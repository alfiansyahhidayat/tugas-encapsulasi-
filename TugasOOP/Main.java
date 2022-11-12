package TugasOOP;

import java.util.Scanner;

public class Main{
        static void batas (){
            System.out.println(".....");
        }
static void menu  (){
    System.out.println("menu");
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    System.out.println("4");
    System.out.println("5");
    System.out.println("6");
    System.out.println("7");
    System.out.println("8");

}

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("masukan nama murid");
    String nama_murid=sc.nextLine();
    System.out.println("alamat murid");
    String alamat_murid=sc.next();
    Student murid =new Student (nama_murid, alamat_murid);
    batas();


    System.out.println("masukan nama guru ");
    String nama_guru=sc.next();
    System.out.println("alamat guru ");
    String alamat_guru=sc.next();
    Teacher guru =new Teacher (alamat_guru,nama_guru);


    while (true){
        System.out.println("");
        batas();
        menu();
        System.out.println("input no menu");
        int noMenu=sc.nextInt();
        switch (noMenu){
            case 1:
            System.out.println(murid);
            break;
            case 3:
            System.out.print("Masukan nama kursus : ");
            String kursus=sc.next();
            System.out.print("Masukan nilai : ");
            int nilaiKursus=sc.nextInt();
            murid.addCourseGrade(kursus, nilaiKursus);
            break;
        case 4:
            murid.printGrades();
            break;
        case 5:
            System.out.println("Rata-rata : "+murid.getAverageGrade());
            break;
        case 6:
            System.out.print("Masukan nama kursus yang akan ditambahkan : ");
            String tambahKursus=sc.next();
            guru.addCourse(tambahKursus);
            break;
        case 7:
            System.out.print("Masukan nama kursus yang akan dihapus : ");
            String hapusKursus=sc.next();
            guru.removeCourse(hapusKursus);
            break;
        case 8:
            System.out.println("Exiting Program...");
            System.exit(0);
            break;
    }
}




        }



    



}


