package com.example.polska.apisearchboard.entity;

import com.example.polska.apisearchboard.enumeration.LevelEnum;
import jakarta.persistence.*;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "levels")
    private List<Role> roles;
}
