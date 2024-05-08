public class Main {
    public static void main(String[] args) {

        //Aritmetica calculo = new Aritmetica();

        Geometrica calculo = new Geometrica();


        Disciplina d = new Disciplina(calculo);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(8);
        d.setP2(8);
        d.calcMedia();
        System.out.println(String.format("P1:%.2f \nP2:%.2f \nMédia:%.2f \nSituação: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}