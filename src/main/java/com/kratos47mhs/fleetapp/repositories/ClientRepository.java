package com.kratos47mhs.fleetapp.repositories;

import com.kratos47mhs.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
