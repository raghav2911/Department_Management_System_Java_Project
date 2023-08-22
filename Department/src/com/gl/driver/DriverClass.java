package com.gl.driver;

import com.gl.base.dept.SuperDepartment;
import com.gl.sub.dept.AdminDepartment;
import com.gl.sub.dept.HrDepartment;
import com.gl.sub.dept.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {

		SuperDepartment sd = new SuperDepartment();

		AdminDepartment ad = new AdminDepartment();

		System.out.println("Welcome to" + " " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();

		HrDepartment hr = new HrDepartment();

		System.out.println("Welcome to" + " " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();

		TechDepartment tech = new TechDepartment();

		System.out.println("Welcome to" + " " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(sd.isTodayAHoliday());

	}

}