import java.time.LocalDate;

/**
 * Super Class Colaborator
 */
abstract class Colaborator {
    private String name;
    private LocalDate birthDate;
    private String address;
    private int citizenCard;
    private int vatNumber;
    private double baseSalary;

    public Colaborator(String name, LocalDate birthDate,
                       String address, int citizenCard,
                       int vatNumber, double baseSalary) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    /**
     * @return
     * Classe abstrata que deve ser implementada
     * nas Subclasses
     */
    abstract double setSalary();

    /**
     *
     * @return
     *
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Colaborator{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", citizenCard=" + citizenCard +
                ", vatNumber=" + vatNumber +
                ", baseSalary=" + setSalary() +
                '}';
    }
}
