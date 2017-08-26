package com.dto.leave;

import com.bean.leave.LeavePO;
import java.io.Serializable;

public class LeaveDTO implements Serializable{

    private LeavePO leavePO = new LeavePO();

    public LeaveDTO(LeavePO leavePO) {
        this.leavePO = leavePO;
    }

    public LeavePO getLeavePO() {
        return leavePO;
    }

    public void setLeavePO(LeavePO leavePO) {
        this.leavePO = leavePO;
    }
}
