package org.itstep.dao.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="test")
public class User {

	@Id
	@Column(name = "login")
	private String login;
	
	private String password;
	private String firstName;
	private String lastName;
	
}
