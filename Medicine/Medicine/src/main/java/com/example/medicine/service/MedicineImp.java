package com.example.medicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.medicine.Bean.Medicine;
import com.example.medicine.repository.MedicineRepository;
@Service
@Transactional
public class MedicineImp implements MedicineService{
	
	@Autowired
	MedicineRepository repository;
	
	@Override
	public Medicine create(Medicine medicine) {
		 
		return repository.save(medicine);
	}

	@Override
	public List<Medicine> getMedicine() {
		 
		return (List<Medicine>) repository.findAll();
	}

	@Override
	public Medicine findById(int id) {
		
		return repository.findById(id).get();
	}
	

	@Override
	public String deleteById(int id) {
	 repository.deleteById(id);
	 return "Medicine id is deleted successfully"+" "+id;
	}

	@Override
	public Medicine update(Medicine medicine) {
		Medicine existingMedicine=repository.findById(medicine.getId()).orElse(null);
		existingMedicine.setmedicineName(medicine.getMedicineName());
		existingMedicine.setmedicineQuantity(medicine.getMedicineQuantity());
		existingMedicine.setPrice(medicine.getPrice());
		return repository.save(medicine);
	}

	@Override
	public long getCountByMedicineName(String medicineName) {
		return repository.countByMedicineName(medicineName);
	}

	@Override
	public List<String> getAllMedicineName() {
		return repository.getAllMedicine();
	}

	@Override
	public long countByMedicineQuantity(String medicineQuantity) {
		 
		return repository.countByMedicineQuantity(medicineQuantity);
	}
	@Override
	public List<String> getQuantity()
	{
		return repository.getAllQuantity();
	}

	
	/*@Override
	public Medicine updatePartially(Medicine medicine) {
		Medicine exitsingMedicine=repository.findById(medicine.getId())
		return null;
	}
	*/

}
