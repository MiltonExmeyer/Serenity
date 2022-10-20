package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//INICIAR QUE LA PRUEBA SE VA EJECUTAR CON SERENITY
@RunWith(CucumberWithSerenity.class)

//RELACION DE DONDE ESTA UBICADO NUESTRA CONFIGURADO

@CucumberOptions(
        features = "src/test/resources/features/MercadoLibre.feature", //UBICACIÓN DONDE SE ENCUENTRA NUESTRO FEACTURES
        glue = "stepDefinitions", //UBICACIÓN DE DONDE SE ENCUENTRA NUESTRO STEPS
        tags = "", // UBICACIÓN DE DONDE SE ENCUENTRA NUESTRAS TAREAS
        snippets = CucumberOptions.SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)
public class MercadoLibreRunner {

}
