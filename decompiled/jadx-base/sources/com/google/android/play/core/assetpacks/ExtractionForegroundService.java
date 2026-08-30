package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ExtractionForegroundService extends android.app.Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f2129a = new com.google.android.play.core.assetpacks.ch(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.f2129a;
    }
}
