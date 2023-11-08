package com.atel.impl;

public class Car {
	private String model;
	private String EngineModel;
	private String FuelType;
	@Override
	public String toString() {
		return "Car [model=" + model + ", EngineModel=" + EngineModel + ", FuelType=" + FuelType + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngineModel() {
		return EngineModel;
	}
	public void setEngineModel(String engineModel) {
		EngineModel = engineModel;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	

}
