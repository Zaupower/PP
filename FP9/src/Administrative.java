import enums.ContractType;
import enums.Habilitacoes;

import java.time.LocalDate;

public class Administrative extends Colaborator{

    private String initials;
    private ContractType contractType;
    private Habilitacoes habilitacoes;
    /**
     * O inicio do contrato pode nao estar definido
     * para isso serao criados dois construtores,
     * um com as datas de inicio e fim e outro sem
     */
    private LocalDate beginContract;
    private LocalDate endContract = null;

    /**
     *
     * @param name
     * @param birthDate
     * @param address
     * @param citizenCard
     * @param vatNumber
     * @param baseSalary
     * @param initials
     * @param contractType
     * @param habilitacoes
     * @param beginContract
     * @param endContract
     */
    public Administrative(String name, LocalDate birthDate,
                          String address, int citizenCard,
                          int vatNumber, double baseSalary,
                          String initials, ContractType contractType,
                          Habilitacoes habilitacoes, LocalDate beginContract,
                          LocalDate endContract) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.habilitacoes = habilitacoes;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    /**
     *
     * @param name
     * @param birthDate
     * @param address
     * @param citizenCard
     * @param vatNumber
     * @param baseSalary
     * @param initials
     * @param contractType
     * @param habilitacoes
     *
     * Contrato sem datas de fim
     */
    public Administrative(String name, LocalDate birthDate, String address,
                          int citizenCard, int vatNumber, double baseSalary,
                          String initials, ContractType contractType,
                          Habilitacoes habilitacoes, LocalDate beginContract) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.habilitacoes = habilitacoes;
        this.beginContract = beginContract;
    }

    /**
     *
     * @param endContract
     * @return
     * Metodo para determinar se o contrato e indeterminado
     */
    public String getEndContract(LocalDate endContract) {
        String tmpLocalDate= null;
        if (this.endContract == null){
            tmpLocalDate = "Contrato sem termo";
        }else {
            tmpLocalDate = this.endContract.toString();
        }
        return tmpLocalDate;
    }

    /**
     *
     * @return
     * Calcula o salario consuante
     * as habilitacoes literarias
     */
    @Override
    double setSalary() {
        double tmpSalary = 0;
        if (this.habilitacoes == Habilitacoes.LICENCIATURA){
            tmpSalary = getBaseSalary() + getBaseSalary() * 0.10;
            System.out.println(getBaseSalary()+" tmp:"+tmpSalary);
        }else if (this.habilitacoes == Habilitacoes.MESTRADO){
            tmpSalary = getBaseSalary() + getBaseSalary() * 0.20;
        }else if (this.habilitacoes == Habilitacoes.DOUTORAMENTO){
            tmpSalary = getBaseSalary() + getBaseSalary() * 0.30;
        }
        return tmpSalary;
    }

    /**
     *
     * @return
     * ToString Method
     */
    @Override
    public String toString() {
        return "Administrative{" +
                "initials='" + initials + '\'' +
                ", contractType=" + contractType +
                ", habilitacoes=" + habilitacoes +
                ", beginContract=" + beginContract +
                ", endContract=" + getEndContract(this.endContract) +
                "} " + super.toString();
    }
}
