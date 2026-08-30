package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbnq implements com.google.android.gms.internal.ads.zzcaf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zza;

    zzbnq(com.google.android.gms.internal.ads.zzbnr zzbnrVar) {
        this.zza = zzbnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzbmn zzbmnVar = (com.google.android.gms.internal.ads.zzbmn) obj;
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbnp
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzbmn zzbmnVar2 = zzbmnVar;
                zzbmnVar2.zzr("/result", com.google.android.gms.internal.ads.zzbjo.zzo);
                zzbmnVar2.zzc();
            }
        });
    }
}
