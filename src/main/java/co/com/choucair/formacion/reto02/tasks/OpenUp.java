package co.com.choucair.formacion.reto02.tasks;

import co.com.choucair.formacion.reto02.userinterface.SimuladorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private SimuladorPage SimuladorPage;
    public static OpenUp thePage(){

    return Tasks.instrumented(OpenUp.class);
       
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(SimuladorPage));

    }
}
