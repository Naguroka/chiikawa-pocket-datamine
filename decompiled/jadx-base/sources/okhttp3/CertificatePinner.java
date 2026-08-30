package okhttp3;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CertificatePinner.Companion INSTANCE = new okhttp3.CertificatePinner.Companion(null);
    public static final okhttp3.CertificatePinner DEFAULT = new okhttp3.CertificatePinner.Builder().build();
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    @kotlin.jvm.JvmStatic
    public static final java.lang.String pin(java.security.cert.Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha1Hash(java.security.cert.X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha256Hash(java.security.cert.X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public CertificatePinner(java.util.Set<okhttp3.CertificatePinner.Pin> pins, okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(java.util.Set set, okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    public final java.util.Set<okhttp3.CertificatePinner.Pin> getPins() {
        return this.pins;
    }

    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final void check(final java.lang.String hostname, final java.util.List<? extends java.security.cert.Certificate> peerCertificates) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.X509Certificate>>() { // from class: okhttp3.CertificatePinner.check.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends java.security.cert.X509Certificate> invoke() {
                java.util.List<java.security.cert.Certificate> listClean;
                okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = okhttp3.CertificatePinner.this.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (listClean = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    listClean = peerCertificates;
                }
                java.util.List<java.security.cert.Certificate> list = listClean;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (java.security.cert.Certificate certificate : list) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((java.security.cert.X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(java.lang.String hostname, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> cleanedPeerCertificatesFn) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        java.util.List<okhttp3.CertificatePinner.Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        java.util.List<? extends java.security.cert.X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (java.security.cert.X509Certificate x509Certificate : listInvoke) {
            okio.ByteString byteStringSha256Hash = null;
            okio.ByteString byteStringSha1Hash = null;
            for (okhttp3.CertificatePinner.Pin pin : listFindMatchingPins) {
                java.lang.String hashAlgorithm = pin.getHashAlgorithm();
                if (kotlin.jvm.internal.Intrinsics.areEqual(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                } else {
                    throw new java.lang.AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (java.security.cert.X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(INSTANCE.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (okhttp3.CertificatePinner.Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new javax.net.ssl.SSLPeerUnverifiedException(string);
    }

    @kotlin.Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @kotlin.ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(java.lang.String hostname, java.security.cert.Certificate... peerCertificates) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, kotlin.collections.ArraysKt.toList(peerCertificates));
    }

    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        java.util.Set<okhttp3.CertificatePinner.Pin> set = this.pins;
        java.util.ArrayList arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
        for (java.lang.Object obj : set) {
            if (((okhttp3.CertificatePinner.Pin) obj).matchesHostname(hostname)) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new java.util.ArrayList();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                kotlin.jvm.internal.TypeIntrinsics.asMutableList(arrayListEmptyList).add(obj);
            }
        }
        return arrayListEmptyList;
    }

    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new okhttp3.CertificatePinner(this.pins, certificateChainCleaner);
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.CertificatePinner) {
            okhttp3.CertificatePinner certificatePinner = (okhttp3.CertificatePinner) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner.pins, this.pins) && kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pin {
        private final okio.ByteString hash;
        private final java.lang.String hashAlgorithm;
        private final java.lang.String pattern;

        public Pin(java.lang.String pattern, java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "pin");
            if (!((kotlin.text.StringsKt.startsWith$default(pattern, "*.", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) pattern, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 1, false, 4, (java.lang.Object) null) == -1) || (kotlin.text.StringsKt.startsWith$default(pattern, "**.", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) pattern, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 2, false, 4, (java.lang.Object) null) == -1) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) pattern, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (java.lang.Object) null) == -1)) {
                throw new java.lang.IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost != null) {
                this.pattern = canonicalHost;
                if (kotlin.text.StringsKt.startsWith$default(pin, "sha1/", false, 2, (java.lang.Object) null)) {
                    this.hashAlgorithm = "sha1";
                    okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
                    java.lang.String strSubstring = pin.substring(5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    okio.ByteString byteStringDecodeBase64 = companion.decodeBase64(strSubstring);
                    if (byteStringDecodeBase64 == null) {
                        throw new java.lang.IllegalArgumentException("Invalid pin hash: " + pin);
                    }
                    this.hash = byteStringDecodeBase64;
                    return;
                }
                if (kotlin.text.StringsKt.startsWith$default(pin, "sha256/", false, 2, (java.lang.Object) null)) {
                    this.hashAlgorithm = "sha256";
                    okio.ByteString.Companion companion2 = okio.ByteString.INSTANCE;
                    java.lang.String strSubstring2 = pin.substring(7);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    okio.ByteString byteStringDecodeBase65 = companion2.decodeBase64(strSubstring2);
                    if (byteStringDecodeBase65 == null) {
                        throw new java.lang.IllegalArgumentException("Invalid pin hash: " + pin);
                    }
                    this.hash = byteStringDecodeBase65;
                    return;
                }
                throw new java.lang.IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            throw new java.lang.IllegalArgumentException("Invalid pattern: " + pattern);
        }

        public final java.lang.String getPattern() {
            return this.pattern;
        }

        public final java.lang.String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final okio.ByteString getHash() {
            return this.hash;
        }

        public final boolean matchesHostname(java.lang.String hostname) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (kotlin.text.StringsKt.startsWith$default(this.pattern, "**.", false, 2, (java.lang.Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!kotlin.text.StringsKt.regionMatches$default(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, (java.lang.Object) null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (kotlin.text.StringsKt.startsWith$default(this.pattern, "*.", false, 2, (java.lang.Object) null)) {
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!kotlin.text.StringsKt.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, (java.lang.Object) null) || kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) hostname, '.', length4 - 1, false, 4, (java.lang.Object) null) != -1) {
                    return false;
                }
            } else {
                return kotlin.jvm.internal.Intrinsics.areEqual(hostname, this.pattern);
            }
            return true;
        }

        public final boolean matchesCertificate(java.security.cert.X509Certificate certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "certificate");
            java.lang.String str = this.hashAlgorithm;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "sha256")) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.hash, okhttp3.CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "sha1")) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.hash, okhttp3.CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public java.lang.String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof okhttp3.CertificatePinner.Pin)) {
                return false;
            }
            okhttp3.CertificatePinner.Pin pin = (okhttp3.CertificatePinner.Pin) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pattern, pin.pattern) && kotlin.jvm.internal.Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && kotlin.jvm.internal.Intrinsics.areEqual(this.hash, pin.hash);
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins = new java.util.ArrayList();

        public final java.util.List<okhttp3.CertificatePinner.Pin> getPins() {
            return this.pins;
        }

        public final okhttp3.CertificatePinner.Builder add(java.lang.String pattern, java.lang.String... pins) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pins, "pins");
            for (java.lang.String str : pins) {
                this.pins.add(new okhttp3.CertificatePinner.Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final okhttp3.CertificatePinner build() {
            return new okhttp3.CertificatePinner(kotlin.collections.CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha1Hash(java.security.cert.X509Certificate x509Certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return okio.ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha256Hash(java.security.cert.X509Certificate x509Certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return okio.ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String pin(java.security.cert.Certificate certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof java.security.cert.X509Certificate)) {
                throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + sha256Hash((java.security.cert.X509Certificate) certificate).base64();
        }
    }
}
