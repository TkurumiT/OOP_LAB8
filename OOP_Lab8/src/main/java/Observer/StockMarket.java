
package Observer;

public class StockMarket {
    public static void main(String[]args) {
        Stock appleStock = new ConcreteStock("APP",100);
        Stock dellStock = new ConcreteStock("DELL",100);
        // Register basic investor
        Investor tomInvestor = new SimpleInvestor("TOM");
        Investor bobInvestor = new SimpleInvestor("BOB");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);
        
        
        // simulate a significant price change
        appleStock.notifyInvestor(100);
        appleStock.notifyInvestor(40.0);
        appleStock.notifyInvestor(10.0);
        appleStock.notifyInvestor(5.0);
        dellStock.notifyInvestor(300.0);
        dellStock.notifyInvestor(200.0);
    }
    
}
