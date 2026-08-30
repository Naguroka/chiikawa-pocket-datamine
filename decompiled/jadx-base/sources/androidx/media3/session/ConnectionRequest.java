package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class ConnectionRequest {
    public final android.os.Bundle connectionHints;
    public final int controllerInterfaceVersion;
    public final int libraryVersion;
    public final java.lang.String packageName;
    public final int pid;
    private static final java.lang.String FIELD_LIBRARY_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_PID = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CONNECTION_HINTS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_CONTROLLER_INTERFACE_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    public ConnectionRequest(java.lang.String str, int i, android.os.Bundle bundle) {
        this(androidx.media3.common.MediaLibraryInfo.VERSION_INT, 6, str, i, new android.os.Bundle(bundle));
    }

    private ConnectionRequest(int i, int i2, java.lang.String str, int i3, android.os.Bundle bundle) {
        this.libraryVersion = i;
        this.controllerInterfaceVersion = i2;
        this.packageName = str;
        this.pid = i3;
        this.connectionHints = bundle;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        bundle.putString(FIELD_PACKAGE_NAME, this.packageName);
        bundle.putInt(FIELD_PID, this.pid);
        bundle.putBundle(FIELD_CONNECTION_HINTS, this.connectionHints);
        bundle.putInt(FIELD_CONTROLLER_INTERFACE_VERSION, this.controllerInterfaceVersion);
        return bundle;
    }

    public static androidx.media3.session.ConnectionRequest fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        int i2 = bundle.getInt(FIELD_CONTROLLER_INTERFACE_VERSION, 0);
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(bundle.getString(FIELD_PACKAGE_NAME));
        java.lang.String str2 = FIELD_PID;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str2));
        int i3 = bundle.getInt(str2);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_CONNECTION_HINTS);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.ConnectionRequest(i, i2, str, i3, bundle2);
    }
}
