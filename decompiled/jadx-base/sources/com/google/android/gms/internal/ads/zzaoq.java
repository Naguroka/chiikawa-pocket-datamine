package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzaoq extends java.security.cert.X509Certificate {
    private final java.security.cert.X509Certificate zza;

    public zzaoq(java.security.cert.X509Certificate x509Certificate) {
        this.zza = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.zza.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.zza.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getCriticalExtensionOIDs() {
        return this.zza.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.zza.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(java.lang.String str) {
        return this.zza.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getIssuerDN() {
        return this.zza.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.zza.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.zza.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getNonCriticalExtensionOIDs() {
        return this.zza.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotAfter() {
        return this.zza.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotBefore() {
        return this.zza.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final java.security.PublicKey getPublicKey() {
        return this.zza.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final java.math.BigInteger getSerialNumber() {
        return this.zza.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgName() {
        return this.zza.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgOID() {
        return this.zza.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.zza.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.zza.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getSubjectDN() {
        return this.zza.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.zza.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
        return this.zza.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.zza.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.zza.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.zza.verify(publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(java.util.Date date) throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.zza.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.zza.verify(publicKey, str);
    }
}
