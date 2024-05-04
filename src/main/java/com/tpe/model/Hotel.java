package com.tpe.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_hotel")
public class Hotel {

    // step  12 add filed about Hotel
    @Id
    private  Long id;  // 0
    @Column(nullable = false)
    private String name;
    @Column(nullable = false ,length = 44)
    private String location;
    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms= new ArrayList<>();


    // Constructor - getter and Setter
    public Hotel() {
    }
    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    // To String Method .
    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}