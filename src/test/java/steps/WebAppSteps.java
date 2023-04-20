package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AffarePage;
import pages.CasaTerminacionesUnicas;
import pages.CasaVentaPage;

public class WebAppSteps {
    AffarePage webAppPage = new AffarePage();
    CasaVentaPage casaVentaPage = new CasaVentaPage();
    CasaTerminacionesUnicas casaTerminacionesUnicas = new CasaTerminacionesUnicas();

    @Given("Ingresar a la pagina")
    public void ingresarAwebapp() {
        System.out.println("ingreso a webapp");
        webAppPage.dirigirseASitioWeb();
    }

    @When("selecciono Nosotros")
    public void seleccionoNosotros() {
        webAppPage.clickNosotros();
    }

    @Then("visualizar la informacion de la pagina nosotros")
    public void muestraPaginaNosotros(){
        webAppPage.dirigirseASitioWebNosotros();
        }

    @When("selecciono ver propiedad de la casa tranquilidad en el Lago")
    public void seleccionoVerPropiedad() {
        webAppPage.clickVerPropiedad();
        webAppPage.dirigirseAverPropiedad();
    }

    @And("se describe las caracteristicas de la misma")
    public void caracteristicasPropiedad() {
        webAppPage.dirigirseAverPropiedad();
    }

    @And("verificar que el precio sea 3,000.000")
    public void verificarPrecioPropiedad() {
        casaVentaPage.verificarPrecio();
    }

    @When("selecciono ver propiedad de la casa terminaciones unicas")
    public void seleccionoVerPropiedadTerminaciones() {
        webAppPage.clickVerPropiedad();
        webAppPage.dirigirseAverPropiedad();
    }

    @Then("verificar que tenga 3 banos")
    public void muestraPaginaCasaUnicas(){
        System.out.println("Pasa por aca");
        casaTerminacionesUnicas.verificarCantidadBanos();
    }

}

