package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    public static java.lang.String maximizeAndGetScript(java.util.Locale locale) {
        return androidx.core.text.ICUCompat.Api24Impl.getScript(androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(androidx.core.text.ICUCompat.Api24Impl.forLocale(locale)));
    }

    private static java.lang.String getScriptBelowApi21(java.lang.String str) {
        try {
            java.lang.reflect.Method method = sGetScriptMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, str);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return null;
    }

    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale locale) {
        java.lang.String string = locale.toString();
        try {
            java.lang.reflect.Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, string);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return string;
    }

    private ICUCompat() {
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.icu.util.ULocale forLocale(java.util.Locale locale) {
            return android.icu.util.ULocale.forLocale(locale);
        }

        static android.icu.util.ULocale addLikelySubtags(java.lang.Object obj) {
            return android.icu.util.ULocale.addLikelySubtags((android.icu.util.ULocale) obj);
        }

        static java.lang.String getScript(java.lang.Object obj) {
            return ((android.icu.util.ULocale) obj).getScript();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.lang.String getScript(java.util.Locale locale) {
            return locale.getScript();
        }
    }
}
