package com.example.polska.apisearchboard.entity;

import com.example.polska.apisearchboard.enumeration.RoleEnum;
import jakarta.persistence.*;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "position",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "level_id"))
    private List<Level> levels;
}
