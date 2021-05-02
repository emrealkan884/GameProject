import Business.CampaignManager;
import Business.CustomerManager;
import Business.EDevletValidator;
import Business.GameManager;
import Business.ValidateManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1, "Crysis", 100);
		
		Campaign campaign1 = new Campaign(1, "Süper Yaz", "Yaz mevsimine özel %25 indirim!",25);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		 
		System.out.println("");
		System.out.println(" --------------------------------------- ");
		System.out.println("");
		
		Customer customer1 = new Customer(1, "12345678910", "Hasan Emre", "Alkan", 2001);
		CustomerManager customerManager = new CustomerManager();
		
		ValidateManager[] validateManagers = {new EDevletValidator()};
		customerManager.add(customer1,validateManagers);
		
		System.out.println("");
		System.out.println(" --------------------------------------- ");
		System.out.println("");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		System.out.println("");
		System.out.println(" --------------------------------------- ");
		System.out.println("");
		
		gameManager.sell(game1, customer1, campaign1);
	}

}
