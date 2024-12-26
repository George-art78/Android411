package lesson10.person;

public class Specialist extends Graduate{
    private int score;

    public Specialist(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject, int score) {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        this.score = score;
        System.out.println("SpecialistConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Specialist(Graduate graduate, int score) {
        super(graduate);
        this.score = score;
        System.out.println("SpecialistConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "Specialist{" +
                "score=" + score +
                '}';
    }
}
