package com.ecommerceproj.abstract_classes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractRepository<T> extends JpaRepository<T, Long> {
}
