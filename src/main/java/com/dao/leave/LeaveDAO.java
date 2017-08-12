package com.dao.leave;

import com.bean.LeavePO;
import org.apache.ibatis.annotations.Param;

public interface LeaveDAO {

    void addLeaveForm(@Param("leavePO") LeavePO leavePO);

}
