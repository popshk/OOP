package popshk.StudentsList;

import java.util.Comparator;

public class StudentComparatorDY implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        Integer yearStudent = student.getBirthday().getYear();
        Integer yearT1 = t1.getBirthday().getYear();
        return yearStudent.compareTo(yearT1);
        /*
            Classic version

        if(y1<y2)
            return -1;
        else if(y1=y2)
            return 0;
        else if(y1>y2)
            return 1

        return 0;

         */


    }
}
