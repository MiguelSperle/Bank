public class Log implements interfaces.Log {
    // Criamos uma nova classe para ser responsavel por mostrar todas as mensagens no console
    @Override
    public void Out(String message) {
        System.out.println("LOG: " + message);
    }
}
