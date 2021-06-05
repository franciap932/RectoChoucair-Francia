package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Abrir;
import tasks.IngresarSeccionEmpleo;
import tasks.SeleccionarPrepararteparaAplicar;

public class PreparateStepdefinition {


    @Dado("^que quiero ingresar a la pagina choucair$")
    public void queQuieroIngresarALaPaginaChoucair() {
        OnStage.theActorCalled("francia").wasAbleTo(Abrir.laPaginadeInicioChoucair());
    }

    @Dado("^dar clic en la seccion Empleo$")
    public void darClicEnLaSeccionEmpleo() {
OnStage.theActorInTheSpotlight().attemptsTo(IngresarSeccionEmpleo.paraPderVerElContenidoDeEsta());
    }

    @Cuando("^voy a la opcion prepararse para aplicar$")
    public void voyALaOpcionPrepararseParaAplicar() {
OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPrepararteparaAplicar.paraPoderVerElContenidoDeEstudio());
    }

    @Entonces("^puedo ver los link de estudio$")
    public void puedoVerLosLinkDeEstudio() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPrepararteparaAplicar.paraPoderVerElContenidoDeEstudio());

    }

}
