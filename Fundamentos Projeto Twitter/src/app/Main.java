package app;

import java.awt.List;
import java.util.ArrayList;

import twitter.TwitterDef;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;

public class Main {

	public static void main(String[] args) {
				
		TwitterDef t = new TwitterDef();
								
		try {
			
			Query query = new Query("java");
			query.setSince("2016-05-08");
			query.setUntil("2016-05-14");
			QueryResult result = null;			
			
			result = t.getTweet().search(query);
			//query = result.nextQuery();
			
			System.out.println("" + result.getCount());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
