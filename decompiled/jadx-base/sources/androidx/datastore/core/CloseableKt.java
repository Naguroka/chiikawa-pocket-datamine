package androidx.datastore.core;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"use", "R", "T", "Landroidx/datastore/core/Closeable;", "block", "Lkotlin/Function1;", "(Landroidx/datastore/core/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CloseableKt {
    public static final <T extends androidx.datastore.core.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> block) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            try {
                t.close();
                th = null;
            } catch (java.lang.Throwable th) {
                th = th;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (java.lang.Throwable th2) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            try {
                t.close();
            } catch (java.lang.Throwable th3) {
                kotlin.ExceptionsKt.addSuppressed(th2, th3);
            }
            throw th2;
        }
    }
}
