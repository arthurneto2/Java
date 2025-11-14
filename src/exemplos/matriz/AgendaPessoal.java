package exemplos.matriz;

import java.util.Scanner;

public class AgendaPessoal {
    public static void main(String[] args) {
        String [][][] agenda = new String[12][30][24];
        int opcao = 0;

        while (opcao != 4){
            opcao = menuInicial();

            switch (opcao){
                case 1: cadastroEvento(agenda);break;
                case 2: buscarEvento(agenda);break;
                case 3: listarEventos(agenda);break;
                case 4: break;
                default: System.out.println("Opcao invalida");
            }
        }
        System.out.println("Saindo...");
    }

    public static int menuInicial(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("### AGENDA ###");
        System.out.println("1 - Cadastrar Evento");
        System.out.println("2 - Buscar Evento");
        System.out.println("3 - Listar Eventos");
        System.out.println("4 - Sair");

        return scanner.nextInt();
    }

    public static int[] capituraMesDiaHora(Scanner scanner){
        int[] data = new int[3];

        System.out.println("Digite o mes: ");
        data[0] = scanner.nextInt() - 1;

        System.out.println("Digite o dia: ");
        data[1] = scanner.nextInt() - 1;

        System.out.println("Digite a hora [24h]: ");
        data[2] = scanner.nextInt() - 1;

        if (data[0] > 12 || data[1] > 30 || data[2] > 24){
            System.out.println("Mes, dia ou hora invalido!");
            return null;
        }
        return data;
    }


    public static void cadastroEvento(String[][][] agenda){
        Scanner scanner = new Scanner(System.in);

        System.out.println("### EVENTO ###");
        System.out.println("Digite o evento: ");
        String evento = scanner.next();

        int[] data = capituraMesDiaHora(scanner);
        if (data == null){
            return;
        }
        agenda[data[0]][data[1]][data[2]] = evento;
    }


    private static void buscarEvento(String[][][] agenda) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### BUSCAR ###");


        int[] data = capituraMesDiaHora(scanner);
        if (data == null){
            return;
        }

        if (agenda[data[0]][data[1]][data[2]] == null){
            System.out.println("Nenhum compromisso cadastrado nesse dia e hora.");
            return;
        }
        System.out.println("Compromisso: " + agenda[data[0]][data[1]][data[2]]);
    }


    private static void listarEventos(String[][][] agenda) {
        System.out.println("### LISTA DE EVENTOS ###");
        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                for (int k = 0; k < agenda[i][j].length; k++) {
                    if (agenda[i][j][k] != null){
                        System.out.println("Mes: " + (i+1) + " Dia: " + (j+1) + " Hora: " + (k+1) + " Evento: " + agenda[i][j][k]);
                    }
                }
            }
        }
        System.out.println();
    }
}
