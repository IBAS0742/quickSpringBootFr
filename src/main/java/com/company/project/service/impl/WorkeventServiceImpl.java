package com.company.project.service.impl;

import com.company.project.dao.WorkeventMapper;
import com.company.project.model.Workevent;
import com.company.project.service.WorkeventService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/22.
 */
@Service
@Transactional
public class WorkeventServiceImpl extends AbstractService<Workevent> implements WorkeventService {
    @Resource
    private WorkeventMapper workeventMapper;

}
