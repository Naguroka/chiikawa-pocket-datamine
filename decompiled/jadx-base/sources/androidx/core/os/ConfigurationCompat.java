package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration configuration) {
        return androidx.core.os.LocaleListCompat.wrap(androidx.core.os.ConfigurationCompat.Api24Impl.getLocales(configuration));
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList getLocales(android.content.res.Configuration configuration) {
            return configuration.getLocales();
        }
    }
}
