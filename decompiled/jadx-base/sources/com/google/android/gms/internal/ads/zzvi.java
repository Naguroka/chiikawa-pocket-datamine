package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvi {
    public final int zza;
    public final boolean zzb;

    public zzvi(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzvi zzviVar = (com.google.android.gms.internal.ads.zzvi) obj;
            if (this.zza == zzviVar.zza && this.zzb == zzviVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
