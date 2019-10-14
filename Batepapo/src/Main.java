public class Main {

	public static void main(String[] args) {
		ZapIFPBFacade zap = new ZapIFPBImpl();
		zap.cadastrarUsuario("fulano", "123");
		zap.cadastrarUsuario("sicrano", "123");
		zap.cadastrarUsuario("beltrano", "123");
		if (zap.autenticar("fulano", "1234")) {
			System.err.println("Aceitou senha inv�lida.");
			System.exit(1);
		}
		if (zap.autenticar("fulanoo", "123")) {
			System.err.println("Aceitou login inv�lido.");
			System.exit(1);
		}
		if (zap.autenticar("fulano", "123")) {
			System.out.println("Usu�rio autenticado.");
		} else {
			System.err.println("Falha inesperada na autentica��o");
			System.exit(1);
		}
		if (zap.enviarMensagem("naoexiste", "Oi")) {
			System.err.println("Mensagem enviada para usu�rio inexistente");
			System.exit(1);
		}
		if (!zap.enviarMensagem("fulano", "Oi")) {
			System.err.println("Falha inesperada no envio de mensagem");
			System.exit(1);
		}

	}

}