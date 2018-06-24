package popshk.StudentsList;

import java.util.Date;

class Student {
    private String name;
    private String lastName;
    private Date birthday;


    public Student (String name, String lastName, Date birthday){
        this.name=name;
        this.lastName=lastName;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder("[");
            sb.append(this.name).append(" ")
                    .append(this.lastName).append(" ").append(this.birthday.getDate())
                    .append("/").append(this.birthday.getMonth()).append("/")
                    .append(this.birthday.getYear()).append("]");

                        return sb.toString();
    }
}
