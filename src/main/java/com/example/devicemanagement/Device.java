package com.example.devicemanagement;

public class Device {

	private String deviceId;
	private String model;
	private String serialNumber;
	private String manufacturer;
	
	public Device(String deviceId, String model, String serialNumber, String manufacturer) {
		this.deviceId = deviceId;
		this.model = model;
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
