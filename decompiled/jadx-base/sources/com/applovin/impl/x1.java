package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class x1 implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {
    private static final java.util.Set c = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.go f1483a;
    private final com.applovin.impl.sdk.j b;

    private x1(long j, final boolean z, com.applovin.impl.sdk.j jVar, final java.lang.Runnable runnable) {
        this.f1483a = com.applovin.impl.go.a(j, z, jVar, new java.lang.Runnable() { // from class: com.applovin.impl.x1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z, runnable);
            }
        });
        this.b = jVar;
        c.add(this);
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f1483a.a();
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
        c.remove(this);
    }

    public long b() {
        return this.f1483a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f1483a.d();
        } else if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f1483a.e();
        }
    }

    public static com.applovin.impl.x1 a(long j, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        return a(j, false, jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, java.lang.Runnable runnable) {
        if (!z) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static com.applovin.impl.x1 a(long j, boolean z, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        return new com.applovin.impl.x1(j, z, jVar, runnable);
    }
}
