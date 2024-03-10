
package Observer;

import java.util.ArrayList;
import java.util.List;

public interface Stock {
    public void addObserver(Investor investor);
    public void removeObservver(Investor investor);
    public void notifyInvestor(double priceChange);
    
}
