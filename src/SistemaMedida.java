public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                
                System.out.println("Tamanh Pequeno");
                
            break;
                }
            
        
        case "M":{
                
            System.out.println("Tamanho Médio");
            
        break;
        }

        case  "G":{
         
        System.out.println("Tamanho Grande");
        
        break;
        }
        
            default:
            System.out.println("Inefinido");
                break;
        }

        
    }

}
