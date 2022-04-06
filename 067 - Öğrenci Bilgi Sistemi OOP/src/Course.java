public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    Teacher teacher;
    int rate;

    Course(String name, String code, String prefix, int rate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
        this.rate = rate;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }


}
