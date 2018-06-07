
package simonsays;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Couleur extends Parent {
    
    public Couleur(){
        
        Rectangle fond_clavier = new Rectangle();
        fond_clavier.setWidth(400);
        fond_clavier.setHeight(400);
        fond_clavier.setArcWidth(30);
        fond_clavier.setArcHeight(30);
        fond_clavier.setFill(Color.BLACK);

        this.setTranslateX(50);//on positionne le groupe plutôt que le rectangle
        this.setTranslateY(250);
        this.getChildren().add(fond_clavier);
        
    }
    
}
