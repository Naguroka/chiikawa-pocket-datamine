package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class hr {
    private static final java.util.Set f = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f859a;
    private final com.applovin.impl.sdk.j b;
    private java.lang.Runnable c;
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.Timer e;

    private java.util.TimerTask b() {
        return new com.applovin.impl.hr.a();
    }

    private hr(long j, boolean z, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        java.util.Timer timer = new java.util.Timer();
        this.e = timer;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j);
        }
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable != null) {
            this.f859a = z;
            this.b = jVar;
            this.c = runnable;
            f.add(this);
            timer.schedule(b(), j);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
    }

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!com.applovin.impl.hr.this.b.e0().isApplicationPaused() || com.applovin.impl.hr.this.f859a) {
                com.applovin.impl.hr.this.c();
            } else {
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(new com.applovin.impl.hr.a.C0035a(), new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.hr$a$a, reason: collision with other inner class name */
        class C0035a implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {
            C0035a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(android.content.Intent intent, java.util.Map map) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
                com.applovin.impl.hr.this.c();
            }
        }
    }

    public void a() {
        synchronized (this.d) {
            this.e.cancel();
            this.c = null;
            f.remove(this);
        }
    }

    public static com.applovin.impl.hr a(long j, boolean z, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        return new com.applovin.impl.hr(j, z, jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        java.lang.Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }
}
