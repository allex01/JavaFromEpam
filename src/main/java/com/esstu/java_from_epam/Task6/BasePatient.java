package com.esstu.java_from_epam.Task6;

import java.util.List;

public abstract class BasePatient implements Patient {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String address;
    protected String phone;
    protected String medicalCardNumber;

    protected String contract;

    protected boolean isServiceActive;
    protected boolean isServicePaid;

    protected List<String> appointments;
    protected String medicalDiagnosis;
    protected List<String> labTests;

    public BasePatient(int id){
        this.id = id;
        this.isServiceActive = true;
        this.isServicePaid = false;
    }

    @Override
    public void registerPatient(
        String lastName, 
        String firstName, 
        String middleName, 
        String address, 
        String phone, 
        String medicalCardNumber
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
    }

    @Override
    public void makeContract(String contractDetails){
        this.contract = contractDetails;
    }

    @Override
    public String getPersonalData() {
        String personalData = "ID: " + id + "\n" 
        + "Фамилия: " + lastName + "\n" 
        + "Имя: " + firstName + "\n" 
        + "Отчество: " + middleName + "\n" 
        + "Адрес: " + address + "\n" 
        + "Телефон: " + phone + "\n" 
        + "Номер мед карты: " + medicalCardNumber;
        return personalData;
    }

    @Override
    public void updatePersonalData(
        String lastName, 
        String firstName, 
        String middleName, 
        String address, 
        String phone, 
        String medicalCardNumber
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
    }

    @Override
    public void makeAppointment(String doctor, String date) {
        String appointment = "ФИО врача: " + doctor + " Дата: " + date;
        this.appointments.add(appointment);
    }

    @Override
    public void addDiagnosis(String diagnosis) {
        this.medicalDiagnosis = diagnosis;
    }

    @Override
    public void addLabTests(String testResults) {
        this.labTests.add(testResults); 
    }

    @Override
    public String getMedicalHistory(){
        String medicalHistory = "Медицинская история:\n ";
        for(String appointment: appointments){
            medicalHistory += appointment + "\n";
        }
        return medicalHistory;
    }

    @Override
    public String getDiagnosis(){
        return this.medicalDiagnosis;
    }

    @Override
    public void payForServices(){
        this.isServicePaid = true;
    }

    @Override 
    public void cancelService(){
        this.isServiceActive = false;
    }

    @Override
    public void resumeService(){
        this.isServiceActive = true;
    }

}
