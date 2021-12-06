package com.example.demo.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.model.Board;

@Component
public class BoardValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Board.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Board b = (Board) obj;
		if(ObjectUtils.isEmpty(b.getContent())) {
			errors.rejectValue("content", "key", "내용을 입력하세요");
		}
	}

}
