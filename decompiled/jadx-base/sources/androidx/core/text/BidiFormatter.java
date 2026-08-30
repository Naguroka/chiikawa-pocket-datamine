package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final androidx.core.text.BidiFormatter DEFAULT_LTR_INSTANCE;
    static final androidx.core.text.BidiFormatter DEFAULT_RTL_INSTANCE;
    static final androidx.core.text.TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final java.lang.String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final java.lang.String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final java.lang.String RLM_STRING;
    private final androidx.core.text.TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    static {
        androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristicCompat;
        LRM_STRING = java.lang.Character.toString(LRM);
        RLM_STRING = java.lang.Character.toString(RLM);
        DEFAULT_LTR_INSTANCE = new androidx.core.text.BidiFormatter(false, 2, textDirectionHeuristicCompat);
        DEFAULT_RTL_INSTANCE = new androidx.core.text.BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private androidx.core.text.TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(androidx.core.text.BidiFormatter.isRtlLocale(java.util.Locale.getDefault()));
        }

        public Builder(boolean z) {
            initialize(z);
        }

        public Builder(java.util.Locale locale) {
            initialize(androidx.core.text.BidiFormatter.isRtlLocale(locale));
        }

        private void initialize(boolean z) {
            this.mIsRtlContext = z;
            this.mTextDirectionHeuristicCompat = androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public androidx.core.text.BidiFormatter.Builder stereoReset(boolean z) {
            if (z) {
                this.mFlags |= 2;
            } else {
                this.mFlags &= -3;
            }
            return this;
        }

        public androidx.core.text.BidiFormatter.Builder setTextDirectionHeuristic(androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        private static androidx.core.text.BidiFormatter getDefaultInstanceFromContext(boolean z) {
            return z ? androidx.core.text.BidiFormatter.DEFAULT_RTL_INSTANCE : androidx.core.text.BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        public androidx.core.text.BidiFormatter build() {
            if (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) {
                return getDefaultInstanceFromContext(this.mIsRtlContext);
            }
            return new androidx.core.text.BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }
    }

    public static androidx.core.text.BidiFormatter getInstance() {
        return new androidx.core.text.BidiFormatter.Builder().build();
    }

    public static androidx.core.text.BidiFormatter getInstance(boolean z) {
        return new androidx.core.text.BidiFormatter.Builder(z).build();
    }

    public static androidx.core.text.BidiFormatter getInstance(java.util.Locale locale) {
        return new androidx.core.text.BidiFormatter.Builder(locale).build();
    }

    BidiFormatter(boolean z, int i, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z;
        this.mFlags = i;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    private java.lang.String markAfter(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.mIsRtlContext && (zIsRtl || getExitDir(charSequence) == 1)) {
            return LRM_STRING;
        }
        if (this.mIsRtlContext) {
            return (!zIsRtl || getExitDir(charSequence) == -1) ? RLM_STRING : "";
        }
        return "";
    }

    private java.lang.String markBefore(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.mIsRtlContext && (zIsRtl || getEntryDir(charSequence) == 1)) {
            return LRM_STRING;
        }
        if (this.mIsRtlContext) {
            return (!zIsRtl || getEntryDir(charSequence) == -1) ? RLM_STRING : "";
        }
        return "";
    }

    public boolean isRtl(java.lang.String str) {
        return isRtl((java.lang.CharSequence) str);
    }

    public boolean isRtl(java.lang.CharSequence charSequence) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public java.lang.String unicodeWrap(java.lang.String str, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((java.lang.CharSequence) str, textDirectionHeuristicCompat, z).toString();
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (getStereoReset() && z) {
            spannableStringBuilder.append((java.lang.CharSequence) markBefore(charSequence, zIsRtl ? androidx.core.text.TextDirectionHeuristicsCompat.RTL : androidx.core.text.TextDirectionHeuristicsCompat.LTR));
        }
        if (zIsRtl != this.mIsRtlContext) {
            spannableStringBuilder.append(zIsRtl ? RLE : LRE);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(PDF);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((java.lang.CharSequence) markAfter(charSequence, zIsRtl ? androidx.core.text.TextDirectionHeuristicsCompat.RTL : androidx.core.text.TextDirectionHeuristicsCompat.LTR));
        }
        return spannableStringBuilder;
    }

    public java.lang.String unicodeWrap(java.lang.String str, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public java.lang.String unicodeWrap(java.lang.String str, boolean z) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, z);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, z);
    }

    public java.lang.String unicodeWrap(java.lang.String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    static boolean isRtlLocale(java.util.Locale locale) {
        return androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getExitDir(java.lang.CharSequence charSequence) {
        return new androidx.core.text.BidiFormatter.DirectionalityEstimator(charSequence, false).getExitDir();
    }

    private static int getEntryDir(java.lang.CharSequence charSequence) {
        return new androidx.core.text.BidiFormatter.DirectionalityEstimator(charSequence, false).getEntryDir();
    }

    private static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final java.lang.CharSequence text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        static {
            for (int i = 0; i < DIR_TYPE_CACHE_SIZE; i++) {
                DIR_TYPE_CACHE[i] = java.lang.Character.getDirectionality(i);
            }
        }

        DirectionalityEstimator(java.lang.CharSequence charSequence, boolean z) {
            this.text = charSequence;
            this.isHtml = z;
            this.length = charSequence.length();
        }

        int getEntryDir() {
            this.charIndex = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.charIndex < this.length && i == 0) {
                byte bDirTypeForward = dirTypeForward();
                if (bDirTypeForward != 0) {
                    if (bDirTypeForward == 1 || bDirTypeForward == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bDirTypeForward != 9) {
                        switch (bDirTypeForward) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int getExitDir() {
            this.charIndex = this.length;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.charIndex > 0) {
                    byte bDirTypeBackward = dirTypeBackward();
                    if (bDirTypeBackward == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bDirTypeBackward == 1 || bDirTypeBackward == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bDirTypeBackward != 9) {
                        switch (bDirTypeBackward) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        private static byte getCachedDirectionality(char c) {
            return c < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c] : java.lang.Character.getDirectionality(c);
        }

        byte dirTypeForward() {
            char cCharAt = this.text.charAt(this.charIndex);
            this.lastChar = cCharAt;
            if (java.lang.Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = java.lang.Character.codePointAt(this.text, this.charIndex);
                this.charIndex += java.lang.Character.charCount(iCodePointAt);
                return java.lang.Character.getDirectionality(iCodePointAt);
            }
            this.charIndex++;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c = this.lastChar;
            if (c == '<') {
                return skipTagForward();
            }
            return c == '&' ? skipEntityForward() : cachedDirectionality;
        }

        byte dirTypeBackward() {
            char cCharAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = cCharAt;
            if (java.lang.Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = java.lang.Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= java.lang.Character.charCount(iCodePointBefore);
                return java.lang.Character.getDirectionality(iCodePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c = this.lastChar;
            if (c == '>') {
                return skipTagBackward();
            }
            return c == ';' ? skipEntityBackward() : cachedDirectionality;
        }

        private byte skipTagForward() {
            char cCharAt;
            int i = this.charIndex;
            while (true) {
                int i2 = this.charIndex;
                if (i2 < this.length) {
                    java.lang.CharSequence charSequence = this.text;
                    this.charIndex = i2 + 1;
                    char cCharAt2 = charSequence.charAt(i2);
                    this.lastChar = cCharAt2;
                    if (cCharAt2 == '>') {
                        return (byte) 12;
                    }
                    if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                        do {
                            int i3 = this.charIndex;
                            if (i3 >= this.length) {
                                break;
                            }
                            java.lang.CharSequence charSequence2 = this.text;
                            this.charIndex = i3 + 1;
                            cCharAt = charSequence2.charAt(i3);
                            this.lastChar = cCharAt;
                        } while (cCharAt != cCharAt2);
                    }
                } else {
                    this.charIndex = i;
                    this.lastChar = kotlin.text.Typography.less;
                    return (byte) 13;
                }
            }
        }

        private byte skipTagBackward() {
            char cCharAt;
            int i = this.charIndex;
            while (true) {
                int i2 = this.charIndex;
                if (i2 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.text;
                int i3 = i2 - 1;
                this.charIndex = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.lastChar = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.charIndex;
                        if (i4 <= 0) {
                            break;
                        }
                        java.lang.CharSequence charSequence2 = this.text;
                        int i5 = i4 - 1;
                        this.charIndex = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.lastChar = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.charIndex = i;
            this.lastChar = kotlin.text.Typography.greater;
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i = this.charIndex;
                if (i >= this.length) {
                    return (byte) 12;
                }
                java.lang.CharSequence charSequence = this.text;
                this.charIndex = i + 1;
                cCharAt = charSequence.charAt(i);
                this.lastChar = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int i = this.charIndex;
            do {
                int i2 = this.charIndex;
                if (i2 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.text;
                int i3 = i2 - 1;
                this.charIndex = i3;
                cCharAt = charSequence.charAt(i3);
                this.lastChar = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.charIndex = i;
            this.lastChar = ';';
            return (byte) 13;
        }
    }
}
