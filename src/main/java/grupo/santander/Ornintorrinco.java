package grupo.santander;

public class Ornintorrinco implements Animal, Nadador, Amamentador{

    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void alimentar() {
        amamentar();
    }
}
