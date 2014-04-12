package edu.univdhaka.iit.twitter.repository;

import java.sql.PreparedStatement;
import java.util.List;

import edu.univdhaka.iit.twitter.domain.Tweet;

public class TweetDaoImpl implements TweetDao {

	@Override
	public void create(Tweet tweet) {
		String query = "INSERT INTO Tweet"
				+ "(tweet_text , timestamp, tweet_by)" + "VALUES(?,?,?)";
	
		try{
			PreparedStatement pre= DataConnectionPool.getConnection().prepareStatement(query);
		
			pre.setString(1, tweet.getTweetText());
			pre.setDate(2, tweet.getTimestamp());
			pre.setString(3, tweet.getTweetBy().getEmailAddress());
			
			pre.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public Tweet findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tweet> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Tweet tweeet) {
		// TODO Auto-generated method stub

	}

}
