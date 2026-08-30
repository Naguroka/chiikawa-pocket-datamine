package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdm {
    public final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzv zzb = new com.google.android.gms.internal.ads.zzv();
    private boolean zzc;
    private boolean zzd;

    public zzdm(java.lang.Object obj) {
        this.zza = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((com.google.android.gms.internal.ads.zzdm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, com.google.android.gms.internal.ads.zzdk zzdkVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzdkVar.zza(this.zza);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzdl zzdlVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        com.google.android.gms.internal.ads.zzx zzxVarZzb = this.zzb.zzb();
        this.zzb = new com.google.android.gms.internal.ads.zzv();
        this.zzc = false;
        zzdlVar.zza(this.zza, zzxVarZzb);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzdl zzdlVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdlVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
