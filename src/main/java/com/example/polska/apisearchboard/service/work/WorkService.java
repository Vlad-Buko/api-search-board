package com.example.polska.apisearchboard.service.work;

import com.example.polska.apisearchboard.entity.Contract;
import com.example.polska.apisearchboard.entity.Location;
import com.example.polska.apisearchboard.entity.Tools;
import com.example.polska.apisearchboard.entity.Work;
import com.example.polska.apisearchboard.enumeration.ContractEnum;
import com.example.polska.apisearchboard.model.WorkModel;
import com.example.polska.apisearchboard.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Service
@AllArgsConstructor
public class WorkService {
    private final WorkRepository workRepository;
    private final ContractRepository contractRepository;
    private final LanguageRepository languageRepository;
    private final LevelRepository levelRepository;
    private final LocationRepository locationRepository;
    private final RoleRepository roleRepository;
    private final PositionRepository positionRepository;

    public Work addedWork(WorkModel workModel) {
        Work work = new Work();
        work.setNameCompany(workModel.getNameCompany());
        Contract contract = contractRepository.findByContract(ContractEnum.valueOf(workModel.getContract()));
        Location location = locationRepository.findByLocationName(workModel.getLocation());

        // Contract

        if (contract.getContract().equals(ContractEnum.FullTime)) {
            work.setContract(contract);
        }

        if (contract.getContract().equals(ContractEnum.PartTime)) {
            work.setContract(contract);
        }

        if (contract.getContract().equals(ContractEnum.Contract)) {
            work.setContract(contract);
        }

        // Location

        if (location == null) {
            Location location1 = new Location();
            locationRepository.save(location1);
            location1.setLocationName(workModel.getLocation());
            work.setLocation(location1);
        }
        if (location != null) {
            work.setLocation(location);
        }

        // tools


        work.setPostAt(LocalDate.now().atStartOfDay());
        work.setPutAt(LocalDate.now().atStartOfDay());
        workRepository.save(work);
        return work;
    }
}
