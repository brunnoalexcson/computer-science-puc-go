import java.util.ArrayList;

public class Teacher {
    private String name;
    private int id;
    // Association
    private ArrayList<Course> courses = new ArrayList<>();

    // Static Polymorphism
    public Teacher(){
        name = "";
        id = 0;
    }

    Teacher(String name){
        this.name = name;
        id = 0;
    }

    Teacher(int id){
        name = "";
        this.id = id;
    }

    Teacher(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    void addCourse(Course c){
        courses.add(c);
        c.setTeacher(this);
    }

    // Printing
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Teacher: ").append(getName()).append("\n");
        sb.append("ID: ").append(getId()).append("\n");
        sb.append("Courses: ");

        for (int i = 0; i < courses.size(); i++){
            sb.append(courses.get(i));
            if (i < courses.size() - 1){
                sb.append(", ");
            }
        }

        return sb.toString();
    }

}
