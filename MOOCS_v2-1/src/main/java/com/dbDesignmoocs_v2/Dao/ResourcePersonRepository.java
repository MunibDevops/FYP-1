package com.dbDesignmoocs_v2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;

public interface ResourcePersonRepository extends JpaRepository<ResourcePersons, Long> {

}
