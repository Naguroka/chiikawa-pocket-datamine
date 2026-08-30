package okhttp3;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0003\"#$B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0015J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u0018J\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014¨\u0006%"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "boundaryByteString", "Lokio/ByteString;", "type", "Lokhttp3/MediaType;", "parts", "", "Lokhttp3/MultipartBody$Part;", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "boundary", "", "()Ljava/lang/String;", "contentLength", "", "contentType", "()Ljava/util/List;", "size", "", "()I", "()Lokhttp3/MediaType;", "-deprecated_boundary", "part", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "-deprecated_parts", "-deprecated_size", "-deprecated_type", "writeOrCountBytes", "sink", "Lokio/BufferedSink;", "countBytes", "", "writeTo", "", "Builder", "Companion", "Part", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartBody extends okhttp3.RequestBody {
    private final okio.ByteString boundaryByteString;
    private long contentLength;
    private final okhttp3.MediaType contentType;
    private final java.util.List<okhttp3.MultipartBody.Part> parts;
    private final okhttp3.MediaType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MultipartBody.Companion INSTANCE = new okhttp3.MultipartBody.Companion(null);
    public static final okhttp3.MediaType MIXED = okhttp3.MediaType.INSTANCE.get("multipart/mixed");
    public static final okhttp3.MediaType ALTERNATIVE = okhttp3.MediaType.INSTANCE.get("multipart/alternative");
    public static final okhttp3.MediaType DIGEST = okhttp3.MediaType.INSTANCE.get("multipart/digest");
    public static final okhttp3.MediaType PARALLEL = okhttp3.MediaType.INSTANCE.get("multipart/parallel");
    public static final okhttp3.MediaType FORM = okhttp3.MediaType.INSTANCE.get(androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_MULTIPART);
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    public final okhttp3.MediaType type() {
        return this.type;
    }

    public final java.util.List<okhttp3.MultipartBody.Part> parts() {
        return this.parts;
    }

    public MultipartBody(okio.ByteString boundaryByteString, okhttp3.MediaType type, java.util.List<okhttp3.MultipartBody.Part> parts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = okhttp3.MediaType.INSTANCE.get(type + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    public final java.lang.String boundary() {
        return this.boundaryByteString.utf8();
    }

    public final int size() {
        return this.parts.size();
    }

    public final okhttp3.MultipartBody.Part part(int index) {
        return this.parts.get(index);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public okhttp3.MediaType getContentType() {
        return this.contentType;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final okhttp3.MediaType getType() {
        return this.type;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "boundary", imports = {}))
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final java.lang.String m2952deprecated_boundary() {
        return boundary();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m2954deprecated_size() {
        return size();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "parts", imports = {}))
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final java.util.List<okhttp3.MultipartBody.Part> m2953deprecated_parts() {
        return this.parts;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws java.io.IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.BufferedSink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }

    private final long writeOrCountBytes(okio.BufferedSink sink, boolean countBytes) throws java.io.IOException {
        okio.Buffer buffer;
        if (countBytes) {
            okio.Buffer buffer2 = new okio.Buffer();
            buffer = buffer2;
            sink = buffer2;
        } else {
            buffer = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            okhttp3.MultipartBody.Part part = this.parts.get(i);
            okhttp3.Headers headers = part.headers();
            okhttp3.RequestBody requestBodyBody = part.body();
            kotlin.jvm.internal.Intrinsics.checkNotNull(sink);
            sink.write(DASHDASH);
            sink.write(this.boundaryByteString);
            sink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sink.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(CRLF);
                }
            }
            okhttp3.MediaType contentType = requestBodyBody.getContentType();
            if (contentType != null) {
                sink.writeUtf8("Content-Type: ").writeUtf8(contentType.getMediaType()).write(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                sink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(CRLF);
            } else if (countBytes) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            sink.write(bArr);
            if (countBytes) {
                j += jContentLength;
            } else {
                requestBodyBody.writeTo(sink);
            }
            sink.write(bArr);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(sink);
        byte[] bArr2 = DASHDASH;
        sink.write(bArr2);
        sink.write(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(CRLF);
        if (!countBytes) {
            return j;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
        long size3 = j + buffer.size();
        buffer.clear();
        return size3;
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final okhttp3.MultipartBody.Part.Companion INSTANCE = new okhttp3.MultipartBody.Part.Companion(null);
        private final okhttp3.RequestBody body;
        private final okhttp3.Headers headers;

        public /* synthetic */ Part(okhttp3.Headers headers, okhttp3.RequestBody requestBody, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part create(okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part create(okhttp3.RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String str, java.lang.String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @kotlin.jvm.JvmStatic
        public static final okhttp3.MultipartBody.Part createFormData(java.lang.String str, java.lang.String str2, okhttp3.RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }

        private Part(okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public final okhttp3.Headers headers() {
            return this.headers;
        }

        public final okhttp3.RequestBody body() {
            return this.body;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final okhttp3.Headers getHeaders() {
            return this.headers;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final okhttp3.RequestBody getBody() {
            return this.body;
        }

        /* JADX INFO: compiled from: MultipartBody.kt */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part create(okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
                return create(null, body);
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part create(okhttp3.Headers headers, okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((headers != null ? headers.get("Content-Type") : null) == null)) {
                    throw new java.lang.IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if (!((headers != null ? headers.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH) : null) == null)) {
                    throw new java.lang.IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                return new okhttp3.MultipartBody.Part(headers, body, defaultConstructorMarker);
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part createFormData(java.lang.String name, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                return createFormData(name, null, okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, value, (okhttp3.MediaType) null, 1, (java.lang.Object) null));
            }

            @kotlin.jvm.JvmStatic
            public final okhttp3.MultipartBody.Part createFormData(java.lang.String name, java.lang.String filename, okhttp3.RequestBody body) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("form-data; name=");
                okhttp3.MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, name);
                if (filename != null) {
                    sb.append("; filename=");
                    okhttp3.MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, filename);
                }
                java.lang.String string = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return create(new okhttp3.Headers.Builder().addUnsafeNonAscii(com.google.common.net.HttpHeaders.CONTENT_DISPOSITION, string).build(), body);
            }
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "boundary", "", "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", "", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", "value", "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final okio.ByteString boundary;
        private final java.util.List<okhttp3.MultipartBody.Part> parts;
        private okhttp3.MediaType type;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(java.lang.String boundary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.boundary = okio.ByteString.INSTANCE.encodeUtf8(boundary);
            this.type = okhttp3.MultipartBody.MIXED;
            this.parts = new java.util.ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }

        public final okhttp3.MultipartBody.Builder setType(okhttp3.MediaType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type.type(), "multipart")) {
                throw new java.lang.IllegalArgumentException(("multipart != " + type).toString());
            }
            this.type = type;
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.create(body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.Headers headers, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.create(headers, body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.createFormData(name, value));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String name, java.lang.String filename, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            addPart(okhttp3.MultipartBody.Part.INSTANCE.createFormData(name, filename, body));
            return this;
        }

        public final okhttp3.MultipartBody.Builder addPart(okhttp3.MultipartBody.Part part) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        public final okhttp3.MultipartBody build() {
            if (!(!this.parts.isEmpty())) {
                throw new java.lang.IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new okhttp3.MultipartBody(this.boundary, this.type, okhttp3.internal.Util.toImmutableList(this.parts));
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "()V", "ALTERNATIVE", "Lokhttp3/MediaType;", "COLONSPACE", "", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "appendQuotedString", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", com.ironsource.y8.h.W, "", "appendQuotedString$okhttp", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void appendQuotedString$okhttp(java.lang.StringBuilder sb, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            sb.append(kotlin.text.Typography.quote);
            int length = key.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append(kotlin.text.Typography.quote);
        }
    }
}
