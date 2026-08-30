package kotlin.io;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", com.json.zb.M, "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextStreamsKt {
    static /* synthetic */ java.io.BufferedReader buffered$default(java.io.Reader reader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    private static final java.io.BufferedReader buffered(java.io.Reader reader, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    static /* synthetic */ java.io.BufferedWriter buffered$default(java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    private static final java.io.BufferedWriter buffered(java.io.Writer writer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    public static final java.util.List<java.lang.String> readLines(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        forEachLine(reader, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: kotlin.io.TextStreamsKt.readLines.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                invoke2(str);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                arrayList.add(it);
            }
        });
        return arrayList;
    }

    public static final <T> T useLines(java.io.Reader reader, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            T tInvoke = block.invoke(lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final java.io.StringReader reader(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.io.StringReader(str);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.io.BufferedReader bufferedReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.io.LinesSequence(bufferedReader));
    }

    public static final java.lang.String readText(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        java.lang.String string = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader reader, java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    public static final long copyTo(java.io.Reader reader, java.io.Writer out, int i) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            out.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    private static final java.lang.String readText(java.net.URL url, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(readBytes(url), charset);
    }

    static /* synthetic */ java.lang.String readText$default(java.net.URL url, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(readBytes(url), charset);
    }

    public static final byte[] readBytes(java.net.URL url) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        java.io.InputStream inputStreamOpenStream = url.openStream();
        try {
            java.io.InputStream inputStream = inputStreamOpenStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(inputStream);
            byte[] bytes = kotlin.io.ByteStreamsKt.readBytes(inputStream);
            kotlin.io.CloseableKt.closeFinally(inputStreamOpenStream, null);
            return bytes;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(inputStreamOpenStream, th);
                throw th2;
            }
        }
    }

    public static final void forEachLine(java.io.Reader reader, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator<java.lang.String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }
}
