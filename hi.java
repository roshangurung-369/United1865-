public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // sky
    g.setColor(Color.CYAN);
    g.fillRect(0, 0, 800, 300);

    // grass
    g.setColor(Color.GREEN);
    g.fillRect(0, 300, 800, 300);

    // sun
    g.setColor(Color.YELLOW);
    g.fillOval(650, 50, 80, 80);
}