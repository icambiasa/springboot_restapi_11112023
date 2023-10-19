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
@Table(name = "Order", schema = "sample")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "order_date")
    private String orderDate;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "salesman_id")
    private Long salesmanId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

}

