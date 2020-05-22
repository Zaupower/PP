package jsonsimpleexample;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
 * Class that writes a JSON file
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
public class JsonWriter {

    /**
     * Writes a {@link Person person} data to JSON file
     *
     * @param path to the JSON file
     * @param person {@link Person person} data
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred. This class is the general class of exceptions produced by
     * failed or interrupted I/O operations.
     */
    public static void writesPersonFromJsonFile(String path, Person person) throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("name", person.getName());

        JSONArray list = new JSONArray();
        for (String telefoneNumber : person.getTelefoneNumbers()) {
            list.add(telefoneNumber);
        }

        obj.put("telephoneNumbers", list);

        try (FileWriter file = new FileWriter(path)) {
            file.write(obj.toJSONString());
        }
    }
}
