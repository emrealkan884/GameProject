package Business;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService {
	public void sell(Game game,Customer customer,Campaign campaign) {
		System.out.println(game.getName() +" Adlý oyun " + customer.getFirstName()+ " " +customer.getLastName()+ " adlý oyuncuya " 
																						+ campaign.getName()+" kampanyasý ile "
																						+ game.getPrice() + "TL fiyatýyla satýldý."
																						);
	}

	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyun eklendi.");
	}

	public void delete(Game game) {
		System.out.println(game.getName() + " adlý oyun silindi.");		
	}
	
}
