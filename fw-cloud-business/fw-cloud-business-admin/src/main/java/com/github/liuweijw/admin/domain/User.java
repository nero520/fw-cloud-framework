package com.github.liuweijw.admin.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author liuweijw
 */
@Entity
@Table(name = User.TABLE_NAME)
public class User implements Serializable {
	
	private static final long serialVersionUID = 4401115751257255358L;

	public static final String TABLE_NAME = "t_sys_user";
	
    /**
     * 主键ID
     */
    @Id
	@GeneratedValue
	@Column(name = "user_id")
    private Integer userId;
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;
    /**
     * 密码
     */
    @Column(name = "password")
    private String password;
    /**
     * openId
     */
    @Column(name = "open_id")
    private String openId;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
    /**
     * 0-正常，1-删除
     */
    @Column(name = "del_flag")
    private Integer delFlag;
    /**
     * 手机号码
     */
    @Column(name = "mobile")
    private String mobile;
    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 所属部门
     */
    @Column(name = "dept_id")
    private Integer deptId;
    
    /**
     * 角色列表
     */
    private transient List<Role> roleList = new ArrayList<Role>();

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}