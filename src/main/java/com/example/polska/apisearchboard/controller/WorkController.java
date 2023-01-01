package com.example.polska.apisearchboard.controller;

import com.example.polska.apisearchboard.model.WorkModel;
import com.example.polska.apisearchboard.service.work.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/api/v1/work")
public class WorkController {

    @Autowired
    private WorkService workService;

    @PostMapping
    public void addWork(@RequestBody WorkModel workModel) {
        workService.addedWork(workModel);
    }

//    @GetMapping
//    public String getSeeWork() {
////        return workService
//    }

}
