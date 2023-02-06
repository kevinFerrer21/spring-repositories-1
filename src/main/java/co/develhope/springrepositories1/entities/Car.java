package co.develhope.springrepositories1.entities;

import javax.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private String serialNumber;
    private double currentPrice;

    private Car(){}

    private Car(Long id,String modelName,String serialNumber, double currentPrice){
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public String getModelName(){
        return modelName;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
}