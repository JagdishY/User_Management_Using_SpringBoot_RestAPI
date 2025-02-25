package com.user.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDAO {

	private long id;
	private String name;
	private String email;
	private String gender;
	private Integer age;
	private long contact;
	private String city;
}
