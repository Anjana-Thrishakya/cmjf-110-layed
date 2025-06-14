/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dto;

import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class OrderDto {
    private String orderId;
    private String date;
    private String cutomerId;
    
    private ArrayList<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String orderId, String date, String cutomerId, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderId = orderId;
        this.date = date;
        this.cutomerId = cutomerId;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the cutomerId
     */
    public String getCutomerId() {
        return cutomerId;
    }

    /**
     * @param cutomerId the cutomerId to set
     */
    public void setCutomerId(String cutomerId) {
        this.cutomerId = cutomerId;
    }

    /**
     * @return the orderDetailDtos
     */
    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", date=" + date + ", cutomerId=" + cutomerId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }

    
}
