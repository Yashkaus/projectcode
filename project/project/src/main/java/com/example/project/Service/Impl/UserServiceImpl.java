package com.example.project.Service.Impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.project.Dto.Userdto;
import com.example.project.Entity.UserEntity;
import com.example.project.Service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserEntity> processExcelFile(MultipartFile file)throws IOException {
		 List<UserEntity> dataList = new ArrayList<>();
	        // Excel processing logic using Apache POI
	        // Read data from the Excel file and populate the dataList
	        return dataList;
	
	}

}
