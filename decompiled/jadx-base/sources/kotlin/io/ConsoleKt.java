package kotlin.io;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"print", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConsoleKt {
    private static final void print(java.lang.Object obj) {
        java.lang.System.out.print(obj);
    }

    private static final void print(int i) {
        java.lang.System.out.print(i);
    }

    private static final void print(long j) {
        java.lang.System.out.print(j);
    }

    private static final void print(byte b) {
        java.lang.System.out.print(java.lang.Byte.valueOf(b));
    }

    private static final void print(short s) {
        java.lang.System.out.print(java.lang.Short.valueOf(s));
    }

    private static final void print(char c) {
        java.lang.System.out.print(c);
    }

    private static final void print(boolean z) {
        java.lang.System.out.print(z);
    }

    private static final void print(float f) {
        java.lang.System.out.print(f);
    }

    private static final void print(double d) {
        java.lang.System.out.print(d);
    }

    private static final void print(char[] message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        java.lang.System.out.print(message);
    }

    private static final void println(java.lang.Object obj) {
        java.lang.System.out.println(obj);
    }

    private static final void println(int i) {
        java.lang.System.out.println(i);
    }

    private static final void println(long j) {
        java.lang.System.out.println(j);
    }

    private static final void println(byte b) {
        java.lang.System.out.println(java.lang.Byte.valueOf(b));
    }

    private static final void println(short s) {
        java.lang.System.out.println(java.lang.Short.valueOf(s));
    }

    private static final void println(char c) {
        java.lang.System.out.println(c);
    }

    private static final void println(boolean z) {
        java.lang.System.out.println(z);
    }

    private static final void println(float f) {
        java.lang.System.out.println(f);
    }

    private static final void println(double d) {
        java.lang.System.out.println(d);
    }

    private static final void println(char[] message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        java.lang.System.out.println(message);
    }

    private static final void println() {
        java.lang.System.out.println();
    }

    public static final java.lang.String readln() {
        java.lang.String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new kotlin.io.ReadAfterEOFException("EOF has already been reached");
    }

    public static final java.lang.String readlnOrNull() {
        return readLine();
    }

    public static final java.lang.String readLine() {
        kotlin.io.LineReader lineReader = kotlin.io.LineReader.INSTANCE;
        java.io.InputStream in = java.lang.System.in;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(in, "in");
        java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in, charsetDefaultCharset);
    }
}
