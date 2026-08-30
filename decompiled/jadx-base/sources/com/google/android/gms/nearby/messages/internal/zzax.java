package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzax extends com.google.android.gms.nearby.messages.internal.zzbf {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.nearby.messages.internal.zzbg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.zzb = zzbgVar;
        this.zza = listenerHolder2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbf, com.google.android.gms.nearby.messages.internal.zzab
    public final void zzd() {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey = this.zza.getListenerKey();
        if (listenerKey != null) {
            this.zzb.doUnregisterEventListener(listenerKey);
        }
        super.zzd();
    }
}
