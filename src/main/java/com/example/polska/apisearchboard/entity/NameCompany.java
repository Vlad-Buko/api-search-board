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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "name_company")
public class NameCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
