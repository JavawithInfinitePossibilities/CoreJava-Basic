/**
 * 
 */
package com.java.interfaceclass.impl;

import java.util.HashMap;
import java.util.Map;

import com.java.interfaceclass.StatisticsAggregator;

/**
 * @author Siddhant sahu
 *
 */
public class StatisticsAggregatorImpl implements StatisticsAggregator {
	private Map<String, Double> stock = new HashMap<String, Double>();
	private Map<String, Integer> count = new HashMap<String, Integer>();

	/* (non-Javadoc)
	 * @see com.java.interfaceclass.StatisticsAggregator#putNewPrice(java.lang.String, double)
	 */
	public void putNewPrice(String symbol, double price) {
		if (stock.containsKey(symbol)) {
			stock.put(symbol, (stock.get(symbol) + price));
			count.put(symbol, count.get(symbol) + 1);
		} else {
			stock.put(symbol, price);
			count.put(symbol, 1);
		}
	}

	/* (non-Javadoc)
	 * @see com.java.interfaceclass.StatisticsAggregator#getAveragePrice(java.lang.String)
	 */
	public double getAveragePrice(String symbol) {
		double avg = stock.get(symbol) / count.get(symbol);
		return avg;
	}

	/* (non-Javadoc)
	 * @see com.java.interfaceclass.StatisticsAggregator#getTickCount(java.lang.String)
	 */
	public int getTickCount(String symbol) {
		return count.get(symbol);
	}

}
