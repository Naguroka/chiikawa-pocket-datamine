package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzab extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfc zza;
    final /* synthetic */ com.google.android.gms.common.api.Status zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzab(com.google.android.gms.internal.nearby.zzag zzagVar, com.google.android.gms.internal.nearby.zzfc zzfcVar, com.google.android.gms.common.api.Status status) {
        super(null);
        this.zza = zzfcVar;
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.ConnectionLifecycleCallback) obj).onConnectionResult(this.zza.zza(), new com.google.android.gms.nearby.connection.ConnectionResolution(this.zzb));
    }
}
