package com.example.GitHubActionsReleaseDemo;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class Helper {
    public void dumpResult() {
//        Path filePath = Path.of("outputs/result.json");
        String result = "Testing...";
        try (FileWriter fileWriter = new FileWriter("outputs/result.txt")){
            fileWriter.write(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
