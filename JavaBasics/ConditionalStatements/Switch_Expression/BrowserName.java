public class BrowserName {
    public static void main(String[] args) {
        String browser = "microsoft edge";
        browser = browser.toUpperCase();

        String openingBrowser = switch (browser) {
            case "GOOGLE CHROME" -> "OPENING GOOGLE CHROME";
            case "MICROSOFT EDGE" -> "OPENING MICROSOFT EDGE";
            case "OPERA BROWSER" -> "OPENING OPERA BROWSER";
            default -> "NOT SUPPORTED";
        };
        System.out.println(openingBrowser);
    }

}
// OPENING MICROSOFT EDGE