package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer);

    void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer);
}
