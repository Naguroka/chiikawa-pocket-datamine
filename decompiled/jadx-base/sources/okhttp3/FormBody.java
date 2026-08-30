package okhttp3;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u001d"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "encodedNames", "", "", "encodedValues", "(Ljava/util/List;Ljava/util/List;)V", "size", "", "()I", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "encodedName", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "encodedValue", "name", "-deprecated_size", "value", "writeOrCountBytes", "sink", "Lokio/BufferedSink;", "countBytes", "", "writeTo", "", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FormBody extends okhttp3.RequestBody {
    private final java.util.List<java.lang.String> encodedNames;
    private final java.util.List<java.lang.String> encodedValues;
    private static final okhttp3.MediaType CONTENT_TYPE = okhttp3.MediaType.INSTANCE.get(androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_URL_ENCODED);

    public FormBody(java.util.List<java.lang.String> encodedNames, java.util.List<java.lang.String> encodedValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.encodedNames = okhttp3.internal.Util.toImmutableList(encodedNames);
        this.encodedValues = okhttp3.internal.Util.toImmutableList(encodedValues);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m2914deprecated_size() {
        return size();
    }

    public final java.lang.String encodedName(int index) {
        return this.encodedNames.get(index);
    }

    public final java.lang.String name(int index) {
        return okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedName(index), 0, 0, true, 3, null);
    }

    public final java.lang.String encodedValue(int index) {
        return this.encodedValues.get(index);
    }

    public final java.lang.String value(int index) {
        return okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedValue(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public okhttp3.MediaType get$contentType() {
        return CONTENT_TYPE;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.BufferedSink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }

    private final long writeOrCountBytes(okio.BufferedSink sink, boolean countBytes) throws java.io.EOFException {
        okio.Buffer buffer;
        if (countBytes) {
            buffer = new okio.Buffer();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(sink);
            buffer = sink.getBuffer();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    /* JADX INFO: compiled from: FormBody.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/FormBody$Builder;", "", com.json.zb.M, "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "names", "", "", "values", "add", "name", "value", "addEncoded", "build", "Lokhttp3/FormBody;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final java.nio.charset.Charset charset;
        private final java.util.List<java.lang.String> names;
        private final java.util.List<java.lang.String> values;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(java.nio.charset.Charset charset) {
            this.charset = charset;
            this.names = new java.util.ArrayList();
            this.values = new java.util.ArrayList();
        }

        public /* synthetic */ Builder(java.nio.charset.Charset charset, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }

        public final okhttp3.FormBody.Builder add(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, value, 0, 0, okhttp3.HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final okhttp3.FormBody.Builder addEncoded(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, value, 0, 0, okhttp3.HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final okhttp3.FormBody build() {
            return new okhttp3.FormBody(this.names, this.values);
        }
    }
}
