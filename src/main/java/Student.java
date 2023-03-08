import java.util.Objects;

public abstract class Student {

    protected String name;
    protected String course;
    protected String adress;
    protected int identityCardNumber;

    public Student() {

    }

    public Student(String name, String course, String adress, int identityCardNumber) {
        this.name = name;
        this.course = course;
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
    }

    public abstract void gehtLernen();

    //public void

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return identityCardNumber == student.identityCardNumber && Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(adress, student.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, adress, identityCardNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
