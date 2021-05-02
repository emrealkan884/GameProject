package Business;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService {
	public void sell(Game game,Customer customer,Campaign campaign) {
		System.out.println(game.getName() +" Adl� oyun " + customer.getFirstName()+ " " +customer.getLastName()+ " adl� oyuncuya " 
																						+ campaign.getName()+" kampanyas� ile "
																						+ game.getPrice() + "TL fiyat�yla sat�ld�."
																						);
	}

	public void add(Game game) {
		System.out.println(game.getName() + " adl� oyun eklendi.");
	}

	public void delete(Game game) {
		System.out.println(game.getName() + " adl� oyun silindi.");		
	}
	
}
