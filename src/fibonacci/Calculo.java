package fibonacci;

import java.math.BigInteger;

public class Calculo {

	public long fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	BigInteger fibo(int n) {
		BigInteger F = new BigInteger("0"); // atual
		BigInteger ant = new BigInteger("0"); // anterior
		BigInteger aux = new BigInteger("0");

		
		for (int i = 1; i <= n; i++) {

			if (i < 3) {
				ant = new BigInteger("1");
				F = new BigInteger("1");
				continue;
			}
			aux = new BigInteger(F.toString());
			F = F.add(ant);
			ant = new BigInteger(aux.toString());
		}

		return F;
	}
}