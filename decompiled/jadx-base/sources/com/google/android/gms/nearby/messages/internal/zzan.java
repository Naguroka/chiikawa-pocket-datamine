package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzan implements com.google.android.gms.nearby.messages.internal.zzbb {
    private final com.google.android.gms.nearby.messages.internal.zzbg zza;
    private final com.google.android.gms.common.api.internal.ListenerHolder zzb;
    private final com.google.android.gms.nearby.messages.internal.zzbf zzc;
    private final com.google.android.gms.nearby.messages.SubscribeOptions zzd;

    zzan(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.nearby.messages.internal.zzbf zzbfVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        this.zza = zzbgVar;
        this.zzb = listenerHolder;
        this.zzc = zzbfVar;
        this.zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        this.zza.zze(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
