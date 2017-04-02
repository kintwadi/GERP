
package gerp.util;

import gerp.ControllerSkoop;
import java.io.PrintStream;
import java.util.Map;
import javafx.scene.control.Label;

/**
 *
 * @author skoop
 */
public class GuiComponents <V>  {
    
    private PrintStream out;
    public GuiComponents(){
        out = System.out;
    }
   
    public  void print(V message){
        out.print(message);
    }
    public Map<String,V>getMapComponents(Map<String,V> components){
        return components;
    }
    
    /*
    Aqui o seu parceiro consegue fazer uso dos teus compomentes gui 
    passados para fora do controller através do metódo getMapComponents
    */
    public static void getControllerExternInstance(ControllerSkoop controller){
        
       Label label = (Label) controller.getMapComponets().get("label");
       label.setText("out of controller context");
        
    }
    
    
    
    
     
}
