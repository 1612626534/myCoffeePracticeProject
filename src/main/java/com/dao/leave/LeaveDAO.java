package com.dao.leave;

import com.bean.leave.LeavePO;
import org.apache.ibatis.annotations.Param;

public interface LeaveDAO {

    void addLeaveForm(@Param("leavePO") LeavePO leavePO);

}
