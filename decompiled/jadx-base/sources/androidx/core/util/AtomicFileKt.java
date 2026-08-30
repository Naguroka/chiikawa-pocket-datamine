package androidx.core.util;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a3\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", com.json.zb.M, "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AtomicFileKt {
    public static final void tryWrite(android.util.AtomicFile atomicFile, kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.Unit> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stream, "stream");
            block.invoke(stream);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            atomicFile.finishWrite(stream);
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            atomicFile.failWrite(stream);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        writeText(atomicFile, str, charset);
    }

    public static final void writeText(android.util.AtomicFile atomicFile, java.lang.String text, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static final byte[] readBytes(android.util.AtomicFile atomicFile) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        byte[] fully = atomicFile.readFully();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fully, "readFully()");
        return fully;
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile atomicFile, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readText(atomicFile, charset);
    }

    public static final java.lang.String readText(android.util.AtomicFile atomicFile, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] fully = atomicFile.readFully();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fully, "readFully()");
        return new java.lang.String(fully, charset);
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] array) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.io.FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stream, "stream");
            stream.write(array);
            atomicFile.finishWrite(stream);
        } catch (java.lang.Throwable th) {
            atomicFile.failWrite(stream);
            throw th;
        }
    }
}
