public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da Tv? " + smartTv.ligada);

        smartTv.mudarCanal(55);
        System.out.println("Canal atual ? " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status da Tv? " + smartTv.ligada);
    }
}