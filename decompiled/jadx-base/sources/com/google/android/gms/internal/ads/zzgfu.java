package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgfu extends com.google.android.gms.internal.ads.zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final com.google.android.gms.internal.ads.zzgfs zzd;

    /* synthetic */ zzgfu(int i, int i2, int i3, com.google.android.gms.internal.ads.zzgfs zzgfsVar, com.google.android.gms.internal.ads.zzgft zzgftVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfsVar;
    }

    public static com.google.android.gms.internal.ads.zzgfr zzd() {
        return new com.google.android.gms.internal.ads.zzgfr(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgfu)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgfu zzgfuVar = (com.google.android.gms.internal.ads.zzgfu) obj;
        if (zzgfuVar.zza == this.zza && zzgfuVar.zzb == this.zzb) {
            int i = zzgfuVar.zzc;
            if (zzgfuVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgfu.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final java.lang.String toString() {
        return "AesEax Parameters (variant: " + java.lang.String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzgfs.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzgfs zze() {
        return this.zzd;
    }
}
