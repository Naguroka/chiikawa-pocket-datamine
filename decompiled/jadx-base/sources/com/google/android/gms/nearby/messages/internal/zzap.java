package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzap implements com.google.android.gms.nearby.messages.internal.zzbb {
    private final com.google.android.gms.nearby.messages.internal.zzbg zza;
    private final android.app.PendingIntent zzb;
    private final com.google.android.gms.nearby.messages.internal.zzbf zzc;
    private final com.google.android.gms.nearby.messages.SubscribeOptions zzd;

    zzap(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.internal.zzbf zzbfVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        this.zza = zzbgVar;
        this.zzb = pendingIntent;
        this.zzc = zzbfVar;
        this.zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        this.zza.zzd(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
