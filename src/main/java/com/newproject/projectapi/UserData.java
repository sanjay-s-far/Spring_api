package com.newproject.projectapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UserData {
	
	@GetMapping
	public String getdata(@RequestParam(value="page",defaultValue="1") int page ,@RequestParam(value="limit" ,defaultValue="10") int limit ) {
		return "comming from get data page = "+ page + " and Limit =" + limit ;
	}
	
	@GetMapping(path="/{userid}")
	public String getdata(@PathVariable String userid) {
		return "This is form any varibale";
	}
	@PostMapping
	public String postdata() {
		return "This id form post";
	}
	@PutMapping
	public String putdata() {
		return "comming from put data";
	}
	@DeleteMapping
	public String deletedata() {
		return "comming from delete data";
	}
}
