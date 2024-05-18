import java.awt.Graphics2D;

public class RunningState extends GameState {

  public RunningState(InvadersPanel invadersPanel) {
      super(invadersPanel);
  }

  @Override
  public void update() {
      invadersPanel.moveAliens();
      invadersPanel.moveBullets();
      invadersPanel.checkCollisions();
      System.out.println("Running State......");
  }

  @Override
  public void render(Graphics2D g) {
      invadersPanel.draw(g);
  }

  
}