package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhs extends com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.StatusCallback> {
    final /* synthetic */ boolean zza;

    zzhs(com.google.android.gms.internal.nearby.zzht zzhtVar, boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.messages.StatusCallback) obj).onPermissionChanged(this.zza);
    }
}
