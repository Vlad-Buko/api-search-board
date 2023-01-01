package com.example.polska.apisearchboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

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

    private String logo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "work")
    private List<Position> position;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "workContract")
    private Contract contract;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "workLocation")
    private Location location;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "language")
    private List<Language> languages;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tool")
    private List<Tools> tools;

    private LocalDateTime postAt;

    private LocalDateTime putAt;
}
