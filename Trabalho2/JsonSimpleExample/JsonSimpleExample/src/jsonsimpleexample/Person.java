package jsonsimpleexample;

/**
 * <h2>
 * Escola Superior de Tecnologia e Gestão (ESTG)<br>
 * Politécnico do Porto (PP)<br>
 * Licenciatura em Engenharia Informática (LEI)<br>
 * Licenciatura em Segurança Informática em Redes de Computadores (LSIRC)<br>
 * Paradigmas de Programação (PP)<br>
 * 2019 / 2020<br>
 * </h2>
 * <p>
 * Class representing the Person structure
 * </p>
 * * <p>
 * Authors:
 * </p>
 * <ul>
 * <li>@author <a href="rjs@estg.ipp.pt">Ricardo Santos</a></li>
 * <li>@author <a href="bmo@estg.ipp.pt">Bruno Oliveira</a></li>
 * <li>@author <a href="fas@estg.ipp.pt">Fábio Silva</a></li>
 * <li>@author <a href="jrmr@estg.ipp.pt">João Ramos</a></li>
 * <li>@author <a href="oao@estg.ipp.pt">Óscar Oliveira</a></li>
 * </ul>
 *
 */
public class Person {

    private final String name;
    private final String[] telephoneNumbers;

    public Person(String name, String[] telephoneNumbers) {
        this.name = name;
        this.telephoneNumbers = telephoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String[] getTelefoneNumbers() {
        return telephoneNumbers;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Person: \n" + "name=" + name + "\nTelephoneNumbers:\n");
        for (String tn : this.getTelefoneNumbers()) {
            str.append(tn).append("\n");
        }
        return str.toString();
    }

}
