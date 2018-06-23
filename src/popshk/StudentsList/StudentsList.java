package popshk.StudentsList;

class StudentsList {
    private Student [] lisl = new Student[2];
    private int i=0;

    public void add(Student student){
        if (i+1==lisl.length){
            Student [] s = new Student[lisl.length*2];
                System.arraycopy(lisl,0,s,0,lisl.length);
                    lisl=s;
        }
            lisl[i++]=student;
    }

    public void delete(int n){
        if(n<=0 || n>lisl.length) return;
            Student [] s =new Student[lisl.length-1];
                System.arraycopy(lisl,0,s,0,n);
                System.arraycopy(lisl,n+1,s,n,s.length-n);
                    lisl=s;
    }

    public Student getStudent(int n){
       return lisl[n];
    }
}
