import java.util.*;

public class Solution {

    public static String generate_bc(String url, String separator) {
        // Remove protocol and query/hash parts
        url = url.replaceAll("https?://", "")
                 .replaceAll("www\\.", "")
                 .replaceAll("[?#].*$", "");

        // Remove domain
        int firstSlash = url.indexOf('/');
        if (firstSlash == -1) return "<span class=\"active\">HOME</span>";
        String[] parts = url.substring(firstSlash + 1).split("/");

        // If last is index.xxx, remove it
        if (parts.length > 0 && parts[parts.length - 1].matches("index\\.(html?|php|asp)")) {
            parts = Arrays.copyOf(parts, parts.length - 1);
        }

        // If nothing remains after removing index, just return HOME active
        if (parts.length == 0) return "<span class=\"active\">HOME</span>";

        StringBuilder result = new StringBuilder();
        result.append("<a href=\"/\">HOME</a>");
        String path = "/";
        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            String label = getLabel(part);

            if (i == parts.length - 1) {
                result.append(separator).append("<span class=\"active\">").append(label).append("</span>");
            } else {
                path += part + "/";
                result.append(separator).append("<a href=\"").append(path).append("\">").append(label).append("</a>");
            }
        }

        return result.toString();
    }

    private static String getLabel(String part) {
        // Remove file extension if exists
        part = part.replaceAll("\\.(html?|php|asp)$", "");

        if (part.length() > 30) {
            // Use acronym of the long part
            String[] words = part.split("-");
            StringBuilder acronym = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty() && !Arrays.asList("the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a").contains(word)) {
                    acronym.append(word.charAt(0));
                }
            }
            return acronym.toString().toUpperCase();
        } else {
            return part.replace("-", " ").toUpperCase();
        }
    }
}
