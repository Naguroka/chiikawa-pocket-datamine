package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class h extends android.content.BroadcastReceiver implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {
    public static int i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.AudioManager f1291a;
    private final android.content.Context b;
    private final com.applovin.impl.sdk.j c;
    private final java.util.Set d = new java.util.HashSet();
    private final java.lang.Object f = new java.lang.Object();
    private boolean g;
    private int h;

    public interface a {
        void a(int i);
    }

    h(com.applovin.impl.sdk.j jVar) {
        this.c = jVar;
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        this.b = contextM;
        this.f1291a = (android.media.AudioManager) contextM.getSystemService("audio");
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void c() {
        this.c.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.I().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.b.unregisterReceiver(this);
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void b(com.applovin.impl.sdk.h.a aVar) {
        synchronized (this.f) {
            if (this.d.contains(aVar)) {
                this.d.remove(aVar);
                if (this.d.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f1291a.getRingerMode());
        }
    }

    public int a() {
        return this.f1291a.getRingerMode();
    }

    public void a(com.applovin.impl.sdk.h.a aVar) {
        synchronized (this.f) {
            if (this.d.contains(aVar)) {
                return;
            }
            this.d.add(aVar);
            if (this.d.size() == 1) {
                b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.g = true;
            this.h = this.f1291a.getRingerMode();
        } else if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.g = false;
            if (this.h != this.f1291a.getRingerMode()) {
                this.h = i;
                b(this.f1291a.getRingerMode());
            }
        }
    }

    private void b() {
        this.c.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.I().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.h = i;
        this.b.registerReceiver(this, new android.content.IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i2) {
        if (this.g) {
            return;
        }
        this.c.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.I().a("AudioSessionManager", "Ringer mode is " + i2);
        }
        synchronized (this.f) {
            for (final com.applovin.impl.sdk.h.a aVar : this.d) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.h$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i2);
                    }
                });
            }
        }
    }
}
