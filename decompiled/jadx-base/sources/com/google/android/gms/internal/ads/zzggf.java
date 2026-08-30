package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggf extends com.google.android.gms.internal.ads.zzgeu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final com.google.android.gms.internal.ads.zzggd zzd;

    /* synthetic */ zzggf(int i, int i2, int i3, com.google.android.gms.internal.ads.zzggd zzggdVar, com.google.android.gms.internal.ads.zzgge zzggeVar) {
        this.zza = i;
        this.zzd = zzggdVar;
    }

    public static com.google.android.gms.internal.ads.zzggc zzc() {
        return new com.google.android.gms.internal.ads.zzggc(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzggf)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzggf zzggfVar = (com.google.android.gms.internal.ads.zzggf) obj;
        if (zzggfVar.zza == this.zza) {
            int i = zzggfVar.zzb;
            int i2 = zzggfVar.zzc;
            if (zzggfVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzggf.class, java.lang.Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final java.lang.String toString() {
        return "AesGcm Parameters (variant: " + java.lang.String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzggd zzd() {
        return this.zzd;
    }
}
