package com.gojo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user", schema = "gojo")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="password")
	private String password;

}
