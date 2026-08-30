package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaop extends com.google.android.gms.internal.ads.zzaoq {
    private final byte[] zza;

    public zzaop(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaoq, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.zza;
    }
}
