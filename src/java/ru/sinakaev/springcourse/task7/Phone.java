package ru.sinakaev.springcourse.task7;

public class Phone {
    String name;
    int number;
    String model;
    String serialNumber;
    int butteryLevel;
    int batteryCapacity;

    Phone(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getButteryLevel() {
        return butteryLevel;
    }

    public void setButteryLevel(int butteryLevel) {
        this.butteryLevel = butteryLevel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
