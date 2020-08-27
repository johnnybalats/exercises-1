package exercises.on.arrays.collections.own.version.of.stack;

public class Student {

    private int AM;
    private String name;
    private String surname;
    private double age;
    private char sex;
    private int absents;
    private double grade;

    public Student() {
    }

    public Student(int AM, String name, String surname, double age, char sex, int absents, double grade) {
        this.AM = AM;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.absents = absents;
        this.grade = grade;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAbsents() {
        return absents;
    }

    public void setAbsents(int absents) {
        this.absents = absents;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "AM=" + AM +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", absents=" + absents +
                ", grade=" + grade +
                '}';
    }
}
