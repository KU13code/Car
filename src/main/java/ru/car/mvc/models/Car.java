package ru.car.mvc.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,updatable = false)
    private int id;

    @Column(name = "brand")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String brand;

    @Column(name = "model")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String model;

    @Column(name = "engine")
    private String engine;

    @Column(name = "ls")
    @Min(value = 100,message = "at least 100 ls")
    private int ls;

    @Column(name = "transmission")
    @NotBlank(message = "no transmission selected")
    private String transmission;

//    @Column(name = "addOptions")
//    private String[] addOptions;

    @Column(name = "owner")
    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String owner;

    @NotBlank(message = "field cannot be empty")
    @Column(name = "phoneNumber")
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7}$", message = "Please, user pattern +7XXX-XXX-XX-XX")
    private String phoneNumber;

    @Column(name = "email")
    @NotBlank(message = "field cannot be empty")
    @Email(message = "isn't email")
    private String email;






//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getEngine() {
//        return engine;
//    }
//
//    public void setEngine(String engine) {
//        this.engine = engine;
//    }
//
//    public int getLs() {
//        return ls;
//    }
//
//    public void setLs(int ls) {
//        this.ls = ls;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public String[] getAddOptions() {
//        return addOptions;
//    }
//
//    public void setAddOptions(String[] addOptions) {
//        this.addOptions = addOptions;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

}
