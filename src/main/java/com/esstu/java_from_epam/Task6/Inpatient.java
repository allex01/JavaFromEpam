package com.esstu.java_from_epam.Task6;

//Пациент стационара
public class Inpatient extends BasePatient{

    private String roomNumber;

    public Inpatient(int id) {
        super(id);
    }

    public void assignRoom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public String getPersonalData() {
        String personalData = "ID: " + id + "\n" 
        + "Фамилия: " + lastName + "\n" 
        + "Имя: " + firstName + "\n" 
        + "Отчество: " + middleName + "\n" 
        + "Адрес: " + address + "\n" 
        + "Телефон: " + phone + "\n" 
        + "Номер мед карты: " + medicalCardNumber + "\n"
        + "Номер палаты: " + roomNumber;
        return personalData;
    
    }
}
