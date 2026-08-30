package kotlin.io;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0012\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010.\u001a\u00020/*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", com.json.zb.M, "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class FilesKt__FileReadWriteKt extends kotlin.io.FilesKt__FilePathComponentsKt {
    static /* synthetic */ java.io.InputStreamReader reader$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
    }

    private static final java.io.InputStreamReader reader(java.io.File file, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, i);
    }

    private static final java.io.BufferedReader bufferedReader(java.io.File file, java.nio.charset.Charset charset, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, i);
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
    }

    private static final java.io.OutputStreamWriter writer(java.io.File file, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, i);
    }

    private static final java.io.BufferedWriter bufferedWriter(java.io.File file, java.nio.charset.Charset charset, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, i);
    }

    static /* synthetic */ java.io.PrintWriter printWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return new java.io.PrintWriter(outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192));
    }

    private static final java.io.PrintWriter printWriter(java.io.File file, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return new java.io.PrintWriter(outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192));
    }

    public static final byte[] readBytes(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.lang.OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyInto = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream2.read(bArrCopyInto, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyInto = java.util.Arrays.copyOf(bArrCopyInto, i3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i5 = fileInputStream2.read();
                if (i5 != -1) {
                    kotlin.io.ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new kotlin.io.ExposingBufferByteArrayOutputStream(8193);
                    exposingBufferByteArrayOutputStream.write(i5);
                    kotlin.io.ByteStreamsKt.copyTo$default(fileInputStream2, exposingBufferByteArrayOutputStream, 0, 2, null);
                    int size = exposingBufferByteArrayOutputStream.size() + i;
                    if (size < 0) {
                        throw new java.lang.OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = exposingBufferByteArrayOutputStream.getBuffer();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrCopyInto, size);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = kotlin.collections.ArraysKt.copyInto(buffer, bArrCopyOf, i, 0, exposingBufferByteArrayOutputStream.size());
                }
            }
            kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void writeBytes(java.io.File file, byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void appendBytes(java.io.File file, byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final java.lang.String readText(java.io.File file, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
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

    public static /* synthetic */ java.lang.String readText$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.FilesKt.readText(file, charset);
    }

    public static final void writeText(java.io.File file, java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        kotlin.io.FilesKt.writeBytes(file, bytes);
    }

    public static /* synthetic */ void writeText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.writeText(file, str, charset);
    }

    public static final void appendText(java.io.File file, java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        kotlin.io.FilesKt.appendBytes(file, bytes);
    }

    public static /* synthetic */ void appendText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.appendText(file, str, charset);
    }

    public static final void forEachBlock(java.io.File file, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.io.FilesKt.forEachBlock(file, 4096, action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(java.io.File file, int i, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        ?? r3 = new byte[kotlin.ranges.RangesKt.coerceAtLeast(i, 512)];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            while (true) {
                int i2 = fileInputStream2.read(r3);
                if (i2 > 0) {
                    action.invoke(r3, java.lang.Integer.valueOf(i2));
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void forEachLine$default(java.io.File file, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.FilesKt.forEachLine(file, charset, function1);
    }

    public static final void forEachLine(java.io.File file, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.io.TextStreamsKt.forEachLine(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset)), action);
    }

    private static final java.io.FileInputStream inputStream(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return new java.io.FileInputStream(file);
    }

    private static final java.io.FileOutputStream outputStream(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return new java.io.FileOutputStream(file);
    }

    public static /* synthetic */ java.util.List readLines$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.FilesKt.readLines(file, charset);
    }

    public static final java.util.List<java.lang.String> readLines(java.io.File file, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.io.FilesKt.forEachLine(file, charset, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: kotlin.io.FilesKt__FileReadWriteKt.readLines.1
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

    public static /* synthetic */ java.lang.Object useLines$default(java.io.File file, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        try {
            java.lang.Object objInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return objInvoke;
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

    public static final <T> T useLines(java.io.File file, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        try {
            T tInvoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
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
}
