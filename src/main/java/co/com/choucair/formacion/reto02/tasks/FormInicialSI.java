package co.com.choucair.formacion.reto02.tasks;

import co.com.choucair.formacion.reto02.userinterface.FormInicialSIPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormInicialSI implements Task {
    public static FormInicialSI OnThePage(){
        return Tasks.instrumented(FormInicialSI.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){

        actor.attemptsTo(
                Click.on(FormInicialSIPage.BOTONCONTINAUR),
                Click.on(FormInicialSIPage.SELECCIONESI),
                Enter.theValue("10000000").into(FormInicialSIPage.MONTO),
                Enter.theValue("48").into(FormInicialSIPage.MESES),
                Click.on(FormInicialSIPage.Fecha),
                Click.on(FormInicialSIPage.Fecha_Año),
                Click.on(FormInicialSIPage.Fecha_Mes),
                Click.on(FormInicialSIPage.Fecha_Dia),
                Click.on(FormInicialSIPage.SIMULAR)
               // Click.on(FormInicialSIPage.CAPTCHA)

        );
    }
}




