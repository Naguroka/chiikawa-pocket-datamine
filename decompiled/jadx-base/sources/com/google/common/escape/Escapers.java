package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class Escapers {
    private static final com.google.common.escape.Escaper NULL_ESCAPER = new com.google.common.escape.CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        @javax.annotation.CheckForNull
        protected char[] escape(char c) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public java.lang.String escape(java.lang.String string) {
            return (java.lang.String) com.google.common.base.Preconditions.checkNotNull(string);
        }
    };

    private Escapers() {
    }

    public static com.google.common.escape.Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    public static com.google.common.escape.Escapers.Builder builder() {
        return new com.google.common.escape.Escapers.Builder();
    }

    public static final class Builder {
        private final java.util.Map<java.lang.Character, java.lang.String> replacementMap;
        private char safeMax;
        private char safeMin;

        @javax.annotation.CheckForNull
        private java.lang.String unsafeReplacement;

        private Builder() {
            this.replacementMap = new java.util.HashMap();
            this.safeMin = (char) 0;
            this.safeMax = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            this.unsafeReplacement = null;
        }

        public com.google.common.escape.Escapers.Builder setSafeRange(char safeMin, char safeMax) {
            this.safeMin = safeMin;
            this.safeMax = safeMax;
            return this;
        }

        public com.google.common.escape.Escapers.Builder setUnsafeReplacement(java.lang.String unsafeReplacement) {
            this.unsafeReplacement = unsafeReplacement;
            return this;
        }

        public com.google.common.escape.Escapers.Builder addEscape(char c, java.lang.String replacement) {
            com.google.common.base.Preconditions.checkNotNull(replacement);
            this.replacementMap.put(java.lang.Character.valueOf(c), replacement);
            return this;
        }

        public com.google.common.escape.Escaper build() {
            return new com.google.common.escape.ArrayBasedCharEscaper(this.replacementMap, this.safeMin, this.safeMax) { // from class: com.google.common.escape.Escapers.Builder.1

                @javax.annotation.CheckForNull
                private final char[] replacementChars;

                {
                    this.replacementChars = com.google.common.escape.Escapers.Builder.this.unsafeReplacement != null ? com.google.common.escape.Escapers.Builder.this.unsafeReplacement.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                @javax.annotation.CheckForNull
                protected char[] escapeUnsafe(char c) {
                    return this.replacementChars;
                }
            };
        }
    }

    static com.google.common.escape.UnicodeEscaper asUnicodeEscaper(com.google.common.escape.Escaper escaper) {
        com.google.common.base.Preconditions.checkNotNull(escaper);
        if (escaper instanceof com.google.common.escape.UnicodeEscaper) {
            return (com.google.common.escape.UnicodeEscaper) escaper;
        }
        if (escaper instanceof com.google.common.escape.CharEscaper) {
            return wrap((com.google.common.escape.CharEscaper) escaper);
        }
        throw new java.lang.IllegalArgumentException("Cannot create a UnicodeEscaper from: " + escaper.getClass().getName());
    }

    @javax.annotation.CheckForNull
    public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper escaper, char c) {
        return stringOrNull(escaper.escape(c));
    }

    @javax.annotation.CheckForNull
    public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper escaper, int cp) {
        return stringOrNull(escaper.escape(cp));
    }

    @javax.annotation.CheckForNull
    private static java.lang.String stringOrNull(@javax.annotation.CheckForNull char[] in) {
        if (in == null) {
            return null;
        }
        return new java.lang.String(in);
    }

    private static com.google.common.escape.UnicodeEscaper wrap(final com.google.common.escape.CharEscaper escaper) {
        return new com.google.common.escape.UnicodeEscaper() { // from class: com.google.common.escape.Escapers.2
            @Override // com.google.common.escape.UnicodeEscaper
            @javax.annotation.CheckForNull
            protected char[] escape(int cp) {
                if (cp < 65536) {
                    return escaper.escape((char) cp);
                }
                char[] cArr = new char[2];
                java.lang.Character.toChars(cp, cArr, 0);
                char[] cArrEscape = escaper.escape(cArr[0]);
                char[] cArrEscape2 = escaper.escape(cArr[1]);
                if (cArrEscape == null && cArrEscape2 == null) {
                    return null;
                }
                int length = cArrEscape != null ? cArrEscape.length : 1;
                char[] cArr2 = new char[(cArrEscape2 != null ? cArrEscape2.length : 1) + length];
                if (cArrEscape != null) {
                    for (int i = 0; i < cArrEscape.length; i++) {
                        cArr2[i] = cArrEscape[i];
                    }
                } else {
                    cArr2[0] = cArr[0];
                }
                if (cArrEscape2 != null) {
                    for (int i2 = 0; i2 < cArrEscape2.length; i2++) {
                        cArr2[length + i2] = cArrEscape2[i2];
                    }
                } else {
                    cArr2[length] = cArr[1];
                }
                return cArr2;
            }
        };
    }
}
