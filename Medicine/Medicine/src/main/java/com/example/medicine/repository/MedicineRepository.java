package com.example.medicine.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.medicine.Bean.Medicine;
import java.util.List;

public interface MedicineRepository extends CrudRepository<Medicine, Integer>{
	
	long countByMedicineName(String medicineName);
	
	@Query("select distinct medicineName from Medicine")
	List<String> getAllMedicine();
	
	
	long countByMedicineQuantity(String medicineQuantity);
	
	@Query("select distinct medicineQuantity from Medicine")
	List<String> getAllQuantity();
	
	

}
