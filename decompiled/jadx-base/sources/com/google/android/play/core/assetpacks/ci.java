package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ci implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.internal.o f2174a = new com.google.android.play.core.assetpacks.internal.o("ExtractionForegroundServiceConnection");
    private final java.util.List b = new java.util.ArrayList();
    private final android.content.Context c;
    private com.google.android.play.core.assetpacks.ExtractionForegroundService d;
    private android.app.Notification e;

    ci(android.content.Context context) {
        this.c = context;
    }

    private final void d() {
        java.util.ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new java.util.ArrayList(this.b);
            this.b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((com.google.android.play.core.assetpacks.internal.k) arrayList.get(i)).e(new android.os.Bundle(), new android.os.Bundle());
            } catch (android.os.RemoteException unused) {
                this.f2174a.b("Could not resolve Play Store service state update callback.", new java.lang.Object[0]);
            }
        }
    }

    final void a(android.app.Notification notification) {
        this.e = notification;
    }

    final void b() {
        this.f2174a.a("Stopping foreground installation service.", new java.lang.Object[0]);
        this.c.unbindService(this);
        com.google.android.play.core.assetpacks.ExtractionForegroundService extractionForegroundService = this.d;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    final void c(com.google.android.play.core.assetpacks.internal.k kVar) {
        synchronized (this.b) {
            this.b.add(kVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f2174a.a("Starting foreground installation service.", new java.lang.Object[0]);
        com.google.android.play.core.assetpacks.ExtractionForegroundService extractionForegroundService = ((com.google.android.play.core.assetpacks.ch) iBinder).f2173a;
        this.d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.e);
        d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
