package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PrepararseParaAplica;

public class SeleccionarPrepararteparaAplicar implements Task {


    public static SeleccionarPrepararteparaAplicar paraPoderVerElContenidoDeEstudio() {
        return Tasks.instrumented(SeleccionarPrepararteparaAplicar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(PrepararseParaAplica.PREPARASE_APLICAR));
    }
}
