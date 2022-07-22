package com.myapp.plcconnect.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
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
public String getMachineId() {
    return machineId;
}
public void setMachineId(String machineId) {
    this.machineId = machineId;
}
public String getJobName() {
    return jobName;
}
public void setJobName(String jobName) {
    this.jobName = jobName;
}
public Integer getJobNo() {
    return jobNo;
}
public void setJobNo(Integer jobNo) {
    this.jobNo = jobNo;
}
public Integer getTotalTurns() {
    return totalTurns;
}
public void setTotalTurns(Integer totalTurns) {
    this.totalTurns = totalTurns;
}
public Integer getCurrentTurns() {
    return CurrentTurns;
}
public void setCurrentTurns(Integer currentTurns) {
    CurrentTurns = currentTurns;
}
public Integer getLayerTurns() {
    return layerTurns;
}
public void setLayerTurns(Integer layerTurns) {
    this.layerTurns = layerTurns;
}
public Integer getQuantity() {
    return quantity;
}
public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}
public Integer getWindSpeed() {
    return windSpeed;
}
public void setWindSpeed(Integer windSpeed) {
    this.windSpeed = windSpeed;
}
public Integer getAccelerationSpeed() {
    return accelerationSpeed;
}
public void setAccelerationSpeed(Integer accelerationSpeed) {
    this.accelerationSpeed = accelerationSpeed;
}
public Date getDateTime() {
    return dateTime;
}
public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
}
    private long clientId;
    private Integer cycleCount;
    private Integer coilCount;
    private Integer cycleTime;
    private String machineId;
    private String jobName;
    private Integer  jobNo;
    private Integer totalTurns;
    private Integer CurrentTurns;
    private Integer layerTurns;
    private Integer quantity;
    private Integer windSpeed;
    private Integer accelerationSpeed;
    private Date dateTime;    
    

    
}
