public class Login {
    public static void main(String[] args) {
        String usuario = args[0];
        String senha = args[1];
            if (usuario.equals("Daniel")) {
                if (senha.equals("1234")) {
                    System.out.print("Acesso Liberado");
                }
            } else {
                System.out.print("Você não tem aceso!");
            }

    }
}