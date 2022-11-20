import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.FreeCustomerManager;
import Concrete.GameManager;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager baseCustomerManager = new FreeCustomerManager(new MernisServiceAdapter());
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();

        Customer customer = new Customer(1,"Tolga","Özkaya","48544492134", LocalDate.of(2002,4,26),"tolgaozkaya@gmail.com");
        baseCustomerManager.save(customer);

        Campaign campaign = new Campaign(1,"Yeni Yil Kampanyasi","Yeni yila özel %20 indirim..");
        campaignManager.addCampaign(campaign);

        Game game = new Game(1,"War Craft","War game",350);

        gameManager.sellGame(customer,game,campaign);
    }
}
