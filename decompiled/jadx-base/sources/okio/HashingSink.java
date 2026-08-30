package okio;

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "digest", "Ljava/security/MessageDigest;", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Sink;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Sink;Ljavax/crypto/Mac;)V", com.ironsource.y8.h.W, "Lokio/ByteString;", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSink extends okio.ForwardingSink implements okio.Sink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.HashingSink.Companion INSTANCE = new okio.HashingSink.Companion(null);
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha1(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha1(sink, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha256(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha256(sink, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha512(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha512(sink, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink md5(okio.Sink sink) {
        return INSTANCE.md5(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha1(okio.Sink sink) {
        return INSTANCE.sha1(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha256(okio.Sink sink) {
        return INSTANCE.sha256(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha512(okio.Sink sink) {
        return INSTANCE.sha512(sink);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(okio.Sink sink, java.security.MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(okio.Sink sink, java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(okio.Sink sink, javax.crypto.Mac mac) {
        super(sink);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(okio.Sink sink, okio.ByteString key, java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
            this(sink, mac);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        okio.Segment segment = source.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        long j = 0;
        while (j < byteCount) {
            int iMin = (int) java.lang.Math.min(byteCount - j, segment.limit - segment.pos);
            java.security.MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                javax.crypto.Mac mac = this.mac;
                kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j += (long) iMin;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        }
        super.write(source, byteCount);
    }

    public final okio.ByteString hash() {
        byte[] bArrDoFinal;
        java.security.MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            javax.crypto.Mac mac = this.mac;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bArrDoFinal);
        return new okio.ByteString(bArrDoFinal);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m3029deprecated_hash() {
        return hash();
    }

    /* JADX INFO: compiled from: HashingSink.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", com.ironsource.y8.h.W, "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink md5(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            return new okio.HashingSink(sink, "MD5");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha1(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            return new okio.HashingSink(sink, com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha256(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            return new okio.HashingSink(sink, "SHA-256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha512(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            return new okio.HashingSink(sink, "SHA-512");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha1(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSink(sink, key, "HmacSHA1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha256(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSink(sink, key, "HmacSHA256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha512(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSink(sink, key, "HmacSHA512");
        }
    }
}
