package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public class ParseException extends java.lang.RuntimeException {
    public final java.lang.String response;

    ParseException(java.lang.String str) {
        super(str);
        this.response = str;
    }
}
