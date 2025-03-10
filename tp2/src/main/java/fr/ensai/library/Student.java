package fr.ensai.library;

public class Student extends Person {
    protected int academicYear;
    protected boolean isClassDelegate;

    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }
    
}
