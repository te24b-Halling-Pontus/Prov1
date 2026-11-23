public class Fiende {
    protected String namn;
    protected int hälsa;

    Fiende(String namn, int hälsa){
        this.namn = namn;
        this.hälsa = hälsa;
    }

    public void förflyttning(){
        IO.println("Fienden flytar på sig");
    }

    public void attack(){
        IO.println("Fienden attackerar");
    }
}
