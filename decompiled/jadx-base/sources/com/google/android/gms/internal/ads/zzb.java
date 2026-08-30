package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    public static final com.google.android.gms.internal.ads.zzb zza = new com.google.android.gms.internal.ads.zzb(null, new com.google.android.gms.internal.ads.zza[0], 0, androidx.media3.common.C.TIME_UNSET, 0);
    private static final com.google.android.gms.internal.ads.zza zze = new com.google.android.gms.internal.ads.zza(0).zzb(0);
    private final com.google.android.gms.internal.ads.zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    private zzb(java.lang.Object obj, com.google.android.gms.internal.ads.zza[] zzaVarArr, long j, long j2, int i) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzb zzbVar = (com.google.android.gms.internal.ads.zzb) obj;
            if (java.util.Objects.equals(null, null) && java.util.Arrays.equals(this.zzf, zzbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) androidx.media3.common.C.TIME_UNSET) * 961) + java.util.Arrays.hashCode(this.zzf);
    }

    public final java.lang.String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }

    public final com.google.android.gms.internal.ads.zza zza(int i) {
        return i < 0 ? zze : this.zzf[i];
    }

    public final boolean zzb(int i) {
        zza(-1);
        int i2 = com.google.android.gms.internal.ads.zza.zzi;
        return false;
    }
}
