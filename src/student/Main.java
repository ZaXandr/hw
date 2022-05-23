package student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] group1 = {
                new Student(),
                new Student(),
                new Student(),
                new Student(),
                new Student()
        };

        for (Student s:group1) {
            s.setMarks(Main.randMarks());
            s.stillHasScholarship();
            System.out.println(s.toString());
        }
       System.out.println("Бюджет: " + Student.money(group1, 2000));
    }

    public static int[] randMarks(){
        int[] arr = new int[5];
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = 51 + rd.nextInt(50);
        }
        return arr;
    }
}
