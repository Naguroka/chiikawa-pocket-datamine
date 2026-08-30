package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjg implements com.google.android.gms.internal.ads.zzbjp {
    zzbjg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        if (zzcexVar.zzJ() != null) {
            zzcexVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcexVar.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzM = zzcexVar.zzM();
        if (zzmVarZzM != null) {
            zzmVarZzM.zzb();
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
