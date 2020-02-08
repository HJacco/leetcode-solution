package com.study;

public class StringIndexer {
    public int index(String source, String target) {
        if(null == source || "".equals(source) || null == target) {
            return -1;
        }
        if("".equals(target)) {
            return 0;
        }
        char fitstChar = target.charAt(0);
        for (int i = 0; i <= source.length() - target.length(); i ++) {
            char t = source.charAt(i);
            if(t != fitstChar) {
                continue;
            }
            boolean ok = true;
            for (int j = 0, k = i; j < target.length(); j ++, k ++) {
                if(source.charAt(k) != target.charAt(j)){
                    ok = false;
                    break;
                }
            }
            if(ok) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StringIndexer indexer = new StringIndexer();
        String source = "abcnd";
        String target = "a";
        System.out.println(indexer.index(source, target));
    }
}
