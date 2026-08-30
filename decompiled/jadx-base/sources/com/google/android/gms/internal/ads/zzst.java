package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzst {
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzst(java.lang.String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == com.google.android.gms.internal.ads.zzst.class) {
            com.google.android.gms.internal.ads.zzst zzstVar = (com.google.android.gms.internal.ads.zzst) obj;
            if (android.text.TextUtils.equals(this.zza, zzstVar.zza) && this.zzb == zzstVar.zzb && this.zzc == zzstVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
