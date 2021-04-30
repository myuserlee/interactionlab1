void stage4(){
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
