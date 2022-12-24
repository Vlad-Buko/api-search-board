package com.example.polska.apisearchboard.service.work;

import com.example.polska.apisearchboard.entity.Work;
import com.example.polska.apisearchboard.model.WorkModel;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Domaniewski
 */

@Component
public class WorkConverter {
    public Work fromWorkModelToWork (WorkModel workModel) {
        return Work.builder()
                .nameCompany(workModel.getNameCompany())
                .position(workModel.getPosition())
                .contract(workModel.getContract())
                .location(workModel.getLocation())
                .build();
    }

    public WorkModel fromWorkToWorkModel (Work work) {
        return WorkModel.builder()
                .nameCompany(work.getNameCompany())
                .position(work.getPosition())
                .contract(work.getContract())
                .location(work.getLocation())
                .build();
    }
}
