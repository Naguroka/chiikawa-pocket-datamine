package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbr {
    public final int zza;
    public final java.lang.String zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzab[] zzd;
    private int zze;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzbr(java.lang.String str, com.google.android.gms.internal.ads.zzab... zzabVarArr) {
        int length = zzabVarArr.length;
        int i = 1;
        com.google.android.gms.internal.ads.zzcw.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzabVarArr;
        this.zza = length;
        int iZzb = com.google.android.gms.internal.ads.zzbb.zzb(zzabVarArr[0].zzo);
        this.zzc = iZzb == -1 ? com.google.android.gms.internal.ads.zzbb.zzb(zzabVarArr[0].zzn) : iZzb;
        java.lang.String strZzc = zzc(zzabVarArr[0].zzd);
        int i2 = zzabVarArr[0].zzf | 16384;
        while (true) {
            com.google.android.gms.internal.ads.zzab[] zzabVarArr2 = this.zzd;
            if (i >= zzabVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzabVarArr2[i].zzd))) {
                com.google.android.gms.internal.ads.zzab[] zzabVarArr3 = this.zzd;
                zzd("languages", zzabVarArr3[0].zzd, zzabVarArr3[i].zzd, i);
                return;
            } else {
                com.google.android.gms.internal.ads.zzab[] zzabVarArr4 = this.zzd;
                if (i2 != (zzabVarArr4[i].zzf | 16384)) {
                    zzd("role flags", java.lang.Integer.toBinaryString(zzabVarArr4[0].zzf), java.lang.Integer.toBinaryString(this.zzd[i].zzf), i);
                    return;
                }
                i++;
            }
        }
    }

    private static java.lang.String zzc(java.lang.String str) {
        return (str == null || str.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        com.google.android.gms.internal.ads.zzdo.zzd("TrackGroup", "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbr zzbrVar = (com.google.android.gms.internal.ads.zzbr) obj;
            if (this.zzb.equals(zzbrVar.zzb) && java.util.Arrays.equals(this.zzd, zzbrVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.zzb.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzd);
        this.zze = iHashCode;
        return iHashCode;
    }

    public final int zza(com.google.android.gms.internal.ads.zzab zzabVar) {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzab[] zzabVarArr = this.zzd;
            if (i >= zzabVarArr.length) {
                return -1;
            }
            if (zzabVar == zzabVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final com.google.android.gms.internal.ads.zzab zzb(int i) {
        return this.zzd[i];
    }
}
