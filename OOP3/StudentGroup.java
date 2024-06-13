import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    String name;

    public StringBuilder students = new StringBuilder();

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}