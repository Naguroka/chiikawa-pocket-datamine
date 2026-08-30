package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class ServiceStarter {
    static final java.lang.String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;
    public static final int ERROR_UNKNOWN = 500;
    private static final java.lang.String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final java.lang.String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static com.google.firebase.messaging.ServiceStarter instance;
    private java.lang.String firebaseMessagingServiceClassName = null;
    private java.lang.Boolean hasWakeLockPermission = null;
    private java.lang.Boolean hasAccessNetworkStatePermission = null;
    private final java.util.Queue<android.content.Intent> messagingEvents = new java.util.ArrayDeque();

    static synchronized com.google.firebase.messaging.ServiceStarter getInstance() {
        if (instance == null) {
            instance = new com.google.firebase.messaging.ServiceStarter();
        }
        return instance;
    }

    private ServiceStarter() {
    }

    android.content.Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    public int startMessagingService(android.content.Context context, android.content.Intent intent) {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Starting service");
        }
        this.messagingEvents.offer(intent);
        android.content.Intent intent2 = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }

    private int doStartService(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentNameStartService;
        java.lang.String strResolveServiceClassName = resolveServiceClassName(context, intent);
        if (strResolveServiceClassName != null) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Restricting intent to a specific service: " + strResolveServiceClassName);
            }
            intent.setClassName(context.getPackageName(), strResolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentNameStartService = com.google.firebase.messaging.WakeLockHolder.startWakefulService(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Failed to start service while in background: " + e);
            return 402;
        } catch (java.lang.SecurityException e2) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    private synchronized java.lang.String resolveServiceClassName(android.content.Context context, android.content.Intent intent) {
        java.lang.String str = this.firebaseMessagingServiceClassName;
        if (str != null) {
            return str;
        }
        android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
            android.content.pm.ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    this.firebaseMessagingServiceClassName = context.getPackageName() + serviceInfo.name;
                } else {
                    this.firebaseMessagingServiceClassName = serviceInfo.name;
                }
                return this.firebaseMessagingServiceClassName;
            }
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    boolean hasWakeLockPermission(android.content.Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    boolean hasAccessNetworkStatePermission(android.content.Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    public static void setForTesting(com.google.firebase.messaging.ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }
}
