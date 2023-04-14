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
        return "Ravenclaw{" +  "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", spellPower=" + getSpellPower() +
                ", transgression=" + getTransgression() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }
}
