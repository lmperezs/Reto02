package co.com.choucair.formacion.reto02.tasks;

import co.com.choucair.formacion.reto02.userinterface.FormInicialNOPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormInicialNO implements Task {

    public static FormInicialNO OnThePag() {
        return Tasks.instrumented(FormInicialNO.class);
    }

   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(FormInicialNOPage.BOTON),
                Click.on(FormInicialNOPage.ButtonNo),
                Enter.theValue("100000").into(FormInicialNOPage.Monto_Cuotas),
                Enter.theValue("48").into(FormInicialNOPage.Meses),
                Click.on(FormInicialNOPage.Fecha),
                Click.on(FormInicialNOPage.Fecha_Año),
                Click.on(FormInicialNOPage.Fecha_Mes),
                Click.on(FormInicialNOPage.Fecha_Dia),
                Click.on(FormInicialNOPage.Button_Simul)
        );
    }
}