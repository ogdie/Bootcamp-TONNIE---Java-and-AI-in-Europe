package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:
        System.out.println("--- Teste Singleton ---");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia(); // Deveria ser a mesma instância
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia(); // Deveria ser a mesma instância
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia(); // Deveria ser a mesma instância
        System.out.println(lazyHolder);
        System.out.println("------------------------\n");

        // Testes relacionados ao Design Pattern Strategy:
        System.out.println("--- Teste Strategy ---");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        System.out.println("------------------------\n");

        // Testes relacionados ao Design Pattern Facade:
        System.out.println("--- Teste Facade ---");
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
        System.out.println("------------------------\n");
    }

}