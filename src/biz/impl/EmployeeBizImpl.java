package biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.EmployeeBiz;
import dao.EmployeeDao;
import po.SysEmployee;

@Service
public class EmployeeBizImpl implements EmployeeBiz {
	
	private EmployeeDao employeeDao;

	@Override
	public SysEmployee checkLogin(SysEmployee emp) {
		SysEmployee result = employeeDao.findById(emp.getSn());
		if(result!=null && result.getPassword().equals(emp.getPassword())) {
			return result;
		}else {
			
			
			return null;
			
		}
		
		
	}

	
	//setter 和 getter获取位置
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}//employeeDao获取

}
