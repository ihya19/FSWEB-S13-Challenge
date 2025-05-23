package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor
    public Company(int id, String name, double giro, String[] developerNames) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz.");
        }
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz.");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index.");
            return;
        }
        if (developerNames[index] != null) {
            System.out.println("Bu index zaten dolu.");
        } else {
            developerNames[index] = name;
            System.out.println("Çalışan eklendi: " + name);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + String.join(", ", developerNames) +
                '}';
    }
}
