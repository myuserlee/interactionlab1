import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class C175133mid extends PApplet {

int stage = 0;
long preTime = 0;
int smallCircleX = 200;
int a = 800;
int b = 0;
int k = 0;
int q = 0;
int rectX = 300;
int rectY = -300;
int angle = 0;
PFont font;
float ry = 0;
int centerRect = 0;
int scX = 1000;
int scY = -1000;
int lcX = 0;
int lcY = 0;
int z = 0;
int purR = 0;
int s = 0;
int e = 0;
int cc = 0;
int bb = 0;

public void setup (){
  
  noStroke();
  rectMode (CENTER);
  preTime = millis();
  font = createFont("DGM.ttf", 50);
  frameRate (60);
}

public void draw (){
  
  if (stage == 0){
    stage0();
  } else if (stage == 1){
    stage1();
  } else if (stage == 2){
    stage2();
  } else if (stage == 3){
    stage3();
  } else if (stage == 4){
    stage4();
  } else if (stage == 5){
    stage5();
  } else if (stage == 6){
    stage6();
  }
  
}
public void stage0(){
  if (preTime + 200 > millis()) {
    background(242, 212, 155);
    for (int i = 200; i <= 600; i++) {
      fill (255, 255, 255);
      circle (i, height*2/3, 100); 
    }
  }
  
  if (keyPressed) {
    if (keyCode == RIGHT) {
      smallCircleX = smallCircleX + 5;
    }
  }
  
  fill (100, 200, 100);
  circle (smallCircleX, height*2/3, 70);
  
  textFont(font);
  textAlign(CENTER);
  fill (31, 64, 33);
  text("PRESS THE RIGHT BUTTON", width/2, height/3);
  
  if (smallCircleX == 600) {
    stage = 1;
  }
}
public void stage1() {
  background (191, 90, 80);
  
  fill (255, 255, 255);
  if (a == 95) {
    stage = 2;
  } else {
    rect (width/2, height/2, a, a, b);
    a = a - 5;
    b = b + 2;
  }

}
public void stage2(){
  fill (255, 255, 255);
  circle (width/2, height/2, 100);
  circle (random(width), random(height), 100);
  k = k + 1;
  z = z + 2;
  
  if (k == 500) { 
    background (255, 255, 255);
    stage = 3;
    preTime = millis();
    
  }
  frameRate(60+z);
}
public void stage3(){
  background (255, 255, 255);
  translate(width/2, height/2);
  frameRate (60);
  
  fill (155, 198, 240);
  rect (rectX, rectY, q, q);
  fill (145, 191, 184);
  rect (-rectX, -rectY, q, q);
  if (q < 110) {
    q = q + 11;
  }
  
  if (rectX == 300 && rectY >= -300 && rectY < 300) {
    rectY = rectY + 5;
  } else if (rectY == 300 && rectX <= 300 && rectX > -300) {
    rectX = rectX - 5;
  } else if (rectX == -300 && rectY <= 300 && rectY > -300) {
    rectY = rectY - 5;
  } else if (rectY == -300 && rectX >= -300 && rectX < 300) {
    rectX = rectX + 5;
  }
  
  if (preTime + 2000 <  millis()) {
    pushMatrix();
    fill (64, 113, 120);
    rotate(radians(angle));
    rect (0, 0, centerRect, centerRect);
    popMatrix();
    angle = angle + 2;
    
    if (centerRect <= 200){
      centerRect = centerRect + 10;
    }
    if (preTime + 6000 < millis()) {
    centerRect = centerRect + 20;
    }
  }
  if (centerRect >= 1100) {
    stage = 4;
    preTime = millis();
  }
}
public void stage4(){
  background (64, 113, 120);
  translate (0, 400);
  frameRate (10);

   for (int u = 50; u < 800; u = u + 100) {
    fill (145, 191, 184);
    ry = random(150, 700);
    rect (u, 0, 60, ry, 10);
  } 

  if (preTime + 3000 < millis()) {
    fill (0);
    rect (400, 0, purR, 1000);
    purR = purR + 140;
  }
  if (purR >= 1000) {
    stage = 5;
    preTime = millis();
  }
}
public void stage5() {
  frameRate(20);
  background(0,0,0);
  colorMode (HSB);
  for (int i = 0; i < 7; i ++){
    for (int column = 0; column < 7; column ++){
      int row = i%7;
      int x = (row+1)*100;
      int y = (column+1)*100;
      fill ((abs(PApplet.parseInt(row-column)+s)*10)%256, 255, 255);
      pushMatrix();
      translate(x, y);
      circle(0, 0, e);
      popMatrix();
      
    }
  }
  s = s + 1;
  if (cc < 10) {
    e = e + 5;
    cc = cc + 1;
  }
  if (preTime + 4000 < millis() && e > 0) {
    e = e - 5;
  }
  
  if (preTime + 5000 < millis()) {
    stage = 6;
    preTime = millis();
  }
}
  
public void stage6(){
  frameRate(60);
  translate (width/2, height/2);
  colorMode(RGB);
  background (195*bb/60, 200*bb/60, 235*bb/60);
  if (bb < 60) {
    //background (195*bb/60, 200*bb/60, 235*bb/60);
    bb = bb + 1;
  }
  
  fill (141, 131, 166);
  circle (scX+20, scY+20, 140);
  fill (191, 90, 80);
  circle (scX, scY, 150);

  if (scY < -160) {
    scX = scX - 14;
    scY = scY + 14;
  }
  
  fill (141, 131, 166);
  circle (lcX+50, lcY+50, 270);
  fill (223, 233, 235);
  circle (lcX, lcY, 300);
  
  if (scY >= -160) {
    lcX = lcX - 3;
    lcY = lcY + 3;
  }
  
  if (preTime + 4000 < millis()) {
    fill (255, 255, 255);
    text("Thank you", 0, 0);
  }
}
  public void settings() {  size (800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "C175133mid" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
