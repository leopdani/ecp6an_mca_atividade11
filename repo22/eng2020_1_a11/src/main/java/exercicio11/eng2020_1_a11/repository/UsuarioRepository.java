package exercicio11.eng2020_1_a11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio11.eng2020_1_a11.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha(String login, String senha);

}