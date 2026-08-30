package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgls {
    private final com.google.android.gms.internal.ads.zzgdz zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzgls(com.google.android.gms.internal.ads.zzgdz zzgdzVar, int i, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzglt zzgltVar) {
        this.zza = zzgdzVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgls)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgls zzglsVar = (com.google.android.gms.internal.ads.zzgls) obj;
        return this.zza == zzglsVar.zza && this.zzb == zzglsVar.zzb && this.zzc.equals(zzglsVar.zzc) && this.zzd.equals(zzglsVar.zzd);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
