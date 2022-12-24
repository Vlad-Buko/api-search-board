package com.example.polska.apisearchboard.controller;

import com.example.polska.apisearchboard.entity.NameCompany;
import com.example.polska.apisearchboard.model.WorkModel;
import com.example.polska.apisearchboard.service.nameCompany.NameCompanyService;
import com.example.polska.apisearchboard.service.work.WorkService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
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
    private final NameCompanyService nameCompanyService;

    @PostMapping("/save")
    public WorkModel saveWork(@RequestBody WorkModel workModel){
        log.info("Work added");
        return workService.saveModel(workModel);
    }

    @GetMapping("/work")
    public String name() {

        return "Hello";
    }

    @PostMapping("/name")
    public NameCompany saveNameCompany(@RequestBody NameCompany nameCompany) {
        log.info("Name company succesfully added");
        return nameCompanyService.saveCompany(nameCompany);
    }
}
