import enums.ContractType;
import enums.Habilitacoes;

import java.time.LocalDate;

public class main {

     public static void main(String[] args) {
         LocalDate ld = LocalDate.parse( "2016-09-20" ) ;
         Administrative administrative = new Administrative("Marcelo",ld,"Rua de Real",
                55555,3333,100,"MCTACO", ContractType.INTEGRAL,
                 Habilitacoes.LICENCIATURA, ld);
         System.out.println(administrative.toString());
    }
}
