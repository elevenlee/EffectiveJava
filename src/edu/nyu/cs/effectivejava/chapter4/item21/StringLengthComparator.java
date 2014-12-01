package edu.nyu.cs.effectivejava.chapter4.item21;

class StringLengthComparator implements Comparator<String> {
    public static final StringLengthComparator INSTANCE = 
            new StringLengthComparator();
    
    private StringLengthComparator() {}
    
    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }

}
