package com.practice.dao.leave;

import com.practice.bean.LeavePO;
import org.apache.ibatis.annotations.Param;

public interface LeaveDAO {

    void addLeaveForm(@Param("leavePO")LeavePO leavePO);

}
