package okhttp3;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lokhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.RequestBody.Companion INSTANCE = new okhttp3.RequestBody.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(java.io.File file, okhttp3.MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(java.lang.String str, okhttp3.MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, java.io.File file) {
        return INSTANCE.create(mediaType, file);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, java.lang.String str) {
        return INSTANCE.create(mediaType, str);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, okio.ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr, int i) {
        return INSTANCE.create(mediaType, bArr, i);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] bArr, int i, int i2) {
        return INSTANCE.create(mediaType, bArr, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(okio.ByteString byteString, okhttp3.MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i) {
        return INSTANCE.create(bArr, mediaType, i);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i, int i2) {
        return INSTANCE.create(bArr, mediaType, i, i2);
    }

    public long contentLength() throws java.io.IOException {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract okhttp3.MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(okio.BufferedSink sink) throws java.io.IOException;

    /* JADX INFO: compiled from: RequestBody.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", com.ironsource.y8.h.b, "Ljava/io/File;", "content", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "", "Lokio/ByteString;", "asRequestBody", "toRequestBody", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (java.lang.Object) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType mediaType, byte[] content, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, i, 0, 8, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (okhttp3.MediaType) null, 0, 0, 7, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(byte[] bArr, okhttp3.MediaType mediaType, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, i, 0, 4, (java.lang.Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, java.lang.String str, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(java.lang.String str, okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            java.nio.charset.Charset charsetCharset$default = kotlin.text.Charsets.UTF_8;
            if (mediaType != null && (charsetCharset$default = okhttp3.MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = kotlin.text.Charsets.UTF_8;
                mediaType = okhttp3.MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
            }
            byte[] bytes = str.getBytes(charsetCharset$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, okio.ByteString byteString, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final okio.ByteString byteString, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public okhttp3.MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.BufferedSink sink) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, byte[] bArr, okhttp3.MediaType mediaType, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final byte[] bArr, final okhttp3.MediaType mediaType, final int i, final int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            okhttp3.internal.Util.checkOffsetAndCount(bArr.length, i, i2);
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public okhttp3.MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.BufferedSink sink) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(bArr, i, i2);
                }
            };
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, java.io.File file, okhttp3.MediaType mediaType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(final java.io.File file, final okhttp3.MediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
            return new okhttp3.RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public okhttp3.MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.BufferedSink sink) throws java.io.FileNotFoundException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                    okio.Source source = okio.Okio.source(file);
                    try {
                        sink.writeAll(source);
                        kotlin.io.CloseableKt.closeFinally(source, null);
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            kotlin.io.CloseableKt.closeFinally(source, th);
                            throw th2;
                        }
                    }
                }
            };
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, okio.ByteString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion companion, okhttp3.MediaType mediaType, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, byte[] content, int offset, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, offset, byteCount);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @kotlin.jvm.JvmStatic
        public final okhttp3.RequestBody create(okhttp3.MediaType contentType, java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            return create(file, contentType);
        }
    }
}
