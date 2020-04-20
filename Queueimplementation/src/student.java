public class student {
    @Override
    public String toString() {
        return "student [roll=" + roll + ", name=" + name + "]";
    }

    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
