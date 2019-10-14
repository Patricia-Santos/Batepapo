import java.util.Objects;

public class Usuario {

	private String nomeUsuario;
	private String senha;
	
	public Usuario(String nomeUsuario, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
	
	public boolean validaSenha(String senha) {
		return this.senha.equals(senha);
	}
	
	public boolean mudarSenha(String senhaAntiga, String nova) {
		if(validaSenha(senhaAntiga) ) {
			this.senha= nova;
			return true;
		}
		return false;
	}
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeUsuario, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return nomeUsuario.equals(other.nomeUsuario);
	}
	
	
	
}