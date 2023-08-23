package com.example.project.Dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Userdto {
	int id;
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
