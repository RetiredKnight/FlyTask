package com.studios.flytask;

import android.util.Pair;

import java.util.ArrayList;

/**
 * Created by Personal on 24.11.2017.
 */

public class OrderClass {

    private String orderNumber;
    private String orderDate;
    private String orderStatus;
    private ArrayList<String> nameList;
    private ArrayList<String> travelList;

    public OrderClass(String orderNumber, String orderDate, String orderStatus, ArrayList<String> nameList, ArrayList<String> travelList) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.nameList = nameList;
        this.travelList = travelList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }

    public void setNameList(ArrayList<String> nameList) {
        this.nameList = nameList;
    }

    public ArrayList<String> getTravelList() {
        return travelList;
    }

    public void setTravelList(ArrayList<String> travelList) {
        this.travelList = travelList;
    }
}
