package org.example.springcrud.repository;


import org.example.springcrud.entity.NoteSharingTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteSharingRepository extends JpaRepository<NoteSharingTable, Long> {
}
