package okhttp3.internal;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000¸\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017\u001a'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a-\u0010'\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u0002H)0!\"\u0002H)H\u0007¢\u0006\u0002\u0010+\u001a\u000e\u0010,\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011\u001a1\u0010-\u001a\u0004\u0018\u0001H)\"\u0004\b\u0000\u0010)2\u0006\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H)002\u0006\u00101\u001a\u00020\u0011¢\u0006\u0002\u00102\u001a\u0016\u00103\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u000f\u001a\"\u00106\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a%\u00107\u001a\u00020\u001b\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H8092\u0006\u0010:\u001a\u0002H8H\u0000¢\u0006\u0002\u0010;\u001a\u0015\u0010<\u001a\u00020\u0014*\u00020=2\u0006\u0010>\u001a\u00020\u0014H\u0086\u0004\u001a\u0015\u0010<\u001a\u00020\u0017*\u00020\u00142\u0006\u0010>\u001a\u00020\u0017H\u0086\u0004\u001a\u0015\u0010<\u001a\u00020\u0014*\u00020?2\u0006\u0010>\u001a\u00020\u0014H\u0086\u0004\u001a\n\u0010@\u001a\u00020A*\u00020B\u001a\r\u0010C\u001a\u00020\u001b*\u00020\"H\u0080\b\u001a\r\u0010D\u001a\u00020\u001b*\u00020\"H\u0080\b\u001a\n\u0010E\u001a\u00020\u000f*\u00020\u0011\u001a\u0012\u0010F\u001a\u00020\u000f*\u00020G2\u0006\u0010H\u001a\u00020G\u001a\n\u0010I\u001a\u00020\u001b*\u00020J\u001a\n\u0010I\u001a\u00020\u001b*\u00020K\u001a\n\u0010I\u001a\u00020\u001b*\u00020L\u001a#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010N\u001a\u00020\u0011¢\u0006\u0002\u0010O\u001a&\u0010P\u001a\u00020\u0014*\u00020\u00112\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a&\u0010P\u001a\u00020\u0014*\u00020\u00112\u0006\u0010U\u001a\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u001a\u0010V\u001a\u00020\u000f*\u00020W2\u0006\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0019\u001a;\u0010Z\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0[2\u0017\u0010\\\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020\u000f0]¢\u0006\u0002\b^H\u0086\bø\u0001\u0000\u001a5\u0010_\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!2\u000e\u0010`\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110a¢\u0006\u0002\u0010b\u001a\n\u0010c\u001a\u00020\u0017*\u00020d\u001a+\u0010e\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010N\u001a\u00020\u00112\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00110a¢\u0006\u0002\u0010f\u001a\n\u0010g\u001a\u00020\u0014*\u00020\u0011\u001a\u001e\u0010h\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u001e\u0010i\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u0014\u0010j\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u0014\u001a9\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010`\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110a¢\u0006\u0002\u0010l\u001a\u0012\u0010m\u001a\u00020\u000f*\u00020n2\u0006\u0010o\u001a\u00020p\u001a\u0012\u0010q\u001a\u00020\u000f*\u00020L2\u0006\u0010r\u001a\u00020s\u001a\r\u0010t\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\r\u0010u\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\n\u0010v\u001a\u00020\u0014*\u00020R\u001a\n\u0010w\u001a\u00020\u0011*\u00020L\u001a\u0012\u0010x\u001a\u00020y*\u00020s2\u0006\u0010z\u001a\u00020y\u001a\n\u0010{\u001a\u00020\u0014*\u00020s\u001a\u0012\u0010|\u001a\u00020\u0014*\u00020}2\u0006\u0010~\u001a\u00020=\u001a\u001a\u0010|\u001a\u00020\u000f*\u00020W2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0019\u001a\u0011\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010(*\u00020\u0003\u001a\u0012\u0010\u0081\u0001\u001a\u00020\u0003*\t\u0012\u0005\u0012\u00030\u0080\u00010(\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0011*\u00020\u0014\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0011*\u00020\u0017\u001a\u0016\u0010\u0083\u0001\u001a\u00020\u0011*\u00020G2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u000f\u001a\u001d\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0(\u001a7\u0010\u0086\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0005\u0012\u0003H\u0089\u00010\u0087\u0001\"\u0005\b\u0000\u0010\u0088\u0001\"\u0005\b\u0001\u0010\u0089\u0001*\u0011\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0005\u0012\u0003H\u0089\u00010\u0087\u0001\u001a\u0014\u0010\u008a\u0001\u001a\u00020\u0017*\u00020\u00112\u0007\u0010\u008b\u0001\u001a\u00020\u0017\u001a\u0016\u0010\u008c\u0001\u001a\u00020\u0014*\u0004\u0018\u00010\u00112\u0007\u0010\u008b\u0001\u001a\u00020\u0014\u001a\u001f\u0010\u008d\u0001\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u000e\u0010\u008e\u0001\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a'\u0010\u008f\u0001\u001a\u00030\u0090\u0001*\b0\u0091\u0001j\u0003`\u0092\u00012\u0013\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b0\u0091\u0001j\u0003`\u0092\u00010(\u001a\u0015\u0010\u0094\u0001\u001a\u00020\u001b*\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u0014\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0097\u0001"}, d2 = {"EMPTY_BYTE_ARRAY", "", "EMPTY_HEADERS", "Lokhttp3/Headers;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "UNICODE_BOMS", "Lokio/Options;", "UTC", "Ljava/util/TimeZone;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "", "okHttpName", "", "userAgent", "checkDuration", "", "name", "duration", "", "unit", "Ljava/util/concurrent/TimeUnit;", "checkOffsetAndCount", "", "arrayLength", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "count", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "ignoreIoExceptions", "block", "Lkotlin/Function0;", "immutableListOf", "", "T", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "isSensitiveHeader", "readFieldOrNull", com.json.j5.p, "fieldType", "Ljava/lang/Class;", "fieldName", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "daemon", "threadName", "addIfAbsent", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "element", "(Ljava/util/List;Ljava/lang/Object;)V", "and", "", "mask", "", "asFactory", "Lokhttp3/EventListener$Factory;", "Lokhttp3/EventListener;", "assertThreadDoesntHoldLock", "assertThreadHoldsLock", "canParseAsIpAddress", "canReuseConnectionFor", "Lokhttp3/HttpUrl;", "other", "closeQuietly", "Ljava/io/Closeable;", "Ljava/net/ServerSocket;", "Ljava/net/Socket;", "concat", "value", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "delimiterOffset", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_DELIMITER, "", "startIndex", "endIndex", "delimiters", "discard", "Lokio/Source;", "timeout", "timeUnit", "filterList", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "hasIntersection", "comparator", "Ljava/util/Comparator;", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "headersContentLength", "Lokhttp3/Response;", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "isCivilized", "Lokhttp3/internal/io/FileSystem;", com.ironsource.y8.h.b, "Ljava/io/File;", "isHealthy", "source", "Lokio/BufferedSource;", "notify", "notifyAll", "parseHexDigit", "peerName", "readBomAsCharset", "Ljava/nio/charset/Charset;", "default", "readMedium", "skipAll", "Lokio/Buffer;", "b", "toHeaderList", "Lokhttp3/internal/http2/Header;", "toHeaders", "toHexString", "toHostHeader", "includeDefaultPort", "toImmutableList", "toImmutableMap", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "toLongOrDefault", "defaultValue", "toNonNegativeInt", "trimSubstring", "wait", "withSuppressed", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "writeMedium", "Lokio/BufferedSink;", "medium", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final okhttp3.RequestBody EMPTY_REQUEST;
    public static final okhttp3.ResponseBody EMPTY_RESPONSE;
    public static final java.util.TimeZone UTC;
    private static final kotlin.text.Regex VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final java.lang.String okHttpName;
    public static final java.lang.String userAgent = "okhttp/4.12.0";
    public static final okhttp3.Headers EMPTY_HEADERS = okhttp3.Headers.INSTANCE.of(new java.lang.String[0]);
    private static final okio.Options UNICODE_BOMS = okio.Options.INSTANCE.of(okio.ByteString.INSTANCE.decodeHex("efbbbf"), okio.ByteString.INSTANCE.decodeHex("feff"), okio.ByteString.INSTANCE.decodeHex("fffe"), okio.ByteString.INSTANCE.decodeHex("0000ffff"), okio.ByteString.INSTANCE.decodeHex("ffff0000"));

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.EventListener asFactory$lambda$8(okhttp3.EventListener this_asFactory, okhttp3.Call it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody.INSTANCE, bArr, (okhttp3.MediaType) null, 1, (java.lang.Object) null);
        EMPTY_REQUEST = okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, bArr, (okhttp3.MediaType) null, 0, 0, 7, (java.lang.Object) null);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new kotlin.text.Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        java.lang.String name = okhttp3.OkHttpClient.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.removePrefix(name, (java.lang.CharSequence) "okhttp3."), (java.lang.CharSequence) "Client");
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public static final java.util.concurrent.ThreadFactory threadFactory(final java.lang.String name, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new java.util.concurrent.ThreadFactory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return okhttp3.internal.Util.threadFactory$lambda$1(name, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Thread threadFactory$lambda$1(java.lang.String name, boolean z, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "$name");
        java.lang.Thread thread = new java.lang.Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    public static final java.lang.String[] intersect(java.lang.String[] strArr, java.lang.String[] other, java.util.Comparator<? super java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final boolean hasIntersection(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator<? super java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (java.lang.String str : strArr) {
                    java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(strArr2);
                    while (it.hasNext()) {
                        if (comparator.compare(str, (java.lang.String) it.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl httpUrl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final java.lang.String toHostHeader(okhttp3.HttpUrl httpUrl, boolean z) {
        java.lang.String strHost;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) httpUrl.host(), (java.lang.CharSequence) ":", false, 2, (java.lang.Object) null)) {
            strHost = com.ironsource.y8.i.d + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        return (z || httpUrl.port() != okhttp3.HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) ? strHost + ':' + httpUrl.port() : strHost;
    }

    public static final java.lang.String[] concat(java.lang.String[] strArr, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        java.lang.String[] strArr2 = (java.lang.String[]) objArrCopyOf;
        strArr2[kotlin.collections.ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfFirstNonAsciiWhitespace(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final java.lang.String trimSubstring(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        java.lang.String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final int delimiterOffset(java.lang.String str, java.lang.String delimiters, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) delimiters, str.charAt(i), false, 2, (java.lang.Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String str, char c, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(java.lang.String str, char c, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int indexOfControlOrNonAscii(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 31) <= 0 || kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean canParseAsIpAddress(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean isSensitiveHeader(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.AUTHORIZATION, true) || kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.COOKIE, true) || kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, true) || kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.SET_COOKIE, true);
    }

    public static final java.lang.String format(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(args, args.length);
        java.lang.String str = java.lang.String.format(locale, format, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final java.nio.charset.Charset readBomAsCharset(okio.BufferedSource bufferedSource, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            java.nio.charset.Charset UTF_16BE = java.nio.charset.StandardCharsets.UTF_16BE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            java.nio.charset.Charset UTF_16LE = java.nio.charset.StandardCharsets.UTF_16LE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return kotlin.text.Charsets.INSTANCE.UTF32_BE();
        }
        if (iSelect == 4) {
            return kotlin.text.Charsets.INSTANCE.UTF32_LE();
        }
        throw new java.lang.AssertionError();
    }

    public static final int checkDuration(java.lang.String name, long j, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        boolean z = true;
        if (!(j >= 0)) {
            throw new java.lang.IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new java.lang.IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException((name + " too large.").toString());
        }
        if (millis == 0 && j > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new java.lang.IllegalArgumentException((name + " too small.").toString());
    }

    public static final okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (okhttp3.internal.http2.Header header : list) {
            builder.addLenient$okhttp(header.getName().utf8(), header.getValue().utf8());
        }
        return builder.build();
    }

    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "<this>");
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, headers.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            arrayList.add(new okhttp3.internal.http2.Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final boolean canReuseConnectionFor(okhttp3.HttpUrl httpUrl, okhttp3.HttpUrl other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.jvm.internal.Intrinsics.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && kotlin.jvm.internal.Intrinsics.areEqual(httpUrl.scheme(), other.scheme());
    }

    public static final okhttp3.EventListener.Factory asFactory(final okhttp3.EventListener eventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "<this>");
        return new okhttp3.EventListener.Factory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda1
            @Override // okhttp3.EventListener.Factory
            public final okhttp3.EventListener create(okhttp3.Call call) {
                return okhttp3.internal.Util.asFactory$lambda$8(eventListener, call);
            }
        };
    }

    public static final void writeMedium(okio.BufferedSink bufferedSink, int i) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public static final int readMedium(okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final boolean skipAll(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = java.lang.System.nanoTime();
        long jDeadlineNanoTime = source.timeout().getHasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(java.lang.Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            okio.Buffer buffer = new okio.Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (java.lang.Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final boolean discard(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(source, i, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static final java.lang.String peerName(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        java.net.SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof java.net.InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        java.lang.String hostName = ((java.net.InetSocketAddress) remoteSocketAddress).getHostName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    public static final boolean isHealthy(java.net.Socket socket, okio.BufferedSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public static final void ignoreIoExceptions(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (java.io.IOException unused) {
        }
    }

    public static final void threadName(java.lang.String name, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            threadCurrentThread.setName(name2);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final int skipAll(okio.Buffer buffer, byte b) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final int indexOfNonWhitespace(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long headersContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "<this>");
        java.lang.String str = response.headers().get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final long toLongOrDefault(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(java.lang.String str, int i) {
        if (str != null) {
            try {
                long j = java.lang.Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> java.util.List<T> toImmutableList(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        java.util.List<T> listUnmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @java.lang.SafeVarargs
    public static final <T> java.util.List<T> immutableListOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.lang.Object[] objArr = (java.lang.Object[]) elements.clone();
        java.util.List<T> listUnmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final <K, V> java.util.Map<K, V> toImmutableMap(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<K, V> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final void closeQuietly(java.io.Closeable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void closeQuietly(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (java.lang.AssertionError e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void closeQuietly(java.net.ServerSocket serverSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean isCivilized(okhttp3.internal.io.FileSystem fileSystem, java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        okio.Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                kotlin.io.CloseableKt.closeFinally(sink, null);
                return true;
            } catch (java.io.IOException unused) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(sink, th);
                throw th2;
            }
        }
    }

    public static final java.lang.String toHexString(long j) {
        java.lang.String hexString = java.lang.Long.toHexString(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final java.lang.String toHexString(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final void wait(java.lang.Object obj) throws java.lang.InterruptedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    public static final void notify(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final <T> T readFieldOrNull(java.lang.Object instance, java.lang.Class<T> fieldType, java.lang.String fieldName) throws java.lang.IllegalAccessException {
        java.lang.Object fieldOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        java.lang.Class<?> superclass = instance.getClass();
        while (true) {
            T tCast = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(superclass, java.lang.Object.class)) {
                try {
                    java.lang.reflect.Field declaredField = superclass.getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    java.lang.Object obj = declaredField.get(instance);
                    if (fieldType.isInstance(obj)) {
                        tCast = fieldType.cast(obj);
                    }
                    return tCast;
                } catch (java.lang.NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
                }
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(fieldName, "delegate") || (fieldOrNull = readFieldOrNull(instance, java.lang.Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
        }
    }

    public static final <E> void addIfAbsent(java.util.List<E> list, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final void assertThreadHoldsLock(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && !java.lang.Thread.holdsLock(obj)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final void assertThreadDoesntHoldLock(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && java.lang.Thread.holdsLock(obj)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final java.lang.Throwable withSuppressed(java.lang.Exception exc, java.util.List<? extends java.lang.Exception> suppressed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        java.util.Iterator<? extends java.lang.Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            kotlin.ExceptionsKt.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final <T> java.util.List<T> filterList(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        java.util.ArrayList arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new java.util.ArrayList();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                kotlin.jvm.internal.TypeIntrinsics.asMutableList(arrayListEmptyList).add(t);
            }
        }
        return arrayListEmptyList;
    }

    public static final int indexOf(java.lang.String[] strArr, java.lang.String value, java.util.Comparator<java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }
}
