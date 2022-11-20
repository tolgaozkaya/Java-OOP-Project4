package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Save to database : " + campaign.getName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Update:" + campaign.getName());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Delete from database: " + campaign.getName());

    }
}
