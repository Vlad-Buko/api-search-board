package com.example.polska.apisearchboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "name_company_work",
            joinColumns = @JoinColumn(name = "name_company_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id"))
    private List<Work> name;
}
