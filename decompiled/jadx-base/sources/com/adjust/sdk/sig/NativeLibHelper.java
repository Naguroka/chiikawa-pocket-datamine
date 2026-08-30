package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes3.dex */
class NativeLibHelper implements com.adjust.sdk.sig.a {
    static {
        try {
            java.lang.System.loadLibrary("signer");
        } catch (java.lang.UnsatisfiedLinkError e) {
            android.util.Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(android.content.Context context, java.lang.Object obj, byte[] bArr, int i);

    public final void a() {
        nOnResume();
    }

    public final byte[] a(android.content.Context context, java.lang.Object obj, byte[] bArr, int i) {
        return nSign(context, obj, bArr, i);
    }
}
