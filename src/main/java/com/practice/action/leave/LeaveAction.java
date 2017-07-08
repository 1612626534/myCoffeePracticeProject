package com.practice.action.leave;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.practice.bean.LeavePO;
import org.activiti.engine.ProcessEngineConfiguration;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.*;

/**
 * This class is used to read leave info.
 */
public class LeaveAction extends ActionSupport implements ModelDriven<LeavePO> {

    private LeavePO leavePO;
    private InputStream inputStream;
    private ProcessEngineConfiguration processEngineConfiguration;

    public String showLeaveInfo() {
        inputStream = new ByteArrayInputStream("there is a method".getBytes());
        return SUCCESS;
    }

    public LeavePO getModel() {
        return this.leavePO;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public ProcessEngineConfiguration getProcessEngineConfiguration() {
        return processEngineConfiguration;
    }

    public void setProcessEngineConfiguration(ProcessEngineConfiguration processEngineConfiguration) {
        this.processEngineConfiguration = processEngineConfiguration;
    }


}
