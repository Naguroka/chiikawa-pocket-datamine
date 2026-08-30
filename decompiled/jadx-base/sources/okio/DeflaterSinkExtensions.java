package okio;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeflaterSinkExtensions {
    public static /* synthetic */ okio.DeflaterSink deflate$default(okio.Sink sink, java.util.zip.Deflater deflater, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deflater = new java.util.zip.Deflater();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new okio.DeflaterSink(sink, deflater);
    }

    public static final okio.DeflaterSink deflate(okio.Sink sink, java.util.zip.Deflater deflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new okio.DeflaterSink(sink, deflater);
    }
}
