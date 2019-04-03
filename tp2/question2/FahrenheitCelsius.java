package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author amine amine
 * @version V1
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
        int fahrenheit = 0;
        float celsius = 0;
        int lengthArgs = args.length;
        for(int i = 0; i < lengthArgs ; i++){
          fahrenheit = Integer.parseInt(args[i]);
          celsius = fahrenheitEnCelsius(Integer.parseInt(args[i]));
          System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                            // format
                                            // impos�s
        }
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
      float degreCelsius = (f-32) * 5/9f;
      degreCelsius = (int)(degreCelsius*10)/10.0f; // un seul chiffre derri�re la virgule,
      return degreCelsius;
     }

}
