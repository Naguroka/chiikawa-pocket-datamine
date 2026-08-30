package androidx.core.os;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TraceKt {
    @kotlin.Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @kotlin.ReplaceWith(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(java.lang.String sectionName, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        androidx.core.os.TraceCompat.beginSection(sectionName);
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            androidx.core.os.TraceCompat.endSection();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
