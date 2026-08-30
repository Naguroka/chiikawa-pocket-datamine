package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleManagerCompat {
    private LocaleManagerCompat() {
    }

    public static androidx.core.os.LocaleListCompat getSystemLocales(android.content.Context context) {
        androidx.core.os.LocaleListCompat emptyLocaleList = androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            java.lang.Object localeManagerForApplication = getLocaleManagerForApplication(context);
            return localeManagerForApplication != null ? androidx.core.os.LocaleListCompat.wrap(androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication)) : emptyLocaleList;
        }
        return getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
    }

    private static java.lang.Object getLocaleManagerForApplication(android.content.Context context) {
        return context.getSystemService("locale");
    }

    static androidx.core.os.LocaleListCompat getConfigurationLocales(android.content.res.Configuration configuration) {
        return androidx.core.app.LocaleManagerCompat.Api24Impl.getLocales(configuration);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.lang.String toLanguageTag(java.util.Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration configuration) {
            return androidx.core.os.LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.os.LocaleList localeManagerGetSystemLocales(java.lang.Object obj) {
            return ((android.app.LocaleManager) obj).getSystemLocales();
        }
    }
}
