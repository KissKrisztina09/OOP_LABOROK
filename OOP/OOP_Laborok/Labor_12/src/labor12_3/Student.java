package labor12_3;

public class Student {
    private int ID;
    private String fristName;
    private String lastName;
    private double math;
    private double hungarian;
    private double romanian;
    private double average;

    public Student(int ID, String fristName, String lastName) {
        this.ID = ID;
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMath() {
        return math;
    }

    public double getHungarian() {
        return hungarian;
    }

    public double getRomanian() {
        return romanian;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setHungarian(double hungarian) {
        this.hungarian = hungarian;
    }

    public void setRomanian(double romanian) {
        this.romanian = romanian;
    }

    public void setAverage() {
        this.average = (this.hungarian + this.romanian + this.math)/3;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(ID + " " + fristName +' ' + lastName + ' ' + "Math " + math + ' ' + "Hungarian " +
                hungarian + ' ' + "Romanian " + romanian + ' ' + "Average " + average);
        return result.toString();
    }
}
