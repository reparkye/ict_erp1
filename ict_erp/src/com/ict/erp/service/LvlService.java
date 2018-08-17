package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ict.erp.vo.LvlInfo;

public interface LvlService {        						/*다오는 왠만하면 셀렉트로 해준다*/
	public List<LvlInfo> getLiList(HttpServletRequest req) throws SQLException;
	
}
