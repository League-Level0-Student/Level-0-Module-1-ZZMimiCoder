int X = 400; 
int Y = 600; 
void setup() {
    background(0, 0, 40);
    size(800, 800);
}
void draw() {
    fill(random(255), 0, 0);
    ellipse(X, Y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(X, Y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(X, Y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(X, Y + 10, X + 50, Y + 100, X - 50, Y + 100);
    Y--;
}
