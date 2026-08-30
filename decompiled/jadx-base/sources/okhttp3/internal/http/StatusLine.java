package okhttp3.internal.http;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatusLine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http.StatusLine.Companion INSTANCE = new okhttp3.internal.http.StatusLine.Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    public StatusLine(okhttp3.Protocol protocol, int i, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.protocol = protocol;
        this.code = i;
        this.message = message;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.protocol == okhttp3.Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ').append(this.code);
        sb.append(' ').append(this.message);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: StatusLine.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", com.json.hs.n, "Lokhttp3/Response;", "parse", "statusLine", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.http.StatusLine get(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            return new okhttp3.internal.http.StatusLine(response.protocol(), response.code(), response.message());
        }

        public final okhttp3.internal.http.StatusLine parse(java.lang.String statusLine) throws java.io.IOException {
            okhttp3.Protocol protocol;
            int i;
            java.lang.String strSubstring;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (kotlin.text.StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (java.lang.Object) null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = okhttp3.Protocol.HTTP_1_0;
                } else if (iCharAt == 1) {
                    protocol = okhttp3.Protocol.HTTP_1_1;
                } else {
                    throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
                }
            } else if (kotlin.text.StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (java.lang.Object) null)) {
                protocol = okhttp3.Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                java.lang.String strSubstring2 = statusLine.substring(i, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = java.lang.Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i + 4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new okhttp3.internal.http.StatusLine(protocol, i3, strSubstring);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.net.ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }
}
