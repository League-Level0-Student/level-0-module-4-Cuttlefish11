PImage face;
void setup() {
  face = loadImage ("face.jpeg");
size (800, 600);
face.resize (width, height);

}

void draw() {
  background (face);
  fill (#FFFFFF);
  ellipse(330,229,100,100);
ellipse(411,300,100,100);
 fill (#070508);
  ellipse(mouseX,mouseY,61,61);
ellipse(mouseX+81,mouseY+71,61,61);
if (mouseX>380){
  mouseX=380;
}
if (mouseX<280){
  mouseX=280;
}
if (mouseY>279){
  mouseY=279;
}
if (mouseY<179){
  mouseY=179;
}


}
