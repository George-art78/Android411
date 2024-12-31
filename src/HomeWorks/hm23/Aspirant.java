package HomeWorks.hm23;

public class Aspirant extends Student{
    private String themeOfWork;

    public Aspirant(String name, String lastName, String group, int estimation, String themeOfWork) {
        super(name, lastName, group, estimation);
        this.themeOfWork = themeOfWork;
    }

    public String getThemeOfWork() {
        return themeOfWork;
    }

    public void setThemeOfWork(String themeOfWork) {
        this.themeOfWork = themeOfWork;
    }

    public int salary() {
        if (estimation == 5) {
            return scholarship + 1000;
        } else {
            return scholarship + 800;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "тема работы: '" + themeOfWork + "', ";
    }
}
