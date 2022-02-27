package com.example.demo.test.repository;

import com.example.demo.test.domain.TestInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestInfo, Long> {
}
