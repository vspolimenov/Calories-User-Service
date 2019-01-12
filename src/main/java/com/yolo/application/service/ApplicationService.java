package com.yolo.application.service;

import org.springframework.stereotype.Service;

import com.yolo.application.model.User;

@Service
public class ApplicationService {

	public void calculate(User user) {
		if(user.getGender().equals("male") ) {
			user.setCalories((int) (66 + 13.7 * user.getWeight() + 5 * user.getHeight() + 6.8 * user.getAge()) );
			user.setCarbs((int) (user.getCalories() * 0.6));
			user.setProteins((int) (user.getCalories() * 0.2));
			user.setFats((int) (user.getCalories() * 0.2));
		} else {
			user.setCalories((int) (655 + 9.6 * user.getWeight() + 1.8 * user.getHeight() + 4.7 * user.getAge()) );
			user.setCarbs((int) (user.getCalories() * 0.5));
			user.setProteins((int) (user.getCalories() * 0.25));
			user.setFats((int) (user.getCalories() * 0.25));
		}
			
	}

}
