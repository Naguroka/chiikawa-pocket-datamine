package jp.co.cyberagent.octo.lib;

/* JADX INFO: loaded from: classes6.dex */
public class HttpResult {
    public java.lang.String errorCode;
    public java.lang.String errorMessage;
    public boolean isComplete;
    public boolean isIoError;
    public java.lang.String protocol;
    public int statusCode;
    public long writtenLength;

    public void a(java.io.IOException iOException) {
        java.lang.String string = iOException.toString();
        this.errorCode = "octo.io.unknown_reason";
        this.errorMessage = string;
        this.isIoError = true;
        this.isComplete = true;
    }

    public void b(java.io.IOException iOException) {
        java.lang.String message = iOException.getMessage();
        java.lang.String str = ((iOException instanceof java.net.SocketTimeoutException) || (message != null && message.contains("timeout"))) ? "octo.network.timeout" : "octo.network.unknown_reason";
        java.lang.String string = iOException.toString();
        this.errorCode = str;
        this.errorMessage = string;
        this.isIoError = false;
        this.isComplete = true;
    }

    public boolean isError() {
        return this.errorCode != null;
    }
}
