package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.project.Dto.Userdto;
import com.example.project.Entity.UserEntity;
import com.example.project.Resp.UserRepo;
import com.example.project.Service.UserService;
@RestController
@RequestMapping("/api/excel")
public class UserController {
	 @Autowired
	    private UserService userservice;

	    @Autowired
	    private UserRepo userrepo;

	    @PostMapping("/upload")
	    public ResponseEntity<String> uploadExcel(@RequestParam("file") MultipartFile file) {
	        try {
	            List<UserEntity> dataList = userservice.processExcelFile(file);
	            userrepo.saveAll(dataList);
	            return ResponseEntity.ok("Excel data inserted successfully.");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing Excel file.");
	        }
	    }
	}



