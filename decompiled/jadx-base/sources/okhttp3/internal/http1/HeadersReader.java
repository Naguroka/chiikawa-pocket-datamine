package okhttp3.internal.http1;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "headerLimit", "", "getSource", "()Lokio/BufferedSource;", "readHeaders", "Lokhttp3/Headers;", "readLine", "", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final okio.BufferedSource source;

    public HeadersReader(okio.BufferedSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.headerLimit = 262144L;
    }

    public final okio.BufferedSource getSource() {
        return this.source;
    }

    public final java.lang.String readLine() throws java.io.IOException {
        java.lang.String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }

    public final okhttp3.Headers readHeaders() throws java.io.IOException {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        while (true) {
            java.lang.String line = readLine();
            if (!(line.length() == 0)) {
                builder.addLenient$okhttp(line);
            } else {
                return builder.build();
            }
        }
    }
}
