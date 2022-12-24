package com.example.polska.apisearchboard.service.nameCompany;

import com.example.polska.apisearchboard.entity.NameCompany;
import com.example.polska.apisearchboard.repository.NameCompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Vladislav Domaniewski
 */

@Service
@AllArgsConstructor
public class NameCompanyServiceImpl implements NameCompanyService {
    private final NameCompanyRepository nameCompanyRepository;

    @Override
    public NameCompany saveCompany(NameCompany nameCompany) {
        return nameCompanyRepository.save(nameCompany);
    }
}
