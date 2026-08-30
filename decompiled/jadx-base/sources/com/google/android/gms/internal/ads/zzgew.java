package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgew implements com.google.android.gms.internal.ads.zzgdn {
    private final com.google.android.gms.internal.ads.zzgnf zza;

    /* synthetic */ zzgew(com.google.android.gms.internal.ads.zzgnf zzgnfVar, com.google.android.gms.internal.ads.zzgex zzgexVar) {
        this.zza = zzgnfVar;
        if (zzgnfVar.zzg()) {
            com.google.android.gms.internal.ads.zzglq zzglqVarZza = com.google.android.gms.internal.ads.zzgmf.zzb().zza();
            com.google.android.gms.internal.ads.zzglu zzgluVarZza = com.google.android.gms.internal.ads.zzglx.zza(zzgnfVar);
            zzglqVarZza.zza(zzgluVarZza, "aead", "encrypt");
            zzglqVarZza.zza(zzgluVarZza, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length > 5) {
            for (com.google.android.gms.internal.ads.zzgnd zzgndVar : this.zza.zzf(java.util.Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((com.google.android.gms.internal.ads.zzgdn) zzgndVar.zzd()).zza(bArr, bArr2);
                    zzgndVar.zza();
                    int length = bArr.length;
                    return bArrZza;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
        }
        for (com.google.android.gms.internal.ads.zzgnd zzgndVar2 : this.zza.zzf(com.google.android.gms.internal.ads.zzgds.zza)) {
            try {
                byte[] bArrZza2 = ((com.google.android.gms.internal.ads.zzgdn) zzgndVar2.zzd()).zza(bArr, bArr2);
                zzgndVar2.zza();
                int length2 = bArr.length;
                return bArrZza2;
            } catch (java.security.GeneralSecurityException unused2) {
            }
        }
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
