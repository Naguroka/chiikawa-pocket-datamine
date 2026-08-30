package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbw extends com.google.android.gms.internal.measurement.zzcc {
    private final java.lang.String zzc;
    private final int zzd;
    private final int zze;

    /* synthetic */ zzbw(java.lang.String str, boolean z, int i, com.google.android.gms.internal.measurement.zzbs zzbsVar, com.google.android.gms.internal.measurement.zzbt zzbtVar, int i2, com.google.android.gms.internal.measurement.zzbv zzbvVar) {
        this.zzc = str;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzcc) {
            com.google.android.gms.internal.measurement.zzcc zzccVar = (com.google.android.gms.internal.measurement.zzcc) obj;
            if (this.zzc.equals(zzccVar.zzc())) {
                zzccVar.zzd();
                int i = this.zzd;
                int iZze = zzccVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzccVar.zza();
                    zzccVar.zzb();
                    int i2 = this.zze;
                    int iZzf = zzccVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i = this.zzd;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zze != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.zzd;
        if (i == 1) {
            str = "ALL_CHECKS";
        } else if (i == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i != 3) {
            str = i != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        java.lang.String str2 = this.zze == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.zzc + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final com.google.android.gms.internal.measurement.zzbs zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final com.google.android.gms.internal.measurement.zzbt zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final java.lang.String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zzf() {
        return this.zze;
    }
}
