package com.quantxt.interval;

import java.util.Comparator;

public class IntervalableComparatorByPosition implements Comparator<Intervalable> {

    @Override
    public int compare(final Intervalable intervalable, final Intervalable intervalable2) {
        return intervalable.getStart() - intervalable2.getStart();
    }

}
