import java.awt.Graphics2D;

class GameOverState extends GameState {

  public GameOverState(InvadersPanel invadersPanel) {
      super(invadersPanel);
  }

  @Override
  public void update() {
      System.out.println("Game is over......");
  }

  @Override
  public void render(Graphics2D g) {
      invadersPanel.gameOver(g);
  }

 
}