/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.studentmanage.entity.studentdocumentmanage;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 学员档案管理Entity
 * @author xx
 * @version 2017-11-02
 */
public class StudentInfo extends DataEntity<StudentInfo> {
	
	private static final long serialVersionUID = 1L;
	private Long userid;		// 草拟吗
	private String code;		// 学号
	private String statuschange;		// 学籍变更
	private String studenttype;		// 学生类型
	private String sex;		// 性别
	private String birthplace;		// 出生地
	private Date birthday;		// 出生日期
	private String married;		// 婚姻状况
	private String school;		// 毕业学校
	private String academy;		// academy
	private String department;		// 院系
	private String collegemajor;		// 专业
	private String schoolrecord;		// 学历
	private String graduatedate;		// 毕业时间
	private String cancel;		// cancel
	private String telephone;		// 入学时电话号码
	private String gtelephone;		// 毕业时电话号码
	private String email;		// 电子邮件
	private String qq;		// QQ号码
	private String msn;		// msn
	private String homephone;		// 家庭电话
	private String homeaddress;		// 家庭住址
	private String comminucationaddress;		// 联系地址
	private String credentialno;		// 证件号码
	private String guardian;		// 监护人
	private String guardianphone;		// 监护人电话号码
	private String relation;		// 和监护人的关系
	private String urgencyperson;		// 紧急联系人
	private String urgencyphone;		// 紧急联系电话
	private String traincompany;		// 原培训公司
	private String traintime;		// 培训时间
	private String traincontext;		// 培训内容
	private String oldcompany;		// 原工作单位
	private String oldheadship;		// 原单位职位
	private String oldsalary;		// 原单位薪资
	private String familybackgroud;		// 家庭背景
	private String parentstatus;		// 父母状况
	private String jobdesign;		// 职业规划
	private String target;		// 期望目标
	private String hobby;		// 爱好
	private String economy;		// 经济能力
	private String qulityscore;		// 职业素质基础分
	private String skillscore;		// 技术能力基础分
	private String innerheadship;		// 职务
	private Date daneigraduatedate;		// 达内毕业时间
	private String pic;		// 照片
	private String picfilename;		// picfilename
	private String resume;		// 简历
	private String resumefilename;		// resumefilename
	private String repayedcredit;		// 是否还清贷款
	private String careerexclamation;		// careerexclamation
	private String company;		// 就业公司
	private String headship;		// 就业职位
	private String salary;		// 就业薪水
	private String returnvist;		// returnvist
	private String other;		// other
	private Long classesId;		// classes_id
	private Long subareaId;		// subarea_id
	private String attendanceno;		// attendanceno
	private String teacherevaluation;		// 班主任评价
	private String pmevaluation;		// 项目经理评价
	private String firstwritten;		// 第一次考试成绩
	private String secondwritten;		// 第二次考试成绩
	private String thirdwritten;		// 第三次考试成绩
	private String scjp;		// SJCP考试成绩
	private String firstpoll;		// 第一次项目考核成绩
	private String secondpoll;		// 第二次项目考核成绩
	private String thirdpoll;		// 第三次项目考核成绩
	private Long fileId;		// file_id
	
	public StudentInfo() {
		super();
	}

	public StudentInfo(String id){
		super(id);
	}

	@NotNull(message="草拟吗不能为空")
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	@Length(min=0, max=20, message="学号长度必须介于 0 和 20 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=500, message="学籍变更长度必须介于 0 和 500 之间")
	public String getStatuschange() {
		return statuschange;
	}

	public void setStatuschange(String statuschange) {
		this.statuschange = statuschange;
	}
	
	@Length(min=0, max=20, message="学生类型长度必须介于 0 和 20 之间")
	public String getStudenttype() {
		return studenttype;
	}

	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
	
	@Length(min=0, max=10, message="性别长度必须介于 0 和 10 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=100, message="出生地长度必须介于 0 和 100 之间")
	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Length(min=0, max=10, message="婚姻状况长度必须介于 0 和 10 之间")
	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}
	
	@Length(min=0, max=50, message="毕业学校长度必须介于 0 和 50 之间")
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Length(min=0, max=20, message="academy长度必须介于 0 和 20 之间")
	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}
	
	@Length(min=0, max=20, message="院系长度必须介于 0 和 20 之间")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Length(min=0, max=20, message="专业长度必须介于 0 和 20 之间")
	public String getCollegemajor() {
		return collegemajor;
	}

	public void setCollegemajor(String collegemajor) {
		this.collegemajor = collegemajor;
	}
	
	@Length(min=0, max=10, message="学历长度必须介于 0 和 10 之间")
	public String getSchoolrecord() {
		return schoolrecord;
	}

	public void setSchoolrecord(String schoolrecord) {
		this.schoolrecord = schoolrecord;
	}
	
