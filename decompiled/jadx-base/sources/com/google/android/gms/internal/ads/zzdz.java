package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdz {
    public static final com.google.android.gms.internal.ads.zzdz zza = new com.google.android.gms.internal.ads.zzdz(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new com.google.android.gms.internal.ads.zzdz(0, 0);
    }

    public zzdz(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzdz) {
            com.google.android.gms.internal.ads.zzdz zzdzVar = (com.google.android.gms.internal.ads.zzdz) obj;
            if (this.zzb == zzdzVar.zzb && this.zzc == zzdzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final java.lang.String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}
