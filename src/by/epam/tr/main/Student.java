package by.epam.tr.main;

public class Student {
    private String name;
    private String numberGroup;
    private int[] progress = new int[5];
 
    private Student(String name, String numberGroup, int[] progress) {
        this.name = name;
        this.numberGroup = numberGroup;
        this.progress = progress;
    }
 
    private static void showBest(Student[] listStudents) {
        for (Student student : listStudents) {
            int cout = 0;
            for (int a : student.progress) {
                if (a < 9) {
                    cout++;
                }
            }
            if (cout == 0)
                System.out.println(student.name + "  " + student.numberGroup);
        }
    }
 
    public static void main(String[] args) {
        Student[] listStudent = {
                new Student("Ivanov", "1gr", new int[]{5, 6, 7, 3, 9}),
                new Student("Petrov", "1gr", new int[]{9, 10, 9, 9, 9}),
                new Student("Radyuk", "2gr", new int[]{8, 6, 7, 5, 10}),
                new Student("Begaliev", "3gr", new int[]{9, 10, 9, 8, 9}),
                new Student("Alekhna", "1gr", new int[]{9, 10, 9, 9, 9}),
                new Student("Petrashevich", "2gr", new int[]{8, 6, 7, 7, 10}),
                new Student("Popko", "3gr", new int[]{9, 10, 9, 9, 9}),
        		new Student("Selyavko", "2gr", new int[]{8, 10, 9, 9, 9}),
        		new Student("Smolyakova", "3gr", new int[]{10,10, 9, 9, 9}),
        		new Student("Kevich", "3gr", new int[]{9, 10, 5, 9, 9})};
        showBest(listStudent);
    }
}