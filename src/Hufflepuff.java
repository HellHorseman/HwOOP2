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
        return "Hufflepuff{" +  "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgression=" + getTransgression() +
                ", hardworking=" + hardworking +
                ", faithful=" + faithful +
                ", honesty=" + honesty +
                '}';
    }
}
