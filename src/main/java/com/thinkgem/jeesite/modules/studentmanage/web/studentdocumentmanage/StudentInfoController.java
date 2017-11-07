/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.studentmanage.web.studentdocumentmanage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.studentmanage.entity.studentdocumentmanage.StudentInfo;
import com.thinkgem.jeesite.modules.studentmanage.service.studentdocumentmanage.StudentInfoService;

/**
 * 学员档案管理Controller
 * @author xx
 * @version 2017-11-02
 */
@Controller
@RequestMapping(value = "${adminPath}/studentmanage/studentdocumentmanage/studentInfo")
public class StudentInfoController extends BaseController {

	@Autowired
	private StudentInfoService studentInfoService;
	
	@ModelAttribute
	public StudentInfo get(@RequestParam(required=false) String id) {
		StudentInfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = studentInfoService.get(id);
		}
		if (entity == null){
			entity = new StudentInfo();
		}
		return entity;
	}
	
	@RequiresPermissions("studentmanage:studentdocumentmanage:studentInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(StudentInfo studentInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<StudentInfo> page = studentInfoService.findPage(new Page<StudentInfo>(request, response), studentInfo); 
		model.addAttribute("page", page);
		return "modules/studentmanage/studentdocumentmanage/studentInfoList";
	}

	@RequiresPermissions("studentmanage:studentdocumentmanage:studentInfo:view")
	@RequestMapping(value = "form")
	public String form(StudentInfo studentInfo, Model model) {
		model.addAttribute("studentInfo", studentInfo);
		return "modules/studentmanage/studentdocumentmanage/studentInfoForm";
	}

	@RequiresPermissions("studentmanage:studentdocumentmanage:studentInfo:edit")
	@RequestMapping(value = "save")
	public String save(StudentInfo studentInfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, studentInfo)){
			return form(studentInfo, model);
		}
		studentInfoService.save(studentInfo);
		addMessage(redirectAttributes, "保存学员档案成功");
		return "redirect:"+Global.getAdminPath()+"/studentmanage/studentdocumentmanage/studentInfo/?repage";
	}
	
	@RequiresPermissions("studentmanage:studentdocumentmanage:studentInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(StudentInfo studentInfo, RedirectAttributes redirectAttributes) {
		studentInfoService.delete(studentInfo);
		addMessage(redirectAttributes, "删除学员档案成功");
		return "redirect:"+Global.getAdminPath()+"/studentmanage/studentdocumentmanage/studentInfo/?repage";
	}

}