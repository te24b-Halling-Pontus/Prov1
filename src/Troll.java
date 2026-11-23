public class Troll extends Fiende{
    private int styrka;


    Troll(String namn, int hälsa, int styrka){
        super(namn, hälsa);
        this.styrka = styrka;
    }

    @Override
    public void förflyttning(){
        IO.println( namn + " flytar på sig");
    }

    @Override
    public void attack(){
        IO.println(namn + " slår mot dig!");
    }
}
