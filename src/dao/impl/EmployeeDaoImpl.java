package dao.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.EmployeeDao;
import po.SysEmployee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
	
	@Override
	public SysEmployee findById(Serializable sn) {
		
		return this.getHibernateTemplate().get(SysEmployee.class, sn);
		//模板类hibernate的内嵌的模板类
		
	}

}
