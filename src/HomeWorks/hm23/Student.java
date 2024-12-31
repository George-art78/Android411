package HomeWorks.hm23;

public class Student {
    private String name;
    private String lastName;
    private String group;
    int estimation;
    static int scholarship = 1000;

    public Student(String name, String lastName, String group, int estimation) {
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.estimation = estimation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        if (estimation >= 2 && estimation <= 5)
            this.estimation = estimation;
    }

    public int salary() {
        if (estimation == 5) {
            return scholarship;
        } else {
            return scholarship - 200;
        }
    }

    @Override
    public String toString() {
        return  lastName + " " + name + ", " +
                "группа " + group + ", ";
    }
}

