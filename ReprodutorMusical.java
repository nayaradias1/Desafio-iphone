// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void reproduzirMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void enviarMensagem(String destino, String mensagem);
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void abrirNavegador(String url);
}

// Classe que representa o iPhone, implementando as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
    public void reproduzirMusica(String musica) {
        // Lógica para reproduzir música
    }

    public void fazerChamada(String numero) {
        // Lógica para fazer uma chamada telefônica
    }

    public void enviarMensagem(String destino, String mensagem) {
        // Lógica para enviar uma mensagem de texto
    }

    public void abrirNavegador(String url) {
        // Lógica para abrir o navegador da Internet
    }
}