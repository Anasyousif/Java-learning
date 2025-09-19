// The Welcome class contains a method to provide a localized greeting.
public class Welcome {

 private static final java.util.Map<String,String> greetings = new java.util.HashMap<>();

  
    static {
        greetings.put("english", "Welcome");
        greetings.put("czech", "Vitejte");
        greetings.put("danish", "Velkomst");
        greetings.put("dutch", "Welkom");
        greetings.put("estonian", "Tere tulemast");
        greetings.put("finnish", "Tervetuloa");
        greetings.put("flemish", "Welgekomen");
        greetings.put("french", "Bienvenue");
        greetings.put("german", "Willkommen");
        greetings.put("irish", "Failte");
        greetings.put("italian", "Benvenuto");
        greetings.put("latvian", "Gaidits");
        greetings.put("lithuanian", "Laukiamas");
        greetings.put("polish", "Witamy");
        greetings.put("spanish", "Bienvenido");
        greetings.put("swedish", "Valkommen");
        greetings.put("welsh", "Croeso");
    }
  
  public static String greet(String language){
    
    if (language == null || language.trim().isEmpty()){
      return "Welcome";
    }
    
    String lowercaseLanguage = language.toLowerCase();
    
    return greetings.getOrDefault(lowercaseLanguage,"Welcome");
  } 

  
}
