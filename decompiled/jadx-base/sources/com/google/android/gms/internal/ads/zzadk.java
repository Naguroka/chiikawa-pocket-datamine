package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadk {
    public final com.google.android.gms.internal.ads.zzadn zza;
    public final com.google.android.gms.internal.ads.zzadn zzb;

    public zzadk(com.google.android.gms.internal.ads.zzadn zzadnVar, com.google.android.gms.internal.ads.zzadn zzadnVar2) {
        this.zza = zzadnVar;
        this.zzb = zzadnVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzadk zzadkVar = (com.google.android.gms.internal.ads.zzadk) obj;
            if (this.zza.equals(zzadkVar.zza) && this.zzb.equals(zzadkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzadn zzadnVar = this.zza;
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = this.zzb;
        return com.ironsource.y8.i.d + zzadnVar.toString() + (zzadnVar.equals(zzadnVar2) ? "" : ", ".concat(this.zzb.toString())) + com.ironsource.y8.i.e;
    }
}
