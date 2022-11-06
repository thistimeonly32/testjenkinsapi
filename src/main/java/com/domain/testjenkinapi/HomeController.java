package com.domain.testjenkinapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping(path = "/getData/{dataKey}")
	public DataResponse getAllEndUserAnswerByFormId(@PathVariable String dataKey) {
		return new DataResponse(dataKey);
	}
	
}
