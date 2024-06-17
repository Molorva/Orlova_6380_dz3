package seminar;

import java.util.*;

// Создать класс Студент
// Создать класс УчебнаяГруппа
// Создать класс УчебнаяГруппаИтератор, заставив его реализовать
//интерфейс Iterator
// Реализовать его контракты (включая удаление)
public class seminar3 {
    public static void main(String[] args) {
        StudentGroup  studentGroup = new StudentGroup();
        Student ivan = new Student("Van",4);
        Student igor = new Student("Igor",1);
        Student alexandr = new Student("Alexandr",2);
        Student alex = new Student("Alexey",3);

        studentGroup.addStudent(ivan);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);

//        for (Student s : studentGroup){
//            System.out.println(s);
//        }
        ArrayList<Student> g1 = new ArrayList<>(List.of(ivan, igor,alex, alexandr));
        Collections.sort(g1, (s1,s2) -> s1.name.length() - s2.name.length());;
        System.out.println(g1);
//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        StudentGroup  studentGroup2 = new StudentGroup();
        Student maha = new Student("Masha",5);
        Student dayana = new Student("Dayana",7);
        Student y = new Student("Y",8);
        Student ola = new Student("Ola",0);
        Student zinaida = new Student("Zinaida",0);

        studentGroup2.addStudent(maha);
        studentGroup2.addStudent(dayana);
        studentGroup2.addStudent(y);
        studentGroup2.addStudent(ola);

        ArrayList<Student> g2 = new ArrayList<>(List.of(maha, dayana, y,ola, zinaida));
        Collections.sort(g2, (s1,s2) -> s1.name.length() - s2.name.length());
        System.out.println(g2);

        System.out.println("------------");
        StudentFlow sf = new StudentFlow();
        sf.addGroup(studentGroup);
        sf.addGroup(studentGroup2);
        System.out.println(sf.getGroups());

    }

}
