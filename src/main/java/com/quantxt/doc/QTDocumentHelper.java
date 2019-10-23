package com.quantxt.doc;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.quantxt.doc.QTDocument.DOCTYPE;
import com.quantxt.helper.types.ExtInterval;
import com.quantxt.helper.types.ExtIntervalSimple;
import com.quantxt.interval.Interval;
import com.quantxt.trie.Trie;

public interface QTDocumentHelper {

    List<String> tokenize(String str);

    List<String> stemmer(String str);

    String normalize(String string);

    String removeStopWords(String string);

    String[] getSentences(String text);

    String[] getPosTags(String[] text);

    List<ExtIntervalSimple> getNounAndVerbPhrases(String orig, String[] tokens);

    Trie getVerbTree();

    boolean isSentence(String str, List<String> tokens);

    Set<String> getStopwords();

    Set<String> getPronouns();

    DOCTYPE getVerbType(String verbPhs);

    boolean isStopWord(String p);

    String getValues(String orig, String context, List<ExtIntervalSimple> list);

    String getDatetimeValues(String orig, String context, List<ExtIntervalSimple> list);

    String getPatternValues(String orig, String context, Pattern regex, int[] groupd, List<ExtIntervalSimple> list);

}
