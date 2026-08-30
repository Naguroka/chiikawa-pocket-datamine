package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzad {
    public final java.lang.String zza;
    public final java.lang.String zzb;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzad(java.lang.String str, java.lang.String str2) {
        this.zza = com.google.android.gms.internal.ads.zzei.zzE(str);
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzad zzadVar = (com.google.android.gms.internal.ads.zzad) obj;
            if (java.util.Objects.equals(this.zza, zzadVar.zza) && java.util.Objects.equals(this.zzb, zzadVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        java.lang.String str = this.zza;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
