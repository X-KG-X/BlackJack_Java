package com.annapurna;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {
    Dealer dealer=new Dealer();

    @Before
    public void setUp() {

    }

    @Test
    public void testDealerStaticName(){
        assertEquals("Polly", Dealer.name);
    }

    @Test
    public void testDealerNewDeck(){

        assertEquals(52,dealer.getDeck().size());
    }

    @Test
    public void testShuffleDeck(){
        System.out.println(dealer.shuffleDeck());
        assertTrue(dealer.shuffleDeck());
    }

}