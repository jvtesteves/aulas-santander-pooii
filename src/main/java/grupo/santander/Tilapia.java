package grupo.santander;

public class Tilapia implements Animal, Nadador{

    @Override
    public void movimentar() {
        nadar();
    }
}
