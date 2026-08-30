package okhttp3;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b!J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\"J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b#J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\u0017H\u0016R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lokhttp3/Handshake;", "", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "localCertificates", "", "Ljava/security/cert/Certificate;", "peerCertificatesFn", "Lkotlin/Function0;", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "()Lokhttp3/CipherSuite;", "()Ljava/util/List;", "localPrincipal", "Ljava/security/Principal;", "()Ljava/security/Principal;", "peerCertificates", "peerCertificates$delegate", "Lkotlin/Lazy;", "peerPrincipal", "()Lokhttp3/TlsVersion;", "name", "", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "-deprecated_cipherSuite", "equals", "", "other", "hashCode", "", "-deprecated_localCertificates", "-deprecated_localPrincipal", "-deprecated_peerCertificates", "-deprecated_peerPrincipal", "-deprecated_tlsVersion", "toString", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Handshake {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Handshake.Companion INSTANCE = new okhttp3.Handshake.Companion(null);
    private final okhttp3.CipherSuite cipherSuite;
    private final java.util.List<java.security.cert.Certificate> localCertificates;

    /* JADX INFO: renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy peerCertificates;
    private final okhttp3.TlsVersion tlsVersion;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
        return INSTANCE.get(sSLSession);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> list, java.util.List<? extends java.security.cert.Certificate> list2) {
        return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> localCertificates, final kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.Certificate>>() { // from class: okhttp3.Handshake.peerCertificates.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends java.security.cert.Certificate> invoke() {
                try {
                    return peerCertificatesFn.invoke();
                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            }
        });
    }

    public final okhttp3.TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public final okhttp3.CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public final java.util.List<java.security.cert.Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
        return (java.util.List) this.peerCertificates.getValue();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersion", imports = {}))
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name and from getter */
    public final okhttp3.TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuite", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name and from getter */
    public final okhttp3.CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerCertificates", imports = {}))
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m2918deprecated_peerCertificates() {
        return peerCertificates();
    }

    public final java.security.Principal peerPrincipal() {
        java.lang.Object objFirstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) peerCertificates());
        java.security.cert.X509Certificate x509Certificate = objFirstOrNull instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) objFirstOrNull : null;
        return x509Certificate != null ? x509Certificate.getSubjectX500Principal() : null;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerPrincipal", imports = {}))
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m2919deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localCertificates", imports = {}))
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m2916deprecated_localCertificates() {
        return this.localCertificates;
    }

    public final java.security.Principal localPrincipal() {
        java.lang.Object objFirstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) this.localCertificates);
        java.security.cert.X509Certificate x509Certificate = objFirstOrNull instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) objFirstOrNull : null;
        return x509Certificate != null ? x509Certificate.getSubjectX500Principal() : null;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localPrincipal", imports = {}))
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m2917deprecated_localPrincipal() {
        return localPrincipal();
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.Handshake) {
            okhttp3.Handshake handshake = (okhttp3.Handshake) other;
            if (handshake.tlsVersion == this.tlsVersion && kotlin.jvm.internal.Intrinsics.areEqual(handshake.cipherSuite, this.cipherSuite) && kotlin.jvm.internal.Intrinsics.areEqual(handshake.peerCertificates(), peerCertificates()) && kotlin.jvm.internal.Intrinsics.areEqual(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public java.lang.String toString() {
        java.util.List<java.security.cert.Certificate> listPeerCertificates = peerCertificates();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listPeerCertificates, 10));
        java.util.Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((java.security.cert.Certificate) it.next()));
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Handshake{tlsVersion=").append(this.tlsVersion).append(" cipherSuite=").append(this.cipherSuite).append(" peerCertificates=").append(arrayList.toString()).append(" localCertificates=");
        java.util.List<java.security.cert.Certificate> list = this.localCertificates;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((java.security.cert.Certificate) it2.next()));
        }
        return sbAppend.append(arrayList2).append('}').toString();
    }

    private final java.lang.String getName(java.security.cert.Certificate certificate) {
        if (certificate instanceof java.security.cert.X509Certificate) {
            return ((java.security.cert.X509Certificate) certificate).getSubjectDN().toString();
        }
        java.lang.String type = certificate.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    /* JADX INFO: compiled from: Handshake.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
            final java.util.List<java.security.cert.Certificate> listEmptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            java.lang.String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new java.lang.IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new java.io.IOException("cipherSuite == " + cipherSuite);
            }
            okhttp3.CipherSuite cipherSuiteForJavaName = okhttp3.CipherSuite.INSTANCE.forJavaName(cipherSuite);
            java.lang.String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new java.lang.IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("NONE", protocol)) {
                throw new java.io.IOException("tlsVersion == NONE");
            }
            okhttp3.TlsVersion tlsVersionForJavaName = okhttp3.TlsVersion.INSTANCE.forJavaName(protocol);
            try {
                listEmptyList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            return new okhttp3.Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends java.security.cert.Certificate> invoke() {
                    return listEmptyList;
                }
            });
        }

        private final java.util.List<java.security.cert.Certificate> toImmutableList(java.security.cert.Certificate[] certificateArr) {
            if (certificateArr != null) {
                return okhttp3.internal.Util.immutableListOf(java.util.Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m2921deprecated_get(javax.net.ssl.SSLSession sslSession) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSession, "sslSession");
            return get(sslSession);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> peerCertificates, java.util.List<? extends java.security.cert.Certificate> localCertificates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            final java.util.List immutableList = okhttp3.internal.Util.toImmutableList(peerCertificates);
            return new okhttp3.Handshake(tlsVersion, cipherSuite, okhttp3.internal.Util.toImmutableList(localCertificates), new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends java.security.cert.Certificate> invoke() {
                    return immutableList;
                }
            });
        }
    }
}
