package july25;

import java.awt.desktop.SystemEventListener;

public class Language {
    protected String name;
    public String toString(){
        return name;
    }
    public void sayHello(){
        System.out.println("Should not be called directly");
    }
}
