package com.service.restaurante.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenRespDTO {

	private String orderId;
    private String name;
    private int qty;
    private double price;
    private Date orderDate;
    private String status;
    private int estimateDeliveryWindow;



}
