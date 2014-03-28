package edu.univdhaka.iit.twitter.utils;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import edu.univdhaka.iit.twitter.repository.DataConnectionPool;

public class DataConnectionPoolTest {

	

	@Test
	public void testGetConnection() {
		Connection con = DataConnectionPool.getConnection();
		assertNotNull(con);

	}

}
