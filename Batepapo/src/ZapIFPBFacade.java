import java.util.ArrayList;

public interface ZapIFPBFacade {

	public boolean cadastrarUsuario(String nomeUsuario, String senha);
	
	public boolean autenticar(String nomeUsuario, String senha);
	
	public boolean enviarMensagem(String destinatario, String mensagem);
	
	public ArrayList<String> contatosComMensagensNaoLidas();
	
	public ArrayList<String> mensagensNaoLidas(String contato);
	
	public ArrayList<String> mensagens(String contato);
	
}