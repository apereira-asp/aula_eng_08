public class Geometrica implements ICalcMedia{

    public double calcMedia(double p1, double p2){
        return Math.sqrt(p1*p2);
    }
    public String situacao(double p1, double p2){
        if(calcMedia(p1, p2)>7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
