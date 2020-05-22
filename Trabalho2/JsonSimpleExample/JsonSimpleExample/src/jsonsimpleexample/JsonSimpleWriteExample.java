package jsonsimpleexample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 * <h2>
 * Escola Superior de Tecnologia e Gestão (ESTG)<br>
 * Politécnico do Porto (PP)<br>
 * Licenciatura em Engenharia Informática (LEI)<br>
 * Licenciatura em Segurança Informática em Redes de Computadores (LSIRC)<br>
 * Paradigmas de Programação (PP)<br>
 * 2019 / 2020<br>
 * </h2>
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
public class JsonSimpleWriteExample {

    public static void main(String[] args) {
        String[] telephoneNumbers = {
            "911111111",
            "92222222"
        };
        Person person = new Person("Pedro", telephoneNumbers);

        try {
            JsonWriter.writesPersonFromJsonFile("files/test.json", person);
        } catch (IOException ex) {
            Logger.getLogger(JsonSimpleWriteExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            person = JsonReader.readPersonFromJsonFile("files/test.json");
            System.out.println(person.toString());
        } catch (IOException | ParseException ex) {
            Logger.getLogger(JsonSimpleWriteExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
