package com.user.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDTO {

	private long id;
	
	@Size(min = 5  , max = 30 , message = "Name Should Contain Min 5 And Max 30 Characters...")
	@NotBlank
	private String name;
	@NotBlank
	@Email(message = "Email Should be in Proper Format..")
	private String email;
	@NotBlank(message = "Please Provide Gender")
	private String gender;
	@Digits(fraction = 0, integer = 3, message = "Age should be between 1 to 100")
	private Integer age;
	@Digits(fraction = 0, integer = 10, message = "Please Provide Valid Mobile Number")
	private long contact;
	private String city;

}
