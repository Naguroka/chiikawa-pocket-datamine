package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @java.lang.Deprecated
    public final long absoluteStreamPosition;
    public final java.lang.Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
    public final java.lang.String key;
    public final long length;
    public final long position;
    public final android.net.Uri uri;
    public final long uriPositionOffset;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.datasource");
    }

    public static final class Builder {
        private java.lang.Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
        private java.lang.String key;
        private long length;
        private long position;
        private android.net.Uri uri;
        private long uriPositionOffset;

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = java.util.Collections.emptyMap();
            this.length = -1L;
        }

        private Builder(androidx.media3.datasource.DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        public androidx.media3.datasource.DataSpec.Builder setUri(java.lang.String str) {
            this.uri = android.net.Uri.parse(str);
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setUriPositionOffset(long j) {
            this.uriPositionOffset = j;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setKey(java.lang.String str) {
            this.key = str;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setCustomData(java.lang.Object obj) {
            this.customData = obj;
            return this;
        }

        public androidx.media3.datasource.DataSpec build() {
            androidx.media3.common.util.Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }
    }

    public static java.lang.String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new java.lang.IllegalStateException();
    }

    public DataSpec(android.net.Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(android.net.Uri uri, long j, long j2) {
        this(uri, j, j2, null);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j2, java.lang.String str) {
        this(uri, 0L, 1, null, java.util.Collections.emptyMap(), j, j2, str, 0, null);
    }

    private DataSpec(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        androidx.media3.common.util.Assertions.checkArgument(j4 >= 0);
        androidx.media3.common.util.Assertions.checkArgument(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        this.uri = (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(uri);
        this.uriPositionOffset = j;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.position = j2;
        this.absoluteStreamPosition = j4;
        this.length = j3;
        this.key = str;
        this.flags = i2;
        this.customData = obj;
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public final java.lang.String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public androidx.media3.datasource.DataSpec.Builder buildUpon() {
        return new androidx.media3.datasource.DataSpec.Builder();
    }

    public androidx.media3.datasource.DataSpec subrange(long j) {
        long j2 = this.length;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public androidx.media3.datasource.DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public androidx.media3.datasource.DataSpec withUri(android.net.Uri uri) {
        return new androidx.media3.datasource.DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public androidx.media3.datasource.DataSpec withRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public androidx.media3.datasource.DataSpec withAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2 = new java.util.HashMap(this.httpRequestHeaders);
        map2.putAll(map);
        return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map2, this.position, this.length, this.key, this.flags, this.customData);
    }

    public java.lang.String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + com.ironsource.y8.i.e;
    }
}
