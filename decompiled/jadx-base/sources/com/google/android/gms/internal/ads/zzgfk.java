package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgfk extends com.google.android.gms.internal.ads.zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final com.google.android.gms.internal.ads.zzgfi zze;
    private final com.google.android.gms.internal.ads.zzgfh zzf;

    /* synthetic */ zzgfk(int i, int i2, int i3, int i4, com.google.android.gms.internal.ads.zzgfi zzgfiVar, com.google.android.gms.internal.ads.zzgfh zzgfhVar, com.google.android.gms.internal.ads.zzgfj zzgfjVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgfiVar;
        this.zzf = zzgfhVar;
    }

    public static com.google.android.gms.internal.ads.zzgfg zzf() {
        return new com.google.android.gms.internal.ads.zzgfg(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgfk)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgfk zzgfkVar = (com.google.android.gms.internal.ads.zzgfk) obj;
        return zzgfkVar.zza == this.zza && zzgfkVar.zzb == this.zzb && zzgfkVar.zzc == this.zzc && zzgfkVar.zzd == this.zzd && zzgfkVar.zze == this.zze && zzgfkVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzgfk.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzgfh zzgfhVar = this.zzf;
        return "AesCtrHmacAead Parameters (variant: " + java.lang.String.valueOf(this.zze) + ", hashType: " + java.lang.String.valueOf(zzgfhVar) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zze != com.google.android.gms.internal.ads.zzgfi.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzgfh zzg() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzgfi zzh() {
        return this.zze;
    }
}
