
public class Hideout<T> {

    private T element;

    public void putIntoHideout(T toHide){
        if (element != null) {
            element = null;
        }
        element = toHide;
    }

    public T takeFromHideout(){
        if (isInHideout()){
            T returned = element;
            element = null;
            return returned;
        }
        return null;
    }

    public boolean isInHideout(){
        return element != null;
    }
}
