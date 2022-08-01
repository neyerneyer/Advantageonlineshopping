package co.com.tyba.reto.advantageonlineshopping.setup.datadefinition;

import co.com.tyba.reto.advantageonlineshopping.models.ModeloContacto;
import co.com.tyba.reto.advantageonlineshopping.models.ModeloSesion;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DefinicionModelo {
    @DataTableType
    public ModeloSesion modelLoginEntry(Map<String, String> entry) {
        return new ModeloSesion(
                entry.get("user"),
                entry.get("pass")
        );
    }

    @DataTableType
    public ModeloContacto modelContactEntry(Map<String, String> entry) {
        return new ModeloContacto(
                entry.get("category"),
                entry.get("product"),
                entry.get("email"),
                entry.get("subject")
        );
    }
}
