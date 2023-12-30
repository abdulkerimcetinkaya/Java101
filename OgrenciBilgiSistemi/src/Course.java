public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    // Constructor
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    // Metotlar

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else {
            System.out.println("Ders/Öğretmen uyuşmazlığı");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
