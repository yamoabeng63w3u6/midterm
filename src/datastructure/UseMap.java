package datastructure;

import com.mongodb.*;
import databases.ConnectToSqlDB;


import java.util.*;


public class UseMap {

	public static void main(String[] args) {
		Map<Integer,String> state = new HashMap<Integer, String>();
		state.put(1, "NY");
		state.put(2, "NJ");
		state.put(3, "FL");

		System.out.println(state.get(2));
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}

}
