package pp_fp05;

public class PPFP05 {
    static User user1;

    public static void main(String[] args) {
        // Inicialização dos atributos da classe User
        user1 = new User();
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[] {'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[] {'b', 'm', 'o', '@', 'e', 's', 't', 'g', ',', 'i', 'p', 'p', '.', 'p', 't'};

        // Impressão dos valores (Alínea 3)
        System.out.println("User 1-");
        System.out.print("ID:");
        System.out.println(user1.id);
        System.out.print("Name:");
        System.out.print(user1.name);
        System.out.print("Email:");
        System.out.println(user1.email);
    }
}