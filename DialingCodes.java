import java.util.Map;
import java.util.HashMap;
public class DialingCodes {
    // Map to hold the dialing codes and corresponding countries
    private Map<Integer, String> dialingCodes = new HashMap<>();
    // This method returns the map of dialing codes
    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }
    // This method adds or updates the dialing code for a given country
    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }
    // This method adds a new dialing code only if the code or country is not already in the map
    public void addNewDialingCode(Integer code, String country) {
        // Check if the code or country already exists
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)) {
            dialingCodes.put(code, country); // Add new entry if neither exists
        }
    }
    // This method finds and returns the dialing code for a given country
    public Integer findDialingCode(String country) {
        // Iterate over the map to find the country
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();  // Return the dialing code if country matches
            }
        }
        return null; // Return null if the country is not found in the map
    }
    // This method updates the dialing code for a given country
    public void updateCountryDialingCode(Integer newCode, String country) {
        // Find the existing dialing code for the country
        Integer existingCode = findDialingCode(country);
        // If the country exists, update the dialing code
        if (existingCode != null) {
            // Remove the old dialing code and update with the new one
            dialingCodes.remove(existingCode);
            dialingCodes.put(newCode, country);
        }
        // If the country does not exist, do nothing
    }
    // This method retrieves the country for a given dialing code
    public String getCountry(Integer code) {
        return dialingCodes.get(code); // Return the country associated with the dialing code
    }
}