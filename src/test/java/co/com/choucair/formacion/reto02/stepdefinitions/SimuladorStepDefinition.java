package co.com.choucair.formacion.reto02.stepdefinitions;

import co.com.choucair.formacion.reto02.tasks.FormInicialNO;
import co.com.choucair.formacion.reto02.tasks.FormInicialSI;
import co.com.choucair.formacion.reto02.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SimuladorStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Laura quiere ingresar al simulador de creditos$")
    public void queLauraQuiereIngresarAlSimuladorDeCreditos(){
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(),(FormInicialSI.OnThePage()));//(FormInicialNO.OnThePag())//);
    }


    @Cuando("^Laura ingrese los campos solicitados$")
    public void lauraIngreseLosCamposSolicitados() {

    }

    @Entonces("^Laura puede visualizar la simulacion de su credito$")
    public void lauraPuedeVisualizarLaSimulacionDeSuCredito() {

    }

}
