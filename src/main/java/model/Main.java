package model;

import ApiRequest.ApiRequest;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiRequest apiRequest = new ApiRequest();
        Exchange exchange = new Exchange();
        Scanner scanner = new Scanner(System.in);
        Filters filters = new Filters();

        int iniciador = 0;
        while(iniciador != -1){
            PrincipalMessage();
            String userInput = scanner.nextLine();
            filters.RemoveSpaces(userInput);
            SimpleMessage();
            String out = scanner.nextLine();
            String outFilter = filters.RemoveSpaces(out);
            System.out.println(apiRequest.currencyMade(outFilter));
            iniciador = -1;
        }
    }

    private static void PrincipalMessage() {
        System.out.println("""
                    ****************************************************************************************************
                    Bievenido a tu conversor de monedas de confianza.
                    Para poder usarlo te voy a dar las siguientes instrucciones:
                    1. Se mostrarán las tasas que están disponibles, tipea la tasa que buscas.
                    2. Las tasas a las que se podrán hacer la conversión serán las mismas que se muestran en consola.
                    3. Elige el valor el cual quieres tranformar.
                    4. ¡Disfruta!
                    
                    Tasas disponibles:
                    
                    USD
                    COP
                    ARS
                    BOB
                    BRL
                    
                    """);
    }
    private static void SimpleMessage(){
        System.out.println("""
                Tasas disponibles a convertir:
                
                USD
                COP
                ARS
                BOB
                BRL

                """);
    }
}

