package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class eg {
    private static com.applovin.impl.eg e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f758a = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Object c = new java.lang.Object();
    private int d = 0;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile boolean f759a;
    }

    public interface c {
        void a(int i);
    }

    private eg(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new com.applovin.impl.eg.d(), intentFilter);
    }

    public void b(final com.applovin.impl.eg.c cVar) {
        b();
        this.b.add(new java.lang.ref.WeakReference(cVar));
        this.f758a.post(new java.lang.Runnable() { // from class: com.applovin.impl.eg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(android.content.Context context) {
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
                    if (type == 9) {
                        return 7;
                    }
                    if (type != 4 && type != 5) {
                        return type != 6 ? 8 : 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (java.lang.SecurityException unused) {
        }
        return i;
    }

    private final class d extends android.content.BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            int iC = com.applovin.impl.eg.c(context);
            int i = com.applovin.impl.xp.f1515a;
            if (i >= 29 && !com.applovin.impl.eg.b.f759a && iC == 5) {
                try {
                    android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.applovin.impl.b1.a((android.telephony.TelephonyManager) context.getSystemService("phone"));
                    com.applovin.impl.eg.e eVar = new com.applovin.impl.eg.e();
                    if (i < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            com.applovin.impl.eg.this.a(iC);
        }
    }

    private class e extends android.telephony.PhoneStateListener {
        private e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(android.telephony.ServiceState serviceState) {
            java.lang.String string = serviceState == null ? "" : serviceState.toString();
            com.applovin.impl.eg.this.a(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            com.applovin.impl.eg.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }
    }

    private void b() {
        for (java.lang.ref.WeakReference weakReference : this.b) {
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
    }

    public static synchronized com.applovin.impl.eg b(android.content.Context context) {
        if (e == null) {
            e = new com.applovin.impl.eg(context);
        }
        return e;
    }

    private static int a(android.net.NetworkInfo networkInfo) {
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
                return com.applovin.impl.xp.f1515a >= 29 ? 9 : 0;
        }
    }

    public int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.eg.c cVar) {
        cVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.c) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            for (java.lang.ref.WeakReference weakReference : this.b) {
                com.applovin.impl.eg.c cVar = (com.applovin.impl.eg.c) weakReference.get();
                if (cVar != null) {
                    cVar.a(i);
                } else {
                    this.b.remove(weakReference);
                }
            }
        }
    }
}
