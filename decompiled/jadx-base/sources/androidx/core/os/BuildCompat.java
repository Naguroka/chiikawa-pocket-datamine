package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class BuildCompat {

    public @interface PrereleaseSdkCheck {
    }

    @java.lang.Deprecated
    public static boolean isAtLeastN() {
        return true;
    }

    private BuildCompat() {
    }

    protected static boolean isAtLeastPreReleaseCodename(java.lang.String str, java.lang.String str2) {
        return !"REL".equals(str2) && str2.toUpperCase(java.util.Locale.ROOT).compareTo(str.toUpperCase(java.util.Locale.ROOT)) >= 0;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastNMR1() {
        return android.os.Build.VERSION.SDK_INT >= 25;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastOMR1() {
        return android.os.Build.VERSION.SDK_INT >= 27;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastQ() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastR() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastS() {
        return android.os.Build.VERSION.SDK_INT >= 31 || (android.os.Build.VERSION.SDK_INT >= 30 && isAtLeastPreReleaseCodename(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, android.os.Build.VERSION.CODENAME));
    }

    @java.lang.Deprecated
    public static boolean isAtLeastSv2() {
        return android.os.Build.VERSION.SDK_INT >= 32 || (android.os.Build.VERSION.SDK_INT >= 31 && isAtLeastPreReleaseCodename("Sv2", android.os.Build.VERSION.CODENAME));
    }

    public static boolean isAtLeastT() {
        return android.os.Build.VERSION.SDK_INT >= 33 || (android.os.Build.VERSION.SDK_INT >= 32 && isAtLeastPreReleaseCodename("Tiramisu", android.os.Build.VERSION.CODENAME));
    }

    public static boolean isAtLeastU() {
        return android.os.Build.VERSION.SDK_INT >= 33 && isAtLeastPreReleaseCodename("UpsideDownCake", android.os.Build.VERSION.CODENAME);
    }
}
