package okhttp3;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR!\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, d2 = {"Lokhttp3/Challenge;", "", "scheme", "", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "authParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/util/Map;", com.json.zb.M, "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "()Ljava/lang/String;", "-deprecated_authParams", "-deprecated_charset", "equals", "", "other", "hashCode", "", "-deprecated_realm", "-deprecated_scheme", "toString", "withCharset", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Challenge {
    private final java.util.Map<java.lang.String, java.lang.String> authParams;
    private final java.lang.String scheme;

    public Challenge(java.lang.String scheme, java.util.Map<java.lang.String, java.lang.String> authParams) {
        java.lang.String lowerCase;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.scheme = scheme;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : authParams.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key != null) {
                java.util.Locale US = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        java.util.Map<java.lang.String, java.lang.String> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    public final java.lang.String scheme() {
        return this.scheme;
    }

    public final java.util.Map<java.lang.String, java.lang.String> authParams() {
        return this.authParams;
    }

    public final java.lang.String realm() {
        return this.authParams.get("realm");
    }

    public final java.nio.charset.Charset charset() {
        java.lang.String str = this.authParams.get(com.json.zb.M);
        if (str != null) {
            try {
                java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (java.lang.Exception unused) {
            }
        }
        java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(java.lang.String scheme, java.lang.String realm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realm, "realm");
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap("realm", realm);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (java.util.Map<java.lang.String, java.lang.String>) mapSingletonMap);
    }

    public final okhttp3.Challenge withCharset(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.authParams);
        java.lang.String strName = charset.name();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strName, "charset.name()");
        mutableMap.put(com.json.zb.M, strName);
        return new okhttp3.Challenge(this.scheme, (java.util.Map<java.lang.String, java.lang.String>) mutableMap);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authParams", imports = {}))
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final java.util.Map<java.lang.String, java.lang.String> m2896deprecated_authParams() {
        return this.authParams;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "realm", imports = {}))
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final java.lang.String m2898deprecated_realm() {
        return realm();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.json.zb.M, imports = {}))
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final java.nio.charset.Charset m2897deprecated_charset() {
        return charset();
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.Challenge) {
            okhttp3.Challenge challenge = (okhttp3.Challenge) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(challenge.scheme, this.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public java.lang.String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }
}
