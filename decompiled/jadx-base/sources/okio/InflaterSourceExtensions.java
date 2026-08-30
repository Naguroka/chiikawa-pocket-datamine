package okio;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InflaterSourceExtensions {
    public static /* synthetic */ okio.InflaterSource inflate$default(okio.Source source, java.util.zip.Inflater inflater, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            inflater = new java.util.zip.Inflater();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new okio.InflaterSource(source, inflater);
    }

    public static final okio.InflaterSource inflate(okio.Source source, java.util.zip.Inflater inflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new okio.InflaterSource(source, inflater);
    }
}
