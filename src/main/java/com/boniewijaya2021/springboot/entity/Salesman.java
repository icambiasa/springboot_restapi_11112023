package com.boniewijaya2021.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "saleman", schema = "sample")
public class Salesman{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesman_id")
    private Long salesmanId;
    @Column(name = "salesman_name")
    private String salesmanName;
    @Column(name = "salesman_city")
    private String salesmanCity;
    @Column(name = "commission")
    private Double commission;
}