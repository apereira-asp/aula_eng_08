public class Aritmetica implements ICalcMedia{

    @Override
    public double calcMedia(double p1, double p2){
        return (p1+p2)/2.0;
    }

    @Override
    public String situacao(double p1, double p2){
        if(calcMedia(p1, p2)>5){
            return "Aprovado";

        }else{
            return "Reprovado";
        }

    }

}
