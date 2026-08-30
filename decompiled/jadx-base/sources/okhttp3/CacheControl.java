package okhttp3;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheControl {
    private java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CacheControl.Companion INSTANCE = new okhttp3.CacheControl.Companion(null);
    public static final okhttp3.CacheControl FORCE_NETWORK = new okhttp3.CacheControl.Builder().noCache().build();
    public static final okhttp3.CacheControl FORCE_CACHE = new okhttp3.CacheControl.Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, java.util.concurrent.TimeUnit.SECONDS).build();

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.CacheControl parse(okhttp3.Headers headers) {
        return INSTANCE.parse(headers);
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, java.lang.String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    public java.lang.String toString() {
        java.lang.String str = this.headerValue;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=").append(this.maxAgeSeconds).append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=").append(this.sMaxAgeSeconds).append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=").append(this.maxStaleSeconds).append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=").append(this.minFreshSeconds).append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final okhttp3.CacheControl.Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final okhttp3.CacheControl.Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final okhttp3.CacheControl.Builder maxAge(int maxAge, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (!(maxAge >= 0)) {
                throw new java.lang.IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
            return this;
        }

        public final okhttp3.CacheControl.Builder maxStale(int maxStale, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (!(maxStale >= 0)) {
                throw new java.lang.IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final okhttp3.CacheControl.Builder minFresh(int minFresh, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (!(minFresh >= 0)) {
                throw new java.lang.IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
            return this;
        }

        public final okhttp3.CacheControl.Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final okhttp3.CacheControl.Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final okhttp3.CacheControl.Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final okhttp3.CacheControl build() {
            return new okhttp3.CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0069  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:43:0x0103  */
        /* JADX WARN: Code duplicated, block: B:44:0x0109  */
        /* JADX WARN: Code duplicated, block: B:46:0x0111  */
        /* JADX WARN: Code duplicated, block: B:47:0x0116  */
        /* JADX WARN: Code duplicated, block: B:49:0x011e  */
        /* JADX WARN: Code duplicated, block: B:50:0x0123  */
        /* JADX WARN: Code duplicated, block: B:52:0x012b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0131  */
        /* JADX WARN: Code duplicated, block: B:55:0x0139  */
        /* JADX WARN: Code duplicated, block: B:56:0x0141  */
        /* JADX WARN: Code duplicated, block: B:58:0x0149  */
        /* JADX WARN: Code duplicated, block: B:59:0x014f  */
        /* JADX WARN: Code duplicated, block: B:61:0x0158  */
        /* JADX WARN: Code duplicated, block: B:62:0x015f  */
        /* JADX WARN: Code duplicated, block: B:64:0x0167  */
        /* JADX WARN: Code duplicated, block: B:65:0x016e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0176  */
        @kotlin.jvm.JvmStatic
        public final okhttp3.CacheControl parse(okhttp3.Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            java.lang.String string;
            int i;
            java.lang.String string2;
            okhttp3.Headers headers2 = headers;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers.size();
            boolean z = true;
            boolean z2 = true;
            int i2 = 0;
            java.lang.String str = null;
            boolean z3 = false;
            boolean z4 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                java.lang.String strName = headers2.name(i2);
                java.lang.String strValue = headers2.value(i2);
                if (!kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.CACHE_CONTROL, z)) {
                    if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.PRAGMA, z)) {
                    }
                    i2++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        java.lang.String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = kotlin.text.StringsKt.trim((java.lang.CharSequence) strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = okhttp3.internal.Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace < strValue.length() && strValue.charAt(iIndexOfNonWhitespace) == '\"') {
                                    int i3 = iIndexOfNonWhitespace + 1;
                                    int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) strValue, kotlin.text.Typography.quote, i3, false, 4, (java.lang.Object) null);
                                    string2 = strValue.substring(i3, iIndexOf$default);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iIndexOf$default + 1;
                                } else {
                                    iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                    java.lang.String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) strSubstring2).toString();
                                }
                            }
                            z = true;
                            if (kotlin.text.StringsKt.equals("no-cache", string, true)) {
                                z3 = true;
                            } else if (kotlin.text.StringsKt.equals("no-store", string, true)) {
                                z4 = true;
                            } else if (kotlin.text.StringsKt.equals("max-age", string, true)) {
                                nonNegativeInt = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                            } else if (kotlin.text.StringsKt.equals("s-maxage", string, true)) {
                                nonNegativeInt2 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                            } else if (kotlin.text.StringsKt.equals("private", string, true)) {
                                z5 = true;
                            } else if (kotlin.text.StringsKt.equals("public", string, true)) {
                                z6 = true;
                            } else if (kotlin.text.StringsKt.equals("must-revalidate", string, true)) {
                                z7 = true;
                            } else if (kotlin.text.StringsKt.equals("max-stale", string, true)) {
                                nonNegativeInt3 = okhttp3.internal.Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (kotlin.text.StringsKt.equals("min-fresh", string, true)) {
                                nonNegativeInt4 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                            } else if (kotlin.text.StringsKt.equals("only-if-cached", string, true)) {
                                z8 = true;
                            } else if (kotlin.text.StringsKt.equals("no-transform", string, true)) {
                                z9 = true;
                            } else if (kotlin.text.StringsKt.equals("immutable", string, true)) {
                                z10 = true;
                            }
                            size = i;
                        } else {
                            i = size;
                        }
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        z = true;
                        if (kotlin.text.StringsKt.equals("no-cache", string, true)) {
                            z3 = true;
                        } else if (kotlin.text.StringsKt.equals("no-store", string, true)) {
                            z4 = true;
                        } else if (kotlin.text.StringsKt.equals("max-age", string, true)) {
                            nonNegativeInt = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("s-maxage", string, true)) {
                            nonNegativeInt2 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("private", string, true)) {
                            z5 = true;
                        } else if (kotlin.text.StringsKt.equals("public", string, true)) {
                            z6 = true;
                        } else if (kotlin.text.StringsKt.equals("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (kotlin.text.StringsKt.equals("max-stale", string, true)) {
                            nonNegativeInt3 = okhttp3.internal.Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (kotlin.text.StringsKt.equals("min-fresh", string, true)) {
                            nonNegativeInt4 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (kotlin.text.StringsKt.equals("no-transform", string, true)) {
                            z9 = true;
                        } else if (kotlin.text.StringsKt.equals("immutable", string, true)) {
                            z10 = true;
                        }
                        size = i;
                    }
                    i2++;
                    headers2 = headers;
                    size = size;
                }
                z2 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    java.lang.String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = kotlin.text.StringsKt.trim((java.lang.CharSequence) strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        z = true;
                        if (kotlin.text.StringsKt.equals("no-cache", string, true)) {
                            z3 = true;
                        } else if (kotlin.text.StringsKt.equals("no-store", string, true)) {
                            z4 = true;
                        } else if (kotlin.text.StringsKt.equals("max-age", string, true)) {
                            nonNegativeInt = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("s-maxage", string, true)) {
                            nonNegativeInt2 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("private", string, true)) {
                            z5 = true;
                        } else if (kotlin.text.StringsKt.equals("public", string, true)) {
                            z6 = true;
                        } else if (kotlin.text.StringsKt.equals("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (kotlin.text.StringsKt.equals("max-stale", string, true)) {
                            nonNegativeInt3 = okhttp3.internal.Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (kotlin.text.StringsKt.equals("min-fresh", string, true)) {
                            nonNegativeInt4 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                        } else if (kotlin.text.StringsKt.equals("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (kotlin.text.StringsKt.equals("no-transform", string, true)) {
                            z9 = true;
                        } else if (kotlin.text.StringsKt.equals("immutable", string, true)) {
                            z10 = true;
                        }
                        size = i;
                    } else {
                        i = size;
                    }
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    z = true;
                    if (kotlin.text.StringsKt.equals("no-cache", string, true)) {
                        z3 = true;
                    } else if (kotlin.text.StringsKt.equals("no-store", string, true)) {
                        z4 = true;
                    } else if (kotlin.text.StringsKt.equals("max-age", string, true)) {
                        nonNegativeInt = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                    } else if (kotlin.text.StringsKt.equals("s-maxage", string, true)) {
                        nonNegativeInt2 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                    } else if (kotlin.text.StringsKt.equals("private", string, true)) {
                        z5 = true;
                    } else if (kotlin.text.StringsKt.equals("public", string, true)) {
                        z6 = true;
                    } else if (kotlin.text.StringsKt.equals("must-revalidate", string, true)) {
                        z7 = true;
                    } else if (kotlin.text.StringsKt.equals("max-stale", string, true)) {
                        nonNegativeInt3 = okhttp3.internal.Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if (kotlin.text.StringsKt.equals("min-fresh", string, true)) {
                        nonNegativeInt4 = okhttp3.internal.Util.toNonNegativeInt(string2, -1);
                    } else if (kotlin.text.StringsKt.equals("only-if-cached", string, true)) {
                        z8 = true;
                    } else if (kotlin.text.StringsKt.equals("no-transform", string, true)) {
                        z9 = true;
                    } else if (kotlin.text.StringsKt.equals("immutable", string, true)) {
                        z10 = true;
                    }
                    size = i;
                }
                i2++;
                headers2 = headers;
                size = size;
            }
            return new okhttp3.CacheControl(z3, z4, nonNegativeInt, nonNegativeInt2, z5, z6, z7, nonNegativeInt3, nonNegativeInt4, z8, z9, z10, !z2 ? null : str, null);
        }

        static /* synthetic */ int indexOfElement$default(okhttp3.CacheControl.Companion companion, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        private final int indexOfElement(java.lang.String str, java.lang.String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, str.charAt(i), false, 2, (java.lang.Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }
    }
}
