package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
    }

    static androidx.core.os.LocaleListCompat combineLocalesIfOverlayExists(androidx.core.os.LocaleListCompat localeListCompat, androidx.core.os.LocaleListCompat localeListCompat2) {
        if (localeListCompat == null || localeListCompat.isEmpty()) {
            return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        }
        return combineLocales(localeListCompat, localeListCompat2);
    }

    static androidx.core.os.LocaleListCompat combineLocalesIfOverlayExists(android.os.LocaleList localeList, android.os.LocaleList localeList2) {
        if (localeList == null || localeList.isEmpty()) {
            return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        }
        return combineLocales(androidx.core.os.LocaleListCompat.wrap(localeList), androidx.core.os.LocaleListCompat.wrap(localeList2));
    }

    private static androidx.core.os.LocaleListCompat combineLocales(androidx.core.os.LocaleListCompat localeListCompat, androidx.core.os.LocaleListCompat localeListCompat2) {
        java.util.Locale locale;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (int i = 0; i < localeListCompat.size() + localeListCompat2.size(); i++) {
            if (i < localeListCompat.size()) {
                locale = localeListCompat.get(i);
            } else {
                locale = localeListCompat2.get(i - localeListCompat.size());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return androidx.core.os.LocaleListCompat.create((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]));
    }
}
