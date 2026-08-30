package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> consumer);

    void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> consumer);
}
