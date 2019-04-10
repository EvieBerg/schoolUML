public class Runner {


    public static void main(String[] args){
        School BIHS = new School("BIHS");

        Section history = new Section("history");
        Section math = new Section("math");
        Section art = new Section("art");

        Teacher albie = new Teacher("ablie", 1, "art");
        Teacher parkie = new Teacher("parkie", 2, "history");
        Teacher r = new Teacher("r", 3, "math");

        Student evie = new Student("Evie", 4, 11);
        Student munt = new Student("Munt", 5, 11);
        Student eva = new Student("Eva", 6, 11);
        Student ben = new Student("Ben", 7, 11);
        Student elliot = new Student("Elliot", 8, 11);
        Student emilia = new Student("Emilia", 9, 11);

        albie.addSection(art);
        parkie.addSection(history);
        r.addSection(math);

        art.setTeacher(albie);
        history.setTeacher(parkie);
        math.setTeacher(r);

        evie.addSection(art);
        munt.addSection(art);
        eva.addSection(history);
        ben.addSection(history);
        elliot.addSection(math);
        emilia.addSection(math);

        art.addStudent(evie);
        art.addStudent(munt);

        history.addStudent(eva);
        history.addStudent(eva);

        math.addStudent(elliot);
        math.addStudent(emilia);


        BIHS.addSection(math);
        BIHS.addSection(history);
        BIHS.addSection(art);

        
        art.toString();
        history.toString();
        math.toString();
    }
}
