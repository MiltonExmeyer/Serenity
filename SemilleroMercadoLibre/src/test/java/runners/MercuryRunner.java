package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//INDICIAR QUE LA PRUEBA SE VA A EJECUTAR CON SERENITY
@RunWith(CucumberWithSerenity.class)

//RELACION DE DONDE ESTA UBICADO NUESTRA CONFIGURACION
@CucumberOptions(
        features = "src/test/resources/feactures/MercuryTours.feature",//UBICACION DONDE SE ENCUENTRA NUESTRO FEACTURES
        glue = "stepDefinitions",//UBICACION DONDE SE ENCUENTRA NUESTROS STEPS
        tags ="",//UBICACION DONDE SE ENCUENTRANUESTRAS TAREAS
        snippets = CucumberOptions.SnippetType.CAMELCASE//INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)
public class MercuryRunner {
}
