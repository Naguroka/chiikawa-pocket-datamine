package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzht {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzab zzb;
    public final com.google.android.gms.internal.ads.zzab zzc;
    public final int zzd;
    public final int zze;

    public zzht(java.lang.String str, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab zzabVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        com.google.android.gms.internal.ads.zzcw.zzc(str);
        this.zza = str;
        this.zzb = zzabVar;
        zzabVar2.getClass();
        this.zzc = zzabVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzht zzhtVar = (com.google.android.gms.internal.ads.zzht) obj;
            if (this.zzd == zzhtVar.zzd && this.zze == zzhtVar.zze && this.zza.equals(zzhtVar.zza) && this.zzb.equals(zzhtVar.zzb) && this.zzc.equals(zzhtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
