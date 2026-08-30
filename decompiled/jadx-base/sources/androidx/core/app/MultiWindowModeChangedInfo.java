package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean mIsInMultiWindowMode;
    private final android.content.res.Configuration mNewConfig;

    public MultiWindowModeChangedInfo(boolean z) {
        this.mIsInMultiWindowMode = z;
        this.mNewConfig = null;
    }

    public MultiWindowModeChangedInfo(boolean z, android.content.res.Configuration configuration) {
        this.mIsInMultiWindowMode = z;
        this.mNewConfig = configuration;
    }

    public boolean isInMultiWindowMode() {
        return this.mIsInMultiWindowMode;
    }

    public android.content.res.Configuration getNewConfig() {
        android.content.res.Configuration configuration = this.mNewConfig;
        if (configuration != null) {
            return configuration;
        }
        throw new java.lang.IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }
}
