package grupo.santander;

public class Golfinho implements Animal, Nadador, Amamentador {

    @Override
    public void alimentar() {
        amamentar();
    }

    @Override
    public void movimentar() {
        nadar();
    }


}
