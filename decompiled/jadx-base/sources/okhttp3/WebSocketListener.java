package okhttp3;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lokhttp3/WebSocketListener;", "", "()V", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", com.json.hs.n, "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WebSocketListener {
    public void onClosed(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onFailure(okhttp3.WebSocket webSocket, java.lang.Throwable t, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
    }

    public void onMessage(okhttp3.WebSocket webSocket, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
    }

    public void onMessage(okhttp3.WebSocket webSocket, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public void onOpen(okhttp3.WebSocket webSocket, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
    }
}
