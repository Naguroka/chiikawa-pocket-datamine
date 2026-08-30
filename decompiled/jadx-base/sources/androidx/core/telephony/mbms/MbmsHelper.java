package androidx.core.telephony.mbms;

/* JADX INFO: loaded from: classes.dex */
public final class MbmsHelper {
    private MbmsHelper() {
    }

    public static java.lang.CharSequence getBestNameForService(android.content.Context context, android.telephony.mbms.ServiceInfo serviceInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.telephony.mbms.MbmsHelper.Api28Impl.getBestNameForService(context, serviceInfo);
        }
        return null;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.lang.CharSequence getBestNameForService(android.content.Context context, android.telephony.mbms.ServiceInfo serviceInfo) {
            java.util.Set<java.util.Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            java.lang.String[] strArr = new java.lang.String[namedContentLocales.size()];
            java.util.Iterator<java.util.Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = it.next().toLanguageTag();
                i++;
            }
            java.util.Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }
}
