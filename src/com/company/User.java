package com.company;

public class User {
    private long id;
    private String nameVacancy;
    private Vacancy vacancy;

    public User(long id, String nameVacancy) {
        this.id = id;
        this.nameVacancy = nameVacancy;
    }
    String getVacancy() {
        Vacancy vacancy = new Vacancy(nameVacancy);
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}
