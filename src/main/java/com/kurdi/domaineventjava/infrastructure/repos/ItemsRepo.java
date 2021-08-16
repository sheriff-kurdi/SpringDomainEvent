package com.kurdi.domaineventjava.infrastructure.repos;

import com.kurdi.domaineventjava.domain.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepo extends JpaRepository<Item, Integer> {
}
