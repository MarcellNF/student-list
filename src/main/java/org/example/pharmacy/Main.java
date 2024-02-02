package org.example.pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy("Neue Apotheke");

        Medication aspirin = new Medication("Aspirin", 10.0, true);
        Medication paracetamol = new Medication("Paracetamol", 5.0, true);
        Medication ibuprofen = new Medication("Ibuprofen", 7.0, true);

        pharmacy.addMedication(aspirin);
        pharmacy.addMedication(paracetamol);
        pharmacy.addMedication(ibuprofen);

        pharmacy.printAllMedications();
        System.out.println("Count: " + pharmacy.getCount());
        System.out.println();
        System.out.println("Find Aspirin: " + pharmacy.findMedicationByName("Aspirin"));
        System.out.println();
        pharmacy.deleteMedication("Aspirin");
        pharmacy.printAllMedications();
        System.out.println("Count: " + pharmacy.getCount());

        System.out.println(pharmacy);
    }
}
