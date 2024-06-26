package AgeValidity;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// campos numéricos
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" quer comprar "+quantity+" "+itemDesc;

	// Calculando o custo total
        total = (price*quantity)*tax;

        
        
        boolean outOfStock = false;
        
        if (quantity > 1){
            message = message +"s";
        } 
        
        // Teste outOfStock e notifique o usuário em ambos os casos.
        if (outOfStock){  
            System.out.println(itemDesc+" está fora de estoque.");
        }
        else{
            System.out.println(message);
            System.out.println("Custo total com impostos: "+ total);
        }
        
        
        
        // Teste a quantidade e modifique a mensagem se a quantidade for > 1  
       
        
        // Teste outOfStock e notifique o usuário em ambos os casos.  
        
        
        
    }
    
}


