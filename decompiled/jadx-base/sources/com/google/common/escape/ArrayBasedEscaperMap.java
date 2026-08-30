package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = (char[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Character.TYPE, 0, 0);
    private final char[][] replacementArray;

    public static com.google.common.escape.ArrayBasedEscaperMap create(java.util.Map<java.lang.Character, java.lang.String> replacements) {
        return new com.google.common.escape.ArrayBasedEscaperMap(createReplacementArray(replacements));
    }

    private ArrayBasedEscaperMap(char[][] replacementArray) {
        this.replacementArray = replacementArray;
    }

    char[][] getReplacementArray() {
        return this.replacementArray;
    }

    static char[][] createReplacementArray(java.util.Map<java.lang.Character, java.lang.String> map) {
        com.google.common.base.Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return EMPTY_REPLACEMENT_ARRAY;
        }
        char[][] cArr = new char[((java.lang.Character) java.util.Collections.max(map.keySet())).charValue() + 1][];
        for (java.lang.Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }
}
