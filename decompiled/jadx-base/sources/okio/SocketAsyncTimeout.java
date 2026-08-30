package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SocketAsyncTimeout extends okio.AsyncTimeout {
    private final java.net.Socket socket;

    public SocketAsyncTimeout(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    protected java.io.IOException newTimeoutException(java.io.IOException cause) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    protected void timedOut() {
        try {
            this.socket.close();
        } catch (java.lang.AssertionError e) {
            if (okio.Okio.isAndroidGetsocknameError(e)) {
                okio.Okio__JvmOkioKt.logger.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + this.socket, (java.lang.Throwable) e);
                return;
            }
            throw e;
        } catch (java.lang.Exception e2) {
            okio.Okio__JvmOkioKt.logger.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + this.socket, (java.lang.Throwable) e2);
        }
    }
}
