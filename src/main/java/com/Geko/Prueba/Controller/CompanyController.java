package com.Geko.Prueba.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Geko.Prueba.Services.CompanyServiceImpl;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyServiceImpl companyService;
	
	@GetMapping("/getcompany")
	public ResponseEntity<String> getCompany(@RequestParam("code") String Code){
		if (Code != null) {
			HashMap<String, String> company = companyService.getCode(Code);
			if (company != null) {
				String response = "Codigo: "+company.get("code")+ " Name: "+company.get("name")+" Version: "+company.get("version");
				return ResponseEntity.ok(response);
			}
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
		
	}
}
