import java.time.LocalDate;

public class ProjectManager extends Colaborator{
    private int code;
    private String projects;
    private LocalDate contractDate;

    public ProjectManager(String name, LocalDate birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
    }

    @Override
    double setSalary() {
        double tmpSalary = getBaseSalary() * 1.15;
        int nrProjects = 2;
        tmpSalary = (tmpSalary * (1.5)) + (tmpSalary * (0.01 * nrProjects));
        return  tmpSalary;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "code=" + code +
                ", projects='" + projects + '\'' +
                ", contractDate=" + contractDate +
                "} " + super.toString();
    }
}
