package com.nit.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer sno;
	private String sname;
	private String sadd;
	private Double avg;

}
