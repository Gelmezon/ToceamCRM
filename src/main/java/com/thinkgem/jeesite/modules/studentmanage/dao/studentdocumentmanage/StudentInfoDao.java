/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.studentmanage.dao.studentdocumentmanage;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.studentmanage.entity.studentdocumentmanage.StudentInfo;

/**
 * 学员档案管理DAO接口
 * @author xx
 * @version 2017-11-02
 */
@MyBatisDao
public interface StudentInfoDao extends CrudDao<StudentInfo> {
	
}