package com.cafemanager.repository;

import com.cafemanager.entity.TableBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableBoxRepository extends JpaRepository<TableBox, Long> {
}
