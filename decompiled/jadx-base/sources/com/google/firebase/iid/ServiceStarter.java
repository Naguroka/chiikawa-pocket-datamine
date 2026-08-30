package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ServiceStarter {
    public static final java.lang.String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    public static final int ERROR_UNKNOWN = 500;
    private static com.google.firebase.iid.ServiceStarter instance;
    private java.lang.Boolean hasWakeLockPermission = null;
    private java.lang.Boolean hasAccessNetworkStatePermission = null;

    private ServiceStarter() {
    }

    public static synchronized com.google.firebase.iid.ServiceStarter getInstance() {
        if (instance == null) {
            instance = new com.google.firebase.iid.ServiceStarter();
        }
        return instance;
    }

    public static void setForTesting(com.google.firebase.iid.ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    boolean hasAccessNetworkStatePermission(android.content.Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    boolean hasWakeLockPermission(android.content.Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }
}
