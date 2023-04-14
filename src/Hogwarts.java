public abstract class Hogwarts {
    private String name;
    private String surname;
     private int spellPower;
     private int transgression;

    public Hogwarts(String name, String surname, int spellPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

}
