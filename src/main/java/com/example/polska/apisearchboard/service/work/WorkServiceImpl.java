package com.example.polska.apisearchboard.service.work;

import com.example.polska.apisearchboard.entity.Work;
import com.example.polska.apisearchboard.model.WorkModel;
import com.example.polska.apisearchboard.repository.WorkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Vladislav Domaniewski
 */

@Service
@AllArgsConstructor
public class WorkServiceImpl implements WorkService {
    private final WorkRepository workRepository;
    private final WorkConverter workConverter;

    @Override
    public WorkModel saveModel(WorkModel workModel) {
        Work saveWork = workRepository.save(workConverter.fromWorkModelToWork(workModel));
        return workConverter.fromWorkToWorkModel(saveWork);
    }
}
