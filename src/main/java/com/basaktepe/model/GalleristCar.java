package com.basaktepe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "gallerist_car",
        uniqueConstraints = { @UniqueConstraint(columnNames = {"gallerist_id", "car_id"}, name = "uq_gallerist_car")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GalleristCar extends BaseEntity {

    @ManyToOne
    private Gallerist gallerist;

    @OneToOne
    private Car car;

}
