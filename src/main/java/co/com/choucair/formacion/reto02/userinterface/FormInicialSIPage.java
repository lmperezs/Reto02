package co.com.choucair.formacion.reto02.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FormInicialSIPage extends PageObject {

    public static final Target BOTONCONTINAUR = Target.the
            ("Seleccione el boton continuar").located(By.xpath("//BUTTON[@id='boton-seleccion-tarjeta']"));

    public static final Target SELECCIONESI = Target.the
            ("Seleccione SI").located(By.xpath("(//LABEL[@class='mat-radio-label'])[1]"));

    public static final Target MONTO = Target.the
            ("Digite un monto").located(By.xpath("//INPUT[@id='valor-simulacion']"));

    public static final Target MESES = Target.the
            ("Digite los meses de plazo entre 48 y 84").located(By.xpath("//INPUT[@id='valor-plazo']"));

    public static final Target Fecha= Target.the("Click en fecha")
            .located(By.xpath("//INPUT[@id='campo-fecha']"));

    public static final Target Fecha_Año = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 1997 ']"));

    public static final Target Fecha_Mes = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' ABR ']"));

    public static final Target Fecha_Dia = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 11 ']"));

    public static final Target SIMULAR = Target.the
            ("Seleccione simular").located(By.xpath("//BUTTON[@id='boton-simular']"));

   //public static final Target CAPTCHA = Target.the
     //      ("Seleccione el captcha").located(By.xpath("//*[@id=\"rc-imageselect\"]/div[2]"));


}
