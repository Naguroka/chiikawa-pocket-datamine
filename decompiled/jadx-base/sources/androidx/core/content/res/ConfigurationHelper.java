package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
    }

    public static int getDensityDpi(android.content.res.Resources resources) {
        return resources.getConfiguration().densityDpi;
    }
}
