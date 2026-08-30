package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0016\u0010 \u001a\u00020\t*\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007\u001a\n\u0010 \u001a\u00020\t*\u00020\"\u001a\n\u0010 \u001a\u00020\t*\u00020#\u001a#\u0010 \u001a\u00020\t*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010(\u001a\n\u0010)\u001a\u00020\u0014*\u00020\n\u001a\n\u0010)\u001a\u00020\u0014*\u00020*\u001a\n\u0010)\u001a\u00020\u0014*\u00020#\u001a#\u0010)\u001a\u00020\u0014*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010+\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u00020\u0004*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006,"}, d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "asResourceFileSystem", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "cipherSink", "Lokio/CipherSink;", "cipher", "Ljavax/crypto/Cipher;", "cipherSource", "Lokio/CipherSource;", "Lokio/Source;", "hashingSink", "Lokio/HashingSink;", "digest", "Ljava/security/MessageDigest;", "mac", "Ljavax/crypto/Mac;", "hashingSource", "Lokio/HashingSource;", "openZip", "zipPath", "Lokio/Path;", "sink", org.jacoco.core.runtime.AgentOptions.APPEND, "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "source", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
final /* synthetic */ class Okio__JvmOkioKt {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger("okio.Okio");

    public static final okio.Sink sink(java.io.File file) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static final okio.Sink sink(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new okio.OutputStreamSink(outputStream, new okio.Timeout());
    }

    public static final okio.Source source(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new okio.InputStreamSource(inputStream, new okio.Timeout());
    }

    public static final okio.Sink sink(java.net.Socket socket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        okio.SocketAsyncTimeout socketAsyncTimeout = new okio.SocketAsyncTimeout(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new okio.OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final okio.Source source(java.net.Socket socket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        okio.SocketAsyncTimeout socketAsyncTimeout = new okio.SocketAsyncTimeout(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new okio.InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final okio.Sink sink(java.io.File file, boolean z) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return okio.Okio.sink(new java.io.FileOutputStream(file, z));
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File file, boolean z, int i, java.lang.Object obj) throws java.io.FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return okio.Okio.sink(file, z);
    }

    public static final okio.Sink appendingSink(java.io.File file) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return okio.Okio.sink(new java.io.FileOutputStream(file, true));
    }

    public static final okio.Source source(java.io.File file) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return new okio.InputStreamSource(new java.io.FileInputStream(file), okio.Timeout.NONE);
    }

    public static final okio.Sink sink(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.OutputStream outputStreamNewOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return okio.Okio.sink(outputStreamNewOutputStream);
    }

    public static final okio.Source source(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.InputStream inputStreamNewInputStream = java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return okio.Okio.source(inputStreamNewInputStream);
    }

    public static final okio.CipherSink cipherSink(okio.Sink sink, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new okio.CipherSink(okio.Okio.buffer(sink), cipher);
    }

    public static final okio.CipherSource cipherSource(okio.Source source, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new okio.CipherSource(okio.Okio.buffer(source), cipher);
    }

    public static final okio.HashingSink hashingSink(okio.Sink sink, javax.crypto.Mac mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        return new okio.HashingSink(sink, mac);
    }

    public static final okio.HashingSource hashingSource(okio.Source source, javax.crypto.Mac mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        return new okio.HashingSource(source, mac);
    }

    public static final okio.HashingSink hashingSink(okio.Sink sink, java.security.MessageDigest digest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digest, "digest");
        return new okio.HashingSink(sink, digest);
    }

    public static final okio.HashingSource hashingSource(okio.Source source, java.security.MessageDigest digest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digest, "digest");
        return new okio.HashingSource(source, digest);
    }

    public static final okio.FileSystem openZip(okio.FileSystem fileSystem, okio.Path zipPath) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return okio.internal.ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    public static final okio.FileSystem asResourceFileSystem(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "<this>");
        return new okio.internal.ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        java.lang.String message = assertionError.getMessage();
        return message != null ? kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "getsockname failed", false, 2, (java.lang.Object) null) : false;
    }
}
