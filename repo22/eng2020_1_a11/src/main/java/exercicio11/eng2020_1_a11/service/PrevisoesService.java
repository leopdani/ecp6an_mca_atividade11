package exercicio11.eng2020_1_a11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercicio11.eng2020_1_a11.model.Previsao;
import exercicio11.eng2020_1_a11.repository.PrevisoesRepository;


@Service
public class PrevisoesService {
	
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		return previsoesRepo.findAll();
	}
}
