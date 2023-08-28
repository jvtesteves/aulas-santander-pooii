package grupo.santander;

public class Vaca implements Animal, Amamentador {
    @Override
    public void alimentar() {
        amamentar();
    }

    @Override
    public void movimentar() {

    }
}
