package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public class CryptoException extends java.lang.Exception {
    public final int errorCode;

    public CryptoException(int i, java.lang.String str) {
        super(str);
        this.errorCode = i;
    }
}
