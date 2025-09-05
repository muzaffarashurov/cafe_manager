package com.cafemanager.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@jakarta.persistence.Table(name = "tables")
@NoArgsConstructor
@Data
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "table_number", unique = true, nullable = false)
    private Integer tableNumber;

    @Column(nullable = false)
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TableStatus status = TableStatus.AVAILABLE;

    @Column(name = "occupied_at")
    private LocalDateTime occupiedAt;

    public enum TableStatus {
        AVAILABLE, OCCUPIED, RESERVED, OUT_OF_SERVICE
    }

    // Constructors

    public Table(Integer tableNumber, Integer capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
    }
}
