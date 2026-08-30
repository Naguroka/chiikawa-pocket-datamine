package okhttp3;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", com.ironsource.y8.i.D, "path", "secure", "", "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", "hashCode", "", "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cookie {
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean persistent;
    private final boolean secure;
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Cookie.Companion INSTANCE = new okhttp3.Cookie.Companion(null);
    private static final java.util.regex.Pattern YEAR_PATTERN = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final java.util.regex.Pattern MONTH_PATTERN = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final java.util.regex.Pattern DAY_OF_MONTH_PATTERN = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final java.util.regex.Pattern TIME_PATTERN = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public /* synthetic */ Cookie(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Cookie parse(okhttp3.HttpUrl httpUrl, java.lang.String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl httpUrl, okhttp3.Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    private Cookie(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public final java.lang.String name() {
        return this.name;
    }

    public final java.lang.String value() {
        return this.value;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final java.lang.String domain() {
        return this.domain;
    }

    public final java.lang.String path() {
        return this.path;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean matches(okhttp3.HttpUrl url) {
        boolean zDomainMatch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (this.hostOnly) {
            zDomainMatch = kotlin.jvm.internal.Intrinsics.areEqual(url.host(), this.domain);
        } else {
            zDomainMatch = INSTANCE.domainMatch(url.host(), this.domain);
        }
        if (zDomainMatch && INSTANCE.pathMatch(url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.Cookie) {
            okhttp3.Cookie cookie = (okhttp3.Cookie) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(cookie.name, this.name) && kotlin.jvm.internal.Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && kotlin.jvm.internal.Intrinsics.areEqual(cookie.domain, this.domain) && kotlin.jvm.internal.Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + java.lang.Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + java.lang.Boolean.hashCode(this.secure)) * 31) + java.lang.Boolean.hashCode(this.httpOnly)) * 31) + java.lang.Boolean.hashCode(this.persistent)) * 31) + java.lang.Boolean.hashCode(this.hostOnly);
    }

    public java.lang.String toString() {
        return toString$okhttp(false);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "name", imports = {}))
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "value", imports = {}))
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "persistent", imports = {}))
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "expiresAt", imports = {}))
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.ironsource.y8.i.D, imports = {}))
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "path", imports = {}))
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "httpOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "secure", imports = {}))
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    public final java.lang.String toString$okhttp(boolean forObsoleteRfc2965) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(okhttp3.internal.http.DatesKt.toHttpDateString(new java.util.Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=").append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    /* JADX INFO: compiled from: Cookie.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "()V", com.ironsource.y8.i.D, "", "expiresAt", "", "hostOnly", "", "httpOnly", "name", "path", "persistent", "secure", "value", "build", "Lokhttp3/Cookie;", "hostOnlyDomain", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private java.lang.String name;
        private boolean persistent;
        private boolean secure;
        private java.lang.String value;
        private long expiresAt = okhttp3.internal.http.DatesKt.MAX_DATE;
        private java.lang.String path = "/";

        public final okhttp3.Cookie.Builder name(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim((java.lang.CharSequence) name).toString(), name)) {
                throw new java.lang.IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        public final okhttp3.Cookie.Builder value(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim((java.lang.CharSequence) value).toString(), value)) {
                throw new java.lang.IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }

        public final okhttp3.Cookie.Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > okhttp3.internal.http.DatesKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        public final okhttp3.Cookie.Builder domain(java.lang.String domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
            return domain(domain, false);
        }

        public final okhttp3.Cookie.Builder hostOnlyDomain(java.lang.String domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
            return domain(domain, true);
        }

        private final okhttp3.Cookie.Builder domain(java.lang.String domain, boolean hostOnly) {
            java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected domain: " + domain);
            }
            this.domain = canonicalHost;
            this.hostOnly = hostOnly;
            return this;
        }

        public final okhttp3.Cookie.Builder path(java.lang.String path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            if (!kotlin.text.StringsKt.startsWith$default(path, "/", false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        public final okhttp3.Cookie.Builder secure() {
            this.secure = true;
            return this;
        }

        public final okhttp3.Cookie.Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final okhttp3.Cookie build() {
            java.lang.String str = this.name;
            if (str == null) {
                throw new java.lang.NullPointerException("builder.name == null");
            }
            java.lang.String str2 = this.value;
            if (str2 == null) {
                throw new java.lang.NullPointerException("builder.value == null");
            }
            long j = this.expiresAt;
            java.lang.String str3 = this.domain;
            if (str3 != null) {
                return new okhttp3.Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new java.lang.NullPointerException("builder.domain == null");
        }
    }

    /* JADX INFO: compiled from: Cookie.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", "", "input", "", "pos", "limit", "invert", "", "domainMatch", "urlHost", com.ironsource.y8.i.D, "parse", "Lokhttp3/Cookie;", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", "", "headers", "Lokhttp3/Headers;", "parseDomain", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "parseExpires", "parseMaxAge", "pathMatch", "path", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(java.lang.String urlHost, java.lang.String domain) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(urlHost, domain)) {
                return true;
            }
            return kotlin.text.StringsKt.endsWith$default(urlHost, domain, false, 2, (java.lang.Object) null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !okhttp3.internal.Util.canParseAsIpAddress(urlHost);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(okhttp3.HttpUrl url, java.lang.String path) {
            java.lang.String strEncodedPath = url.encodedPath();
            if (kotlin.jvm.internal.Intrinsics.areEqual(strEncodedPath, path)) {
                return true;
            }
            return kotlin.text.StringsKt.startsWith$default(strEncodedPath, path, false, 2, (java.lang.Object) null) && (kotlin.text.StringsKt.endsWith$default(path, "/", false, 2, (java.lang.Object) null) || strEncodedPath.charAt(path.length()) == '/');
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Cookie parse(okhttp3.HttpUrl url, java.lang.String setCookie) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(java.lang.System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00df A[PHI: r1
  0x00df: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00dd, B:56:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        public final okhttp3.Cookie parse$okhttp(long currentTimeMillis, okhttp3.HttpUrl url, java.lang.String setCookie) {
            long j;
            long j2;
            okhttp3.Cookie cookie;
            java.lang.String str;
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iDelimiterOffset$default = okhttp3.internal.Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (java.lang.Object) null);
            int iDelimiterOffset$default2 = okhttp3.internal.Util.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (java.lang.Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            java.lang.String strTrimSubstring$default = okhttp3.internal.Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if ((strTrimSubstring$default.length() == 0) || okhttp3.internal.Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            java.lang.String strTrimSubstring = okhttp3.internal.Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (okhttp3.internal.Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            java.lang.String domain = null;
            java.lang.String str3 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long maxAge = -1;
            long expires = okhttp3.internal.http.DatesKt.MAX_DATE;
            while (i < length) {
                int iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(setCookie, ';', i, length);
                int iDelimiterOffset2 = okhttp3.internal.Util.delimiterOffset(setCookie, '=', i, iDelimiterOffset);
                java.lang.String strTrimSubstring2 = okhttp3.internal.Util.trimSubstring(setCookie, i, iDelimiterOffset2);
                java.lang.String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? okhttp3.internal.Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (kotlin.text.StringsKt.equals(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z3 = true;
                    } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
                    }
                } else if (kotlin.text.StringsKt.equals(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z3 = true;
                } else if (kotlin.text.StringsKt.equals(strTrimSubstring2, com.ironsource.y8.i.D, true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z4 = false;
                } else if (kotlin.text.StringsKt.equals(strTrimSubstring2, "path", true)) {
                    str3 = strTrimSubstring3;
                } else if (kotlin.text.StringsKt.equals(strTrimSubstring2, "secure", true)) {
                    z = true;
                } else if (kotlin.text.StringsKt.equals(strTrimSubstring2, "httponly", true)) {
                    z2 = true;
                }
                i = iDelimiterOffset + 1;
            }
            long j3 = Long.MIN_VALUE;
            if (maxAge == Long.MIN_VALUE) {
                j = j3;
            } else if (maxAge != -1) {
                j3 = currentTimeMillis + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                if (j3 >= currentTimeMillis) {
                    j2 = okhttp3.internal.http.DatesKt.MAX_DATE;
                    if (j3 <= okhttp3.internal.http.DatesKt.MAX_DATE) {
                        j = j3;
                    }
                } else {
                    j2 = okhttp3.internal.http.DatesKt.MAX_DATE;
                }
                j = j2;
            } else {
                j = expires;
            }
            java.lang.String strHost = url.host();
            if (domain == null) {
                str = strHost;
                cookie = null;
            } else {
                if (!domainMatch(strHost, domain)) {
                    return null;
                }
                cookie = null;
                str = domain;
            }
            if (strHost.length() != str.length() && okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                return cookie;
            }
            java.lang.String strSubstring = "/";
            java.lang.String str4 = str3;
            if (str4 == null || !kotlin.text.StringsKt.startsWith$default(str4, "/", false, 2, (java.lang.Object) cookie)) {
                java.lang.String strEncodedPath = url.encodedPath();
                int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) strEncodedPath, '/', 0, false, 6, (java.lang.Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new okhttp3.Cookie(strTrimSubstring$default, strTrimSubstring, j, str, str2, z, z2, z3, z4, null);
        }

        private final long parseExpires(java.lang.String s, int pos, int limit) {
            int iDateCharacterOffset = dateCharacterOffset(s, pos, limit, false);
            java.util.regex.Matcher matcher = okhttp3.Cookie.TIME_PATTERN.matcher(s);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int iIndexOf$default = -1;
            int i4 = -1;
            int i5 = -1;
            while (iDateCharacterOffset < limit) {
                int iDateCharacterOffset2 = dateCharacterOffset(s, iDateCharacterOffset + 1, limit, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i2 != -1 || !matcher.usePattern(okhttp3.Cookie.TIME_PATTERN).matches()) {
                    if (i3 != -1 || !matcher.usePattern(okhttp3.Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                        if (iIndexOf$default != -1 || !matcher.usePattern(okhttp3.Cookie.MONTH_PATTERN).matches()) {
                            if (i == -1 && matcher.usePattern(okhttp3.Cookie.YEAR_PATTERN).matches()) {
                                java.lang.String strGroup = matcher.group(1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                                i = java.lang.Integer.parseInt(strGroup);
                            }
                        } else {
                            java.lang.String strGroup2 = matcher.group(1);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(1)");
                            java.util.Locale US = java.util.Locale.US;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
                            java.lang.String lowerCase = strGroup2.toLowerCase(US);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            java.lang.String strPattern = okhttp3.Cookie.MONTH_PATTERN.pattern();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                            iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) strPattern, lowerCase, 0, false, 6, (java.lang.Object) null) / 4;
                        }
                    } else {
                        java.lang.String strGroup3 = matcher.group(1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(1)");
                        i3 = java.lang.Integer.parseInt(strGroup3);
                    }
                } else {
                    java.lang.String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i2 = java.lang.Integer.parseInt(strGroup4);
                    java.lang.String strGroup5 = matcher.group(2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(2)");
                    i4 = java.lang.Integer.parseInt(strGroup5);
                    java.lang.String strGroup6 = matcher.group(3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(3)");
                    i5 = java.lang.Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(s, iDateCharacterOffset2 + 1, limit, false);
            }
            if (70 <= i && i < 100) {
                i += 1900;
            }
            if (i >= 0 && i < 70) {
                i += 2000;
            }
            if (!(i >= 1601)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i3 && i3 < 32)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i2 >= 0 && i2 < 24)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && i4 < 60)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && i5 < 60)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(okhttp3.internal.Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i4);
            gregorianCalendar.set(13, i5);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX WARN: Code duplicated, block: B:30:0x003d  */
        private final int dateCharacterOffset(java.lang.String input, int pos, int limit, boolean invert) {
            boolean z;
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!('0' <= cCharAt && cCharAt < ':')) {
                        if (!('a' <= cCharAt && cCharAt < '{')) {
                            z = ('A' <= cCharAt && cCharAt < '[') || cCharAt == ':';
                        }
                    }
                }
                if (z == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        private final long parseMaxAge(java.lang.String s) {
            try {
                long j = java.lang.Long.parseLong(s);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (java.lang.NumberFormatException e) {
                if (new kotlin.text.Regex("-?\\d+").matches(s)) {
                    return kotlin.text.StringsKt.startsWith$default(s, "-", false, 2, (java.lang.Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        private final java.lang.String parseDomain(java.lang.String s) {
            if (!(!kotlin.text.StringsKt.endsWith$default(s, ".", false, 2, (java.lang.Object) null))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(kotlin.text.StringsKt.removePrefix(s, (java.lang.CharSequence) "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl url, okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            java.util.List<java.lang.String> listValues = headers.values(com.google.common.net.HttpHeaders.SET_COOKIE);
            int size = listValues.size();
            java.util.ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                okhttp3.Cookie cookie = parse(url, listValues.get(i));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList != null) {
                java.util.List<okhttp3.Cookie> listUnmodifiableList = java.util.Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
                return listUnmodifiableList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
