package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextUtilsCompat {
    private static final java.lang.String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final java.lang.String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final java.util.Locale ROOT = new java.util.Locale("", "");

    public static java.lang.String htmlEncode(java.lang.String str) {
        return android.text.TextUtils.htmlEncode(str);
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale locale) {
        return androidx.core.text.TextUtilsCompat.Api17Impl.getLayoutDirectionFromLocale(locale);
    }

    private static int getLayoutDirectionFromFirstChar(java.util.Locale locale) {
        byte directionality = java.lang.Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    private TextUtilsCompat() {
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static int getLayoutDirectionFromLocale(java.util.Locale locale) {
            return android.text.TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }
}
