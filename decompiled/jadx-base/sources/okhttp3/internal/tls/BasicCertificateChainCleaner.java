package okhttp3.internal.tls;

/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "verifySignature", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    private static final int MAX_SIGNERS = 9;
    private final okhttp3.internal.tls.TrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(okhttp3.internal.tls.TrustRootIndex trustRootIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.trustRootIndex = trustRootIndex;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> chain, java.lang.String hostname) throws javax.net.ssl.SSLPeerUnverifiedException {
        java.security.cert.X509Certificate x509Certificate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(chain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object objRemoveFirst = arrayDeque.removeFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            java.lang.Object obj = arrayList.get(arrayList.size() - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) obj;
            java.security.cert.X509Certificate x509CertificateFindByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate2);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !kotlin.jvm.internal.Intrinsics.areEqual(x509Certificate2, x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (verifySignature(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
                    return arrayList;
                }
                z = true;
            } else {
                java.util.Iterator it = arrayDeque.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z) {
                            return arrayList;
                        }
                        throw new javax.net.ssl.SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                    }
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (java.security.cert.X509Certificate) next;
                } while (!verifySignature(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    private final boolean verifySignature(java.security.cert.X509Certificate toVerify, java.security.cert.X509Certificate signingCert) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(toVerify.getIssuerDN(), signingCert.getSubjectDN())) {
            return false;
        }
        try {
            toVerify.verify(signingCert.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }

    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof okhttp3.internal.tls.BasicCertificateChainCleaner) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.internal.tls.BasicCertificateChainCleaner) other).trustRootIndex, this.trustRootIndex);
    }
}
