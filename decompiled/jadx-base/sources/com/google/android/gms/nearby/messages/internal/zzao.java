package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzao implements com.google.android.gms.nearby.messages.internal.zzbb {
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzao(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> listenerHolder2 = this.zza;
        int i = com.google.android.gms.nearby.messages.internal.zzbg.zza;
        zzaiVar.zzx(listenerHolder, listenerHolder2);
    }
}
