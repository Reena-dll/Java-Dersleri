import java.nio.charset.CoderResult;
import java.sql.SQLOutput;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int quiz1, int note2, int quiz2, int note3, int quiz3) {
        if (note1 >= 0 && note1 <= 100 && quiz1 >= 0 && quiz1 <= 100) {
            c1.note = note1;
            c1.quiz = quiz1;
        }
        if (note2 >= 0 && note2 <= 100 && quiz2 >= 0 && quiz2 <= 100) {
            c2.note = note2;
            c2.quiz = quiz2;
        }
        if (note3 >= 0 && note3 <= 100 && quiz3 >= 0 && quiz3 <= 100) {
            c3.note = note3;
            c3.quiz = quiz3;
        }

    }

    // this.avarage = (((this.c1.note * ((c1.rate - 100.0) / -100.0)) + (this.c1.rate / 100.0)) +
    // (((this.c2.note * ((c2.rate - 100.0) / -100.0)) + (this.c2.rate / 100.0))) +
    // (((this.c3.note * ((c3.rate - 100.0) / -100.0)) + (this.c3.rate / 100.0)))) / 3.0;

    void isPass() {
        System.out.println("-----------------");
        this.avarage = ((this.c1.note * ((this.c1.rate - 100.0) / -100.0) + ((this.c1.rate / 100.0)*this.c1.quiz))+
                (this.c2.note * ((this.c2.rate - 100.0) / -100.0) + ((this.c2.rate / 100.0)*this.c2.quiz))+
                (this.c3.note * ((this.c3.rate - 100.0) / -100.0) + ((this.c3.rate / 100.0)*this.c3.quiz)))/3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı Geçti");
            System.out.println();
            System.out.println(this.name + " Öğrencinin Bütün Derlerinin Ortalaması => "+ this.avarage);
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldı.");
            System.out.println(this.name + " Öğrencinin Bütün Derlerinin Ortalaması => "+ this.avarage);
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(c1.name + " Notu => " + c1.note);
        System.out.println(c1.name + " Quiz Notu => " + c1.quiz);
        System.out.println(c1.name + " Kanaat Notu Ortalamaya Etkisi => %" + c1.rate);
        System.out.println(c1.name + " Dersinin Ortalaması => " + (this.c1.note * ((this.c1.rate - 100.0) / -100.0) + ((this.c1.rate / 100.0)*this.c1.quiz)));
        System.out.println();
        System.out.println(c2.name + " Notu => " + c2.note);
        System.out.println(c2.name + " Quiz Notu => " + c2.quiz);
        System.out.println(c2.name + " Kanaat Notu Ortalamaya Etkisi => %" + c2.rate);
        System.out.println(c1.name + " Dersinin Ortalaması => " + (this.c2.note * ((this.c2.rate - 100.0) / -100.0) + ((this.c2.rate / 100.0)*this.c2.quiz)));
        System.out.println();
        System.out.println(c3.name + " Notu => " + c3.note);
        System.out.println(c3.name + " Quiz Notu => " + c3.quiz);
        System.out.println(c3.name + " Kanaat Notu Ortalamaya Etkisi => %" + c3.rate);
        System.out.println(c1.name + " Dersinin Ortalaması => " + (this.c3.note * ((this.c3.rate - 100.0) / -100.0) + ((this.c3.rate / 100.0)*this.c3.quiz)));

    }

}
