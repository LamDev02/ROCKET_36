public class Student {
    private static int nextID = 1;
    public int id ;
    public String name;

    public Student(int id, String name) {
        this.id = nextID++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
