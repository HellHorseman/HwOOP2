public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int faithful;
    private int honesty;

    public Hufflepuff(String name, String surname, int spellPower, int transgression, int hardworking, int faithful, int honesty) {
        super(name, surname, spellPower, transgression);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +  super.toString() +
                ", hardworking=" + hardworking +
                ", faithful=" + faithful +
                ", honesty=" + honesty +
                '}';
    }
    @Override
    public int getIndAbyl() {
        return hardworking + honesty + faithful;
    }
    public void equalsHuffStud(Hogwarts students) {
        if (this.getIndAbyl() > students.getIndAbyl()) {
            System.out.println(this.getName() + " лучше, чем " + students.getName());
        } else if (this.getIndAbyl() < students.getIndAbyl()) {
            System.out.println(students.getName() + " лучше, чем " + this.getName());
        } else if (this.getIndAbyl() == students.getIndAbyl()) {
            System.out.println("Студенты " + students.getName() + " и " + this.getName() + " равны");
        }
    }
}
