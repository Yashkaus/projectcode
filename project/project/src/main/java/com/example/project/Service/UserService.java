package com.example.project.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.project.Dto.Userdto;
import com.example.project.Entity.UserEntity;

public interface UserService {
	 public List<UserEntity> processExcelFile(MultipartFile file)throws IOException;
}
