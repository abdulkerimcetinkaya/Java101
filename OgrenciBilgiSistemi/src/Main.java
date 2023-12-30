public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Fatma Ayşe", "FZK", "532");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIO", "531");

        // Dersler
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        //öğrenciler
        Student s1=new Student("Kerim","100","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,50,85,90,90,90);
        s1.isPass();

        Student s2=new Student("Fatma","293","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,20,40,50,100,100);
        s2.isPass();


    }
}