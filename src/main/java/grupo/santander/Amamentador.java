package grupo.santander;

public interface Amamentador {

    default void amamentar() {
        System.out.println("amamentando");
    }
}
