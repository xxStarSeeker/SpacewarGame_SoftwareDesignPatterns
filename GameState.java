import java.awt.Graphics2D;

public abstract class GameState {
  protected InvadersPanel invadersPanel;

  public GameState(InvadersPanel invadersPanel) {
      this.invadersPanel = invadersPanel;
  }

  public abstract void update();
  public abstract void render(Graphics2D g);
  
}