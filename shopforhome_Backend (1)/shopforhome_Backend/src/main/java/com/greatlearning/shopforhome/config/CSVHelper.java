package com.greatlearning.shopforhome.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.greatlearning.shopforhome.model.Product;

public class CSVHelper {
	
	public static String type = "text/csv";
    static String[] Headers = {"pid","pname","price","url","category"};
	
	public static boolean hasCSVFormat(MultipartFile file) {
		if(type.equals(file.getContentType()) || file.getContentType().equals("application/vnd.ms-excel")) {
			
			return true;
		}
		
		return false;
	}
	
	public static List<Product> csvToProduct(InputStream is){
		try(BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8")); CSVParser csvParser = new CSVParser(fileReader,CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());){
			List<Product> productList = new ArrayList<>();
			
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			
			for(CSVRecord csvRecord : csvRecords) {
				Product product = new Product(
						Integer.parseInt(csvRecord.get("pid")),
						csvRecord.get("pname"),
					    Float.parseFloat(csvRecord.get("price")),
					    csvRecord.get("url"),
					    csvRecord.get("category")
						);
				productList.add(product);
			}
			
			return productList;
			
		}
		catch (IOException e) {
		      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		    }
	}

}
