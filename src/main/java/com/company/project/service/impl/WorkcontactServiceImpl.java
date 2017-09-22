package com.company.project.service.impl;

import com.company.project.dao.WorkcontactMapper;
import com.company.project.model.Workcontact;
import com.company.project.service.WorkcontactService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/22.
 */
@Service
@Transactional
public class WorkcontactServiceImpl extends AbstractService<Workcontact> implements WorkcontactService {
    @Resource
    private WorkcontactMapper workcontactMapper;

}
