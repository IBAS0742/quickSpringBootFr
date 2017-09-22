package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Workcontact;
import com.company.project.service.WorkcontactService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
* Created by CodeGenerator on 2017/09/22.
*/
@RestController
@RequestMapping("/workcontact")
public class WorkcontactController {
    @Resource
    private WorkcontactService workcontactService;

    @PostMapping("/add")
    public Result add(Workcontact workcontact) {
        workcontact.setId(UUID.randomUUID().toString());
        workcontactService.save(workcontact);
        return ResultGenerator.genSuccessResult(workcontact);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        workcontactService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Workcontact workcontact) {
        workcontactService.update(workcontact);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        Workcontact workcontact = workcontactService.findById(id);
        return ResultGenerator.genSuccessResult(workcontact);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Workcontact> list = workcontactService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //根据条件进行查找 ex => data : { id : 12 }
    @PostMapping("/listBy")
    public Result listBy(@RequestParam Map<String,String> cond, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        Condition condition = new Condition(Workcontact.class);
        Iterator<String> keys = cond.keySet().iterator();
        while (keys.hasNext()) {
            String k = keys.next();
            if (k.equals("page") || k.equals("size")) {
                continue;
            }
            condition.createCriteria().andEqualTo(k,cond.get(k));
        }
        PageHelper.startPage(page, size);
        List<Workcontact> list = workcontactService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
