package fr.ensai.library;
import java.time.LocalDate;

public class Loan {
    private Student student;
    private String item;
    private LocalDate startDate;
    private LocalDate returnDate; // Initially null

    public Loan(Student student, String item, LocalDate startDate) {
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null; // Set to null at creation
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Item " + item + " borrowed by " + student.name;
    }
    
}
