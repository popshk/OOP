package popshk.StudentsList;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StudentsList list = new StudentsList();

            list.add(new Student("Vova","Grob",new Date(1999,5,18)));
            list.add(new Student("Dima","Popkov",new Date(1994,7,19)));
            list.add(new Student("Gena","Greben",new Date(1968,4,23)));
            list.add(new Student("Anna","Lee",new Date(1998,10,7)));
                list.delete(2);

                int n = list.findByName("dima");
                int m = list.findByLastName("grob");
            System.out.println(list.getStudent(n).toString());
            System.out.println(list.getStudent(m).toString()+"\n");

                list.printAll();
    }
}
