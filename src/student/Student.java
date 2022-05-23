package student;

import java.util.Arrays;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private String group;
    private String faculty;
    private String university;
    private boolean scholarship;
    private String[] subjects;
    private int[] marks;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return name;
    }

    public String getFaculty() {
        return name;
    }

    public String getUniversity() {
        return name;
    }

    public boolean getScholarship() {
        return scholarship;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public boolean stillHasScholarship() {
        if (this.marks == null) {
            System.out.println("No marks");
            return this.scholarship = false;
        } else {
            int sum = 0;
            for (int m : this.marks) {
                sum += m;
            }
            if (sum >= 400) {
                return this.scholarship = true;
            } else {
                return this.scholarship = false;
            }

        }
    }

    public static double money(Student[] group, double scholarship) {
        int count = 0;
        for (Student s : group) {
            if (s.getScholarship() == true) {
                count++;
            }
        }
        return count * scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                ", university='" + university + '\'' +
                ", scholarship=" + scholarship +
                ", subjects=" + Arrays.toString(subjects) +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
