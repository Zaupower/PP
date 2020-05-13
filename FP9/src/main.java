import Objects.Administrative;
import Manegement.ProgrammingManagement;
import Objects.ProjectManager;
import enums.ContractType;
import enums.Habilitacoes;

import java.time.LocalDate;

/**
 *
 */
public class main {

    /**
     *
     * @param args
     */
     public static void main(String[] args) {
         /**
          *
          */
         LocalDate ld = LocalDate.parse( "2016-09-20" ) ;
         Administrative administrative = new Administrative("Marcelo",ld,"Rua de Real",
                55555,3333,100,"MCTACO", ContractType.INTEGRAL,
                 Habilitacoes.LICENCIATURA, ld);
         ProjectManager projectManager = new ProjectManager("Administrative", ld, "Rua do administrador", 00000, 0000, 200, 1, " abc", ld);

         ProgrammingManagement programmingManagement = new ProgrammingManagement();
         programmingManagement.setColaborators(administrative);
         programmingManagement.setColaborators(administrative);
         programmingManagement.setColaborators(projectManager);

         //System.out.println(administrative.toString());
         //System.out.println(programmingManagement.toString());
         //programmingManagement.print();
         programmingManagement.findProjectManager();
    }
}
