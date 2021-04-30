void stage3(){
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
