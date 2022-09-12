package Concrete;

import Abstract.CustomerService;
import Abstract.GameService;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class GameManager implements GameService {

    @Override
    public void sellGame(Customer customer, Game game, Campaign campaign) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " '" + game.getName() + "'" + " satin aldi");
        System.out.println(campaign.getName() + " uygulandı...");
    }
}
