package com.nghia.rent_book.repository;

import com.nghia.rent_book.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusRepository extends JpaRepository<Status , Integer> {

}
