package com.GestionEmpresa.Repositories;

import com.GestionEmpresa.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
    Enterprise findByName(String name);
    Enterprise findByDocument(String name);
}
