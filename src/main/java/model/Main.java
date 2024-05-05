package model;

import ApiRequest.ApiRequest;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiRequest apiRequest = new ApiRequest();
        Scanner scanner = new Scanner(System.in);


        int iniciador = 0;
        while(iniciador != -1){
            PrincipalMessage();
            String userInput = scanner.nextLine();
            String userInputFilter = Filters.removeSpacesAndUppercase(userInput);

            // Use the user-selected currency for the API request
            SimpleMessage();
            String out = scanner.nextLine();
            String outFilter = Filters.removeSpacesAndUppercase(out);

            // Get the amount to be converted from the user
            System.out.println("Por favor digita la cantidad " + userInputFilter + " que deseas convertir");
            double value = scanner.nextDouble();

            // Calculate the conversion based on user-selected currencies and value
            double convertedAmount = apiRequest.currencyMade(userInputFilter, outFilter, value);

            System.out.println("La cantidad convertida es: " + convertedAmount + " " + outFilter);

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

                AED
                AFN
                ALL
                AMD
                ANG
                AOA
                ARS
                AUD
                AWG
                AZN
                BAM
                BBD
                BDT
                BGN
                BHD
                BIF
                BMD
                BND
                BOB
                BRL
                BSD
                BTN
                BWP
                BYN
                BZD
                CAD
                CDF
                CHF
                CLP
                CNY
                COP
                CRC
                CUP
                CVE
                CZK
                DJF
                DKK
                DOP
                DZD
                EGP
                ERN
                ETB
                EUR
                FJD
                FKP
                FOK
                GBP
                GEL
                GGP
                GHS
                GIP
                GMD
                GNF
                GTQ
                GYD
                HKD
                HNL
                HRK
                HTG
                HUF
                IDR
                ILS
                IMP
                INR
                IQD
                IRR
                ISK
                JEP
                JMD
                JOD
                JPY
                KES
                KGS
                KHR
                KID
                KMF
                KRW
                KWD
                KYD
                KZT
                LAK
                LBP
                LKR
                LRD
                LSL
                LYD
                MAD
                MDL
                MGA
                MKD
                MMK
                MNT
                MOP
                MRU
                MUR
                MVR
                MWK
                MXN
                MYR
                MZN
                NAD
                NGN
                NIO
                NOK
                NPR
                NZD
                OMR
                PAB
                PEN
                PGK
                PHP
                PKR
                PLN
                PYG
                QAR
                RON
                RSD
                RUB
                RWF
                SAR
                SBD
                SCR
                SDG
                SEK
                SGD
                SHP
                SLE
                SLL
                SOS
                SRD
                SSP
                STN
                SYP
                SZL
                THB
                TJS
                TMT
                TND
                TOP
                TRY
                TTD
                TVD
                TWD
                TZS
                UAH
                UGX
                UYU
                UZS
                VES
                VND
                VUV
                WST
                XAF
                XCD
                XDR
                XOF
                XPF
                YER
                ZAR
                ZMW
                ZWL
    
                """);
    }
    private static void SimpleMessage(){
        System.out.println("""
                Tasas disponibles a convertir:
                
                
                AED
                AFN
                ALL
                AMD
                ANG
                AOA
                ARS
                AUD
                AWG
                AZN
                BAM
                BBD
                BDT
                BGN
                BHD
                BIF
                BMD
                BND
                BOB
                BRL
                BSD
                BTN
                BWP
                BYN
                BZD
                CAD
                CDF
                CHF
                CLP
                CNY
                COP
                CRC
                CUP
                CVE
                CZK
                DJF
                DKK
                DOP
                DZD
                EGP
                ERN
                ETB
                EUR
                FJD
                FKP
                FOK
                GBP
                GEL
                GGP
                GHS
                GIP
                GMD
                GNF
                GTQ
                GYD
                HKD
                HNL
                HRK
                HTG
                HUF
                IDR
                ILS
                IMP
                INR
                IQD
                IRR
                ISK
                JEP
                JMD
                JOD
                JPY
                KES
                KGS
                KHR
                KID
                KMF
                KRW
                KWD
                KYD
                KZT
                LAK
                LBP
                LKR
                LRD
                LSL
                LYD
                MAD
                MDL
                MGA
                MKD
                MMK
                MNT
                MOP
                MRU
                MUR
                MVR
                MWK
                MXN
                MYR
                MZN
                NAD
                NGN
                NIO
                NOK
                NPR
                NZD
                OMR
                PAB
                PEN
                PGK
                PHP
                PKR
                PLN
                PYG
                QAR
                RON
                RSD
                RUB
                RWF
                SAR
                SBD
                SCR
                SDG
                SEK
                SGD
                SHP
                SLE
                SLL
                SOS
                SRD
                SSP
                STN
                SYP
                SZL
                THB
                TJS
                TMT
                TND
                TOP
                TRY
                TTD
                TVD
                TWD
                TZS
                UAH
                UGX
                UYU
                UZS
                VES
                VND
                VUV
                WST
                XAF
                XCD
                XDR
                XOF
                XPF
                YER
                ZAR
                ZMW
                ZWL

                """);
    }
}

