package okhttp3;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Protocol.Companion INSTANCE = new okhttp3.Protocol.Companion(null);
    private final java.lang.String protocol;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Protocol get(java.lang.String str) throws java.io.IOException {
        return INSTANCE.get(str);
    }

    Protocol(java.lang.String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.protocol;
    }

    /* JADX INFO: compiled from: Protocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "()V", "get", "Lokhttp3/Protocol;", "protocol", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Protocol get(java.lang.String protocol) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_1_0.protocol)) {
                return okhttp3.Protocol.HTTP_1_0;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_1_1.protocol)) {
                return okhttp3.Protocol.HTTP_1_1;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.H2_PRIOR_KNOWLEDGE.protocol)) {
                return okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_2.protocol)) {
                return okhttp3.Protocol.HTTP_2;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.SPDY_3.protocol)) {
                return okhttp3.Protocol.SPDY_3;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.QUIC.protocol)) {
                return okhttp3.Protocol.QUIC;
            }
            throw new java.io.IOException("Unexpected protocol: " + protocol);
        }
    }
}
