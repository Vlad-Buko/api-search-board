package com.example.polska.apisearchboard.entity;

import com.example.polska.apisearchboard.enumeration.LanguageEnum;
import jakarta.persistence.*;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language")
    private Work language;

    private LanguageEnum enumListLanguage;
}
