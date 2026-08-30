package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabv extends android.content.BroadcastReceiver {
    android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabu zab;

    public zabv(com.google.android.gms.common.api.internal.zabu zabuVar) {
        this.zab = zabuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zab.zaa();
            zab();
        }
    }

    public final void zaa(android.content.Context context) {
        this.zaa = context;
    }

    public final synchronized void zab() {
        android.content.Context context = this.zaa;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.zaa = null;
    }
}
