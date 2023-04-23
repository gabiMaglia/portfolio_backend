package com.portfolio.Gabriel.Maglia.Repository;


import com.portfolio.Gabriel.Maglia.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
