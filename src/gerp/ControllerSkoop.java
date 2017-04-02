/*
 Este controller é um exemplo de como teremos que personalizar nossos controller 
 afim de podermos passar os componentes do gui aos parceiros 
 */
package gerp;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import static gerp.util.GuiComponents.getControllerExternInstance;

/**
 *
 * @author skoop
 */
public class ControllerSkoop implements Initializable {

    @FXML
    private Label label;
    private @FXML
    Button btn;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        // label.setText("Hello World!");
        
        /* deverá chamar este metódo em qualquer lugar do seu controller para que seu parceiro consiga
         uma instancia do seu controler
        */
        getControllerExternInstance(this);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /*
    @Param void
    @return type Map
    prepare este metódo para que possa enviar os componentes da sua gui fora do seu controller
    */
    public Map<String, Object> getMapComponets() {
        Map<String, Object> components = new HashMap<>();
        components.put("label", label);
        return components;
    }

}
