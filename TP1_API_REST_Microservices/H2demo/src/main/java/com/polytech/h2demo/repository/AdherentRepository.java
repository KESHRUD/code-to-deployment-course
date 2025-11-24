package com.polytech.h2demo.repository;


import com.polytech.h2demo.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdherentRepository extends JpaRepository<Adherent, Long> {

}