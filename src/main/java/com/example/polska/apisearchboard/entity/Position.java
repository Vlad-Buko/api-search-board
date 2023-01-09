package com.example.polska.apisearchboard.entity;

import jakarta.persistence.*;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position")
    private Work work;
}