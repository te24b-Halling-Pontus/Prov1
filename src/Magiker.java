public class Magiker extends Fiende{
    private int mana;

    Magiker(String namn, int hälsa, int mana){
        super(namn, hälsa);
        this.mana = mana;
    }

    @Override
    public void förflyttning(){
        IO.println(namn + " rör sig mot spelaren");
    }

    @Override
    public void attack(){
        IO.println(namn + " sjuter mana-blixtrar");
    }
}
