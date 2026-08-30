package okhttp3;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J@\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00170\u0014H\u0082\b¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u0015H&J\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "()V", "reader", "Ljava/io/Reader;", "byteStream", "Ljava/io/InputStream;", "byteString", "Lokio/ByteString;", "bytes", "", "charStream", com.json.zb.M, "Ljava/nio/charset/Charset;", "close", "", "consumeSource", "T", "", "consumer", "Lkotlin/Function1;", "Lokio/BufferedSource;", "sizeMapper", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "source", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "", "BomAwareReader", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResponseBody implements java.io.Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.ResponseBody.Companion INSTANCE = new okhttp3.ResponseBody.Companion(null);
    private java.io.Reader reader;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(java.lang.String str, okhttp3.MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, long j, okio.BufferedSource bufferedSource) {
        return INSTANCE.create(mediaType, j, bufferedSource);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, java.lang.String str) {
        return INSTANCE.create(mediaType, str);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, okio.ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okhttp3.MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okio.BufferedSource bufferedSource, okhttp3.MediaType mediaType, long j) {
        return INSTANCE.create(bufferedSource, mediaType, j);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.ResponseBody create(byte[] bArr, okhttp3.MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long get$contentLength();

    /* JADX INFO: renamed from: contentType */
    public abstract okhttp3.MediaType get$contentType();

    /* JADX INFO: renamed from: source */
    public abstract okio.BufferedSource get$this_asResponseBody();

    public final java.io.InputStream byteStream() {
        return get$this_asResponseBody().inputStream();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> consumer, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> sizeMapper) throws java.io.IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new java.io.IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.BufferedSource bufferedSourceSource = get$this_asResponseBody();
        try {
            T tInvoke = consumer.invoke(bufferedSourceSource);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new java.io.IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, th);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public final java.io.Reader charStream() {
        java.io.Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        okhttp3.ResponseBody.BomAwareReader bomAwareReader = new okhttp3.ResponseBody.BomAwareReader(get$this_asResponseBody(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final java.lang.String string() throws java.io.IOException {
        okio.BufferedSource bufferedSourceSource = get$this_asResponseBody();
        try {
            okio.BufferedSource bufferedSource = bufferedSourceSource;
            java.lang.String string = bufferedSource.readString(okhttp3.internal.Util.readBomAsCharset(bufferedSource, charset()));
            kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, null);
            return string;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    private final java.nio.charset.Charset charset() {
        java.nio.charset.Charset charset;
        okhttp3.MediaType mediaTypeContentType = get$contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(kotlin.text.Charsets.UTF_8)) == null) ? kotlin.text.Charsets.UTF_8 : charset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal.Util.closeQuietly(get$this_asResponseBody());
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "source", "Lokio/BufferedSource;", com.json.zb.M, "Ljava/nio/charset/Charset;", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "closed", "", "delegate", "close", "", "read", "", "cbuf", "", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends java.io.Reader {
        private final java.nio.charset.Charset charset;
        private boolean closed;
        private java.io.Reader delegate;
        private final okio.BufferedSource source;

        public BomAwareReader(okio.BufferedSource source, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new java.io.IOException("Stream closed");
            }
            java.io.InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new java.io.InputStreamReader(this.source.inputStream(), okhttp3.internal.Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            kotlin.Unit unit;
            this.closed = true;
            java.io.Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.source.close();
            }
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, java.lang.String str, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(java.lang.String str, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            java.nio.charset.Charset charsetCharset$default = kotlin.text.Charsets.UTF_8;
            if (mediaType != null && (charsetCharset$default = okhttp3.MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = kotlin.text.Charsets.UTF_8;
                mediaType = okhttp3.MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
            }
            okio.Buffer bufferWriteString = new okio.Buffer().writeString(str, charsetCharset$default);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, byte[] bArr, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(byte[] bArr, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create(new okio.Buffer().write(bArr), mediaType, bArr.length);
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, okio.ByteString byteString, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
            return create(new okio.Buffer().write(byteString), mediaType, byteString.size());
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion companion, okio.BufferedSource bufferedSource, okhttp3.MediaType mediaType, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(bufferedSource, mediaType, j);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(final okio.BufferedSource bufferedSource, final okhttp3.MediaType mediaType, final long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new okhttp3.ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public okhttp3.MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public okio.BufferedSource get$this_asResponseBody() {
                    return bufferedSource;
                }
            };
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, byte[] content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, okio.ByteString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.ResponseBody create(okhttp3.MediaType contentType, long contentLength, okio.BufferedSource content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, contentLength);
        }
    }

    public final byte[] bytes() throws java.io.IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new java.io.IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.BufferedSource bufferedSourceSource = get$this_asResponseBody();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new java.io.IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    public final okio.ByteString byteString() throws java.io.IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new java.io.IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        okio.BufferedSource bufferedSourceSource = get$this_asResponseBody();
        try {
            okio.ByteString byteString = bufferedSourceSource.readByteString();
            kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new java.io.IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedSourceSource, th);
                throw th2;
            }
        }
    }
}
