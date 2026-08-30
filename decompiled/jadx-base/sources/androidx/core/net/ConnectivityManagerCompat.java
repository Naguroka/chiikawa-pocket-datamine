package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    public static boolean isActiveNetworkMetered(android.net.ConnectivityManager connectivityManager) {
        return androidx.core.net.ConnectivityManagerCompat.Api16Impl.isActiveNetworkMetered(connectivityManager);
    }

    public static android.net.NetworkInfo getNetworkInfoFromBroadcast(android.net.ConnectivityManager connectivityManager, android.content.Intent intent) {
        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int getRestrictBackgroundStatus(android.net.ConnectivityManager connectivityManager) {
        return androidx.core.net.ConnectivityManagerCompat.Api24Impl.getRestrictBackgroundStatus(connectivityManager);
    }

    private ConnectivityManagerCompat() {
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static boolean isActiveNetworkMetered(android.net.ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static int getRestrictBackgroundStatus(android.net.ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }
}
