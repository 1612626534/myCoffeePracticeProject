package com.practice.action.leave;

import com.opensymphony.xwork2.ModelDriven;
import com.practice.bean.LeavePO;

/**
 * Thi class is used to manage leave info, include /create/update/delete.
 */
public class LeaveManageAction implements ModelDriven<LeavePO>{
    private LeavePO leavePO;

    public LeavePO getModel() {
        return null;
    }
}
