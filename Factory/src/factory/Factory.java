package factory;

public class Factory {

    public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrInmatriculare) {
        switch (tipTransport) {
            case AUTOBUZ: return new Autobuz(nrInmatriculare); //avand return nu trb neaparat sa punem break
            case TRAMVAI: return new Tramvai(nrInmatriculare);
            case TROLEIBUZ: return new Troleibuz(nrInmatriculare);
            default: return null;
        }
    }
}
