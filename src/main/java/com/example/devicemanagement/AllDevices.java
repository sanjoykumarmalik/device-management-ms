package com.example.devicemanagement;

import java.util.ArrayList;
import java.util.List;

public class AllDevices {

	private List<Device> results = new ArrayList<>();
	
	public AllDevices() {
        Device d = new Device("000001", "ECG Machine", "12345ABCDE", "ExampleTech1");
        results.add(d);
        
        d = new Device("000002", "ECG Machine", "78905GHMNP", "ExampleTech2");
        results.add(d);
	}
	
	public List<Device> getResults() {
		return this.results;
	}
}
