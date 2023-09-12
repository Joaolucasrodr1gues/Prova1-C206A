public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico hardwareBasico;
    MemoriaUSB Musb;

    public Computador(){
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico();

    }

    void mostraPCConfigs() {
        System.out.println
                (
                        "Marca: " + marca + '\n' +
                                "Processador: " + hardwareBasico.nome + '\n' +
                                "RAM: " + Math.round(hardwareBasico.capacidadeRAM) + "Gb\n" +
                                "HDD: " + Math.round(hardwareBasico.capacidadeHD) + "Gb\n" +
                                "Sistema: " + sistemaOperacional.nome + '\n' +
                                "Tipo de Sistema: " + sistemaOperacional.tipo + "bits"
                );

        if (Musb != null) {
            System.out.println(Musb.nome + "(Brinde): " + Musb.capacidade + "Gb");
        }
    }
    void addMemoriaUSB(MemoriaUSB musb) {
        Musb = musb;
    }
}
