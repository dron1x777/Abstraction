import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements GenericDao<Student>{
    List<Student> students =  new ArrayList<>();

    @Override
    public void create(Student newObject) {
        students.add(newObject);
    }

    @Override
    public Student getByName(String name) {
        for(Student student : students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(String name, Student newObject) {
        Student student = newObject;
        for(Student student2 : students){
            if(student2.getName().equals(name)){
                student2 = student;
            }
        }
    }

    @Override
    public void delete(String name) {
        for(Student student : students){
            if(student.getName().equals(name)){
                students.remove(student);
            }
        }
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
