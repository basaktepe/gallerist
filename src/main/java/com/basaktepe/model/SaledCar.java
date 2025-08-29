package com.basaktepe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "saled_car",
        uniqueConstraints = { @UniqueConstraint(columnNames = {"gallerist_id", "car_id", "customer_id"},
                name = "uq_gallerist_car_customer")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaledCar extends BaseEntity {


    @ManyToOne
    @Enumerated(EnumType.STRING)
    private Gallerist gallerist;

    @ManyToOne
    @Enumerated(EnumType.STRING)
    private Car car;

    @Enumerated(EnumType.STRING)
    @ManyToOne
    private  Customer customer;
}





