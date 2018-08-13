package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.DepartInfo;

public interface DepartService {
	public List<DepartInfo> getDepartList()throws SQLException;
	public DepartInfo getDepart();              // DepartDAO 인터페이스꺼 가져와서 get으로 바꿔준다.
}

