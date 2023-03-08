public class ComputerScienceStudent extends Student implements Citizen {

    boolean passedJavaCourse = false;
    boolean passedSqlCourse = false;
    protected int anzahlStundenJavaGelernt = 0;
    protected int anzahlStundenSqlGelernt = 0;


    public ComputerScienceStudent() {

    }

    public ComputerScienceStudent(String name, String course, String address, int identityCardNumber, boolean passedJavaCourse, boolean passedSqlCourse) {
        super(name, course, address, identityCardNumber);
        this.passedJavaCourse = passedJavaCourse;
        this.passedSqlCourse = passedSqlCourse;
    }

    public void gehtLernen() {
        System.out.println("1 Stunde später");
        anzahlStundenJavaGelernt++;
    }

    public void eineStundeJavaLernen() {
        anzahlStundenJavaGelernt++;
        System.out.println(getAnzahlStundenJavaGelernt()+" Stunde/n Java gelernt");
        if (getAnzahlStundenJavaGelernt() == 5) {
            setPassedJavaCourse(true);
            System.out.println("Herlichen Glückwunsch. Sie haben den Java-Kurs bestanden");;
        }
    }

    @Override
    public String getAdress() {
        return super.getAddress();
    }

    public boolean isPassedJavaCourse() {
        return passedJavaCourse;
    }

    public void setPassedJavaCourse(boolean passedJavaCourse) {
        this.passedJavaCourse = passedJavaCourse;
    }

    public boolean isPassedSqlCourse() {
        return passedSqlCourse;
    }

    public void setPassedSqlCourse(boolean passedSqlCourse) {
        this.passedSqlCourse = passedSqlCourse;
    }

    public int getAnzahlStundenJavaGelernt() {
        return anzahlStundenJavaGelernt;
    }

    public void setAnzahlStundenJavaGelernt(int anzahlStundenJavaGelernt) {
        this.anzahlStundenJavaGelernt = anzahlStundenJavaGelernt;
    }

    public int getAnzahlStundenSqlGelernt() {
        return anzahlStundenSqlGelernt;
    }

    public void setAnzahlStundenSqlGelernt(int anzahlStundenSqlGelernt) {
        this.anzahlStundenSqlGelernt = anzahlStundenSqlGelernt;
    }

}
