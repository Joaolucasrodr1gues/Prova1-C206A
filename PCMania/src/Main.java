import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Computador comp1 = new Computador();
    Computador comp2 = new Computador();
    Computador comp3 = new Computador();
    MemoriaUSB tempUsb;
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        cliente.nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        cliente.cpf = sc.nextLong();
        sc.nextLine();

        comp1.marca = "Positivo";
        comp1.preco = 2300;
        comp1.hardwareBasico.nome = "Pentium Core i3 (2200 Mhz)";
        comp1.hardwareBasico.capacidadeRAM = 8;
        comp1.hardwareBasico.capacidadeHD = 500;
        comp1.sistemaOperacional.nome = "Linux Ubuntu";
        comp1.sistemaOperacional.tipo = 32;
        tempUsb = new MemoriaUSB();
        tempUsb.nome = "PenDrive";
        tempUsb.capacidade = 16;
        comp1.addMemoriaUSB(tempUsb);

        comp2.marca = "Acer";
        comp2.preco = 5800;
        comp2.hardwareBasico.nome = "Pentium Core i5 (3370 Mhz)";
        comp2.hardwareBasico.capacidadeRAM = 16;
        comp2.hardwareBasico.capacidadeHD = 1000;
        comp2.sistemaOperacional.nome = "Windows 8";
        comp2.sistemaOperacional.tipo = 64;
        tempUsb = new MemoriaUSB();
        tempUsb.nome = "PenDrive";
        tempUsb.capacidade = 32;
        comp2.addMemoriaUSB(tempUsb);

        comp3.marca = "Vaio";
        comp3.preco = 1800;
        comp3.hardwareBasico.nome = "Pentium Core i7 (4500 Mhz)";
        comp3.hardwareBasico.capacidadeRAM = 32;
        comp3.hardwareBasico.capacidadeHD = 2000;
        comp3.sistemaOperacional.nome = "Windows 10";
        comp3.sistemaOperacional.tipo = 64;
        tempUsb = new MemoriaUSB();
        tempUsb.capacidade = 1000;
        tempUsb.nome = "HD Externo";
        comp3.addMemoriaUSB(tempUsb);

        boolean controle = true;
        int i = 0;

        while(controle) {
            System.out.println(
                    """
                            +++++++ Promocoes PC Mania +++++++
                            1- PC Positivo com Pentium i3 (2200Mhz), 8Gb de RAM, 500Gb de HD, SO Linux Ubuntu (32b) com Pen-Drive de 16 GB por apenas R$2300.00!
                            2- PC Acer com Pentium i5 (3370Mhz), 16Gb de RAM, 1Tb de HD, SO Windows 8 (64b) com Pen-Drive de 32 GB por apenas 5800.00!
                            3- PC Positivo com Pentium i7 (4500Mhz), 32Gb de RAM, 2Tb de HD, SO Windows 10 (64b) com HD Externo de 1Tb por apenas R$1800.00!
                            0- finalizar compra!
                            """
            );

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("A promocao escolhida foi a numero 1!");
                    System.out.println("Produtos correspondentes foram adicionados ao carrinho.");
                    cliente.PCs[i] = comp1;
                    i++;
                }
                case 2 -> {
                    System.out.println("A promocao escolhida foi a numero 2!");
                    System.out.println("Produtos correspondentes foram adicionados ao carrinho.");
                    cliente.PCs[i] = comp1;
                    i++;
                }
                case 3 -> {
                    System.out.println("A promocao escolhida foi a numero 3!");
                    System.out.println("Produtos correspondentes foram adicionados ao carrinho.");
                    cliente.PCs[i] = comp1;
                    i++;
                }
                case 0 -> {
                    System.out.println("Usuário: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println();
                    System.out.printf("Valor total: R$%.2f%n", cliente.calculaTotalCompra());
                    controle = false;
                }
                default -> System.out.println("Promoção inválida! Tente novamente!");
            }
        }
    }
}