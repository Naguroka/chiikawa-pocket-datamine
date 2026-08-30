package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbao implements com.google.android.gms.internal.ads.zzazd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbar zza;

    zzbao(com.google.android.gms.internal.ads.zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            com.google.android.gms.internal.ads.zzbar.zzh(this.zza);
        }
    }
}
