package menu;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClasePrincipal extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        MenuBar menubar=new MenuBar();
        Menu menu1=new Menu("Opciones");
        Menu menu2=new Menu("Archivos");
        Menu menu3=new Menu("Editar");
        MenuItem item1=new MenuItem("Cargar");
        MenuItem item2=new MenuItem("Guardar");
        SeparatorMenuItem sepMen = new SeparatorMenuItem();
        MenuItem exit=new MenuItem("Exit");
        
        
        menu1.getItems().addAll(item1,item2,sepMen,exit);
        
        menu1.setOnShowing((t) -> {
            System.out.println("Mostrando Opciones");
        });
        menu1.setOnHiding((t) -> {
            System.out.println("Ocultando Opciones");
        });
        item1.setOnAction((t) -> {
            System.out.println("Has seleccionado Guardar");
        });
        item2.setOnAction((t) -> {
            System.out.println("Has seleccionado Cargar");
        });
        exit.setOnAction((t) -> {
            System.exit(0);
        });
        
        menubar.getMenus().addAll(menu1,menu2,menu3);
        
        VBox vBox = new VBox(menubar);
        Scene scene = new Scene(vBox,250,300);
        
        stage.setScene(scene);
        stage.show();
    }
}
