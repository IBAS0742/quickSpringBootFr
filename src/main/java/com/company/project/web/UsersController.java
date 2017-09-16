package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PobjUsers;
import com.company.project.model.Users;
import com.company.project.service.UsersService;
import com.company.project.utils.FileUploadUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
* Created by CodeGenerator on 2017/08/02.
*/
@RestController
@RequestMapping("/users")
@EnableSwagger2
@CrossOrigin
public class UsersController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private UsersService usersService;

    @PostMapping("totalUsers")
    @ApiOperation(value = "测试接口",notes = "当且仅当作为测试使用")
    public Result countUsers() {
        return ResultGenerator.genSuccessResult(usersService.totalUsers());
    }

    @PostMapping("/add")
    @ApiOperation(value="不推荐的注册接口", notes="用户注册后返回密码外信息，但并没有登陆")
    public Result add(Users users,@RequestParam String registerToken) {
        if (stringRedisTemplate.opsForHash().get("registerToken",users.getNickname()).equals(registerToken)) {
            users.setScore(0);
            usersService.save(users);
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("用户名未认证过，如果反复出现请联系管理员");
        }
    }

    @PostMapping("/register")
    @ApiOperation(value="注册接口", notes="用户注册后返回密码外信息，但并没有登陆")
    public Result register(Users users,@RequestParam String registerToken) {
        String rToken = (String) stringRedisTemplate.opsForHash().get("registerToken",users.getNickname());
        if (rToken != null && rToken.equals(registerToken)) {
            stringRedisTemplate.opsForHash().delete("registerToken",users.getNickname());
            Users u = new Users();
            users.setScore(0);
            usersService.insertRetId(users);
            u.setId(users.getId());
            return ResultGenerator.genSuccessResult(u);
        } else {
            return ResultGenerator.genFailResult("用户名未认证过，如果反复出现请联系管理员");
        }
    }

    @PostMapping("/delete")
    @ApiOperation(value="删除用户信息", notes="仅管理员可用")
    public Result delete(@RequestParam(defaultValue = "0") String uper,@RequestParam Long id) {
        if (uper.equals("ibas0742")) {
            usersService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("没有权限");
        }
    }

    @PostMapping("/update")
    @ApiOperation(value="更新用户信息", notes="登陆用户可以使用")
    public Result update(@RequestParam(defaultValue = "") String token,
                         Users users) {
        String token_ = (String)stringRedisTemplate.opsForHash().get("token",users.getId().toString());
        if (token.equals(token_)) {
            usersService.update(users);
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("没有权限");
        }
    }

    @PostMapping("/detail")
    @ApiOperation(value="获取用户信息", notes="没登陆用户可以使用")
    public Result detail(@RequestParam Long id) {
        Users users = usersService.findById(id);
        users.setPassword("");
        return ResultGenerator.genSuccessResult(users);
    }

    @PostMapping("/detailLogin")
    @ApiOperation(value="获取用户信息", notes="登陆用户可以使用")
    public Result detailLogin(@RequestParam(defaultValue = "") String token,
                         @RequestParam Long id) {
        String token_ = (String)stringRedisTemplate.opsForHash().get("token",id.toString());
        if (token_ != null && token.equals(token_)) {
            Users users = usersService.findById(id);
            return ResultGenerator.genSuccessResult(users);
        } else {
            return ResultGenerator.genFailResult("没有权限");
        }
    }

    @PostMapping("/list")
    @ApiOperation(value="获取用户列表", notes="该接口为管理员使用")
    public Result list(@RequestParam(defaultValue = "0") String uper,
                       @RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        if (uper.equals("ibas0742")) {
            PageHelper.startPage(page, size);
            List<Users> list = usersService.findAll();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        } else {
            return ResultGenerator.genFailResult("没有操作权限");
        }
    }

    //根据条件进行查找 ex => data : { id : 12 }
    @PostMapping("/listBy")
    @ApiOperation(value="根据条件查询用户", notes="该接口为管理员使用")
    public Result listBy(@RequestParam Map<String,String> cond,
                         @RequestParam(defaultValue = "0") Integer page,
                         @RequestParam(defaultValue = "0") Integer size) {
        Condition condition = new Condition(Users.class);
        Iterator<String> keys = cond.keySet().iterator();
        boolean isOk = false;
        while (keys.hasNext()) {
            String k = keys.next();
            if (k.equals("page") || k.equals("size")) {
                continue;
            }
            if (k.equals("uper")) {
                if (cond.get(k).equals("ibas0742")) {
                    isOk = true;
                }
                continue;
            }
            condition.createCriteria().andEqualTo(k,cond.get(k));
        }
        if (isOk) {
            PageHelper.startPage(page, size);
            List<Users> list = usersService.findByCondition(condition);
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        } else {
            return ResultGenerator.genFailResult("没有操作权限");
        }
    }
    //根据条件进行查找 ex => data : { id : 12 }
    @PostMapping("/login")
    @ApiOperation(value="登陆接口", notes="用户登陆后会返回token作为登陆凭证")
    public Result login(@RequestParam String nickName,@RequestParam String password) {
        Condition condition = new Condition(Users.class);
        condition.createCriteria().andEqualTo("nickname",nickName);
        condition.createCriteria().andEqualTo("password",password);
        List<Users> list = usersService.findByCondition(condition);
        PobjUsers pobjUsers = new PobjUsers();
        if (list.size() == 1) {
            //登陆成功
            //ShiroToken token = (ShiroToken) authcToken;
            pobjUsers.setUsers(list.get(0));
            pobjUsers.setToken(UUID.randomUUID().toString());
            stringRedisTemplate.opsForHash().put("token",pobjUsers.getUsers().getId().toString(),pobjUsers.getToken());
            pobjUsers.getUsers().setPassword("");
            return ResultGenerator.genSuccessResult(pobjUsers);
        } else {
            //登陆失败
            return ResultGenerator.genFailResult("昵称或密码错误！");
        }
    }

    @PostMapping("/checkUserName")
    @ApiOperation(value="查询用户名是否可用", notes="用于注册前使用，将返回一个token值与用户名对应，届时不对应将无法完成注册")
    public Result checkUserName(@RequestParam String nickName) {
        Condition condition = new Condition(Users.class);
        condition.createCriteria().andEqualTo("nickname",nickName);
        List<Users> list = usersService.findByCondition(condition);
        if (list.size() > 0) {
            return ResultGenerator.genFailResult("用户名已经被使用");
        } else {
            String token = UUID.randomUUID().toString();
            stringRedisTemplate.opsForHash().put(
                    "registerToken",
                        nickName,
                        token
                    );
            return ResultGenerator.genSuccessResult(token);
        }
    }

    @PostMapping("/checkLogin")
    @ApiOperation(value="查询用户名是否可用", notes="用于注册前使用，将返回一个token值与用户名对应，届时不对应将无法完成注册")
    public Result checkLogin(@RequestParam(defaultValue = "") String token,
                             @RequestParam(defaultValue = "") Long id) {
        String token_ = (String)stringRedisTemplate.opsForHash().get("token",id.toString());
        if (token_ != null && token.equals(token_)) {
            return ResultGenerator.genSuccessResult("ok");
        } else {
            return ResultGenerator.genFailResult("fail");
        }
    }

    @PostMapping("/testFileUpload")
    public Result testFileUpload(@RequestParam MultipartFile[] files) {
        String filePath = FileUploadUtils.saveFile(files[0]);
        return ResultGenerator.genSuccessResult(filePath);
    }
}
