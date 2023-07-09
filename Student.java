public class Student {

    int id ;
    int age ;
    String name ;
    String rank ;

    Student ( int id, int age, String name, String rank) {
        this.id = id ;
        this.name = name ;
        this.age = age ;
        this.rank  = rank ;
    }
    public String toString () {

        return "name: "+name+"\n"+"age: "+age+"\n"+"id: "+id+"\n"+"rank: "+rank ;
    }
}
