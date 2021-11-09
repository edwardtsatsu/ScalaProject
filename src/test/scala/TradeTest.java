import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

     Trade myTrade  = new Trade(67,"yhu","67hjs",78);

    @Test
    void value() {
        assertEquals(5226,myTrade.value());
    }

}