package com.esstu.java_from_epam.Task6;

//Пациент инфекционного отделения
public class InfectiousPatient extends BasePatient {

    String infectionType;

    public InfectiousPatient(int id) {
        super(id);
    }

    public void addInfectionType(String infectionType) {
        this.infectionType = infectionType;
    }

    public String getInfectionType(){
        return this.infectionType;
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
        + "Тип инфекции: " + infectionType;
        return personalData;
    
    }

}
