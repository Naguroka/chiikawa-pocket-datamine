package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwa implements com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdee {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdrw zzb;

    zzdwa(android.content.Context context, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdrwVar;
    }

    private final void zzd(final android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeG)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdvz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(android.content.Context context) {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
    }
}
