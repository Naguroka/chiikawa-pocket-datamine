package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzab extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzc;

    zzab(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "rewarded");
        return new com.google.android.gms.ads.internal.client.zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzp(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        return com.google.android.gms.internal.ads.zzbxb.zza(this.zza, this.zzb, this.zzc);
    }
}
