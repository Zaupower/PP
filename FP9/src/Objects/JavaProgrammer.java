package Objects;

import enums.ProgrammerType;

import java.time.LocalDate;

public class JavaProgrammer extends Colaborator{

    /**
     *
     */
    private int code;
    private int programmingYers;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(String name, LocalDate birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
    }

    /**
     *
     * @return
     */
    @Override
    double setSalary() {
        double tmpSalary = getBaseSalary() * 1.05;
        if (programmerType == ProgrammerType.JUNIOR) {
            tmpSalary = (tmpSalary + tmpSalary * 0.05) + tmpSalary * (0.05 * this.programmingYers) ;
        } else if (programmerType == ProgrammerType.SENIOR) {
            tmpSalary = (tmpSalary + tmpSalary * 0.15) + tmpSalary * (0.05 * this.programmingYers) ;
        }
        return tmpSalary;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "JavaProgrammer{" +
                "code=" + code +
                ", programmingYers=" + programmingYers +
                ", projectName='" + projectName + '\'' +
                ", programmerType=" + programmerType +
                "} " + super.toString();
    }
}
