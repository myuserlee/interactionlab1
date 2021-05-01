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

void setup (){
  size (800, 800);
  noStroke();
  rectMode (CENTER);
  preTime = millis();
  font = createFont("DGM.ttf", 50);
  frameRate (60);
}

void draw (){
  
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
