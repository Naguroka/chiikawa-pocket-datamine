package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebResourceErrorCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    public abstract java.lang.CharSequence getDescription();

    public abstract int getErrorCode();
}
