package com.happyrabbit.springcloud.entities;

import java.io.Serializable;

import org.apache.commons.collections.functors.TruePredicate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


//Entity Dept orm mysql-> Dept(table) 类映射
//使用“小辣椒lombok”来生成类的构造方法、setter/getter、 tostring等


@SuppressWarnings("serial")
//@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable {
	
	private Long 	deptno; 	// 主键
	private String 	dname; 		// 部门名称
	private String 	db_source;	// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}

//	public static void main(String[] args) {
//
//		Dept dept = new Dept();
//		dept.setDeptno(11L).setDname("dept").setDb_source("SpringCloudDB");
//		
//	}

}
