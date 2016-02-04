package test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;


 
public class Testgwt implements EntryPoint {
   
  public void onModuleLoad() {
     
    Polymer.importHref("iron-icons/iron-icons.html", new Function() {
        public Object call(Object arg) {
            // The app is executed when all imports succeed.
            startApplication();
            return null;
        }
    });
  }
  
  
  private void startApplication() {
    
    RootPanel.get("body").clear();
    
    RootPanel.get("body").add(new MyView());
    GWT.log("Running123");
    
    
  }
}
