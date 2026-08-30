package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzap extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzd;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zze;

    zzap(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        this.zzd = zzbpeVar;
        this.zze = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "interstitial");
        return new com.google.android.gms.ads.internal.client.zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
