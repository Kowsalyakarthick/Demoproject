package com.example.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicine.Bean.Medicine;
import com.example.medicine.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class medicineController {
	
	@Autowired
	MedicineService service;
	@PostMapping("/create")
	public Medicine create(@RequestBody Medicine medicine) 
	{
		System.out.println("Creating Medicine"+medicine.getMedicineName());
		service.create(medicine);
		return service.create(medicine); 
		
	}
	
	@GetMapping("/get")
	public List<Medicine> getMedicine()
	{
		return service.getMedicine();
	}
	
	@GetMapping("/get/{id}")
	public Medicine getById(@PathVariable("id") int id)
	{
		return service.findById(id);
	}
	
	@GetMapping("/getCountByMedicine/{medicineName}")
	public long getByMedicineName(@PathVariable("medicineName") String name) {
        return service.getCountByMedicineName(name);		
	}
	
	@GetMapping("/getAllMedicine") 
	public List<String> getAllMedicine() {
		return service.getAllMedicineName();
	}
	 
	@GetMapping("getCountByQuantity/{medicineQuantity}")
	public long getByMedicineQuantity(@PathVariable("medicineQuantity") int quan)
	{
		return service.countByMedicineQuantity(Integer.toString(quan));
	}
	
	@GetMapping("/getQuantity")
	public List<String> getAllQuantity()
	{
		return service.getQuantity();
	}
	
	@PutMapping("/update")
	public Medicine updateMedicine(@RequestBody Medicine medicine)
	{
		return service.update(medicine);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteMedicine(@PathVariable("id") int id )
	{
		return service.deleteById(id);
	}
	

}
