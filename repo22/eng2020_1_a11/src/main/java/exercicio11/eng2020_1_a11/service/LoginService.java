package exercicio11.eng2020_1_a11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercicio11.eng2020_1_a11.model.Usuario;
import exercicio11.eng2020_1_a11.repository.UsuarioRepository;


@Service
public class LoginService {

	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
