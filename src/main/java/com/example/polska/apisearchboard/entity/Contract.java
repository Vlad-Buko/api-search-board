package com.example.polska.apisearchboard.entity;

import com.example.polska.apisearchboard.enumeration.ContractEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Table(name = "contract")
@Getter
@Setter
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private ContractEnum contract;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contract")
    private List<Work> workList;
}
