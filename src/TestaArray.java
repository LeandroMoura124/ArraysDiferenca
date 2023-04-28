public class TestaArray {
    public static void main(String[] args){

        // Cliente[] clientes = new Cliente[10];
        // for(int i=0; i < clientes.length; i ++){
        //     clientes[i] = new Cliente();
        //     clientes[i].nome = "leandro";
        // }
        // for(Cliente c : clientes){
        //     System.out.println(c.nome);
        // }
            //podemos criar array assim também
        Cliente clienteEspec[] = new Cliente[5];
        clienteEspec[0] = new Cliente();
        clienteEspec[1] = new ClienteEspecial(); //compila 
        //*podemos jogar um array de cliente e tambem um outro array da subclasse de cliente (ClienteEspecial) */


       Cliente leandro = new Cliente();
       leandro.nome = "leandro";
       clienteEspec[2] = leandro;
       System.out.println(leandro.nome); //compila im prime leandro
       System.out.println(clienteEspec[2].nome); // compila imprime leandro


       //se eu modificar o objeto diretamente, as referencias dos objetos tambem serao modificadas
       leandro.nome = "silva";
       System.out.println(leandro.nome); //compila imprime silva
       System.out.println(clienteEspec[2].nome); // compila tambem imprime silva, pois foi atribuido silva pro meu objeto direto

                /*OUTRO EXE */
                Cliente guilherme = new Cliente();
                guilherme.setNome("guilherme");

                Cliente[] clientes = new Cliente[10];
                clientes[0] = guilherme;

                System.out.println(guilherme.getNome()); // guilherme
                System.out.println(clientes[0].getNome()); // guilherme

                guilherme.setNome("Silveira");

                System.out.println(guilherme.getNome()); // silveira
                System.out.println(clientes[0].getNome()); // silveira



       //tentando fazer casting de arrays de outros tipos
       int valores [] = new int[10];
       
    //    long valores2[] = (long[]) valores; // nao compila o casting msm forçando

       String nomes[] = {"Leandro", "Ney", "Wind"};
       Object objetos[] = nomes; //compila
       System.out.println(objetos[0]);

       for(Object o : objetos){
        System.out.println(o);
       }

       //Já no caso de referências, por causa do polimorfismo, é possível fazer a atribuição sem casting de um array para outro tipo de array:

       String[] valores2 = new String[2];
        valores2[0] = "Certificação";
        valores2[1] = "Java";

        Object[] vals = valores2;

        for(Object valor : vals) {
            System.out.println(valor); // Certificação e depois Java
        }














    }
}


class Cliente{
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class ClienteEspecial extends Cliente{

}