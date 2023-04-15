public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honesty;
    private int bravery;

    public Gryffindor(String name, String surname, int spellPower, int transgression, int nobility, int honesty, int bravery) {
        super(name, surname, spellPower, transgression);
        this.nobility = nobility;
        this.honesty = honesty;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + super.toString() +
                ", nobility=" + nobility +
                ", honesty=" + honesty +
                ", bravery=" + bravery +
                '}';
    }

   @Override
    public int getIndAbyl() {
        return nobility + honesty + bravery;
    }
    public void equalsGriffStud(Hogwarts students) {
        if (this.getIndAbyl() > students.getIndAbyl()) {
            System.out.println(this.getName() + " лучше, чем " + students.getName());
        } else if (this.getIndAbyl() < students.getIndAbyl()) {
            System.out.println(students.getName() + " лучше, чем " + this.getName());
        } else if (this.getIndAbyl() == students.getIndAbyl()) {
            System.out.println("Студенты " + students.getName() + " и " + this.getName() + " равны");
        }
    }
}
