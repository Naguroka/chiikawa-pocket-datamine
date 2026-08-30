package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends com.google.common.escape.CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    @javax.annotation.CheckForNull
    protected abstract char[] escapeUnsafe(char c);

    protected ArrayBasedCharEscaper(java.util.Map<java.lang.Character, java.lang.String> replacementMap, char safeMin, char safeMax) {
        this(com.google.common.escape.ArrayBasedEscaperMap.create(replacementMap), safeMin, safeMax);
    }

    protected ArrayBasedCharEscaper(com.google.common.escape.ArrayBasedEscaperMap escaperMap, char safeMin, char safeMax) {
        com.google.common.base.Preconditions.checkNotNull(escaperMap);
        char[][] replacementArray = escaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (safeMax < safeMin) {
            safeMax = 0;
            safeMin = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        this.safeMin = safeMin;
        this.safeMax = safeMax;
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String s) {
        com.google.common.base.Preconditions.checkNotNull(s);
        for (int i = 0; i < s.length(); i++) {
            char cCharAt = s.charAt(i);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMax || cCharAt < this.safeMin) {
                return escapeSlow(s, i);
            }
        }
        return s;
    }

    @Override // com.google.common.escape.CharEscaper
    @javax.annotation.CheckForNull
    protected final char[] escape(char c) {
        char[] cArr;
        if (c < this.replacementsLength && (cArr = this.replacements[c]) != null) {
            return cArr;
        }
        if (c < this.safeMin || c > this.safeMax) {
            return escapeUnsafe(c);
        }
        return null;
    }
}
