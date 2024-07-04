package com.example.hexagonal.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDateTime orderDate;

    public Order() {
    }

    public Order(Long id, String description, LocalDateTime orderDate) {
        this.id = id;
        this.description = description;
        this.orderDate = orderDate;
    }

}
