package com.example.polska.apisearchboard.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Vladislav Domaniewski
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class WorkModel {
    private String nameCompany;
    private String position;
    private String contract;
    private String location;
}
