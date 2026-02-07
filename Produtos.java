class Produtos{
    String nome;
    double preco;
    int quantidade;
    boolean disponivel;
}

class Main{
    public static void main(String[] args) {
        
        Produtos comida1 = new Produtos();
        comida1.nome = "Arroz";
        comida1.preco = 25.50;
        comida1.quantidade = 0;

        if (comida1.quantidade > 0){

            comida1.disponivel = true;
            System.out.println("Status: Produto disponivel");

            if(comida1.quantidade <=5){
                System.out.println("Estoque Baixo!!");
            }

            else if(comida1.quantidade >= 6 && comida1.quantidade <= 15){
                System.out.println("Estoque Regular");
            }

            else if(comida1.quantidade > 20){
                System.out.println("Estoque Alto");
            }


        }
        else{
            System.out.println("Sem itens em estoque.");
        }
    }
}
