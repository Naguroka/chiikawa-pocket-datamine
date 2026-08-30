package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public interface AutoSizeableTextView {

    @java.lang.Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);

    static {
        PLATFORM_SUPPORTS_AUTOSIZE = android.os.Build.VERSION.SDK_INT >= 27;
    }
}
