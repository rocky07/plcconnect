package com.myapp.plcconnect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private long clientId;
    private Integer cycleCount;
    private Integer coilCount;
    private Integer cycleTime;
    private String machineId;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getClientId() {
        return clientId;
    }
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
    public Integer getCycleCount() {
        return cycleCount;
    }
    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }
    public Integer getCoilCount() {
        return coilCount;
    }
    public void setCoilCount(Integer coilCount) {
        this.coilCount = coilCount;
    }
    public Integer getCycleTime() {
        return cycleTime;
    }
    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }
    public void setMachineId(String machineId){
    	this.machineId=machineId;
    }
    public String getMachineId(){
    	return this.machineId;
    }

    
}
