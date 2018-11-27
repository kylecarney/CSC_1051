import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

//************************************************************************
//  Shapes.java       Author: M A Papalaskari
//
//  Demonstrates the use of polygons and polylines. 
//  Also demonstrates the use of arrays as parameters.
//************************************************************************

public class Shapes extends Application
{
    //--------------------------------------------------------------------
    //  Displays shapes using polygons and polyline.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        double[] trianglePoints = {100, 150, 120, 40,  150, 110};
        
        Polygon triangle = new Polygon(trianglePoints);
        triangle.setFill(Color.RED);
        
        double[] pentagonPoints = {35, 70, 35, 40, 60, 20, 80, 40, 80, 60};

        Polygon pentagon = new Polygon(pentagonPoints);
        pentagon.setFill(Color.MAROON);
        
        // addTen(trianglePoints);
        
        Polyline vee = new Polyline(trianglePoints); // note: using same array
        vee.setStroke(Color.GREEN);
        vee.setStrokeWidth(3);
        
        Group root = new Group(triangle, pentagon, vee);
        
        Scene scene = new Scene(root, 200, 200, Color.BLACK);
        
        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
      
      
    // adds ten to each entry in the array a
    public void addTen(double[] a)
    {
      for (int i = 0; i < a.length; i++)
         a[i] = a[i] + 10;
    }

    
    public static void main(String[] args)
    {
        launch(args);
    }
}