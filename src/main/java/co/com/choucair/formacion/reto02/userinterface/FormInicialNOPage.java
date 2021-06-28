package co.com.choucair.formacion.reto02.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormInicialNOPage extends PageObject {

    public static final Target BOTON = Target.the
         ("Seleccione el boton continuar").located(By.xpath("//BUTTON[@id='boton-seleccion-tarjeta']"));

    public static final Target ButtonNo = Target.the("Seleccione No")
            .located(By.id("opcion-no"));

    public static final Target Monto_Cuotas = Target.the("Digite un monto")
            .located(By.xpath("//INPUT[@id='valor-simulacion']"));

    public static final Target Meses = Target.the("Digite los meses de plazo entre 48 y 84")
            .located(By.xpath("//INPUT[@id='valor-plazo']"));

    public static final Target Fecha= Target.the("Click en fecha")
            .located(By.xpath("//INPUT[@id='campo-fecha']"));

    public static final Target Fecha_Año = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 1990 ']"));

    public static final Target Fecha_Mes = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' OCT ']"));

    public static final Target Fecha_Dia = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 8 ']"));

    public static final Target Button_Simul = Target.the("Boton Validar")
            .located(By.xpath("//BUTTON[@id='boton-simular']"));

}