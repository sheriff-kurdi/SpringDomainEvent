package com.kurdi.domaineventjava.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue
    Integer id;
    String itemName;
}
