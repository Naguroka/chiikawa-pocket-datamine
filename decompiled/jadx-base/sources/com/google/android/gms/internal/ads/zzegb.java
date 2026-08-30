package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzegb {
    private final com.google.android.gms.internal.ads.zzgdb zzc;
    private com.google.android.gms.internal.ads.zzegr zzf;
    private final java.lang.String zzh;
    private final int zzi;
    private final com.google.android.gms.internal.ads.zzegq zzj;
    private com.google.android.gms.internal.ads.zzfbo zzk;
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzd = new java.util.ArrayList();
    private final java.util.Set zze = new java.util.HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzegb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzgdb zzgdbVar) {
        this.zzi = zzfcaVar.zzb.zzb.zzr;
        this.zzj = zzegqVar;
        this.zzc = zzgdbVar;
        this.zzh = com.google.android.gms.internal.ads.zzegx.zzc(zzfcaVar);
        java.util.List list = zzfcaVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((com.google.android.gms.internal.ads.zzfbo) list.get(i), java.lang.Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        com.google.android.gms.internal.ads.zzegr zzegrVar = this.zzf;
        if (zzegrVar != null) {
            this.zzc.zzc(zzegrVar);
        } else {
            this.zzc.zzd(new com.google.android.gms.internal.ads.zzegu(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z) {
        for (com.google.android.gms.internal.ads.zzfbo zzfboVar : this.zzb) {
            java.lang.Integer num = (java.lang.Integer) this.zza.get(zzfboVar);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzfboVar.zzat)) {
                if (numValueOf.intValue() < this.zzg) {
                    return true;
                }
                if (numValueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) this.zza.get((com.google.android.gms.internal.ads.zzfbo) it.next());
            if (java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((com.google.android.gms.internal.ads.zzfbo) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            java.util.List list = this.zzd;
            if (list.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    @javax.annotation.Nullable
    final synchronized com.google.android.gms.internal.ads.zzfbo zza() {
        if (zzi()) {
            for (int i = 0; i < this.zzb.size(); i++) {
                com.google.android.gms.internal.ads.zzfbo zzfboVar = (com.google.android.gms.internal.ads.zzfbo) this.zzb.get(i);
                java.lang.String str = zzfboVar.zzat;
                if (!this.zze.contains(str)) {
                    if (zzfboVar.zzav) {
                        this.zzl = true;
                    }
                    if (!android.text.TextUtils.isEmpty(str)) {
                        this.zze.add(str);
                    }
                    this.zzd.add(zzfboVar);
                    return (com.google.android.gms.internal.ads.zzfbo) this.zzb.remove(i);
                }
            }
        }
        return null;
    }

    final synchronized void zzb(java.lang.Throwable th, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zzl = false;
        this.zzd.remove(zzfboVar);
        this.zze.remove(zzfboVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zze();
    }

    final synchronized void zzc(com.google.android.gms.internal.ads.zzegr zzegrVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zzl = false;
        this.zzd.remove(zzfboVar);
        if (zzd()) {
            zzegrVar.zzr();
            return;
        }
        java.lang.Integer num = (java.lang.Integer) this.zza.get(zzfboVar);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfboVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = numValueOf.intValue();
        this.zzf = zzegrVar;
        this.zzk = zzfboVar;
        if (zzh()) {
            return;
        }
        zze();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
