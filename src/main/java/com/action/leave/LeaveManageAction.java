package com.action.leave;

import com.opensymphony.xwork2.ModelDriven;
import com.bean.leave.LeavePO;

/**
 * Thi class is used to manage leave info, include /create/update/delete.
 */
public class LeaveManageAction implements ModelDriven<LeavePO>{
    private LeavePO leavePO;

    public LeavePO getModel() {
        return null;
    }
}
