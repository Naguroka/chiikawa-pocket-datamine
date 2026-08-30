package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdo implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdg zzgp;

    zzdo(com.google.android.gms.internal.drive.zzdk zzdkVar, com.google.android.gms.internal.drive.zzdg zzdgVar) {
        this.zzgp = zzdgVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.drive.events.OpenFileCallback openFileCallback) {
        this.zzgp.accept(openFileCallback);
    }
}
