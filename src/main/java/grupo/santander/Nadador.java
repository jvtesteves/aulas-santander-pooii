package grupo.santander;

public interface Nadador {

    default void nadar() {
        System.out.println("Nadando");
    }

    void movimentar();
}
