package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkTypeObserver {
    private static androidx.media3.common.util.NetworkTypeObserver staticInstance;
    private final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.media3.common.util.NetworkTypeObserver.Listener>> listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final java.lang.Object networkTypeLock = new java.lang.Object();
    private int networkType = 0;

    public interface Listener {
        void onNetworkTypeChanged(int i);
    }

    public static synchronized androidx.media3.common.util.NetworkTypeObserver getInstance(android.content.Context context) {
        if (staticInstance == null) {
            staticInstance = new androidx.media3.common.util.NetworkTypeObserver(context);
        }
        return staticInstance;
    }

    public static synchronized void resetForTests() {
        staticInstance = null;
    }

    private NetworkTypeObserver(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new androidx.media3.common.util.NetworkTypeObserver.Receiver(), intentFilter);
    }

    public void register(final androidx.media3.common.util.NetworkTypeObserver.Listener listener) {
        removeClearedReferences();
        this.listeners.add(new java.lang.ref.WeakReference<>(listener));
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m57xc4ab8e3(listener);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$register$0$androidx-media3-common-util-NetworkTypeObserver, reason: not valid java name */
    /* synthetic */ void m57xc4ab8e3(androidx.media3.common.util.NetworkTypeObserver.Listener listener) {
        listener.onNetworkTypeChanged(getNetworkType());
    }

    public int getNetworkType() {
        int i;
        synchronized (this.networkTypeLock) {
            i = this.networkType;
        }
        return i;
    }

    private void removeClearedReferences() {
        for (java.lang.ref.WeakReference<androidx.media3.common.util.NetworkTypeObserver.Listener> weakReference : this.listeners) {
            if (weakReference.get() == null) {
                this.listeners.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i) {
        synchronized (this.networkTypeLock) {
            if (this.networkType == i) {
                return;
            }
            this.networkType = i;
            for (java.lang.ref.WeakReference<androidx.media3.common.util.NetworkTypeObserver.Listener> weakReference : this.listeners) {
                androidx.media3.common.util.NetworkTypeObserver.Listener listener = weakReference.get();
                if (listener != null) {
                    listener.onNetworkTypeChanged(i);
                } else {
                    this.listeners.remove(weakReference);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNetworkTypeFromConnectivityManager(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (java.lang.SecurityException unused) {
        }
        return i;
    }

    private static int getMobileNetworkType(android.net.NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return androidx.media3.common.util.Util.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private final class Receiver extends android.content.BroadcastReceiver {
        private Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            int networkTypeFromConnectivityManager = androidx.media3.common.util.NetworkTypeObserver.getNetworkTypeFromConnectivityManager(context);
            if (androidx.media3.common.util.Util.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
                androidx.media3.common.util.NetworkTypeObserver.this.updateNetworkType(networkTypeFromConnectivityManager);
            } else {
                androidx.media3.common.util.NetworkTypeObserver.Api31.disambiguate4gAnd5gNsa(context, androidx.media3.common.util.NetworkTypeObserver.this);
            }
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(android.content.Context context, androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) androidx.media3.common.util.Assertions.checkNotNull((android.telephony.TelephonyManager) context.getSystemService("phone"));
                androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback displayInfoCallback = new androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (java.lang.RuntimeException unused) {
                networkTypeObserver.updateNetworkType(5);
            }
        }

        private static final class DisplayInfoCallback extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
            private final androidx.media3.common.util.NetworkTypeObserver instance;

            public DisplayInfoCallback(androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
                this.instance = networkTypeObserver;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.instance.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }
}
