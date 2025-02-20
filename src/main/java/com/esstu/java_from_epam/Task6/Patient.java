package com.esstu.java_from_epam.Task6;


public interface Patient {
    void registerPatient(String lastName, String firstName, String middleName, String address, String phone, String medicalCardNumber);
    void makeContract(String contractDetails);
    String getPersonalData();
    void updatePersonalData(String lastName, String firstName, String middleName, String address, String phone, String medicalCardNumber);
    void makeAppointment(String doctor, String date);
    void addDiagnosis(String diagnosis);
    void addLabTests(String testResults);
    String getMedicalHistory();
    String getDiagnosis();
    void payForServices();
    void cancelService();
    void resumeService();
}
