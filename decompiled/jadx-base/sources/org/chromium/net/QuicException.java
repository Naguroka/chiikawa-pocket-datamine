package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class QuicException extends org.chromium.net.NetworkException {
    public abstract int getQuicDetailedErrorCode();

    protected QuicException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }
}
