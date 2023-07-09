public class Soldier {

    private String id ;
    private int age ;
    private String name ;
    private int rank ;

    Soldier ( String id, String name, int age, int rank) {

        this.id = id ;
        this.name = name ;
        this.age = age ;
        this.rank  = rank ;
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setId(String id){
        this.id = id ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public void setRank(int rank){
        this.rank = rank ;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public int getRank() {
        return rank;
    }

    public String toString () {

        return "name: "+name+"|"+"age: "+age+"|"+"id: "+id+"|"+"rank: "+rank ;
    }
}


