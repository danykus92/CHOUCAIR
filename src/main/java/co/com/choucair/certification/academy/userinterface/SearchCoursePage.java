package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona  Cursos y Certificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("buscar curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da clicK para buscar curso").located(By.xpath("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da clicK para buscar curso").located(By.xpath("//h4//a[contains(text(),'Foundation Express')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h3//a[contains(text(),'Foundation Express')]"));

}