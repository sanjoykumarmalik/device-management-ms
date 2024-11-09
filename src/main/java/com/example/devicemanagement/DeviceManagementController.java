package com.example.devicemanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceManagementController {

    @GetMapping("/devices")
    private ResponseEntity<AllDevices> getAllDevices() {
    	AllDevices deviceList = new AllDevices();
        return ResponseEntity.status(HttpStatus.OK).body(deviceList);
    }
}
