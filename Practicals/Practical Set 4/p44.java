interface Property {
    double computePrice();
}

class Bungalow implements Property {
    private String name;
    private double constructionArea;
    private double landArea;

    public Bungalow(String name, double constructionArea, double landArea) {
        this.name = name;
        this.constructionArea = constructionArea;
        this.landArea = landArea;
    }

    @Override
    public double computePrice() {
        double constructionCost = constructionArea * 500; // Rs. 500/- per sq.feet
        double landCost = landArea * 400; // Rs. 400/- per sq.feet for landArea
        return constructionCost + landCost;
    }
}

class Flat implements Property {
    private String name;
    private double constructionArea;

    public Flat(String name, double constructionArea) {
        this.name = name;
        this.constructionArea = constructionArea;
    }

    @Override
    public double computePrice() {
        double constructionCost = constructionArea * 500; // Rs. 500/- per sq.feet
        return constructionCost + 200000; // Additional cost for Flat: Rs. 200,000/-
    }
}

public class Main {
    public static void main(String[] args) {
        Bungalow bungalow = new Bungalow("Luxury Bungalow", 2500, 1500);
        Flat flat = new Flat("Apartment Flat", 1500);

        double bungalowPrice = bungalow.computePrice();
        double flatPrice = flat.computePrice();

        System.out.println("Bungalow Price: Rs. " + bungalowPrice);
        System.out.println("Flat Price: Rs. " + flatPrice);
    }
}
