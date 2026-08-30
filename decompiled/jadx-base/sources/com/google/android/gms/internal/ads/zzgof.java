package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgof extends com.google.android.gms.internal.ads.zzgoz {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzgod zzc;

    /* synthetic */ zzgof(int i, int i2, com.google.android.gms.internal.ads.zzgod zzgodVar, com.google.android.gms.internal.ads.zzgoe zzgoeVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgodVar;
    }

    public static com.google.android.gms.internal.ads.zzgoc zze() {
        return new com.google.android.gms.internal.ads.zzgoc(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgof)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgof zzgofVar = (com.google.android.gms.internal.ads.zzgof) obj;
        return zzgofVar.zza == this.zza && zzgofVar.zzd() == zzd() && zzgofVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgof.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), this.zzc);
    }

    public final java.lang.String toString() {
        return "AES-CMAC Parameters (variant: " + java.lang.String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != com.google.android.gms.internal.ads.zzgod.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        com.google.android.gms.internal.ads.zzgod zzgodVar = this.zzc;
        if (zzgodVar == com.google.android.gms.internal.ads.zzgod.zzd) {
            return this.zzb;
        }
        if (zzgodVar == com.google.android.gms.internal.ads.zzgod.zza || zzgodVar == com.google.android.gms.internal.ads.zzgod.zzb || zzgodVar == com.google.android.gms.internal.ads.zzgod.zzc) {
            return this.zzb + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final com.google.android.gms.internal.ads.zzgod zzf() {
        return this.zzc;
    }
}
