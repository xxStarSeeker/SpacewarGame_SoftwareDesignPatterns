 
 interface ShipMovementStrategy {
    void moveShip(Ship ship);
}

 class LeftMovementStrategy implements ShipMovementStrategy {
    @Override
    public void moveShip(Ship ship) {
        if (ship.getX() > 0) {
            ship.setX(ship.getX() - 15);
        }
    }
}

 class RightMovementStrategy implements ShipMovementStrategy {
    final int SCREEN_HEIGHT = 500;
    final int SCREEN_WIDTH = 500;
    final int SCREEN_UNIT = 25;
    final int ALIEN_WIDTH = 50;
    final int SHIP_WIDTH = 50;
    final int DELAY = 150;
    
    @Override
    public void moveShip(Ship ship) {
        if (ship.getX() + SHIP_WIDTH < SCREEN_WIDTH) {
            ship.setX(ship.getX() + 15);
        }
    }
}