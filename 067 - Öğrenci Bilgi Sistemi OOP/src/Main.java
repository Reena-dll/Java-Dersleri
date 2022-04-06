public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "541 935 92 01", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "12332145", "FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "123321", "BIO");

        Course tarih = new Course("Tarih", "101","TRH",40);
        Course fizik = new Course("Fizik", "102","FZK",50);
        Course biyo = new Course("Biyoloji", "101", "BIO",60);

        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123", "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,40,70,23,50,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","124","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,40,50,40);
        s2.isPass();

    }
}
