package okhttp3.internal.http2;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {
    public final int hpackSize;
    public final okio.ByteString name;
    public final okio.ByteString value;
    public static final okio.ByteString PSEUDO_PREFIX = okio.ByteString.INSTANCE.encodeUtf8(":");
    public static final java.lang.String RESPONSE_STATUS_UTF8 = ":status";
    public static final okio.ByteString RESPONSE_STATUS = okio.ByteString.INSTANCE.encodeUtf8(RESPONSE_STATUS_UTF8);
    public static final java.lang.String TARGET_METHOD_UTF8 = ":method";
    public static final okio.ByteString TARGET_METHOD = okio.ByteString.INSTANCE.encodeUtf8(TARGET_METHOD_UTF8);
    public static final java.lang.String TARGET_PATH_UTF8 = ":path";
    public static final okio.ByteString TARGET_PATH = okio.ByteString.INSTANCE.encodeUtf8(TARGET_PATH_UTF8);
    public static final java.lang.String TARGET_SCHEME_UTF8 = ":scheme";
    public static final okio.ByteString TARGET_SCHEME = okio.ByteString.INSTANCE.encodeUtf8(TARGET_SCHEME_UTF8);
    public static final java.lang.String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final okio.ByteString TARGET_AUTHORITY = okio.ByteString.INSTANCE.encodeUtf8(TARGET_AUTHORITY_UTF8);

    public static /* synthetic */ okhttp3.internal.http2.Header copy$default(okhttp3.internal.http2.Header header, okio.ByteString byteString, okio.ByteString byteString2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            byteString = header.name;
        }
        if ((i & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final okio.ByteString getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final okio.ByteString getValue() {
        return this.value;
    }

    public final okhttp3.internal.http2.Header copy(okio.ByteString name, okio.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new okhttp3.internal.http2.Header(name, value);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof okhttp3.internal.http2.Header)) {
            return false;
        }
        okhttp3.internal.http2.Header header = (okhttp3.internal.http2.Header) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, header.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public Header(okio.ByteString name, okio.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(java.lang.String name, java.lang.String value) {
        this(okio.ByteString.INSTANCE.encodeUtf8(name), okio.ByteString.INSTANCE.encodeUtf8(value));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(okio.ByteString name, java.lang.String value) {
        this(name, okio.ByteString.INSTANCE.encodeUtf8(value));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
    }

    public java.lang.String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }
}
