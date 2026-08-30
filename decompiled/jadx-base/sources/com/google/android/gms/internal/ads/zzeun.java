package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeun implements com.google.android.gms.internal.ads.zzetq {
    final java.lang.String zza;
    final int zzb;

    /* synthetic */ zzeun(java.lang.String str, int i, com.google.android.gms.internal.ads.zzeum zzeumVar) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkm)).booleanValue()) {
            if (!android.text.TextUtils.isEmpty(this.zza)) {
                zzcuvVar.zza.putString("topics", this.zza);
            }
            int i = this.zzb;
            if (i != -1) {
                zzcuvVar.zza.putInt("atps", i);
            }
        }
    }
}
