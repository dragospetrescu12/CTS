package clase;

//asta e proxy ul
// declaram te tipul interfetei pentru ca daca am avea si alte autoturisme, sa mearga pt toate
public class MijlocDeTransportNoapte implements MijlocTransport {

    private MijlocTransport mijlocTransport;

    public MijlocDeTransportNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getNrCalatori() > 0) {
            mijlocTransport.opresteInStatie();
        } else {
            System.out.println("Autobuzul de noapte nu opreste!");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }
}
