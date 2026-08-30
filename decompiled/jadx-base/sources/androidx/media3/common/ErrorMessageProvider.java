package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface ErrorMessageProvider<T extends java.lang.Throwable> {
    android.util.Pair<java.lang.Integer, java.lang.String> getErrorMessage(T t);
}
