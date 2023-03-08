import java.util.Objects;

public class ComputerScienceStudent implements Citizen {

    private String name;
    private String course;
    private String adress;
    private int identityCardNumber;

    public ComputerScienceStudent() {

    }

    public ComputerScienceStudent(String name, String course, String adress, int identityCardNumber) {
        this.name = name;
        this.course = course;
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
    }

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

    @Override
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
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
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return identityCardNumber == that.identityCardNumber && Objects.equals(name, that.name) && Objects.equals(course, that.course) && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, adress, identityCardNumber);
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
