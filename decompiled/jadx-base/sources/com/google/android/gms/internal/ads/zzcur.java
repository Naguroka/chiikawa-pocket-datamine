package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcur implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcwo {
    private final com.google.android.gms.internal.ads.zzfbo zza;

    public zzcur(android.content.Context context, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzbtj zzbtjVar) {
        this.zza = zzfboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.internal.ads.zzbtk zzbtkVar = this.zza.zzad;
        if (zzbtkVar == null || !zzbtkVar.zza) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.zza.zzad.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zza.zzad.zzb);
    }
}
