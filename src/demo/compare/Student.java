package demo.compare;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {

        /*
        * trả về 1 nếu đối tượng this > lớn hơn đối  tượng o
        * trả về 0 nếu dtuowng this giống đối tượng o
        *
        * */
        // theo ten

        return this.name.compareTo(o.name);
    }

    private String name;
    private int id;
    private int score;



    public Student() {
    }

    public Student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}