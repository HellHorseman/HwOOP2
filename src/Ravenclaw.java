public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int wit;
    private int creative;

    public Ravenclaw(String name, String surname, int spellPower, int transgression, int smart, int wise, int wit, int creative) {
        super(name, surname, spellPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +  super.toString() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }
    @Override
    public int getIndAbyl() {
        return smart + wit + wise + creative;
    }
    public void equalsRavStud(Hogwarts students) {
        if (this.getIndAbyl() > students.getIndAbyl()) {
            System.out.println(this.getName() + " лучше, чем " + students.getName());
        } else if (this.getIndAbyl() < students.getIndAbyl()) {
            System.out.println(students.getName() + " лучше, чем " + this.getName());
        } else if (this.getIndAbyl() == students.getIndAbyl()) {
            System.out.println("Студенты " + students.getName() + " и " + this.getName() + " равны");
        }
    }
}
