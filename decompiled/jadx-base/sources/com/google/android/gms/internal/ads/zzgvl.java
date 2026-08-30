package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvl implements com.google.android.gms.internal.ads.zzgej {
    private static final byte[] zza = {0};
    private final com.google.android.gms.internal.ads.zzgpy zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgvl(com.google.android.gms.internal.ads.zzgnx zzgnxVar) throws java.security.GeneralSecurityException {
        this.zzb = new com.google.android.gms.internal.ads.zzgvi(zzgnxVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()));
        this.zzc = zzgnxVar.zzb().zzb();
        this.zzd = zzgnxVar.zzc().zzc();
        if (zzgnxVar.zzb().zzf().equals(com.google.android.gms.internal.ads.zzgod.zzc)) {
            this.zze = java.util.Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static com.google.android.gms.internal.ads.zzgej zza(com.google.android.gms.internal.ads.zzgnx zzgnxVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgvl(zzgnxVar);
    }

    public static com.google.android.gms.internal.ads.zzgej zzb(com.google.android.gms.internal.ads.zzgom zzgomVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgvl(zzgomVar);
    }

    public final byte[] zzc(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? com.google.android.gms.internal.ads.zzguo.zzb(this.zzd, this.zzb.zza(com.google.android.gms.internal.ads.zzguo.zzb(bArr, bArr2), this.zzc)) : com.google.android.gms.internal.ads.zzguo.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgvl(com.google.android.gms.internal.ads.zzgom zzgomVar) throws java.security.GeneralSecurityException {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(zzgomVar.zzb().zzf()));
        this.zzb = new com.google.android.gms.internal.ads.zzgvk("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(zzgomVar.zzd().zzd(com.google.android.gms.internal.ads.zzgdw.zza()), "HMAC"));
        this.zzc = zzgomVar.zzb().zzb();
        this.zzd = zzgomVar.zzc().zzc();
        if (zzgomVar.zzb().zzg().equals(com.google.android.gms.internal.ads.zzgou.zzc)) {
            this.zze = java.util.Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgvl(com.google.android.gms.internal.ads.zzgpy zzgpyVar, int i) throws java.security.GeneralSecurityException {
        this.zzb = zzgpyVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgpyVar.zza(new byte[0], i);
    }
}
