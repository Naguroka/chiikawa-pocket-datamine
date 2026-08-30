package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbhx extends com.google.android.gms.internal.ads.zzbgz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbia zza;

    /* synthetic */ zzbhx(com.google.android.gms.internal.ads.zzbia zzbiaVar, com.google.android.gms.internal.ads.zzbhz zzbhzVar) {
        this.zza = zzbiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbia zzbiaVar = this.zza;
        if (zzbiaVar.zzb == null) {
            return;
        }
        zzbiaVar.zzb.zzb(zzbiaVar.zzf(zzbgqVar), str);
    }
}
