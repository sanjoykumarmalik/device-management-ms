package com.example.devicemanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceManagementController {

    @GetMapping("/devices")
    private ResponseEntity<List<Device>> getAllDevices() {
        List<Device> deviceList = new ArrayList<>();
        Device d = new Device("000001", "ECG Machine", "12345ABCDE", "ExampleTech1");
        deviceList.add(d);
        return ResponseEntity.status(HttpStatus.OK).body(deviceList);
    }
}
