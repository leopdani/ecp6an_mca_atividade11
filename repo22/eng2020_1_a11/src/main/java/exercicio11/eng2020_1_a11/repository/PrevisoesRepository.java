package exercicio11.eng2020_1_a11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio11.eng2020_1_a11.model.Previsao;


public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}