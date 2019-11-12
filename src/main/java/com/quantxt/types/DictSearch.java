package com.quantxt.types;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
public abstract class DictSearch<T> implements Serializable {

    private static final long serialVersionUID = 3935799515300870082L;

    public enum Mode {
        ORDERED_SPAN, FUZZY_ORDERED_SPAN, SPAN, FUZZY_SPAN, PARTIAL_SPAN,
        PARTIAL_FUZZY_SPAN
    }

    public enum AnalyzType {
        EXACT, EXACT_CI, WHITESPACE, SIMPLE, STANDARD, STEM
    }

    protected Mode [] mode = new Mode [] {Mode.ORDERED_SPAN};
    protected AnalyzType [] analyzType = new AnalyzType[] {AnalyzType.STANDARD};
    protected Dictionary dictionary;

    public abstract Collection<T> search(final String query_string);
}