	@Length(min=0, max=10, message="毕业时间长度必须介于 0 和 10 之间")
	public String getGraduatedate() {
		return graduatedate;
	}

	public void setGraduatedate(String graduatedate) {
		this.graduatedate = graduatedate;
	}
	
	@Length(min=1, max=1, message="cancel长度必须介于 1 和 1 之间")
	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
	
	@Length(min=0, max=50, message="入学时电话号码长度必须介于 0 和 50 之间")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Length(min=0, max=50, message="毕业时电话号码长度必须介于 0 和 50 之间")
	public String getGtelephone() {
		return gtelephone;
	}

	public void setGtelephone(String gtelephone) {
		this.gtelephone = gtelephone;
	}
	
	@Length(min=0, max=50, message="电子邮件长度必须介于 0 和 50 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=50, message="QQ号码长度必须介于 0 和 50 之间")
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	
	@Length(min=0, max=50, message="msn长度必须介于 0 和 50 之间")
	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}
	
	@Length(min=0, max=50, message="家庭电话长度必须介于 0 和 50 之间")
	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	
	@Length(min=0, max=50, message="家庭住址长度必须介于 0 和 50 之间")
	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}
	
	@Length(min=0, max=100, message="联系地址长度必须介于 0 和 100 之间")
	public String getComminucationaddress() {
		return comminucationaddress;
	}

	public void setComminucationaddress(String comminucationaddress) {
		this.comminucationaddress = comminucationaddress;
	}
	
	@Length(min=0, max=50, message="证件号码长度必须介于 0 和 50 之间")
	public String getCredentialno() {
		return credentialno;
	}

	public void setCredentialno(String credentialno) {
		this.credentialno = credentialno;
	}
	
	@Length(min=0, max=10, message="监护人长度必须介于 0 和 10 之间")
	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	
	@Length(min=0, max=50, message="监护人电话号码长度必须介于 0 和 50 之间")
	public String getGuardianphone() {
		return guardianphone;
	}

	public void setGuardianphone(String guardianphone) {
		this.guardianphone = guardianphone;
	}
	
	@Length(min=0, max=10, message="和监护人的关系长度必须介于 0 和 10 之间")
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	@Length(min=0, max=20, message="紧急联系人长度必须介于 0 和 20 之间")
	public String getUrgencyperson() {
		return urgencyperson;
	}

	public void setUrgencyperson(String urgencyperson) {
		this.urgencyperson = urgencyperson;
	}
	
	@Length(min=0, max=20, message="紧急联系电话长度必须介于 0 和 20 之间")
	public String getUrgencyphone() {
		return urgencyphone;
	}

	public void setUrgencyphone(String urgencyphone) {
		this.urgencyphone = urgencyphone;
	}
	
	@Length(min=0, max=50, message="原培训公司长度必须介于 0 和 50 之间")
	public String getTraincompany() {
		return traincompany;
	}

	public void setTraincompany(String traincompany) {
		this.traincompany = traincompany;
	}
	
	@Length(min=0, max=255, message="培训时间长度必须介于 0 和 255 之间")
	public String getTraintime() {
		return traintime;
	}

	public void setTraintime(String traintime) {
		this.traintime = traintime;
	}
	
	@Length(min=0, max=50, message="培训内容长度必须介于 0 和 50 之间")
	public String getTraincontext() {
		return traincontext;
	}

	public void setTraincontext(String traincontext) {
		this.traincontext = traincontext;
	}
	
	@Length(min=0, max=50, message="原工作单位长度必须介于 0 和 50 之间")
	public String getOldcompany() {
		return oldcompany;
	}

	public void setOldcompany(String oldcompany) {
		this.oldcompany = oldcompany;
	}
	
	@Length(min=0, max=20, message="原单位职位长度必须介于 0 和 20 之间")
	public String getOldheadship() {
		return oldheadship;
	}

	public void setOldheadship(String oldheadship) {
		this.oldheadship = oldheadship;
	}
	
	@Length(min=0, max=11, message="原单位薪资长度必须介于 0 和 11 之间")
	public String getOldsalary() {
		return oldsalary;
	}

	public void setOldsalary(String oldsalary) {
		this.oldsalary = oldsalary;
	}
	
	@Length(min=0, max=255, message="家庭背景长度必须介于 0 和 255 之间")
	public String getFamilybackgroud() {
		return familybackgroud;
	}

	public void setFamilybackgroud(String familybackgroud) {
		this.familybackgroud = familybackgroud;
	}
	
	@Length(min=0, max=255, message="父母状况长度必须介于 0 和 255 之间")
	public String getParentstatus() {
		return parentstatus;
	}

	public void setParentstatus(String parentstatus) {
		this.parentstatus = parentstatus;
	}
	
	@Length(min=0, max=255, message="职业规划长度必须介于 0 和 255 之间")
	public String getJobdesign() {
		return jobdesign;
	}

	public void setJobdesign(String jobdesign) {
		this.jobdesign = jobdesign;
	}
	
	@Length(min=0, max=255, message="期望目标长度必须介于 0 和 255 之间")
	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	@Length(min=0, max=255, message="爱好长度必须介于 0 和 255 之间")
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Length(min=0, max=50, message="经济能力长度必须介于 0 和 50 之间")
	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}
	
	public String getQulityscore() {
		return qulityscore;
	}

	public void setQulityscore(String qulityscore) {
		this.qulityscore = qulityscore;
	}
	
	public String getSkillscore() {
		return skillscore;
	}

	public void setSkillscore(String skillscore) {
		this.skillscore = skillscore;
	}
	
	@Length(min=0, max=20, message="职务长度必须介于 0 和 20 之间")
	public String getInnerheadship() {
		return innerheadship;
	}

	public void setInnerheadship(String innerheadship) {
		this.innerheadship = innerheadship;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDaneigraduatedate() {
		return daneigraduatedate;
	}

	public void setDaneigraduatedate(Date daneigraduatedate) {
		this.daneigraduatedate = daneigraduatedate;
	}
	
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	@Length(min=0, max=255, message="picfilename长度必须介于 0 和 255 之间")
	public String getPicfilename() {
		return picfilename;
	}

	public void setPicfilename(String picfilename) {
		this.picfilename = picfilename;
	}
	
	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	@Length(min=0, max=255, message="resumefilename长度必须介于 0 和 255 之间")
	public String getResumefilename() {
		return resumefilename;
	}

	public void setResumefilename(String resumefilename) {
		this.resumefilename = resumefilename;
	}
	
	@Length(min=1, max=1, message="是否还清贷款长度必须介于 1 和 1 之间")
	public String getRepayedcredit() {
		return repayedcredit;
	}

	public void setRepayedcredit(String repayedcredit) {
		this.repayedcredit = repayedcredit;
	}
	
	public String getCareerexclamation() {
		return careerexclamation;
	}

	public void setCareerexclamation(String careerexclamation) {
		this.careerexclamation = careerexclamation;
	}
	
	@Length(min=0, max=20, message="就业公司长度必须介于 0 和 20 之间")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Length(min=0, max=20, message="就业职位长度必须介于 0 和 20 之间")
	public String getHeadship() {
		return headship;
	}

	public void setHeadship(String headship) {
		this.headship = headship;
	}
	
	@Length(min=0, max=11, message="就业薪水长度必须介于 0 和 11 之间")
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getReturnvist() {
		return returnvist;
	}

	public void setReturnvist(String returnvist) {
		this.returnvist = returnvist;
	}
	
	@Length(min=0, max=255, message="other长度必须介于 0 和 255 之间")
	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}
	
	public Long getSubareaId() {
		return subareaId;
	}

	public void setSubareaId(Long subareaId) {
		this.subareaId = subareaId;
	}
	
	@Length(min=0, max=10, message="attendanceno长度必须介于 0 和 10 之间")
	public String getAttendanceno() {
		return attendanceno;
	}

	public void setAttendanceno(String attendanceno) {
		this.attendanceno = attendanceno;
	}
	
	public String getTeacherevaluation() {
		return teacherevaluation;
	}

	public void setTeacherevaluation(String teacherevaluation) {
		this.teacherevaluation = teacherevaluation;
	}
	
	public String getPmevaluation() {
		return pmevaluation;
	}

	public void setPmevaluation(String pmevaluation) {
		this.pmevaluation = pmevaluation;
	}
	
	public String getFirstwritten() {
		return firstwritten;
	}

	public void setFirstwritten(String firstwritten) {
		this.firstwritten = firstwritten;
	}
	
	public String getSecondwritten() {
		return secondwritten;
	}

	public void setSecondwritten(String secondwritten) {
		this.secondwritten = secondwritten;
	}
	
	public String getThirdwritten() {
		return thirdwritten;
	}

	public void setThirdwritten(String thirdwritten) {
		this.thirdwritten = thirdwritten;
	}
	
	public String getScjp() {
		return scjp;
	}

	public void setScjp(String scjp) {
		this.scjp = scjp;
	}
	
	public String getFirstpoll() {
		return firstpoll;
	}

	public void setFirstpoll(String firstpoll) {
		this.firstpoll = firstpoll;
	}
	
	public String getSecondpoll() {
		return secondpoll;
	}

	public void setSecondpoll(String secondpoll) {
		this.secondpoll = secondpoll;
	}
	
	public String getThirdpoll() {
		return thirdpoll;
	}

	public void setThirdpoll(String thirdpoll) {
		this.thirdpoll = thirdpoll;
	}
	
	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	
}