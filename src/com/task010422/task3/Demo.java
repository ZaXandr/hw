package com.task010422.task3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
        String[] methods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

        System.out.println("Developer name: " + developer.getName());
        System.out.println("Developer email: " + developer.getEmail());
        System.out.println("Developer experience: " + developer.getExperience());
        System.out.println("Developer main Language: " + developer.getMainLanguage());
        System.out.println("Developer skills: " + Arrays.toString(developer.getSkills()));

        System.out.println("DataAnalyst name: " + analyst.getName());
        System.out.println("DataAnalyst email: " + analyst.getEmail());
        System.out.println("DataAnalyst experience: " + analyst.getExperience());
        System.out.println("DataAnalyst methods: " + Arrays.toString(analyst.getMethods()));
        System.out.println("DataAnalyst is Phd: " + analyst.isPhd());

    }
}
