package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfnd {
    protected static final byte[] zza = {kotlin.io.encoding.Base64.padSymbol, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, okio.Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(java.io.File file) throws java.security.GeneralSecurityException {
        try {
            java.security.cert.X509Certificate[][] x509CertificateArrZza = com.google.android.gms.internal.ads.zzaos.zza(file.getAbsolutePath());
            if (x509CertificateArrZza.length != 1) {
                throw new java.security.GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-256").digest(x509CertificateArrZza[0][0].getEncoded());
            if (java.util.Arrays.equals(this.zzd, bArrDigest)) {
                return true;
            }
            return !"user".equals(android.os.Build.TYPE) && java.util.Arrays.equals(this.zzc, bArrDigest);
        } catch (com.google.android.gms.internal.ads.zzaoo e) {
            throw new java.security.GeneralSecurityException("Package is not signed", e);
        } catch (java.io.IOException e2) {
            e = e2;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
