package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnc {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbop zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzcnh zzd;
    private final com.google.android.gms.internal.ads.zzbjp zze = new com.google.android.gms.internal.ads.zzcmz(this);
    private final com.google.android.gms.internal.ads.zzbjp zzf = new com.google.android.gms.internal.ads.zzcnb(this);

    public zzcnc(java.lang.String str, com.google.android.gms.internal.ads.zzbop zzbopVar, java.util.concurrent.Executor executor) {
        this.zza = str;
        this.zzb = zzbopVar;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.internal.ads.zzcnc zzcncVar, java.util.Map map) {
        if (map == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get("hashCode");
        return !android.text.TextUtils.isEmpty(str) && str.equals(zzcncVar.zza);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcnh zzcnhVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnhVar;
    }

    public final void zzd(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzcexVar.zzag("/updateActiveView", this.zze);
        zzcexVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzcexVar.zzaz("/updateActiveView", this.zze);
        zzcexVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
