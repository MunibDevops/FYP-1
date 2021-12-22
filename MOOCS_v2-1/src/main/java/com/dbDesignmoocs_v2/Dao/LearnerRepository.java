package com.dbDesignmoocs_v2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;

public interface LearnerRepository extends JpaRepository<Learners, Long> {

}
