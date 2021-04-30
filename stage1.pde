void stage1() {
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
