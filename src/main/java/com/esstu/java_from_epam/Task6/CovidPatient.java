package com.esstu.java_from_epam.Task6;

public class CovidPatient extends BasePatient{

    private boolean isVaccinated;

    public CovidPatient(int id) {
        super(id);
    }

    public void makeVaccine(){
        this.isVaccinated = true;
    }

    public boolean getVaccinated(){
        return this.isVaccinated;
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
        + "Вакцинирован: " + (isVaccinated ? "Да" : "Нет");
        return personalData;
    }
}
