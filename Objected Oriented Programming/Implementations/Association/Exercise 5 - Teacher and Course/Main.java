import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Karen", 1001));
        teachers.add(new Teacher("Robert", 1002));
        teachers.add(new Teacher("Julius", 1003));

        Course c1 = new Course("Statistic");
        Course c2 = new Course("Computing Fundamentals");
        Course c3 = new Course("Objected Oriented Programming");
        Course c4 = new Course("Graph Algorithms");

        teachers.get(0).addCourse(c1);
        teachers.get(0).addCourse(c2);
        teachers.get(0).addCourse(c3);
        teachers.get(0).addCourse(c4);

        teachers.get(1).addCourse(c2);
        teachers.get(1).addCourse(c4);

        teachers.get(2).addCourse(c1);
        teachers.get(2).addCourse(c3);

        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }

    }
}
