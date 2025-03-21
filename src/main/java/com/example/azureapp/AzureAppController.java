package com.example.azureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class AzureAppController {

    @GetMapping("/data")
    public Map<String, String> getData() {
        return Map.of(
                "message", "Hello from Azure App Service! - SJBIT",
                "status", "success"
        );
    }
}
