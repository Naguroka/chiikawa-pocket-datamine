package okio;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "source", "digest", "Ljava/security/MessageDigest;", "(Lokio/Source;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Source;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Source;Ljavax/crypto/Mac;)V", com.ironsource.y8.h.W, "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "read", "", "sink", "Lokio/Buffer;", "byteCount", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSource extends okio.ForwardingSource implements okio.Source {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.HashingSource.Companion INSTANCE = new okio.HashingSource.Companion(null);
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha1(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha1(source, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha256(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha256(source, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha512(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha512(source, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource md5(okio.Source source) {
        return INSTANCE.md5(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha1(okio.Source source) {
        return INSTANCE.sha1(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha256(okio.Source source) {
        return INSTANCE.sha256(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha512(okio.Source source) {
        return INSTANCE.sha512(source);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(okio.Source source, java.security.MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(okio.Source source, java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(okio.Source source, javax.crypto.Mac mac) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(okio.Source source, okio.ByteString key, java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
            this(source, mac);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = super.read(sink, byteCount);
        if (j != -1) {
            long size = sink.size() - j;
            long size2 = sink.size();
            okio.Segment segment = sink.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            while (size2 > size) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i = (int) ((((long) segment.pos) + size) - size2);
                java.security.MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    javax.crypto.Mac mac = this.mac;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
                    mac.update(segment.data, i, segment.limit - i);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size = size2;
            }
        }
        return j;
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
    public final okio.ByteString m3030deprecated_hash() {
        return hash();
    }

    /* JADX INFO: compiled from: HashingSource.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSource;", "source", "Lokio/Source;", com.ironsource.y8.h.W, "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource md5(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new okio.HashingSource(source, "MD5");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha1(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new okio.HashingSource(source, com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha256(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new okio.HashingSource(source, "SHA-256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha512(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new okio.HashingSource(source, "SHA-512");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha1(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSource(source, key, "HmacSHA1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha256(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSource(source, key, "HmacSHA256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha512(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return new okio.HashingSource(source, key, "HmacSHA512");
        }
    }
}
