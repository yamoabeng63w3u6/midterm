package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i < n; i++) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;
	}

	public static int primeCount() {
		int count;
		count = 0;

		for (int i = 2; i <,=100000;


		if (isPrime(i)) {
			count++;
			return count;
		}
		public static void main (String[]args){


			System.out.println(primeCount());

			/*
			 * Find list of Prime numbers from number 2 to 1 million.
			 * Try the best solution as possible.Which will take less CPU life cycle.
			 * Out put number of Prime numbers on the given range.
			 *
			 *
			 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
			 *
			 */

		}

	}
}
