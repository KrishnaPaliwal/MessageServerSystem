/**
 * 
 */
package com.messageserver.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author M1022158
 *
 */
public class Roles {

	public List<String> roleList = new ArrayList<String>();

	private int roleId;

	/**
	 * @return the roleList
	 */
	public List<String> getRoleList() {
		return roleList;
	}

	/**
	 * @param roleList
	 *            the roleList to set
	 */
	public void setRoleList(List<String> roleList) {
		roleList.add("principal");
		roleList.add("admin");
		roleList.add("staff");
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
