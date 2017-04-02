
package gerp.util;

/**
 *
 * @author skoop
 * @param <T>
 */
public interface IGuiComponents<T>{
    //public  Map<String, V> getGuiComponents();
    //public  <T extends IGuiComponents<T>> Map<String,T> getMapComponets(Map<String,T> components);
    public boolean compareTo(T to);
}
