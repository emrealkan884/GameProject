package Business;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameService {
	void sell(Game game,Customer customer,Campaign campaign);
	void add(Game game);
	void delete(Game game);
}
