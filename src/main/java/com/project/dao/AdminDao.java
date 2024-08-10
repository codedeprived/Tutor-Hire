package com.project.dao;

import java.util.List;

import com.project.dto.Admin;

public interface AdminDao {

	boolean addAdmin(Admin admin);

	boolean deleteAdmin(int adminId);

	List<Admin> showAllAdmin();

	Admin searchAdmin(int adminId);

}
