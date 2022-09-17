package com.example.medicine.service;

import java.util.List;


import com.example.medicine.Bean.Medicine;

public interface MedicineService {

	 Medicine create(Medicine medicine);
	 List<Medicine> getMedicine();
	 Medicine findById(int id);
 	 Medicine update(Medicine medicine);
 	 String deleteById(int id);
 	 long getCountByMedicineName(String medicineName);
 	long countByMedicineQuantity(String medicineQuantity);
 	 List<String> getAllMedicineName();
	List<String> getQuantity();
 	
 	//public Medicine updatePartially(Medicine medicine, int id);
}

