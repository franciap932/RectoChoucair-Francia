package tasks;

import cucumber.api.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.DarclicEnSeccionEmpleo;

public class IngresarSeccionEmpleo  implements Task {

    public static IngresarSeccionEmpleo paraPderVerElContenidoDeEsta() {
        return Tasks.instrumented(IngresarSeccionEmpleo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(DarclicEnSeccionEmpleo.EMPLEO));
    }
}
