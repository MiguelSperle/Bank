public class Account implements interfaces.Account {
    private String agency;

    private String account;

    private String name;

    private double balance;

    private static final int MAX_LENGTH = 12;
    // Esse final, indica que o valor da variável não pode ser modificado depois de ser atribuído;
    // static aqui ele faz com que a cada instancia que seja feita desssa classe, tenha apenas uma copia de MAX_LENGTH

    Log logger = new Log(); // Criamos uma nova classe para ser responsavel por mostrar todas as mensagens no console

    public Account(String agency, String account, String name, double balance){ // Constructor ( criando o objeto )
        this.agency = agency;
        this.account = account;
        this.balance = balance;
        setName(name); // Passando o método setter ( name dentro dele )
    }


    @Override
    public void setName(String name){ // Método setter
        if(name.length() > MAX_LENGTH){ // verificando se o tamanho do name é maior que o tamanho maximo que ele pode ter
            this.name = name.substring(0, MAX_LENGTH); // se for, eu seto o atributo name do caracter 0 até o 12;
        } else {
            this.name = name;
        }
    }

    @Override
    public void currentBalance(String numberAccount){ // Método para ver o saldo atual
        if(account.equals(numberAccount)){ // equals === verificação de strings
            logger.out("Seu saldo atual é de: " + this.balance);
        } else {
            System.out.println("Seu acesso está errado!");
        }
    }

    @Override
    public void drawBalance(double value){ // Método para sacar
        if(balance < value){
            logger.out("Você não tem saldo suficiente para isso");
        } else {
            this.balance = balance - value; // mesma coisa que balance = balance - value
            logger.out("Valor retirado foi de " + value + ", agora você possui um saldo de " + this.balance);
        }
    }

    @Override
    public void depositBalance(double value){
        this.balance = balance + value;
        logger.out("Você depositou " + value + ", agora sua conta tem um saldo de " + this.balance);
    }

    @Override // sobrecreve por cima o print dessa classe
    public String toString() {
       return  "A conta " + this.name + " tem um saldo de " + this.balance;
    }
}
