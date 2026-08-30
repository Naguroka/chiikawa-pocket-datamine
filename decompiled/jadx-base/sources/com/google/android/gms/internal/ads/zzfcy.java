package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcy {
    public zzfcy() {
        try {
            com.google.android.gms.internal.ads.zzges.zza();
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final java.lang.String zza() {
        byte[] byteArray;
        try {
            com.google.android.gms.internal.ads.zzgeg zzgegVarZzb = com.google.android.gms.internal.ads.zzgeg.zzb(com.google.android.gms.internal.ads.zzgea.zza(com.google.android.gms.internal.ads.zzgmg.zzb().zza("AES128_GCM")));
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.google.android.gms.internal.ads.zzgdq.zzb(zzgegVarZzb, com.google.android.gms.internal.ads.zzgdp.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Serialize keyset failed");
            }
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return android.util.Base64.encodeToString(byteArray, 11);
    }

    @javax.annotation.Nullable
    public static final java.lang.String zzb(byte[] bArr, byte[] bArr2, @javax.annotation.Nullable java.lang.String str, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        com.google.android.gms.internal.ads.zzgeg zzgegVarZzc;
        if (str != null && (zzgegVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((com.google.android.gms.internal.ads.zzgdn) zzgegVarZzc.zzd(com.google.android.gms.internal.ads.zzgnl.zzd(), com.google.android.gms.internal.ads.zzgdn.class)).zza(bArr, bArr2);
                zzdrqVar.zzb().put("ds", "1");
                return new java.lang.String(bArrZza, com.adjust.sdk.Constants.ENCODING);
            } catch (java.io.UnsupportedEncodingException | java.lang.UnsupportedOperationException | java.security.GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.decrypt");
                zzdrqVar.zzb().put("dsf", e.toString());
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    private static final com.google.android.gms.internal.ads.zzgeg zzc(java.lang.String str) {
        try {
            try {
                return com.google.android.gms.internal.ads.zzgdq.zza(com.google.android.gms.internal.ads.zzgdo.zzb(android.util.Base64.decode(str, 11)));
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Parse keyset failed");
            }
        } catch (java.security.GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
