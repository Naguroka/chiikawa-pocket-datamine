package okio;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "use", "R", "T", "Ljava/io/Closeable;", "Lokio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
final /* synthetic */ class Okio__OkioKt {
    public static final okio.BufferedSource buffer(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return new okio.RealBufferedSource(source);
    }

    public static final okio.BufferedSink buffer(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        return new okio.RealBufferedSink(sink);
    }

    public static final okio.Sink blackhole() {
        return new okio.BlackholeSink();
    }

    public static final <T extends java.io.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> block) throws java.lang.Throwable {
        R rInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.lang.Throwable th = null;
        try {
            rInvoke = block.invoke(t);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (t != null) {
                try {
                    t.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th3) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (t != null) {
                try {
                    t.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            th = th3;
            rInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(rInvoke);
        return rInvoke;
    }
}
