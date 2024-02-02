package org.example.pharmacy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    private String name;
    private final Map<String, Medication> medications = new HashMap<>();

    public Pharmacy(String name) {
        this.name = name;
    }

    public int getCount() {
        return medications.size();
    }

    public void addMedication(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication findMedicationByName(String name) {
        return medications.getOrDefault(name, null);
    }

    public void deleteMedication(String name) {
        medications.remove(name);
    }

    public void printAllMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(name, pharmacy.name) && Objects.equals(medications, pharmacy.medications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, medications);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", medications=" + medications +
                '}';
    }
}
