package BusinessLogic.Entities.Exoesqueleto;

import BusinessLogic.Entities.EjercitoRuso.IhomigaExtremidad;
import BusinessLogic.Entities.EjercitoRuso.HormigaRusa;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;

public class AntBot extends IABOT implements IhomigaExtremidad {
    private FuentePoder ssEFuentePoder;
    private TurboReactor ssETurboReactor;
    private BrazoDerecho ssEBrazoDerecho;
    private BrazoIzquierdo ssEBrazoIzquierdo;
    private Pierna ssEPiernaDerecha;
    private Pierna ssEPiernaIzquierda;

    public AntBot(IABOT iaBot) {
        super(iaBot);
        // ssEFuentePoder = new FuentePoder();
        ssETurboReactor = new TurboReactor();
        ssEBrazoDerecho = new BrazoDerecho();
        ssEPiernaDerecha = new Pierna();
        ssEPiernaIzquierda = new Pierna();

        if (AntBot.circuitoAnillado)
            ssEBrazoIzquierdo = new BrazoIzquierdo();

    }

    public void unirseSoldado(HormigaRusa soldado) throws InterruptedException {
        // if (ExoBot.circuitoAnillado && ssEBrazoIzquierdo != null) {
        //     ssEBrazoIzquierdo = new BrazoIzquierdo();
        //     System.out.print("Arma del brazo izquierdo: ");
        //     if (soldado.getssHabilidadBrazoIzquierdo())

        //         ssEBrazoIzquierdo.setssArma(new ArmaMetralleta("Metralleta MK61"));
        //     else
        //         ssEBrazoIzquierdo.setssArma(new ArmaBazuca("Bazuca antitanque"));

        //     System.out.println(ssEBrazoIzquierdo.ssArma.toString());
        //     System.out.print("Arma del brazo derecho: ");

        //     ArmaLaser armaLaser = new ArmaLaser("Arma láser");
        //     ArmaLanzaFuego armaLanzaFuegos = new ArmaLanzaFuego("Lanza fuegos");
        //     if (soldado.getssHabilidadBrazoDerecho())
        //         ssEBrazoDerecho.setArma(armaLaser);
        //     else
        //         ssEBrazoDerecho.setArma(armaLanzaFuegos);

        //     System.out.println(ssEBrazoDerecho.ssArma.toString());

        // }



    }

    public void dispararArmas() throws InterruptedException {

        // ssEBrazoIzquierdo.ssArma.ssDispararArmaIzquierda(30);
        // ssEBrazoDerecho.ssArma.ssDispararArmaDerecha(10);
    }

}
