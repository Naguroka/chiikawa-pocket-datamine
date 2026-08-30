package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgll extends com.google.android.gms.internal.ads.zzgek {
    private final com.google.android.gms.internal.ads.zzgni zza;

    public zzgll(com.google.android.gms.internal.ads.zzgni zzgniVar) {
        this.zza = zzgniVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgll)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgni zzgniVar = ((com.google.android.gms.internal.ads.zzgll) obj).zza;
        return this.zza.zzc().zzg().equals(zzgniVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgniVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgniVar.zzc().zzh());
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.zzgni zzgniVar = this.zza;
        return java.util.Objects.hash(zzgniVar.zzc(), zzgniVar.zzd());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.zza.zzc().zzi();
        int iOrdinal = this.zza.zzc().zzg().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza.zzc().zzg() != com.google.android.gms.internal.ads.zzgtp.RAW;
    }

    public final com.google.android.gms.internal.ads.zzgni zzb() {
        return this.zza;
    }
}
