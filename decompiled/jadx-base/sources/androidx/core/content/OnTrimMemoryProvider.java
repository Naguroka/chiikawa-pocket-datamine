package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer);

    void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer);
}
