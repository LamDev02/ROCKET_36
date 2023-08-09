
public class StudentCompare implements Comparable{
    public int id;
    public String name;
    public String birthDate;
    public double score;

    public StudentCompare(int id, String name, String birthDate, double score) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.score = score;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentCompare{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(StudentCompare other) {
        return this.name.compareTo(other.name);
    }
}

