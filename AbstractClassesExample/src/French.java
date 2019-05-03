public class French extends Greeting {
    @Override
    public String hello() {
        countFrench++;
        return "Bonjour";
    }

    @Override
    public String goodbye() {
        return "Au revoir";
    }
}
