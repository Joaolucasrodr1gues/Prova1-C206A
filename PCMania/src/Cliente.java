public class Cliente {
    String nome;
    long cpf;
    Computador [] PCs = new Computador[100];
    float calculaTotalCompra() {
        float totalCompra = 0;
        for (int i = 0; i < PCs.length; i++) {
            // Verifica se o elemento PCs[i] não é nulo antes de acessar o campo preco
            if (PCs[i] != null) {
                totalCompra += PCs[i].preco;
                System.out.println("PC " + (i + 1) + ": ");
                PCs[i].mostraPCConfigs();
                System.out.println();
            } else {
                break;
            }
        }
        return totalCompra;
    }
}


