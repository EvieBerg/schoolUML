public class Teacher extends Person{
    private int sectionCount;
    private String subject;
    private Section[] sections = new Section[10];


    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }


    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections(){
        return sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount]= s;
        sectionCount++;
    }
}
