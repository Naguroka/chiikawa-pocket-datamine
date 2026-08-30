package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzaj implements com.google.android.gms.nearby.messages.internal.zzbb {
    private final com.google.android.gms.nearby.messages.internal.zzbg zza;
    private final com.google.android.gms.nearby.messages.Message zzb;
    private final com.google.android.gms.nearby.messages.internal.zzbd zzc;
    private final com.google.android.gms.nearby.messages.PublishOptions zzd;

    zzaj(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.internal.zzbd zzbdVar, com.google.android.gms.nearby.messages.PublishOptions publishOptions) {
        this.zza = zzbgVar;
        this.zzb = message;
        this.zzc = zzbdVar;
        this.zzd = publishOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        this.zza.zzf(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
