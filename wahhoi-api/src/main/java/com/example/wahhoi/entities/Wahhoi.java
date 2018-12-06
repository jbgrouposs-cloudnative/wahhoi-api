package com.example.wahhoi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "wahhoi")
public class Wahhoi implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nm")
    private String name;
}