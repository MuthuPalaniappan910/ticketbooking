package com.travels.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travels.busbooking.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{

}
