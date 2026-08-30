package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {
    private int max = -1;
    private final java.util.Map<java.lang.Character, java.lang.String> map = new java.util.HashMap();

    private static class CharArrayDecorator extends com.google.common.escape.CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        CharArrayDecorator(char[][] replacements) {
            this.replacements = replacements;
            this.replaceLength = replacements.length;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public java.lang.String escape(java.lang.String s) {
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = s.charAt(i);
                char[][] cArr = this.replacements;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return escapeSlow(s, i);
                }
            }
            return s;
        }

        @Override // com.google.common.escape.CharEscaper
        @javax.annotation.CheckForNull
        protected char[] escape(char c) {
            if (c < this.replaceLength) {
                return this.replacements[c];
            }
            return null;
        }
    }

    public com.google.common.escape.CharEscaperBuilder addEscape(char c, java.lang.String r) {
        this.map.put(java.lang.Character.valueOf(c), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(r));
        if (c > this.max) {
            this.max = c;
        }
        return this;
    }

    public com.google.common.escape.CharEscaperBuilder addEscapes(char[] cs, java.lang.String r) {
        com.google.common.base.Preconditions.checkNotNull(r);
        for (char c : cs) {
            addEscape(c, r);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.max + 1][];
        for (java.util.Map.Entry<java.lang.Character, java.lang.String> entry : this.map.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public com.google.common.escape.Escaper toEscaper() {
        return new com.google.common.escape.CharEscaperBuilder.CharArrayDecorator(toArray());
    }
}
