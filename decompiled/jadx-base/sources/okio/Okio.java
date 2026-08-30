package okio;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class Okio {
    public static final okio.Sink appendingSink(java.io.File file) throws java.io.FileNotFoundException {
        return okio.Okio__JvmOkioKt.appendingSink(file);
    }

    public static final okio.FileSystem asResourceFileSystem(java.lang.ClassLoader classLoader) {
        return okio.Okio__JvmOkioKt.asResourceFileSystem(classLoader);
    }

    public static final okio.Sink blackhole() {
        return okio.Okio__OkioKt.blackhole();
    }

    public static final okio.BufferedSink buffer(okio.Sink sink) {
        return okio.Okio__OkioKt.buffer(sink);
    }

    public static final okio.BufferedSource buffer(okio.Source source) {
        return okio.Okio__OkioKt.buffer(source);
    }

    public static final okio.CipherSink cipherSink(okio.Sink sink, javax.crypto.Cipher cipher) {
        return okio.Okio__JvmOkioKt.cipherSink(sink, cipher);
    }

    public static final okio.CipherSource cipherSource(okio.Source source, javax.crypto.Cipher cipher) {
        return okio.Okio__JvmOkioKt.cipherSource(source, cipher);
    }

    public static final okio.HashingSink hashingSink(okio.Sink sink, java.security.MessageDigest messageDigest) {
        return okio.Okio__JvmOkioKt.hashingSink(sink, messageDigest);
    }

    public static final okio.HashingSink hashingSink(okio.Sink sink, javax.crypto.Mac mac) {
        return okio.Okio__JvmOkioKt.hashingSink(sink, mac);
    }

    public static final okio.HashingSource hashingSource(okio.Source source, java.security.MessageDigest messageDigest) {
        return okio.Okio__JvmOkioKt.hashingSource(source, messageDigest);
    }

    public static final okio.HashingSource hashingSource(okio.Source source, javax.crypto.Mac mac) {
        return okio.Okio__JvmOkioKt.hashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        return okio.Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
    }

    public static final okio.FileSystem openZip(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        return okio.Okio__JvmOkioKt.openZip(fileSystem, path);
    }

    public static final okio.Sink sink(java.io.File file) throws java.io.FileNotFoundException {
        return okio.Okio__JvmOkioKt.sink(file);
    }

    public static final okio.Sink sink(java.io.File file, boolean z) throws java.io.FileNotFoundException {
        return okio.Okio__JvmOkioKt.sink(file, z);
    }

    public static final okio.Sink sink(java.io.OutputStream outputStream) {
        return okio.Okio__JvmOkioKt.sink(outputStream);
    }

    public static final okio.Sink sink(java.net.Socket socket) throws java.io.IOException {
        return okio.Okio__JvmOkioKt.sink(socket);
    }

    public static final okio.Sink sink(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) throws java.io.IOException {
        return okio.Okio__JvmOkioKt.sink(path, openOptionArr);
    }

    public static final okio.Source source(java.io.File file) throws java.io.FileNotFoundException {
        return okio.Okio__JvmOkioKt.source(file);
    }

    public static final okio.Source source(java.io.InputStream inputStream) {
        return okio.Okio__JvmOkioKt.source(inputStream);
    }

    public static final okio.Source source(java.net.Socket socket) throws java.io.IOException {
        return okio.Okio__JvmOkioKt.source(socket);
    }

    public static final okio.Source source(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) throws java.io.IOException {
        return okio.Okio__JvmOkioKt.source(path, openOptionArr);
    }

    public static final <T extends java.io.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        return (R) okio.Okio__OkioKt.use(t, function1);
    }
}
