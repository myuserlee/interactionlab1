void stage2(){
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
