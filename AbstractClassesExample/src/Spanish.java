public class Spanish extends Greeting{
    @Override
    public String hello() {
        countSpanish++;
        return "Hola";
    }

    @Override
    public String goodbye() {
        return "Adios";
    }
}
