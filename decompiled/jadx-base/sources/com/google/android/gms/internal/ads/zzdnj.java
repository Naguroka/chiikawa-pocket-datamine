package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdnj implements com.google.android.gms.internal.ads.zzbjp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdnl zza;
    private final java.lang.ref.WeakReference zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbjp zzd;

    /* synthetic */ zzdnj(com.google.android.gms.internal.ads.zzdnl zzdnlVar, java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar, com.google.android.gms.internal.ads.zzdnk zzdnkVar) {
        this.zza = zzdnlVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
