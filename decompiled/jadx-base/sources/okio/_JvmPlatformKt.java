package okio;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u001a-\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00060\u0001j\u0002`\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015*\n\u0010\u0016\"\u00020\u00012\u00020\u0001*\n\u0010\u0017\"\u00020\u00182\u00020\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"newLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "asUtf8ToByteArray", "", "", "toUtf8String", "withLock", "T", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ArrayIndexOutOfBoundsException", "Ljava/lang/ArrayIndexOutOfBoundsException;", "Closeable", "Ljava/io/Closeable;", "EOFException", "Ljava/io/EOFException;", "FileNotFoundException", "Ljava/io/FileNotFoundException;", "IOException", "Ljava/io/IOException;", "Lock", "ProtocolException", "Ljava/net/ProtocolException;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _JvmPlatformKt {
    public static final java.lang.String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public static final byte[] asUtf8ToByteArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final java.util.concurrent.locks.ReentrantLock newLock() {
        return new java.util.concurrent.locks.ReentrantLock();
    }

    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock reentrantLock, kotlin.jvm.functions.Function0<? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reentrantLock, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            return action.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            reentrantLock2.unlock();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
