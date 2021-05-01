void stage6(){
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
