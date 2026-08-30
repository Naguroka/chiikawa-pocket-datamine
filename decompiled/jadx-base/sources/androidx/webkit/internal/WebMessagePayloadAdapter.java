package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessagePayloadAdapter implements org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface {
    private final byte[] mArrayBuffer;
    private final java.lang.String mString;
    private final int mType;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[0];
    }

    public WebMessagePayloadAdapter(java.lang.String str) {
        this.mType = 0;
        this.mString = str;
        this.mArrayBuffer = null;
    }

    public WebMessagePayloadAdapter(byte[] bArr) {
        this.mType = 1;
        this.mString = null;
        this.mArrayBuffer = bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.mType;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public java.lang.String getAsString() {
        checkType(0);
        return this.mString;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        checkType(1);
        return (byte[]) java.util.Objects.requireNonNull(this.mArrayBuffer);
    }

    private void checkType(int i) {
        if (this.mType != i) {
            throw new java.lang.IllegalStateException("Expected " + i + ", but type is " + this.mType);
        }
    }
}
