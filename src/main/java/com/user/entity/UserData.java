package com.user.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User_Data")
public class UserData {

	public UserData() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	@Nonnull
	private String name;
	@Column
	@Nonnull
	private String email;
	@Column
	@Nonnull
	private String gender;
	@Column
	@Nonnull
	private Integer age;
	@Column
	@Nonnull
	private long contact;
	@Column
	private String city;
	
	
}
