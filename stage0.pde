void stage0(){
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
