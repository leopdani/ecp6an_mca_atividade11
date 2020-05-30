package exercicio11.eng2020_1_a11.repository;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

		public static void main(String[] args) {
			Persistence.createEntityManagerFactory("usjtPU");
		}
}