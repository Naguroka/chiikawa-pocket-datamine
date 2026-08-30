package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrz implements com.google.android.gms.internal.ads.zzfgo {
    private final com.google.android.gms.internal.ads.zzdrq zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();

    public zzdrz(com.google.android.gms.internal.ads.zzdrq zzdrqVar, java.util.Set set, com.google.android.gms.common.util.Clock clock) {
        this.zzb = zzdrqVar;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzdry zzdryVar = (com.google.android.gms.internal.ads.zzdry) it.next();
            this.zzd.put(zzdryVar.zzc, zzdryVar);
        }
        this.zzc = clock;
    }

    private final void zze(com.google.android.gms.internal.ads.zzfgh zzfghVar, boolean z) {
        com.google.android.gms.internal.ads.zzdry zzdryVar = (com.google.android.gms.internal.ads.zzdry) this.zzd.get(zzfghVar);
        if (zzdryVar == null) {
            return;
        }
        java.lang.String str = true != z ? "f." : "s.";
        java.util.Map map = this.zza;
        com.google.android.gms.internal.ads.zzfgh zzfghVar2 = zzdryVar.zzb;
        if (map.containsKey(zzfghVar2)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) this.zza.get(zzfghVar2)).longValue();
            this.zzb.zzb().put("label.".concat(zzdryVar.zza), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        if (this.zza.containsKey(zzfghVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) this.zza.get(zzfghVar)).longValue();
            com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzb;
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            zzdrqVar.zzb().put("task.".concat(strValueOf), "s.".concat(java.lang.String.valueOf(java.lang.Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfghVar)) {
            zze(zzfghVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str, java.lang.Throwable th) {
        if (this.zza.containsKey(zzfghVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) this.zza.get(zzfghVar)).longValue();
            com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzb;
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            zzdrqVar.zzb().put("task.".concat(strValueOf), "f.".concat(java.lang.String.valueOf(java.lang.Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfghVar)) {
            zze(zzfghVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        this.zza.put(zzfghVar, java.lang.Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
