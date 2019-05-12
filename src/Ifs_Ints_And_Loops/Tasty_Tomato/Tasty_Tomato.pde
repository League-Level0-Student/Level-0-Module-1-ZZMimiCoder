void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255, 0, 0);
    ellipse(200, 250, 150, 150);
    ellipse(262, 250, 150, 150);
    fill(0, 255, 0);
    rect(226, 153, 12, 32);
    if (mousePressed) {
      fill(200, 200, 200);
      ellipse(302, 290, 75, 75);
    }
}
