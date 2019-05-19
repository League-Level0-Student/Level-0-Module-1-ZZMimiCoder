void setup() {
  size(500, 500);
  PImage zombie = loadImage("Zombie.png");
  zombie.resize(500, 500);
  image(zombie, 0, 0);
}

void draw() {
  fill(mouseX, mouseY, random(1, 255));
  ellipse(140, 125, 50, 50);
  ellipse(225, 125, 60, 60);
}
