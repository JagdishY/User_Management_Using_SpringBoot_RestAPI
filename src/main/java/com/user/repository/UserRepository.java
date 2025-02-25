package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.user.entity.UserData;

public interface UserRepository  extends JpaRepository<UserData, Long>{

	public UserData getByEmail(String email);

	public List<UserData> getByCity(String city);

	public List<UserData> getByCityAndGender(String city, String gender);

	public List<UserData> getByCityAndAge(String city, Integer age);
	
	public List<UserData> getByAge(Integer age);

	
	
	//Custom query
	@Query(value = "UPDATE USER_DATA SET CONTACT=?1 WHERE EMAIL=?2 ",nativeQuery = true)
	public UserData updateUserContactData(long contact,String email);


}
