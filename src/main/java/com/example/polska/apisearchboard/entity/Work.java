package com.example.polska.apisearchboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "work")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_company")
    private String nameCompany;

    private String position;

    private String contract;

    private String location;

//    private List<Object> languages;
//
//    private List<Object> tools;
}
