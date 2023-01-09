package com.example.polska.apisearchboard.model;

import com.example.polska.apisearchboard.entity.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

/**
 * Created by Vladislav Domaniewski
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Schema(description = "Schema for work")
public class WorkModel {
    @Schema(description = "Enter name company")
    private String nameCompany;
    @Schema(description = "We choose logo for our company")
    private String logo;
    @Schema(description = "We choose position")
    private Position position;
    @Schema(description = "We choose contract")
    private String contract;
    @Schema(description = "We choose location")
    private String location;
    @Schema(description = "To need choose languages our programming")
    private List<String> languages;
    @Schema(description = "Choose tools")
    private List<String> tools;
}
