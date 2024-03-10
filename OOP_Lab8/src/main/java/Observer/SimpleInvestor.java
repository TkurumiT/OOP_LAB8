
package Observer;

public class SimpleInvestor implements Investor {
       private String name;
       private Strategy currentStrategy;
       public SimpleInvestor(String name)
       {
           this.name = name;
           this.currentStrategy = Strategy.monitorOnly;
       }
       @Override
       public String getName() {
              return name;
       }
       @Override
       public Strategy addaptStrategy() {
              return currentStrategy;
       }
       @Override
       public void update(String stocksymbol, double priceChange) {
              System.out.print.(getName() +"was notified by the price change in " + stockSymbol + ": $" + priceChange)
              if(priceChange < 50)
              {
                  System.out.println(" and change their strategy to " +Strategy.HedgingStrategies );
              }
              else {
                       if(priceChange > 200)
                       {
                             System.out.println(" and change their Strategy to " + Strategy.QuickTransictions);
                       }
                       else {
                             System.out.println(" and decide to do nothing");
                       }
           }
       }
    
}
