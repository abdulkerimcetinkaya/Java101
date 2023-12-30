public class Teacher {
    String name;
    String branch;
    String mpno;

    // Contructor
    Teacher(String name, String brach, String mpno){
        this.name = name;
        this.branch = brach;
        this.mpno = mpno;
    }

    // Metotlar

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Branşı : " + this.branch);
        System.out.println("Telefon numarası : " + this.mpno);
    }
}
