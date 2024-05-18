import java.awt.Graphics2D;

class VictoryState extends GameState {

  public VictoryState(InvadersPanel invadersPanel) {
      super(invadersPanel);
  }

  @Override
  public void update() {
    System.out.println("Victory....");
  }
  @Override
  public void render(Graphics2D g) {
    
  }

 
}