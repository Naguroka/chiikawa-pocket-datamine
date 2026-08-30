package okhttp3;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0015J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bH\u0007¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0007H\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006%"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "isTls", "", "supportsTlsExtensions", "cipherSuitesAsString", "", "", "tlsVersionsAsString", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "cipherSuites", "", "Lokhttp3/CipherSuite;", "()Ljava/util/List;", "[Ljava/lang/String;", "()Z", "tlsVersions", "Lokhttp3/TlsVersion;", "apply", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "apply$okhttp", "-deprecated_cipherSuites", "equals", "other", "hashCode", "", "isCompatible", "socket", "supportedSpec", "-deprecated_supportsTlsExtensions", "-deprecated_tlsVersions", "toString", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionSpec {
    private static final okhttp3.CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final okhttp3.ConnectionSpec CLEARTEXT;
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS;
    public static final okhttp3.ConnectionSpec MODERN_TLS;
    private static final okhttp3.CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS;
    private final java.lang.String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final java.lang.String[] tlsVersionsAsString;

    public ConnectionSpec(boolean z, boolean z2, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    /* JADX INFO: renamed from: isTls, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
        java.lang.String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(okhttp3.CipherSuite.INSTANCE.forJavaName(str));
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuites", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m2901deprecated_cipherSuites() {
        return cipherSuites();
    }

    public final java.util.List<okhttp3.TlsVersion> tlsVersions() {
        java.lang.String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(okhttp3.TlsVersion.INSTANCE.forJavaName(str));
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersions", imports = {}))
    /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m2903deprecated_tlsVersions() {
        return tlsVersions();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name and from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final void apply$okhttp(javax.net.ssl.SSLSocket sslSocket, boolean isFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        okhttp3.ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sslSocket, isFallback);
        if (connectionSpecSupportedSpec.tlsVersions() != null) {
            sslSocket.setEnabledProtocols(connectionSpecSupportedSpec.tlsVersionsAsString);
        }
        if (connectionSpecSupportedSpec.cipherSuites() != null) {
            sslSocket.setEnabledCipherSuites(connectionSpecSupportedSpec.cipherSuitesAsString);
        }
    }

    private final okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket sslSocket, boolean isFallback) {
        java.lang.String[] cipherSuitesIntersection;
        java.lang.String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            java.lang.String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = okhttp3.internal.Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            java.lang.String[] enabledProtocols = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = okhttp3.internal.Util.intersect(enabledProtocols, this.tlsVersionsAsString, kotlin.comparisons.ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        java.lang.String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iIndexOf = okhttp3.internal.Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
        if (isFallback && iIndexOf != -1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            java.lang.String str = supportedCipherSuites[iIndexOf];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = okhttp3.internal.Util.concat(cipherSuitesIntersection, str);
        }
        okhttp3.ConnectionSpec.Builder builder = new okhttp3.ConnectionSpec.Builder(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        okhttp3.ConnectionSpec.Builder builderCipherSuites = builder.cipherSuites((java.lang.String[]) java.util.Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return builderCipherSuites.tlsVersions((java.lang.String[]) java.util.Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).build();
    }

    public final boolean isCompatible(javax.net.ssl.SSLSocket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        java.lang.String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !okhttp3.internal.Util.hasIntersection(strArr, socket.getEnabledProtocols(), kotlin.comparisons.ComparisonsKt.naturalOrder())) {
            return false;
        }
        java.lang.String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || okhttp3.internal.Util.hasIntersection(strArr2, socket.getEnabledCipherSuites(), okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.ConnectionSpec)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z = this.isTls;
        okhttp3.ConnectionSpec connectionSpec = (okhttp3.ConnectionSpec) other;
        if (z != connectionSpec.isTls) {
            return false;
        }
        return !z || (java.util.Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && java.util.Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        java.lang.String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? java.util.Arrays.hashCode(strArr) : 0)) * 31;
        java.lang.String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public java.lang.String toString() {
        return !this.isTls ? "ConnectionSpec()" : "ConnectionSpec(cipherSuites=" + java.util.Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + java.util.Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\t\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\t\"\u00020\u001f¢\u0006\u0002\u0010 R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0004R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006!"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "tls", "", "(Z)V", "connectionSpec", "Lokhttp3/ConnectionSpec;", "(Lokhttp3/ConnectionSpec;)V", "cipherSuites", "", "", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "supportsTlsExtensions", "getSupportsTlsExtensions$okhttp", "()Z", "setSupportsTlsExtensions$okhttp", "getTls$okhttp", "setTls$okhttp", "tlsVersions", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "allEnabledCipherSuites", "allEnabledTlsVersions", "build", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/CipherSuite;", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/TlsVersion;", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private java.lang.String[] tlsVersions;

        /* JADX INFO: renamed from: getTls$okhttp, reason: from getter */
        public final boolean getTls() {
            return this.tls;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        /* JADX INFO: renamed from: getCipherSuites$okhttp, reason: from getter */
        public final java.lang.String[] getCipherSuites() {
            return this.cipherSuites;
        }

        public final void setCipherSuites$okhttp(java.lang.String[] strArr) {
            this.cipherSuites = strArr;
        }

        /* JADX INFO: renamed from: getTlsVersions$okhttp, reason: from getter */
        public final java.lang.String[] getTlsVersions() {
            return this.tlsVersions;
        }

        public final void setTlsVersions$okhttp(java.lang.String[] strArr) {
            this.tlsVersions = strArr;
        }

        /* JADX INFO: renamed from: getSupportsTlsExtensions$okhttp, reason: from getter */
        public final boolean getSupportsTlsExtensions() {
            return this.supportsTlsExtensions;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public Builder(boolean z) {
            this.tls = z;
        }

        public Builder(okhttp3.ConnectionSpec connectionSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.cipherSuites = null;
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(okhttp3.CipherSuite... cipherSuites) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(cipherSuites.length);
            for (okhttp3.CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.javaName());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return cipherSuites((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(java.lang.String... cipherSuites) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new java.lang.IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.cipherSuites = (java.lang.String[]) cipherSuites.clone();
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.tlsVersions = null;
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(okhttp3.TlsVersion... tlsVersions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(tlsVersions.length);
            for (okhttp3.TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return tlsVersions((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(java.lang.String... tlsVersions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new java.lang.IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.tlsVersions = (java.lang.String[]) tlsVersions.clone();
            return this;
        }

        @kotlin.Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        public final okhttp3.ConnectionSpec build() {
            return new okhttp3.ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }
    }

    static {
        okhttp3.CipherSuite[] cipherSuiteArr = {okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        okhttp3.CipherSuite[] cipherSuiteArr2 = {okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        RESTRICTED_TLS = new okhttp3.ConnectionSpec.Builder(true).cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        MODERN_TLS = new okhttp3.ConnectionSpec.Builder(true).cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new okhttp3.ConnectionSpec.Builder(true).cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2, okhttp3.TlsVersion.TLS_1_1, okhttp3.TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new okhttp3.ConnectionSpec.Builder(false).build();
    }
}
