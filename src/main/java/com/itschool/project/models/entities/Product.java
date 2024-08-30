package com.itschool.project.models.entities;

import com.itschool.project.services.UserService;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.Array;
import org.hibernate.mapping.List;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name ")
    private String productName;
}