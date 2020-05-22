package jsonsimpleexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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
 * <p>
 * Class that reads a JSON file
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
public class JsonReader {

    /**
     * Reads a {@link Person person} data from JSON file
     *
     * @param path to the JSON file
     * @return {@link Person person} data
     *
     * @throws FileNotFoundException Signals that an attempt to open the file
     * denoted by a specified pathname has failed.
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred. This class is the general class of exceptions produced by
     * failed or interrupted I/O operations
     * @throws ParseException Signals that an error has been reached
     * unexpectedly while parsing
     */
    public static Person readPersonFromJsonFile(String path) throws FileNotFoundException, IOException, ParseException {
        JSONObject resultObject;
        JSONParser parser = new JSONParser();

        Reader reader = new FileReader(path);
        resultObject = (JSONObject) parser.parse(reader);

        String name = (String) resultObject.get("name");

        JSONArray jsonTelephoneNumbers = (JSONArray) resultObject.get("telephoneNumbers");
        String[] telephoneNumbers = new String[jsonTelephoneNumbers.size()];
        for (int i = 0; i < jsonTelephoneNumbers.size(); i++) {
            telephoneNumbers[i] = jsonTelephoneNumbers.get(i).toString();
        }
        return new Person(name, telephoneNumbers);
    }
}
