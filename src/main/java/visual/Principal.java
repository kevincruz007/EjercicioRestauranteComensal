package visual;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
/**
 * Created by alumno on 12/07/2017.
 *
 * Enunciado
 *
 * Crear un método que publique los nombres de las primeras 3 personas que más asisten.
 * Realizar la clase e interfaces para generar de manera visual la edición de
 * restaurantes y comensales, impuestos.
 *
 */
@SpringUI
public class Principal extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addComponent(new Button("Hola"));
        setContent(verticalLayout);
    }
}
