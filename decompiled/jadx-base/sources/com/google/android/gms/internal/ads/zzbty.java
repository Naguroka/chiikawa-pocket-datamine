package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbty extends com.google.android.gms.internal.ads.zzbts {
    final /* synthetic */ java.util.List zza;

    zzbty(com.google.android.gms.internal.ads.zzbub zzbubVar, java.util.List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error recording impression urls: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(java.util.List list) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
