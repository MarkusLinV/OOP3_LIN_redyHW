// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup("16-ЭЭ-11");
        StudentGroup studentGroup1 = new StudentGroup("16-ЭЭ-21");
        StudentGroup studentGroup2 = new StudentGroup("16-ЭЭ-31");

        Steam st1 = new Steam();
        Steam st2 = new Steam();

        st1.addGroups(studentGroup);
        st2.addGroups(studentGroup1);
        st2.addGroups(studentGroup2);

        System.out.println("Группы " + st2);

        Iterator<StudentGroup>iterator = new SteamIterator(st2);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Steam> arrayList = new ArrayList<Steam>(List.of(st2, st1));
        System.out.println(arrayList);

        Collections.sort(arrayList,(s1, s2) -> s1.groups.size() - s2.groups.size());

        System.out.println(arrayList);

        // Student van = new Student("Van", 4);
        // Student igor = new Student("Igorechick", 1);
        // Student alex = new Student("Alex", 2);
        // Student alexey = new Student("Alexey", 3);


        // studentGroup.addStudent(van);
        // studentGroup.addStudent(igor);
        // studentGroup.addStudent(alex);
        // studentGroup.addStudent(alexey);

        // // System.out.println("студенты " + studentGroup.students);
        // // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // // while (iterator.hasNext()) {
        // //     System.out.println(iterator.next());
        // // }

        // for(Student student: studentGroup) {
        //     System.out.println(student);
        // }

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        // System.out.println(arrayList);

        // // public int compare(Student o1, Student o2) {
        // //     return o1.id - o2.id;
        // // }
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        // // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        // System.out.println(arrayList);
    }

}
