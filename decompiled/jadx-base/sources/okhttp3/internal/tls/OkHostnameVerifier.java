package okhttp3.internal.tls;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = new okhttp3.internal.tls.OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String host, javax.net.ssl.SSLSession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            java.security.cert.Certificate certificate = session.getPeerCertificates()[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (java.security.cert.X509Certificate) certificate);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }

    public final boolean verify(java.lang.String host, java.security.cert.X509Certificate certificate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "certificate");
        return okhttp3.internal.Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyIpAddress(java.lang.String ipAddress, java.security.cert.X509Certificate certificate) {
        java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(ipAddress);
        java.util.List<java.lang.String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if ((subjectAltNames instanceof java.util.Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalHost, okhttp3.internal.HostnamesKt.toCanonicalHost((java.lang.String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyHostname(java.lang.String hostname, java.security.cert.X509Certificate certificate) {
        java.lang.String strAsciiToLowercase = asciiToLowercase(hostname);
        java.util.List<java.lang.String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if ((subjectAltNames instanceof java.util.Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final java.lang.String asciiToLowercase(java.lang.String str) {
        if (!isAscii(str)) {
            return str;
        }
        java.util.Locale US = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
        java.lang.String lowerCase = str.toLowerCase(US);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final boolean isAscii(java.lang.String str) {
        return str.length() == ((int) okio.Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(java.lang.String hostname, java.lang.String pattern) {
        java.lang.String str = hostname;
        if (!(str == null || str.length() == 0) && !kotlin.text.StringsKt.startsWith$default(hostname, ".", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(hostname, "..", false, 2, (java.lang.Object) null)) {
            java.lang.String str2 = pattern;
            if (!(str2 == null || str2.length() == 0) && !kotlin.text.StringsKt.startsWith$default(pattern, ".", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(pattern, "..", false, 2, (java.lang.Object) null)) {
                if (!kotlin.text.StringsKt.endsWith$default(hostname, ".", false, 2, (java.lang.Object) null)) {
                    hostname = hostname + '.';
                }
                if (!kotlin.text.StringsKt.endsWith$default(pattern, ".", false, 2, (java.lang.Object) null)) {
                    pattern = pattern + '.';
                }
                java.lang.String strAsciiToLowercase = asciiToLowercase(pattern);
                java.lang.String str3 = strAsciiToLowercase;
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (java.lang.Object) null)) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(hostname, strAsciiToLowercase);
                }
                if (!kotlin.text.StringsKt.startsWith$default(strAsciiToLowercase, "*.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '*', 1, false, 4, (java.lang.Object) null) != -1 || hostname.length() < strAsciiToLowercase.length() || kotlin.jvm.internal.Intrinsics.areEqual("*.", strAsciiToLowercase)) {
                    return false;
                }
                java.lang.String strSubstring = strAsciiToLowercase.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!kotlin.text.StringsKt.endsWith$default(hostname, strSubstring, false, 2, (java.lang.Object) null)) {
                    return false;
                }
                int length = hostname.length() - strSubstring.length();
                return length <= 0 || kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) hostname, '.', length + (-1), false, 4, (java.lang.Object) null) == -1;
            }
        }
        return false;
    }

    public final java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate certificate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "certificate");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getSubjectAltNames(certificate, 7), (java.lang.Iterable) getSubjectAltNames(certificate, 2));
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate certificate, int type) {
        java.lang.Object obj;
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && kotlin.jvm.internal.Intrinsics.areEqual(list.get(0), java.lang.Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((java.lang.String) obj);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
