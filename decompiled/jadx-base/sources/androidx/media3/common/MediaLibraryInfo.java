package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class MediaLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final java.lang.String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final java.lang.String VERSION = "1.4.0";
    public static final int VERSION_INT = 1004000300;
    public static final java.lang.String VERSION_SLASHY = "AndroidXMedia3/1.4.0";
    private static final java.util.HashSet<java.lang.String> registeredModules = new java.util.HashSet<>();
    private static java.lang.String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static synchronized java.lang.String registeredModules() {
        return registeredModulesString;
    }

    public static synchronized void registerModule(java.lang.String str) {
        if (registeredModules.add(str)) {
            registeredModulesString += ", " + str;
        }
    }
}
