package kotlin.io.path;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001a?\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", com.json.zb.M, "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathReadWriteKt {
    static /* synthetic */ java.io.InputStreamReader reader$default(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    private static final java.io.InputStreamReader reader(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption[] options, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedReader(new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final java.io.BufferedReader bufferedReader(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedReader(new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    private static final java.io.OutputStreamWriter writer(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption[] options, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final java.io.BufferedWriter bufferedWriter(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final byte[] readBytes(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        byte[] allBytes = java.nio.file.Files.readAllBytes(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allBytes, "readAllBytes(...)");
        return allBytes;
    }

    private static final void writeBytes(java.nio.file.Path path, byte[] array, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Files.write(path, array, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final void appendBytes(java.nio.file.Path path, byte[] array) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.nio.file.Files.write(path, array, java.nio.file.StandardOpenOption.APPEND);
    }

    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.path.PathsKt.readText(path, charset);
    }

    public static final java.lang.String readText(java.nio.file.Path path, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(new java.nio.file.OpenOption[0], 0)), charset);
        try {
            java.lang.String text = kotlin.io.TextStreamsKt.readText(inputStreamReader);
            kotlin.io.CloseableKt.closeFinally(inputStreamReader, null);
            return text;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, java.nio.file.OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.path.PathsKt.writeText(path, charSequence, charset, openOptionArr);
    }

    public static final void writeText(java.nio.file.Path path, java.lang.CharSequence text, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.OutputStream outputStreamNewOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.CloseableKt.closeFinally(outputStreamWriter, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(outputStreamWriter, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void appendText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.path.PathsKt.appendText(path, charSequence, charset);
    }

    public static final void appendText(java.nio.file.Path path, java.lang.CharSequence text, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.OutputStream outputStreamNewOutputStream = java.nio.file.Files.newOutputStream(path, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.CloseableKt.closeFinally(outputStreamWriter, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(outputStreamWriter, th);
                throw th2;
            }
        }
    }

    static /* synthetic */ void forEachLine$default(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader bufferedReaderNewBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        java.io.BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
        try {
            java.util.Iterator<java.lang.String> it = kotlin.io.TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
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

    private static final void forEachLine(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader bufferedReaderNewBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        java.io.BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
        try {
            java.util.Iterator<java.lang.String> it = kotlin.io.TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
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

    private static final java.io.InputStream inputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.InputStream inputStreamNewInputStream = java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return inputStreamNewInputStream;
    }

    private static final java.io.OutputStream outputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.OutputStream outputStreamNewOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return outputStreamNewOutputStream;
    }

    static /* synthetic */ java.util.List readLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.util.List<java.lang.String> allLines = java.nio.file.Files.readAllLines(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    private static final java.util.List<java.lang.String> readLines(java.nio.file.Path path, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.util.List<java.lang.String> allLines = java.nio.file.Files.readAllLines(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    static /* synthetic */ java.lang.Object useLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader bufferedReaderNewBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        try {
            java.io.BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedReader);
            java.lang.Object objInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final <T> T useLines(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader bufferedReaderNewBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        try {
            java.io.BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedReader);
            T tInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, java.lang.Iterable lines, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, lines, charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path path, java.lang.Iterable<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, lines, charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, kotlin.sequences.Sequence lines, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path path, kotlin.sequences.Sequence<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, java.lang.Iterable lines, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, lines, charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path path, java.lang.Iterable<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, lines, charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, kotlin.sequences.Sequence lines, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path path, kotlin.sequences.Sequence<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path pathWrite = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }
}
