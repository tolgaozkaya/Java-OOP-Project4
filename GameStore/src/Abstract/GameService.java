package Abstract;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public interface GameService {
    public void sellGame(Customer customer, Game game, Campaign campaign);
}
