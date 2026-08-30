package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfdv {
    private final int zzb;
    private final int zzc;
    private final java.util.LinkedList zza = new java.util.LinkedList();
    private final com.google.android.gms.internal.ads.zzfeu zzd = new com.google.android.gms.internal.ads.zzfeu();

    public zzfdv(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((com.google.android.gms.internal.ads.zzfef) this.zza.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final com.google.android.gms.internal.ads.zzfef zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzfef zzfefVar = (com.google.android.gms.internal.ads.zzfef) this.zza.remove();
        if (zzfefVar != null) {
            this.zzd.zzh();
        }
        return zzfefVar;
    }

    public final com.google.android.gms.internal.ads.zzfet zzf() {
        return this.zzd.zzd();
    }

    public final java.lang.String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(com.google.android.gms.internal.ads.zzfef zzfefVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfefVar);
        return true;
    }
}
