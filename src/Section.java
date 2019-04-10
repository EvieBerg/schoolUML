public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher= t;
    }

    public Student[] getStudents(){
        return students;
    }

    public void addStudent(Student s){
        this.students[currentSize]=s;
        currentSize++;
    }
    public String getName(){

        return this.name;
    }
    public String toString(){

        String n = "";
        for(int i = 0; i< currentSize; i++){

             n += students[i].getName() + ", ";
        }


        System.out.println ("This " + this.name +" class is taught by " +
                this.teacher.getName() +" and has " + currentSize +" students: " + n );
        return "";
    }
}
