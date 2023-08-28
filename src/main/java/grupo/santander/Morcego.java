package grupo.santander;

public class Morcego implements Animal, Amamentador, Voador {

    @Override
    public void movimentar() {
        voar();
    }

    @Override
    public void alimentar() {
        amamentar();
    }

}
