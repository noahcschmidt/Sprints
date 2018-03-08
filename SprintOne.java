public abstract class SprintOne {
    private String stockName;
    private String stockAbb;
    private double pricePerShare;
    private int shareNumber;
    private double dividend;
    private double totalDiv;

    private SprintOne(String stock, double price, int quantity, double div) {
        stockName = stock;
        stockAbb = stockName.substring(0,3);  //something like that
        pricePerShare = price;
        shareNumber = quantity;
        dividend = div;

        totalDiv = dividend * shareNumber;
    }

    public void setStockName(String name) {
        stockName = name;
    }
    public void setStockAbb(String abb) {
        stockAbb = abb;
    }
    public void setPrice(double price) {
        pricePerShare = price;
    }
    public void setShareNum(int shares) {
        shareNumber = shares;
    }
    public void setDiv(double div) {
        dividend = div;
    }

    private String getName() {
        return stockName;
    }
    private String getAbb() {
        return stockAbb;
    }
    private double getPrice() {
        return pricePerShare;
    }
    private int getNumber() {
        return shareNumber;
    }
    private double getDividend() {
        return dividend;
    }
    private double getTotalDiv() {
        return totalDiv;
    }
}
