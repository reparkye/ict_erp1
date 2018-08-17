package com.ict.erp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.LvlInfo;

public interface LvlDAD {
	public List<LvlInfo> selectLvlList(Connection con)  throws SQLException;   /*메소드명 같아야 하므로 LvlDAOImpl 과 맞춰준다.*/
	
	
}
