package com.company.project.service.impl;

import com.company.project.dao.WorkerMapper;
import com.company.project.model.Worker;
import com.company.project.service.WorkerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/22.
 */
@Service
@Transactional
public class WorkerServiceImpl extends AbstractService<Worker> implements WorkerService {
    @Resource
    private WorkerMapper workerMapper;

}
