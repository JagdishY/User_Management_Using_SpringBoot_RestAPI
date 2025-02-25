package com.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDataDAO;
import com.user.dto.UserDataDTO;
import com.user.entity.UserData;
import com.user.mapstruct.UserMapperStructImpl;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	@Autowired(required = true)
	UserMapperStructImpl struct;

	// Single User Creation
	public UserData createSingleUser(UserDataDTO dataDTO) {
		UserData data = new UserData();
		data.setName(dataDTO.getName());
		data.setEmail(dataDTO.getEmail());
		data.setAge(dataDTO.getAge());
		data.setGender(dataDTO.getGender());
		data.setContact(dataDTO.getContact());
		data.setCity(dataDTO.getCity());

		return repository.save(data);
	}

	// List of User Creation

	public String createMoreUsers(List<UserDataDTO> listDtos) {
		List<UserData> userDatas = listDtos.stream().map(struct::toEntity) // Map DTO to Entity using MapStruct
				.collect(Collectors.toList());
		repository.saveAll(userDatas);
		return "List of User Saved Successfully";

	}

	// GET ALL USER DATA AT A TIME

	public List<UserDataDAO> getAllUserData() {
		UserDataDAO dao = new UserDataDAO();
		List<UserData> datas = repository.findAll();
		List<UserDataDAO> daos = datas.stream().map(v -> new UserDataDAO(v.getId(), v.getName(), v.getEmail(),
				v.getGender(), v.getAge(), v.getContact(), v.getCity())).collect(Collectors.toList());
		return daos;

	}

	// Get User Data based on emailId

	public UserDataDAO getUserBasedOnEmailId(String email) {

		UserData data = repository.getByEmail(email);
		UserDataDAO dataDAO = new UserDataDAO();
		dataDAO.setAge(data.getAge());
		dataDAO.setCity(data.getCity());
		dataDAO.setContact(data.getContact());
		dataDAO.setEmail(data.getEmail());
		dataDAO.setGender(data.getGender());
		dataDAO.setId(data.getId());
		dataDAO.setName(data.getName());

		return dataDAO;

	}

	// GET BY CITY
	public List<UserDataDAO> getByCity(String city) {
		List<UserData> list = repository.getByCity(city);
		List<UserDataDAO> daos = list.stream().map(v -> new UserDataDAO(v.getId(), v.getName(), v.getEmail(),
				v.getGender(), v.getAge(), v.getContact(), v.getCity())).collect(Collectors.toList());
		return daos;
	}

	// GET BY CITY AND GENDER
	public List<UserDataDAO> getByCityAndGender(String city, String gender) {
		List<UserData> datas = repository.getByCityAndGender(city, gender);
		List<UserDataDAO> daos = datas.stream().map(v -> new UserDataDAO(v.getId(), v.getName(), v.getEmail(),
				v.getGender(), v.getAge(), v.getContact(), v.getCity())).collect(Collectors.toList());
		return daos;
	}

	// GET BY CITY AND AGE
	public List<UserDataDAO> getByCityAndAge(String city, Integer age) {
		List<UserData> userDatas = repository.getByCityAndAge(city, age);
		List<UserDataDAO> daos = userDatas.stream().map(v -> new UserDataDAO(v.getId(), v.getName(), v.getEmail(),
				v.getGender(), v.getAge(), v.getContact(), v.getCity())).collect(Collectors.toList());
		return daos;
	}

	// GET BASED ON AGE

	public List<UserDataDAO> getByAge(Integer age) {
		List<UserData> userDatas = repository.getByAge(age);
		List<UserDataDAO> daos = userDatas.stream().map(v -> new UserDataDAO(v.getId(), v.getName(), v.getEmail(),
				v.getGender(), v.getAge(), v.getContact(), v.getCity())).collect(Collectors.toList());
		return daos;
	}

	// UPDATE CONTACT USING EMAIL ID
	public String updateUserContact(String email, long contact) {
		if (email != null) {
			UserData result = repository.updateUserContactData(contact, email);
			repository.save(result);
			return "Contact Updated Successfully.." + email;
		} else {
			return "Cannot Update Contact without Valid Email";
		}

	}

	public UserDataDAO getUserById(Long id) {
		UserData data = repository.getReferenceById(id);
		UserDataDAO dataDAO = new UserDataDAO();
		dataDAO.setAge(data.getAge());
		dataDAO.setCity(data.getCity());
		dataDAO.setContact(data.getContact());
		dataDAO.setEmail(data.getEmail());
		dataDAO.setGender(data.getGender());
		dataDAO.setId(data.getId());
		dataDAO.setName(data.getName());

		return dataDAO;
	}

}
