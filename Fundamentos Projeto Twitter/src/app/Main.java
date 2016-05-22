package app;

import java.util.List;

import twitter.TwitterDef;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;

public class Main {

	public static void main(String[] args) {
				
		TwitterDef t = new TwitterDef();
								
		try {

			Query query = new Query("#javaone");
			query.setSince("2016-05-08");
			query.setUntil("2016-05-14");
			QueryResult result = null;			
			
			result = t.getTweet().search(query);
			//query = result.nextQuery();
			System.out.println(result.getCount());
			  
			result.getTweets().forEach(p -> System.out.println(p.getText() + "\n"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
