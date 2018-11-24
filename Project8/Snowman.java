//************************************************************************
// Snowman.java project for reference
//  
//  Demonstrates the translation of a set of shapes.
//************************************************************************

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import java.lang.*;


public class Snowman extends Application
{

   //--------------------------------------------------------------------
   //  Presents a snowman scene.
   //--------------------------------------------------------------------
   public void start(Stage primaryStage)
   {  
      // Text 
      Text hello = new Text(400, 300, "Snow Day!");
      // Bottom circle for body    
      Ellipse base = new Ellipse(80, 210, 80, 60);
      base.setFill(Color.WHITE);
      // Middle circle for body
      Ellipse middle = new Ellipse(80, 130, 50, 40);
      middle.setFill(Color.WHITE);
      // Head top circle for body
      Circle head = new Circle(80, 70, 30);
      head.setFill(Color.WHITE);
      // Eyes
      Circle rightEye = new Circle(70, 60, 5);
      rightEye.setFill(Color.BLUE);
      Circle leftEye = new Circle(90, 60, 5);
      leftEye.setFill(Color.BLUE);
      // Mouth
      Arc mouth = new Arc(80, 70, 20, 15, 220,100);
      mouth.setType(ArcType.OPEN);
      mouth.setStroke(Color.BLACK);
      mouth.setFill(null);
      // Buttons
      Circle topButton = new Circle(80, 120, 6);
      topButton.setFill(Color.RED);
      Circle bottomButton = new Circle(80, 140, 6);
      bottomButton.setFill(Color.RED);
      // Arms
      Line leftArm = new Line(110, 130, 160, 100);
      leftArm.setStrokeWidth(3);
      Line rightArm = new Line(50, 130, 0, 130);
      rightArm.setStrokeWidth(3);
      // Hat
      Rectangle highlight = new Rectangle (75, 5, 8, 40);
      Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
      Rectangle brim = new Rectangle(50, 45, 60, 5);
      highlight.setFill(Color.LIGHTGREEN);
      // *Group: hat
      Group hat = new Group(stovepipe, brim, highlight);
      hat.setTranslateX(-10);
      hat.setRotate(-15);
      
      
      // Create new color
      Color dirtySnow = Color.rgb(200,220,220);
      
      // Rays 
      Line ray1 = new Line(5, 5, 70, 60); //Ray1
      ray1.setStrokeWidth(2);
      ray1.setStroke(Color.YELLOW);
      Line ray2 = new Line(20, 5, 75, 35); //Ray2
      ray2.setStroke(Color.YELLOW);
      ray2.setStrokeWidth(2);
      Line ray3 = new Line(20, -5, 100, 20); //Ray3
      ray3.setStroke(Color.YELLOW);
      ray3.setStrokeWidth(2);
      Line ray4 = new Line(5, 15, 40, 60); //Ray4
      ray4.setStroke(Color.YELLOW);
      ray4.setStrokeWidth(2);
      Line ray5 = new Line(2, 25, 20, 80); //Ray5
      ray5.setStroke(Color.YELLOW);
      ray5.setStrokeWidth(2);
      
      // *Group: rays
      Group rays = new Group(ray1, ray2, ray3, ray4, ray5);
      // *Group: head
      Group headGroup = new Group(head, leftEye, rightEye, mouth, hat);

      // *Group: snowman
      Group snowman = new Group(leftArm, base, middle,  rightArm, 
         topButton, bottomButton, headGroup);     
      
      // Adjust x and y
      snowman.setTranslateX(200);
      snowman.setTranslateY(50);
      // Sun
      Circle sun = new Circle(5, 5, 45);
      sun.setFill(Color.GOLD);
      // Ground
      Rectangle ground = new Rectangle(0, 250, 500, 100);
      ground.setFill(dirtySnow);
      
   
      // Creates extra button and adds to group snowman
      Circle extraButton = new Circle(80, 160, 6);
      extraButton.setFill(Color.GREEN);
      snowman.getChildren().add(extraButton);
      
      // Creates extra ray and adds to group rays
 
   
      //Make background random color
      Random rand = new Random();
     // int r = rand.nextInt(255);
     // int g = rand.nextInt(255);
      //int b = rand.nextInt(255);
      //Create randomBackground color
      Color background = Color.rgb(0, 0, 0);
      // Create rectangle sky
      Rectangle sky = new Rectangle(0, 0, 500, 250);
      //set sky to randomBackground color
      sky.setFill(background);
   Group snowflakes = new Group();
      // Snow
      for (int i=0; i<100; i++) {
         int x = rand.nextInt(500);
         int y = rand.nextInt(750);
         int radius = rand.nextInt(3);
         
         Circle snowflake = new Circle(x, y, radius);
         snowflake.setFill(Color.WHITE);
         snowflakes.getChildren().add(snowflake);
      }
   
      
   
      // *Group: root
      Group root = new Group(snowflakes, ground, rays, sun, snowman, hello);
      // Scene 
      Scene scene = new Scene(root, 500, 350, background);
      
      primaryStage.setTitle("Snowman");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}