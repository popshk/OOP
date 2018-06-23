package popshk.StudentsList;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StudentsList list = new StudentsList();

            list.add(new Student("Vova","Grob",new Date(1994,5,18)));
        System.out.println(list.getStudent(0).getBirthday().getYear());
    }
}
