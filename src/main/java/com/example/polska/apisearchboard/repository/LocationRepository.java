package com.example.polska.apisearchboard.repository;

import com.example.polska.apisearchboard.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findByLocationName(String location);
}
