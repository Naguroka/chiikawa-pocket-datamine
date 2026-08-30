package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class AssetPackExtractionService extends android.app.Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.play.core.assetpacks.b f2127a;

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.f2127a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        com.google.android.play.core.assetpacks.d.a(getApplicationContext()).b(this);
    }
}
