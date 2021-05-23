package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.DAO.AppDAO;
import com.examly.springapp.Model.LogModel;

@RestController
public class AppController {
	
	@Autowired
	private AppDAO appdao;
	
	@GetMapping("/getAllLog")
	public List<LogModel> getalllogs(){
		return appdao.findAll();
	}
	
	@GetMapping("/checkin")
	public List<LogModel> getbyname(@RequestParam String name){
		List<LogModel> result = appdao.findByName(name);
		return result;
	}
	
	@GetMapping("/checkout")
	public List<LogModel> getbynameout(@RequestParam String name){
		List<LogModel> result = appdao.findByNameOUT(name);
		return result;
	}
	
	@GetMapping("/getLog")
	public List<LogModel> getbydate(@RequestParam String date){
		List<LogModel> result = appdao.findByDate(date);
		return result;
		
	}
	
	
}
