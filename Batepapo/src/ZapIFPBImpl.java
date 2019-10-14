import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ZapIFPBImpl implements ZapIFPBFacade{

	private Set<Usuario> contatos;
	private Usuario autenticado;
	
	public ZapIFPBImpl() {
		contatos = new HashSet<Usuario>();
	}
	
	@Override
	public boolean cadastrarUsuario(String nomeUsuario, String senha) {
		Usuario u = new Usuario(nomeUsuario, senha);
		return contatos.add(u);
	}

	@Override
	public boolean autenticar(String nomeUsuario, String senha) {
		for (Usuario usuario : contatos) {
			if(usuario.getNomeUsuario().equals(nomeUsuario) 
					&& usuario.validaSenha(senha)) {
				autenticado = usuario;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean enviarMensagem(String destinatario, String mensagem) {
		
		return false;
	}

	@Override
	public ArrayList<String> contatosComMensagensNaoLidas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> mensagensNaoLidas(String contato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> mensagens(String contato) {
		// TODO Auto-generated method stub
		return null;
	}

}