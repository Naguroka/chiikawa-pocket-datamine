package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessageCompat {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final byte[] mArrayBuffer;
    private final androidx.webkit.WebMessagePortCompat[] mPorts;
    private final java.lang.String mString;
    private final int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private java.lang.String typeToString(int i) {
        if (i != 0) {
            return i != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public WebMessageCompat(java.lang.String str) {
        this(str, (androidx.webkit.WebMessagePortCompat[]) null);
    }

    public WebMessageCompat(java.lang.String str, androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        this.mString = str;
        this.mArrayBuffer = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 0;
    }

    public WebMessageCompat(byte[] bArr) {
        this(bArr, (androidx.webkit.WebMessagePortCompat[]) null);
    }

    public WebMessageCompat(byte[] bArr, androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        java.util.Objects.requireNonNull(bArr);
        this.mArrayBuffer = bArr;
        this.mString = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 1;
    }

    public int getType() {
        return this.mType;
    }

    public byte[] getArrayBuffer() {
        checkType(1);
        java.util.Objects.requireNonNull(this.mArrayBuffer);
        return this.mArrayBuffer;
    }

    public java.lang.String getData() {
        checkType(0);
        return this.mString;
    }

    public androidx.webkit.WebMessagePortCompat[] getPorts() {
        return this.mPorts;
    }

    private void checkType(int i) {
        if (i != this.mType) {
            throw new java.lang.IllegalStateException("Wrong data accessor type detected. " + typeToString(this.mType) + " expected, but got " + typeToString(i));
        }
    }
}
