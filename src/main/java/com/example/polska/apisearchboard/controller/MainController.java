package com.example.polska.apisearchboard.controller;

import com.example.polska.apisearchboard.model.WorkModel;
import com.example.polska.apisearchboard.service.WorkService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/apia/v1")
@AllArgsConstructor
@Log
public class MainController {
    private final WorkService workService;

    @PostMapping("/save")
    public WorkModel saveWork(@RequestBody WorkModel workModel){
        log.info("Work added");
        return workService.saveModel(workModel);
    }

    @GetMapping("/work")
    public String name() {

        return "Hello";
    }


}
