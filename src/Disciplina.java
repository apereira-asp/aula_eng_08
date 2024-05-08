public class Disciplina {

    //Properties
    private ICalcMedia calcMedia;
    private  double media, p1, p2;
    private String nome, situacao;



    //Methods

    public void calcMedia() {

        media=calcMedia.calcMedia(p1,p2);
        situacao=calcMedia.situacao(p1,p2);
    }

    public Disciplina(ICalcMedia calcmedia) {
        this.calcMedia=calcmedia;

    }

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
