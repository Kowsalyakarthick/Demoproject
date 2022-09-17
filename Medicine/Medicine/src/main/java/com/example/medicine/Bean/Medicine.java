package com.example.medicine.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table
public class Medicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String medicineName;
	private String medicineQuantity;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setmedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineQuantity() {
		return medicineQuantity;
	}
	public void setmedicineQuantity(String medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
