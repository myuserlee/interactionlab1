void stage5() {
  frameRate(20);
  background(0,0,0);
  colorMode (HSB);
  for (int i = 0; i < 7; i ++){
    for (int column = 0; column < 7; column ++){
      int row = i%7;
      int x = (row+1)*100;
      int y = (column+1)*100;
      fill ((abs(int(row-column)+s)*10)%256, 255, 255);
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
  
