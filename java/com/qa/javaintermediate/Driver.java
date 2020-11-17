package com.qa.javaintermediate;

public class Driver {
    private String mileage;

    // functionality
    public void drive(String milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String string) {
		this.mileage = string;
	}



}

