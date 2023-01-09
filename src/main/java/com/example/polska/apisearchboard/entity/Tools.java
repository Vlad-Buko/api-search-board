package com.example.polska.apisearchboard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Getter
@Setter
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tools")
    private Work tool;

    @Column
    private String nameTool;
}
