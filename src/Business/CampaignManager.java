package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService {
	
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi: " + campaign.getName() );
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: "+ campaign.getName());
			
	}
	public void delete(Campaign campaign) {
		System.out.println("Bu kampanya artýk mevcut deðil: " + campaign.getName());
	}
}
