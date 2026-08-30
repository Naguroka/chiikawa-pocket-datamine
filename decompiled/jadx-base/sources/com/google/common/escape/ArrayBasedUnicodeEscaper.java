package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends com.google.common.escape.UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    @javax.annotation.CheckForNull
    protected abstract char[] escapeUnsafe(int cp);

    protected ArrayBasedUnicodeEscaper(java.util.Map<java.lang.Character, java.lang.String> replacementMap, int safeMin, int safeMax, java.lang.String unsafeReplacement) {
        this(com.google.common.escape.ArrayBasedEscaperMap.create(replacementMap), safeMin, safeMax, unsafeReplacement);
    }

    protected ArrayBasedUnicodeEscaper(com.google.common.escape.ArrayBasedEscaperMap escaperMap, int safeMin, int safeMax, java.lang.String unsafeReplacement) {
        com.google.common.base.Preconditions.checkNotNull(escaperMap);
        char[][] replacementArray = escaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (safeMax < safeMin) {
            safeMax = -1;
            safeMin = Integer.MAX_VALUE;
        }
        this.safeMin = safeMin;
        this.safeMax = safeMax;
        if (safeMin >= 55296) {
            this.safeMinChar = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) safeMin;
            this.safeMaxChar = (char) java.lang.Math.min(safeMax, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String s) {
        com.google.common.base.Preconditions.checkNotNull(s);
        for (int i = 0; i < s.length(); i++) {
            char cCharAt = s.charAt(i);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                return escapeSlow(s, i);
            }
        }
        return s;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @javax.annotation.CheckForNull
    protected final char[] escape(int cp) {
        char[] cArr;
        if (cp < this.replacementsLength && (cArr = this.replacements[cp]) != null) {
            return cArr;
        }
        if (cp < this.safeMin || cp > this.safeMax) {
            return escapeUnsafe(cp);
        }
        return null;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected final int nextEscapeIndex(java.lang.CharSequence csq, int index, int end) {
        while (index < end) {
            char cCharAt = csq.charAt(index);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                break;
            }
            index++;
        }
        return index;
    }
}
