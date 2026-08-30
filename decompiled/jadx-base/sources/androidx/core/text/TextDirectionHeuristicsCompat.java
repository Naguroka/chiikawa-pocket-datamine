package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;
    public static final androidx.core.text.TextDirectionHeuristicCompat LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(null, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat RTL = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(null, true);
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_RTL = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE, true);
    public static final androidx.core.text.TextDirectionHeuristicCompat ANYRTL_LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.INSTANCE_RTL, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat LOCALE = androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.INSTANCE;

    private interface TextDirectionAlgorithm {
        int checkRtl(java.lang.CharSequence charSequence, int i, int i2);
    }

    static int isRtlText(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int isRtlTextOrFormat(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    private static abstract class TextDirectionHeuristicImpl implements androidx.core.text.TextDirectionHeuristicCompat {
        private final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm mAlgorithm;

        protected abstract boolean defaultIsRtl();

        TextDirectionHeuristicImpl(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(java.nio.CharBuffer.wrap(cArr), i, i2);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(java.lang.CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new java.lang.IllegalArgumentException();
            }
            if (this.mAlgorithm == null) {
                return defaultIsRtl();
            }
            return doCheck(charSequence, i, i2);
        }

        private boolean doCheck(java.lang.CharSequence charSequence, int i, int i2) {
            int iCheckRtl = this.mAlgorithm.checkRtl(charSequence, i, i2);
            if (iCheckRtl == 0) {
                return true;
            }
            if (iCheckRtl != 1) {
                return defaultIsRtl();
            }
            return false;
        }
    }

    private static class TextDirectionHeuristicInternal extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    private static class FirstStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong INSTANCE = new androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iIsRtlTextOrFormat = 2;
            while (i < i3 && iIsRtlTextOrFormat == 2) {
                iIsRtlTextOrFormat = androidx.core.text.TextDirectionHeuristicsCompat.isRtlTextOrFormat(java.lang.Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iIsRtlTextOrFormat;
        }

        private FirstStrong() {
        }
    }

    private static class AnyStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong INSTANCE_RTL = new androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong(true);
        private final boolean mLookForRtl;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iIsRtlText = androidx.core.text.TextDirectionHeuristicsCompat.isRtlText(java.lang.Character.getDirectionality(charSequence.charAt(i)));
                if (iIsRtlText != 0) {
                    if (iIsRtlText != 1) {
                        continue;
                    } else if (!this.mLookForRtl) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.mLookForRtl) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }

        private AnyStrong(boolean z) {
            this.mLookForRtl = z;
        }
    }

    private static class TextDirectionHeuristicLocale extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        static final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale INSTANCE = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale();

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            return androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
        }
    }

    private TextDirectionHeuristicsCompat() {
    }
}
