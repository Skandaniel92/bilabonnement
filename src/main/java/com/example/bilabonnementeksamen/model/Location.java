package com.example.bilabonnementeksamen.model;



public class Location {


  private String location_address;
  private int location_phone;
  private String location_name;

  public Location() {  }

  public Location(String location_address, int location_phone, String location_name) {
    this.location_address = location_address;
    this.location_phone = location_phone;
    this.location_name = location_name;
  }

  public String getLocation_address() {
    return location_address;
  }

  public void setLocation_address(String location_adress) {
    this.location_address = location_adress;
  }

  public int getLocation_phone() {
    return location_phone;
  }

  public void setLocation_phone(int location_phone) {
    this.location_phone = location_phone;
  }

  public String getLocation_name() {
    return location_name;
  }

  public void setLocation_name(String location_name) {
    this.location_name = location_name;
  }


}
