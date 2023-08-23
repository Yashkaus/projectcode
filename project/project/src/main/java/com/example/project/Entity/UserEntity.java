package com.example.project.Entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class UserEntity {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
long id;
int end_year;
double citylng;
double citylat;
int intensity;
String sector;
String topic;
String insight;
String swot;
String url;	
String region;	
int start_year;	
int impact;
Date added;
Date published;
String city;
String country;
int  relevance;
String pestle;
String  source;
String title;
int likelihood;

}
