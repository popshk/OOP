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
                    lisl=s; i--;
    }

    public Student getStudent(int n){
       return lisl[n];
    }

    public int findByName(String name) {
        for (int n=0;n<i;n++){
            if (lisl[n].getName().equalsIgnoreCase(name)) return n;
        }
        return -1;
    }

    public int findByLastName(String lastName) {
        for (int n=0;n<i;n++){
            if (lisl[n].getLastName().equalsIgnoreCase(lastName)) return n;
        }
        return -1;
    }


    public void printAll(){
        for (int n=0;n<i;n++){
            System.out.println(lisl[n].toString());
        }
    }
}
