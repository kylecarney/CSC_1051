//************************************************************************
//  Pacman.Java            Author: Kyle Carney
//
//  Project 8
//************************************************************************
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.*;

public class Pacman extends Application
{
    //--------------------------------------------------------------------
    //  Presents Pacman scene
    //--------------------------------------------------------------------
   public void start(Stage primaryStage)
   { 
   
      // Ready text 
      Text ready = new Text(245, 368, "READY!");
      ready.setFill(Color.YELLOW);
      ready.setStyle("-fx-font: 25 Arial");
 
      //Group highScore
      Group highScore = new Group();
      //High Score text
      Text highScoreText = new Text(100, 24, "HIGH SCORE");
      highScoreText.setFill(Color.WHITE);
      highScoreText.setStyle("-fx-font: 18 Arial");
      highScore.getChildren().add(highScoreText);
     
      //High score text
      Text highScoreNumber = new Text(170, 42, "0000");
      highScoreNumber.setFill(Color.WHITE);
      highScoreNumber.setStyle("-fx-font: 18 Arial");
      highScore.getChildren().add(highScoreNumber);
     
      //Pacman circle     
      Circle pacman = new Circle(290, 480, 15);
      pacman.setFill(Color.YELLOW);
      
      //Group pacTriangles for cutout in pacman
      Group pacTriangles = new Group();
      //Pacman2
      Circle pacman2 = new Circle(60, 640, 15);
      pacman2.setFill(Color.YELLOW);
      //Triangle for pacman2
      Polygon triangle1 = new Polygon();
      triangle1.getPoints().addAll(45.0,623.0,62.0,640.0,45.0,657.0);
      triangle1.setFill(Color.BLACK);
      triangle1.setStroke(Color.BLACK);  
      pacTriangles.getChildren().add(triangle1);
      
      //Pacman3
      Circle pacman3 = new Circle(95, 640, 15);
      pacman3.setFill(Color.YELLOW);
      //Triangle for pacman3
      Polygon triangle2 = new Polygon();
      triangle2.getPoints().addAll(80.0,623.0,97.0,640.0,80.0,657.0);
      triangle2.setFill(Color.BLACK);
      triangle2.setStroke(Color.BLACK);  
      pacTriangles.getChildren().add(triangle2);
   
      //new group monster
      Group monsters = new Group();
      
      //monster1 Group
 
      //monster1
      Ellipse monster1 = new Ellipse(242, 320, 12, 12);
      monster1.setFill(Color.ORANGE);
      monster1.setStroke(Color.ORANGE);  
      monsters.getChildren().add(monster1);
      //monster1 left eye
      Ellipse rightEyeMonster1 = new Ellipse(237,318,3,4);
      rightEyeMonster1.setFill(Color.WHITE);
      rightEyeMonster1.setStroke(Color.WHITE);
      monsters.getChildren().add(rightEyeMonster1);
      //monster1 right eye color
      Ellipse rightEyeMonster11 = new Ellipse(236,319,1,2);
      rightEyeMonster11.setFill(Color.BLUE);
      rightEyeMonster11.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster11);
      //monster1 right eye
      Ellipse leftEyeMonster1 = new Ellipse(247,318,3,4);
      leftEyeMonster1.setFill(Color.WHITE);
      leftEyeMonster1.setStroke(Color.WHITE);
      monsters.getChildren().add(leftEyeMonster1);
      //monster1 left eye color
      Ellipse rightEyeMonster12 = new Ellipse(246,319,1,2);
      rightEyeMonster12.setFill(Color.BLUE);
      rightEyeMonster12.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster12);
      //bottom triangles for monster1
      //triangle1 monster1
      Polygon triangle1Monster1 = new Polygon();
      triangle1Monster1.getPoints().addAll(230.0,324.0,230.0,336.0,240.0,325.0);
      triangle1Monster1.setFill(Color.ORANGE);
      triangle1Monster1.setStroke(Color.ORANGE);  
      pacTriangles.getChildren().add(triangle1Monster1);
      //triangle1 monster1
      Polygon triangle2Monster1 = new Polygon();
      triangle2Monster1.getPoints().addAll(235.0,325.0,239.0,336.0,250.0,325.0);
      triangle2Monster1.setFill(Color.ORANGE);
      triangle2Monster1.setStroke(Color.ORANGE);  
      pacTriangles.getChildren().add(triangle2Monster1);
      //triangle3 monster1
      Polygon triangle3Monster1 = new Polygon();
      triangle3Monster1.getPoints().addAll(240.0,325.0,249.0,336.0,253.0,325.0);
      triangle3Monster1.setFill(Color.ORANGE);
      triangle3Monster1.setStroke(Color.ORANGE);  
      pacTriangles.getChildren().add(triangle3Monster1);
      //triangle4 monster1
      Polygon triangle4Monster1 = new Polygon();
      triangle4Monster1.getPoints().addAll(242.0,323.0,257.0,336.0,254.0,322.0);
      triangle4Monster1.setFill(Color.ORANGE);
      triangle4Monster1.setStroke(Color.ORANGE);  
      pacTriangles.getChildren().add(triangle4Monster1);   
                        
      //monster2
      Ellipse monster2 = new Ellipse(274, 320, 12, 12);
      monster2.setFill(Color.RED);
      monster2.setStroke(Color.RED);  
      monsters.getChildren().add(monster2);  
      //monster2 left eye
      Ellipse rightEyeMonster2 = new Ellipse(270,318,3,4);
      rightEyeMonster2.setFill(Color.WHITE);
      rightEyeMonster2.setStroke(Color.WHITE);
      monsters.getChildren().add(rightEyeMonster2);
      //monster2 right eye color
      Ellipse rightEyeMonster21 = new Ellipse(272,319,1,2);
      rightEyeMonster21.setFill(Color.BLUE);
      rightEyeMonster21.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster21);
      //monster2 right eye
      Ellipse leftEyeMonster2 = new Ellipse(280,318,3,4);
      leftEyeMonster2.setFill(Color.WHITE);
      leftEyeMonster2.setStroke(Color.WHITE);
      monsters.getChildren().add(leftEyeMonster2);
      //monster2 left eye color
      Ellipse rightEyeMonster22 = new Ellipse(282,319,1,2);
      rightEyeMonster22.setFill(Color.BLUE);
      rightEyeMonster22.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster22);
      //triangle1 monster2
      Polygon triangle1Monster2 = new Polygon();
      triangle1Monster2.getPoints().addAll(262.0,323.0,261.0,337.0,273.0,323.0);
      triangle1Monster2.setFill(Color.RED);
      triangle1Monster2.setStroke(Color.RED);  
      pacTriangles.getChildren().add(triangle1Monster2); 
      //triangle2 monster2
      Polygon triangle2Monster2 = new Polygon();
      triangle2Monster2.getPoints().addAll(265.0,323.0,271.0,336.0,280.0,323.0);
      triangle2Monster2.setFill(Color.RED);
      triangle2Monster2.setStroke(Color.RED);  
      pacTriangles.getChildren().add(triangle2Monster2); 
      //triangle3 monster2
      Polygon triangle3Monster2 = new Polygon();
      triangle3Monster2.getPoints().addAll(272.0,323.0,279.0,337.0,285.0,323.0);
      triangle3Monster2.setFill(Color.RED);
      triangle3Monster2.setStroke(Color.RED);  
      pacTriangles.getChildren().add(triangle3Monster2); 
      //triangle4 monster2
      Polygon triangle4Monster2 = new Polygon();
      triangle4Monster2.getPoints().addAll(275.0,323.0,288.0,337.0,286.0,323.0);
      triangle4Monster2.setFill(Color.RED);
      triangle4Monster2.setStroke(Color.RED);  
      pacTriangles.getChildren().add(triangle4Monster2); 
                                 
      //monster3
      Ellipse monster3 = new Ellipse(306, 320, 12, 12);
      monster3.setFill(Color.PINK);
      monster3.setStroke(Color.PINK);  
      monsters.getChildren().add(monster3); 
      //monster3 left eye
      Ellipse rightEyeMonster3 = new Ellipse(310,318,3,4);
      rightEyeMonster3.setFill(Color.WHITE);
      rightEyeMonster3.setStroke(Color.WHITE);
      monsters.getChildren().add(rightEyeMonster3);
      //monster3 right eye
      Ellipse leftEyeMonster3 = new Ellipse(301,318,3,4);
      leftEyeMonster3.setFill(Color.WHITE);
      leftEyeMonster3.setStroke(Color.WHITE);
      monsters.getChildren().add(leftEyeMonster3);
      //monster3 right eye color
      Ellipse rightEyeMonster31 = new Ellipse(300,317,1,2);
      rightEyeMonster31.setFill(Color.BLUE);
      rightEyeMonster31.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster31);
      //monster3 left eye color
      Ellipse rightEyeMonster32 = new Ellipse(308,317,1,2);
      rightEyeMonster32.setFill(Color.BLUE);
      rightEyeMonster32.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster32);
      //triangle1 monster3
      Polygon triangle1Monster3 = new Polygon();
      triangle1Monster3.getPoints().addAll(294.0,323.0,292.0,337.0,305.0,323.0);
      triangle1Monster3.setFill(Color.PINK);
      triangle1Monster3.setStroke(Color.PINK);  
      pacTriangles.getChildren().add(triangle1Monster3); 
      //triangle2 monster3
      Polygon triangle2Monster3 = new Polygon();
      triangle2Monster3.getPoints().addAll(297.0,323.0,302.0,337.0,312.0,323.0);
      triangle2Monster3.setFill(Color.PINK);
      triangle2Monster3.setStroke(Color.PINK);  
      pacTriangles.getChildren().add(triangle2Monster3);
      //triangle3 monster3
      Polygon triangle3Monster3 = new Polygon();
      triangle3Monster3.getPoints().addAll(303.0,323.0,310.0,337.0,317.0,323.0);
      triangle3Monster3.setFill(Color.PINK);
      triangle3Monster3.setStroke(Color.PINK);  
      pacTriangles.getChildren().add(triangle3Monster3);
      //triangle4 monster3
      Polygon triangle4Monster3 = new Polygon();
      triangle4Monster3.getPoints().addAll(305.0,323.0,320.0,337.0,318.0,323.0);
      triangle4Monster3.setFill(Color.PINK);
      triangle4Monster3.setStroke(Color.PINK);  
      pacTriangles.getChildren().add(triangle4Monster3);
                              
      //monster4
      Ellipse monster4 = new Ellipse(338, 321, 12, 12);
      monster4.setFill(Color.LIGHTGREEN);
      monster4.setStroke(Color.LIGHTGREEN);  
      monsters.getChildren().add(monster4); 
      //monster3 left eye
      Ellipse rightEyeMonster4 = new Ellipse(332,318,3,4);
      rightEyeMonster4.setFill(Color.WHITE);
      rightEyeMonster4.setStroke(Color.WHITE);
      monsters.getChildren().add(rightEyeMonster4);
      //monster3 right eye
      Ellipse leftEyeMonster4 = new Ellipse(343,318,3,4);
      leftEyeMonster4.setFill(Color.WHITE);
      leftEyeMonster4.setStroke(Color.WHITE);
      monsters.getChildren().add(leftEyeMonster4);
      //monster3 right eye color
      Ellipse rightEyeMonster41 = new Ellipse(333,317,1,2);
      rightEyeMonster41.setFill(Color.BLUE);
      rightEyeMonster41.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster41);
      //monster3 left eye color
      Ellipse rightEyeMonster42 = new Ellipse(344,317,1,2);
      rightEyeMonster42.setFill(Color.BLUE);
      rightEyeMonster42.setStroke(Color.BLUE);
      monsters.getChildren().add(rightEyeMonster42);
      //triangle1 monster4
      Polygon triangle1Monster4 = new Polygon();
      triangle1Monster4.getPoints().addAll(326.0,323.0,325.0,337.0,338.0,323.0);
      triangle1Monster4.setFill(Color.LIGHTGREEN);
      triangle1Monster4.setStroke(Color.LIGHTGREEN);  
      pacTriangles.getChildren().add(triangle1Monster4);
      //triangle2 monster4
      Polygon triangle2Monster4 = new Polygon();
      triangle2Monster4.getPoints().addAll(328.0,323.0,333.0,337.0,341.0,323.0);
      triangle2Monster4.setFill(Color.LIGHTGREEN);
      triangle2Monster4.setStroke(Color.LIGHTGREEN);  
      pacTriangles.getChildren().add(triangle2Monster4);
      //triangle3 monster4
      Polygon triangle3Monster4 = new Polygon();
      triangle3Monster4.getPoints().addAll(335.0,323.0,342.0,337.0,350.0,323.0);
      triangle3Monster4.setFill(Color.LIGHTGREEN);
      triangle3Monster4.setStroke(Color.LIGHTGREEN);  
      pacTriangles.getChildren().add(triangle3Monster4);
      //triangle4 monster4
      Polygon triangle4Monster4 = new Polygon();
      triangle4Monster4.getPoints().addAll(338.0,323.0,352.0,337.0,350.0,323.0);
      triangle4Monster4.setFill(Color.LIGHTGREEN);
      triangle4Monster4.setStroke(Color.LIGHTGREEN);  
      pacTriangles.getChildren().add(triangle4Monster4);
                                  
      //Group: bonusDots   
      Group bonusDots = new Group(); 
      //Top left bonus dot
      Circle bonusDot = new Circle(40,120,8);
      bonusDot.setFill(Color.WHITE);
      bonusDots.getChildren().add(bonusDot);
      //Top right bonus dot
      Circle bonusDot2 = new Circle(540,120,8);
      bonusDot2.setFill(Color.WHITE);
      bonusDots.getChildren().add(bonusDot2);
      //Bottom left bonus dot
      Circle bonusDot3 = new Circle(40,480,8);
      bonusDot3.setFill(Color.WHITE);
      bonusDots.getChildren().add(bonusDot3);
      //Bottom right bonus dot
      Circle bonusDot4 = new Circle(540,480,8);
      bonusDot4.setFill(Color.WHITE);
      bonusDots.getChildren().add(bonusDot4);      
                                
      //*Group: dots 
      Group whiteDots = new Group();
      //Dots top left horizontal  
      int x = 40;
      int y = 80;
      for (int i=0;i<12;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20; 
         y=80;
      }
      //Dots top left vertical 7 dots
      x = 40;
      y = 100;
      for (int i=0;i<7;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots left vertical 23
      x = 140;
      y = 100;
      for (int i=0;i<23;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
       //Dots right vertical 25
      x = 440;
      y = 100;
      for (int i=0;i<23;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
       //Dots bottom 25 dots
      x = 40;
      y = 600;
      for (int i=0;i<25;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
       //Dots top left middle horizontal 25 dots
      x = 60;
      y = 160;
      for (int i=0;i<25;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }                      
       //Dots top left bottom horizontal 4 dots
      x = 60;
      y = 220;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }      
       //Dots top left right vertical 3 dots
      x = 260;
      y = 100;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }     
       //Dots top right horizontal 12 dots
      x = 320;
      y = 80;
      for (int i=0;i<12;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }     
       //Dots top right vertical 8 dots
      x = 540;
      y = 80;
      for (int i=0;i<8;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
       //Dots top right left vertical 4 dots
      x = 320;
      y = 80;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      } 
       //Dots top right bottom  horizontal 4 dots
      x = 460;
      y = 220;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }      
       //Dots top left right horizontal vertical 4 dots
      x = 200;
      y = 160;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
       //Dots top right left horizontal vertical 4 dots
      x = 380;
      y = 160;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }   
       //Dots top middle left horizontal 3 dots
      x = 220;
      y = 220;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      } 
       //Dots top middle right horizontal 3 dots
      x = 320;
      y = 220;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      } 
      //Dots bottom right horizontal
      x = 440;
      y = 540;
      for (int i=0;i<6;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }        
      //Dots bottom horizontal left 12 dots
      x = 40;
      y = 420;
      for (int i=0;i<12;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      } 
      //Dots bottom horizontal right 12 dots
      x = 320;
      y = 420;
      for (int i=0;i<12;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots bottom left vertical 3 dots
      x = 40;
      y = 420;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }  
      //Dots bottom right vertical 3 dots
      x = 540;
      y = 420;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      } 
      //Dots bottom left vertical 3 dots
      x = 500;
      y = 480;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots bottom right vertical 3 dots
      x = 80;
      y = 480;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots bottom left horizontal 4 dots
      x = 60;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }   
      //Dots bottom left vertical 4 dots
      x = 40;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      } 
      //Dots bottom right vertical 3 dots
      x = 540;
      y = 560;
      for (int i=0;i<3;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      } 
      //Dots bottom middle left vertical 4 dots
      x = 260;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      } 
      //Dots bottom middle right vertical 4 dots
      x = 320;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots bottom middle right horizontal 2 dots
      x = 60;
      y = 480;
      for (int i=0;i<2;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots bottom middle right horizontal 2 dots
      x = 500;
      y = 480;
      for (int i=0;i<2;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom left horizontal   4 dots    
      x = 160;
      y = 480;
      for (int i=0;i<6;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom right horizontal   4 dots    
      x = 320;
      y = 480;
      for (int i=0;i<6;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom right horizontal   4 dots    
      x = 320;
      y = 480;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom left horizontal   4 dots    
      x = 200;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom left horizontal 4 dots    
      x = 320;
      y = 540;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         x=x+20;   
      }
      //Dots middle bottom left vertical 4 dots    
      x = 200;
      y = 480;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots middle bottom right vetical 4 dots    
      x = 380;
      y = 480;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots middle bottom left vetical 4 dots    
      x = 260;
      y = 420;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
      //Dots middle bottom right vetical 4 dots    
      x = 320;
      y = 420;
      for (int i=0;i<4;i++) {
         Circle dot = new Circle(x, y, 3);
         dot.setFill(Color.WHITE);
         whiteDots.getChildren().add(dot);  
         y=y+20;   
      }
                                                                                                           
      //*Group: boardBoxes
      Group boardBoxes = new Group(); 
      //boardBox1 top left 
      Rectangle boardBox1 = new Rectangle(60,100, 60, 40);   
      boardBox1.setStroke(Color.BLUE);
      boardBox1.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox1);
      //boardBox2 top left bottom
      Rectangle boardBox2 = new Rectangle(60,180, 60, 20);   
      boardBox2.setStroke(Color.BLUE);
      boardBox2.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox2);
      //boardBox3 top left right
      Rectangle boardBox3 = new Rectangle(160,100, 80, 40);   
      boardBox3.setStroke(Color.BLUE);
      boardBox3.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox3);
      //boardBox4 top right left
      Rectangle boardBox4 = new Rectangle(340, 100, 80, 40);   
      boardBox4.setStroke(Color.BLUE);
      boardBox4.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox4);
      //boardBox5 top right right
      Rectangle boardBox5 = new Rectangle(460, 100, 60, 40);   
      boardBox5.setStroke(Color.BLUE);
      boardBox5.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox5);
      //boardBox6 top right bottom
      Rectangle boardBox6 = new Rectangle(460, 180, 60, 20);   
      boardBox6.setStroke(Color.BLUE);
      boardBox6.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox6);
      //boardBox7 middle right
      Rectangle boardBox7 = new Rectangle(400, 340, 20, 60);   
      boardBox7.setStroke(Color.BLUE);
      boardBox7.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox7);
      //boardBox8 middle left
      Rectangle boardBox8 = new Rectangle(160, 340, 20, 60);   
      boardBox8.setStroke(Color.BLUE);
      boardBox8.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox8);
      //boardBox9 bottom left
      Rectangle boardBox9 = new Rectangle(160, 440, 80, 20);   
      boardBox9.setStroke(Color.BLUE);
      boardBox9.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox9);
      //boardBox10 bottom right
      Rectangle boardBox10 = new Rectangle(340, 440, 80, 20);   
      boardBox10.setStroke(Color.BLUE);
      boardBox10.setStrokeWidth(3);
      boardBoxes.getChildren().add(boardBox10);
      
      //Pacman                                     
      Circle dot = new Circle(240, 240, 15);
      pacman.setFill(Color.YELLOW);
      
             
        //Board outline
      Group board = new Group();
        //Line1 top left vertical
      Line boardLine = new Line(20,60,20,240);
      boardLine.setStroke(Color.BLUE);
      boardLine.setStrokeWidth(3);
      board.getChildren().add(boardLine);
        //Line2 top left horizontal
      Line boardLine2 = new Line(20,60,280,60);
      boardLine2.setStroke(Color.BLUE);
      boardLine2.setStrokeWidth(3);        
      board.getChildren().add(boardLine2);    
        //Line3 top middle vertical
      Line boardLine3 = new Line(280,60,280,140);
      boardLine3.setStroke(Color.BLUE);
      boardLine3.setStrokeWidth(3);        
      board.getChildren().add(boardLine3); 
        //Line4 top middle horizontal
      Line boardLine4 = new Line(280,140,300,140);
      boardLine4.setStroke(Color.BLUE);
      boardLine4.setStrokeWidth(3);        
      board.getChildren().add(boardLine4); 
        //Line5 top middle vertical
      Line boardLine5 = new Line(300,140,300,60);
      boardLine5.setStroke(Color.BLUE);
      boardLine5.setStrokeWidth(3);        
      board.getChildren().add(boardLine5);
        //Line6 top right horizontal
      Line boardLine6 = new Line(300,60,560,60);
      boardLine6.setStroke(Color.BLUE);
      boardLine6.setStrokeWidth(3);        
      board.getChildren().add(boardLine6);
        //Line7 top right vertical
      Line boardLine7 = new Line(560,60,560,240);
      boardLine7.setStroke(Color.BLUE);
      boardLine7.setStrokeWidth(3);        
      board.getChildren().add(boardLine7);
        //Line8 top right middle horizontal
      Line boardLine8 = new Line(560,240,460,240);
      boardLine8.setStroke(Color.BLUE);
      boardLine8.setStrokeWidth(3);        
      board.getChildren().add(boardLine8);  
        //Line9  right middle vertical top
      Line boardLine9 = new Line(460,240,460,300);
      boardLine9.setStroke(Color.BLUE);
      boardLine9.setStrokeWidth(3);        
      board.getChildren().add(boardLine9); 
        //Line10 right middle horizontal top
      Line boardLine10 = new Line(460,300,580,300);
      boardLine10.setStroke(Color.BLUE);
      boardLine10.setStrokeWidth(3);        
      board.getChildren().add(boardLine10); 
        //Line11 right middle horizontal bottom
      Line boardLine11 = new Line(460,340,580,340);
      boardLine11.setStroke(Color.BLUE);
      boardLine11.setStrokeWidth(3);        
      board.getChildren().add(boardLine11); 
       //Line12 right middle vertical bottom
      Line boardLine12 = new Line(460,340,460,400);
      boardLine12.setStroke(Color.BLUE);
      boardLine12.setStrokeWidth(3);        
      board.getChildren().add(boardLine12);                                            
      //Line13 right middle horizontal
      Line boardLine13 = new Line(460,400,560,400);
      boardLine13.setStroke(Color.BLUE);
      boardLine13.setStrokeWidth(3);        
      board.getChildren().add(boardLine13); 
      //Line14 right bottom vertical
      Line boardLine14 = new Line(560,400,560,500);
      boardLine14.setStroke(Color.BLUE);
      boardLine14.setStrokeWidth(3);        
      board.getChildren().add(boardLine14); 
      //Line15 right bottom horizontal top
      Line boardLine15 = new Line(560,500,520,500);
      boardLine15.setStroke(Color.BLUE);
      boardLine15.setStrokeWidth(3);        
      board.getChildren().add(boardLine15);   
      //Line16 right bottom vertical top
      Line boardLine16 = new Line(520,500,520,520);
      boardLine16.setStroke(Color.BLUE);
      boardLine16.setStrokeWidth(3);        
      board.getChildren().add(boardLine16);        
      //Line17 right bottom horizontal bottom
      Line boardLine17 = new Line(520,520,560,520);
      boardLine17.setStroke(Color.BLUE);
      boardLine17.setStrokeWidth(3);        
      board.getChildren().add(boardLine17);      
      //Line18 right bottom vertical bottom
      Line boardLine18 = new Line(560,520,560,620);
      boardLine18.setStroke(Color.BLUE);
      boardLine18.setStrokeWidth(3);        
      board.getChildren().add(boardLine18);
      //Line19 bottom horizontal
      Line boardLine19 = new Line(20,620,560,620);
      boardLine19.setStroke(Color.BLUE);
      boardLine19.setStrokeWidth(3);        
      board.getChildren().add(boardLine19); 
      //Line20 left bottom vertical
      Line boardLine20 = new Line(20,620,20,520);
      boardLine20.setStroke(Color.BLUE);
      boardLine20.setStrokeWidth(3);        
      board.getChildren().add(boardLine20);      
      //Line21 left bottom horizontal bottom
      Line boardLine21 = new Line(20,520,60,520);
      boardLine21.setStroke(Color.BLUE);
      boardLine21.setStrokeWidth(3);        
      board.getChildren().add(boardLine21);  
      //Line22 left bottom vertical bottom
      Line boardLine22 = new Line(60,520,60,500);
      boardLine22.setStroke(Color.BLUE);
      boardLine22.setStrokeWidth(3);        
      board.getChildren().add(boardLine22); 
      //Line23 left bottom horizontal top
      Line boardLine23 = new Line(60,500,20,500);
      boardLine23.setStroke(Color.BLUE);
      boardLine23.setStrokeWidth(3);        
      board.getChildren().add(boardLine23); 
      //Line24 left bottom vertical top
      Line boardLine24 = new Line(20,500,20,400);
      boardLine24.setStroke(Color.BLUE);
      boardLine24.setStrokeWidth(3);        
      board.getChildren().add(boardLine24);      
      //Line25 left middle horizontal bottom
      Line boardLine25 = new Line(20,400,120,400);
      boardLine25.setStroke(Color.BLUE);
      boardLine25.setStrokeWidth(3);        
      board.getChildren().add(boardLine25);  
      //Line26 left middle horizontal bottom
      Line boardLine26 = new Line(120,400,120,340);
      boardLine26.setStroke(Color.BLUE);
      boardLine26.setStrokeWidth(3);        
      board.getChildren().add(boardLine26); 
      //Line27 left middle horizontal bottom
      Line boardLine27 = new Line(120,340,0,340);
      boardLine27.setStroke(Color.BLUE);
      boardLine27.setStrokeWidth(3);        
      board.getChildren().add(boardLine27); 
      //Line28 left middle horizontal top
      Line boardLine28 = new Line(0,300,120,300);
      boardLine28.setStroke(Color.BLUE);
      boardLine28.setStrokeWidth(3);        
      board.getChildren().add(boardLine28); 
      //Line29 left middle vertical top
      Line boardLine29 = new Line(120,300,120,240);
      boardLine29.setStroke(Color.BLUE);
      boardLine29.setStrokeWidth(3);        
      board.getChildren().add(boardLine29);
      //Line30 left top horizntal
      Line boardLine30 = new Line(120,240,20,240);
      boardLine30.setStroke(Color.BLUE);
      boardLine30.setStrokeWidth(3);        
      board.getChildren().add(boardLine30);     
      
      //Middle T upper
      //top horizontal
      Line boardLine31 = new Line(220,180,360,180);
      boardLine31.setStroke(Color.BLUE);
      boardLine31.setStrokeWidth(3);
      board.getChildren().add(boardLine31);
      //left horizontal 
      Line boardLine312 = new Line(220,200,280,200);
      boardLine312.setStroke(Color.BLUE);
      boardLine312.setStrokeWidth(3);
      board.getChildren().add(boardLine312); 
      //right horizontal 
      Line boardLine315 = new Line(280,260,300,260);
      boardLine315.setStroke(Color.BLUE);
      boardLine315.setStrokeWidth(3);
      board.getChildren().add(boardLine315); 
      //bottom horizontal 
      Line boardLine313 = new Line(300,200,360,200);
      boardLine313.setStroke(Color.BLUE);
      boardLine313.setStrokeWidth(3);
      board.getChildren().add(boardLine313); 
      //left vertical
      Line boardLine314 = new Line(220,180,220,200);
      boardLine314.setStroke(Color.BLUE);
      boardLine314.setStrokeWidth(3);
      board.getChildren().add(boardLine314);
      //right vertical
      Line boardLine316 = new Line(360,180,360,200);
      boardLine316.setStroke(Color.BLUE);
      boardLine316.setStrokeWidth(3);
      board.getChildren().add(boardLine316);
      //left vertical
      Line boardLine317 = new Line(280,200,280,260);
      boardLine317.setStroke(Color.BLUE);
      boardLine317.setStrokeWidth(3);
      board.getChildren().add(boardLine317);      
      //right vertical
      Line boardLine318 = new Line(300,200,300,260);
      boardLine318.setStroke(Color.BLUE);
      boardLine318.setStrokeWidth(3);
      board.getChildren().add(boardLine318);
   
      //Bottom T top
      //Top line horizontal
      Line boardLine32 = new Line(220,500,360,500);
      boardLine32.setStroke(Color.BLUE);
      boardLine32.setStrokeWidth(3);
      board.getChildren().add(boardLine32);
      //Left line horizontal
      Line boardLine321 = new Line(220,520,280,520);
      boardLine321.setStroke(Color.BLUE);
      boardLine321.setStrokeWidth(3);
      board.getChildren().add(boardLine321);
      //Right line horizontal
      Line boardLine322 = new Line(300,520,360,520);
      boardLine322.setStroke(Color.BLUE);
      boardLine322.setStrokeWidth(3);
      board.getChildren().add(boardLine322);
      //Bottom line horizontal
      Line boardLine323 = new Line(280,580,300,580);
      boardLine323.setStroke(Color.BLUE);
      boardLine323.setStrokeWidth(3);
      board.getChildren().add(boardLine323);
      //Left line vertical
      Line boardLine324 = new Line(220,500,220,520);
      boardLine324.setStroke(Color.BLUE);
      boardLine324.setStrokeWidth(3);
      board.getChildren().add(boardLine324);
      //Right line vertical
      Line boardLine325 = new Line(360,500,360,520);
      boardLine325.setStroke(Color.BLUE);
      boardLine325.setStrokeWidth(3);
      board.getChildren().add(boardLine325);      
      //Left line vertical
      Line boardLine326 = new Line(280,520,280,580);
      boardLine326.setStroke(Color.BLUE);
      boardLine326.setStrokeWidth(3);
      board.getChildren().add(boardLine326);      
      //Right line vertical
      Line boardLine327 = new Line(300,520,300,580);
      boardLine327.setStroke(Color.BLUE);
      boardLine327.setStrokeWidth(3);
      board.getChildren().add(boardLine327);                                   
   
       //Bottom T bottom
      //Top line horizontal
      Line boardLine330 = new Line(220,380,360,380);
      boardLine330.setStroke(Color.BLUE);
      boardLine330.setStrokeWidth(3);
      board.getChildren().add(boardLine330);
      //Left line horizontal
      Line boardLine331 = new Line(220,400,280,400);
      boardLine331.setStroke(Color.BLUE);
      boardLine331.setStrokeWidth(3);
      board.getChildren().add(boardLine331);
      //Right line horizontal
      Line boardLine332 = new Line(300,400,360,400);
      boardLine332.setStroke(Color.BLUE);
      boardLine332.setStrokeWidth(3);
      board.getChildren().add(boardLine332);
      //Bottom line horizontal
      Line boardLine333 = new Line(280,460,300,460);
      boardLine333.setStroke(Color.BLUE);
      boardLine333.setStrokeWidth(3);
      board.getChildren().add(boardLine333);
      //Left line vertical
      Line boardLine334 = new Line(220,380,220,400);
      boardLine334.setStroke(Color.BLUE);
      boardLine334.setStrokeWidth(3);
      board.getChildren().add(boardLine334);
      //Right line vertical
      Line boardLine335 = new Line(360,380,360,400);
      boardLine335.setStroke(Color.BLUE);
      boardLine335.setStrokeWidth(3);
      board.getChildren().add(boardLine335);      
      //Left line vertical
      Line boardLine336 = new Line(280,400,280,460);
      boardLine336.setStroke(Color.BLUE);
      boardLine336.setStrokeWidth(3);
      board.getChildren().add(boardLine336);      
      //Right line vertical
      Line boardLine337 = new Line(300,400,300,460);
      boardLine337.setStroke(Color.BLUE);
      boardLine337.setStrokeWidth(3);
      board.getChildren().add(boardLine337);    
   
      //Middle box
      //bottom line horizontal
      Line boardLine380 = new Line(220,340,360,340);
      boardLine380.setStroke(Color.BLUE);
      boardLine380.setStrokeWidth(3);
      board.getChildren().add(boardLine380);      
      //Left line vertical
      Line boardLine381 = new Line(220,300,220,340);
      boardLine381.setStroke(Color.BLUE);
      boardLine381.setStrokeWidth(3);
      board.getChildren().add(boardLine381);      
      //Right line vertical
      Line boardLine382 = new Line(360,300,360,340);
      boardLine382.setStroke(Color.BLUE);
      boardLine382.setStrokeWidth(3);
      board.getChildren().add(boardLine382);        
      //left line horizontal
      Line boardLine383 = new Line(220,300,270,300);
      boardLine383.setStroke(Color.BLUE);
      boardLine383.setStrokeWidth(3);
      board.getChildren().add(boardLine383);     
      //Right line horizontal
      Line boardLine384 = new Line(310,300,360,300);
      boardLine384.setStroke(Color.BLUE);
      boardLine384.setStrokeWidth(3);
      board.getChildren().add(boardLine384);
   
      //Top right T
      //Top line horizontal
      Line boardLine390 = new Line(400,180,420,180);
      boardLine390.setStroke(Color.BLUE);
      boardLine390.setStrokeWidth(3);
      board.getChildren().add(boardLine390);
      //top middle line horizontal
      Line boardLine391 = new Line(340,240,400,240);
      boardLine391.setStroke(Color.BLUE);
      boardLine391.setStrokeWidth(3);
      board.getChildren().add(boardLine391);
      //bottom middle line horizontal
      Line boardLine392 = new Line(340,260,400,260);
      boardLine392.setStroke(Color.BLUE);
      boardLine392.setStrokeWidth(3);
      board.getChildren().add(boardLine392);
      //Bottom line horizontal
      Line boardLine393 = new Line(400,300,420,300);
      boardLine393.setStroke(Color.BLUE);
      boardLine393.setStrokeWidth(3);
      board.getChildren().add(boardLine393);
      //Left line vertical
      Line boardLine394 = new Line(400,260,400,300);
      boardLine394.setStroke(Color.BLUE);
      boardLine394.setStrokeWidth(3);
      board.getChildren().add(boardLine394);
      //Right line vertical
      Line boardLine395 = new Line(420,180,420,300);
      boardLine395.setStroke(Color.BLUE);
      boardLine395.setStrokeWidth(3);
      board.getChildren().add(boardLine395);      
      //Top left line vertical
      Line boardLine396 = new Line(400,180,400,240);
      boardLine396.setStroke(Color.BLUE);
      boardLine396.setStrokeWidth(3);
      board.getChildren().add(boardLine396);    
      //Left line vertical
      Line boardLine397 = new Line(340,240,340,260);
      boardLine397.setStroke(Color.BLUE);
      boardLine397.setStrokeWidth(3);
      board.getChildren().add(boardLine397);    
   
       //Top left T
      //Top line horizontal
      Line boardLine400 = new Line(160,180,180,180);
      boardLine400.setStroke(Color.BLUE);
      boardLine400.setStrokeWidth(3);
      board.getChildren().add(boardLine400);
      //Middle top horizontal
      Line boardLine401 = new Line(180,240,240,240);
      boardLine401.setStroke(Color.BLUE);
      boardLine401.setStrokeWidth(3);
      board.getChildren().add(boardLine401);
      //Middle bottom horizontal
      Line boardLine402 = new Line(180,260,240,260);
      boardLine402.setStroke(Color.BLUE);
      boardLine402.setStrokeWidth(3);
      board.getChildren().add(boardLine402);
      //Bottom line horizontal
      Line boardLine403 = new Line(160,300,180,300);
      boardLine403.setStroke(Color.BLUE);
      boardLine403.setStrokeWidth(3);
      board.getChildren().add(boardLine403);
      //Left line vertical
      Line boardLine404 = new Line(160,180,160,300);
      boardLine404.setStroke(Color.BLUE);
      boardLine404.setStrokeWidth(3);
      board.getChildren().add(boardLine404);
      //Right line middle vertical
      Line boardLine405 = new Line(240,240,240,260);
      boardLine405.setStroke(Color.BLUE);
      boardLine405.setStrokeWidth(3);
      board.getChildren().add(boardLine405);      
      //right line top vertical
      Line boardLine406 = new Line(180,180,180,240);
      boardLine406.setStroke(Color.BLUE);
      boardLine406.setStrokeWidth(3);
      board.getChildren().add(boardLine406);      
      //Right line bottom vertical
      Line boardLine407 = new Line(180,260,180,300);
      boardLine407.setStroke(Color.BLUE);
      boardLine407.setStrokeWidth(3);
      board.getChildren().add(boardLine407);    
      
   
       //Bottom right top T
      //Top line horizontal
      Line boardLine410 = new Line(460,440,520,440);
      boardLine410.setStroke(Color.BLUE);
      boardLine410.setStrokeWidth(3);
      board.getChildren().add(boardLine410);
      //Middle line horizontal
      Line boardLine411 = new Line(480,460,520,460);
      boardLine411.setStroke(Color.BLUE);
      boardLine411.setStrokeWidth(3);
      board.getChildren().add(boardLine411);
      //Bottom line horizontal
      Line boardLine412 = new Line(460,520,480,520);
      boardLine412.setStroke(Color.BLUE);
      boardLine412.setStrokeWidth(3);
      board.getChildren().add(boardLine412);
      //Left line vertical
      Line boardLine413 = new Line(460,440,460,520);
      boardLine413.setStroke(Color.BLUE);
      boardLine413.setStrokeWidth(3);
      board.getChildren().add(boardLine413);                    
      //Middle line vertical
      Line boardLine414 = new Line(480,460,480,520);
      boardLine414.setStroke(Color.BLUE);
      boardLine414.setStrokeWidth(3);
      board.getChildren().add(boardLine414); 
      //Right line vertical
      Line boardLine415 = new Line(520,440,520,460);
      boardLine415.setStroke(Color.BLUE);
      boardLine415.setStrokeWidth(3);
      board.getChildren().add(boardLine415); 
   
       //Bottom left top T
      //Top line horizontal
      Line boardLine420 = new Line(60,440,120,440);
      boardLine420.setStroke(Color.BLUE);
      boardLine420.setStrokeWidth(3);
      board.getChildren().add(boardLine420);
      //Middle line horizontal
      Line boardLine421 = new Line(60,460,100,460);
      boardLine421.setStroke(Color.BLUE);
      boardLine421.setStrokeWidth(3);
      board.getChildren().add(boardLine421);
      //Bottom line horizontal
      Line boardLine422 = new Line(100,520,120,520);
      boardLine422.setStroke(Color.BLUE);
      boardLine422.setStrokeWidth(3);
      board.getChildren().add(boardLine422);
      //Left line vertical
      Line boardLine423 = new Line(60,440,60,460);
      boardLine423.setStroke(Color.BLUE);
      boardLine423.setStrokeWidth(3);
      board.getChildren().add(boardLine423);                    
      //Middle line vertical
      Line boardLine424 = new Line(100,460,100,520);
      boardLine424.setStroke(Color.BLUE);
      boardLine424.setStrokeWidth(3);
      board.getChildren().add(boardLine424); 
      //Right line vertical
      Line boardLine425 = new Line(120,440,120,520);
      boardLine425.setStroke(Color.BLUE);
      boardLine425.setStrokeWidth(3);
      board.getChildren().add(boardLine425); 
   
       //Bottom left T
      //Top line horizontal
      Line boardLine430 = new Line(160,500,180,500);
      boardLine430.setStroke(Color.BLUE);
      boardLine430.setStrokeWidth(3);
      board.getChildren().add(boardLine430);
      //Left line horizontal
      Line boardLine431 = new Line(60,560,160,560);
      boardLine431.setStroke(Color.BLUE);
      boardLine431.setStrokeWidth(3);
      board.getChildren().add(boardLine431);
      //Right line horizontal
      Line boardLine432 = new Line(180,560,240,560);
      boardLine432.setStroke(Color.BLUE);
      boardLine432.setStrokeWidth(3);
      board.getChildren().add(boardLine432);
      //Left line vertical
      Line boardLine433 = new Line(60,560,60,580);
      boardLine433.setStroke(Color.BLUE);
      boardLine433.setStrokeWidth(3);
      board.getChildren().add(boardLine433);                    
      //Middle left line vertical
      Line boardLine434 = new Line(160,500,160,560);
      boardLine434.setStroke(Color.BLUE);
      boardLine434.setStrokeWidth(3);
      board.getChildren().add(boardLine434); 
      //Middle right line vertical
      Line boardLine435 = new Line(180,500,180,560);
      boardLine435.setStroke(Color.BLUE);
      boardLine435.setStrokeWidth(3);
      board.getChildren().add(boardLine435); 
      //Right line vertical
      Line boardLine436 = new Line(240,560,240,580);
      boardLine436.setStroke(Color.BLUE);
      boardLine436.setStrokeWidth(3);
      board.getChildren().add(boardLine436);
      //Bottom line horizontal
      Line boardLine437 = new Line(60,580,240,580);
      boardLine437.setStroke(Color.BLUE);
      boardLine437.setStrokeWidth(3);
      board.getChildren().add(boardLine437);
   
      //Bottom right T
      //Top line horizontal
      Line boardLine440 = new Line(400,500,420,500);
      boardLine440.setStroke(Color.BLUE);
      boardLine440.setStrokeWidth(3);
      board.getChildren().add(boardLine440);
      //Left line horizontal
      Line boardLine441 = new Line(340,560,400,560);
      boardLine441.setStroke(Color.BLUE);
      boardLine441.setStrokeWidth(3);
      board.getChildren().add(boardLine441);
      //Right line horizontal
      Line boardLine442 = new Line(420,560,520,560);
      boardLine442.setStroke(Color.BLUE);
      boardLine442.setStrokeWidth(3);
      board.getChildren().add(boardLine442);
      //Left line vertical
      Line boardLine443 = new Line(340,560,340,580);
      boardLine443.setStroke(Color.BLUE);
      boardLine443.setStrokeWidth(3);
      board.getChildren().add(boardLine443);                    
      //Middle left line vertical
      Line boardLine444 = new Line(400,500,400,560);
      boardLine444.setStroke(Color.BLUE);
      boardLine444.setStrokeWidth(3);
      board.getChildren().add(boardLine444); 
      //Middle right line vertical
      Line boardLine445 = new Line(420,500,420,560);
      boardLine445.setStroke(Color.BLUE);
      boardLine445.setStrokeWidth(3);
      board.getChildren().add(boardLine445); 
      //Right line vertical
      Line boardLine446 = new Line(520,560,520,580);
      boardLine446.setStroke(Color.BLUE);
      boardLine446.setStrokeWidth(3);
      board.getChildren().add(boardLine446);
      //Bottom line horizontal
      Line boardLine447 = new Line(340,580,520,580);
      boardLine447.setStroke(Color.BLUE);
      boardLine447.setStrokeWidth(3);
      board.getChildren().add(boardLine447);
      //Board line for Monsters
      Line boardLineMonsters = new Line(265,300,315,300);
      boardLineMonsters.setStroke(Color.WHITE);
      boardLineMonsters.setStrokeWidth(6);
      board.getChildren().add(boardLineMonsters);                                                                                            
      
      //Groups
      Group pacmen = new Group(pacman, pacman2, pacman3, pacTriangles);
      Group allDots = new Group (whiteDots, bonusDots);
      Group completeBoard = new Group (board, boardBoxes);
      Group allText = new Group(highScore, ready);
      
      //*Group: root                                                
      Group root = new Group(allText, monsters, completeBoard,  allDots, pacmen);

      //Scene root, 580x660, random color.BLACK
      Scene scene = new Scene(root, 580, 660, Color.BLACK);

      primaryStage.setTitle("Pacman");
      primaryStage.setScene(scene);
      primaryStage.show(); 
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}