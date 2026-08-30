package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    private final java.util.List<java.lang.String> mCustomIncludedCategories;
    private int mPredefinedCategories;
    private int mTracingMode;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    public TracingConfig(int i, java.util.List<java.lang.String> list, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mCustomIncludedCategories = arrayList;
        this.mPredefinedCategories = i;
        arrayList.addAll(list);
        this.mTracingMode = i2;
    }

    public int getPredefinedCategories() {
        return this.mPredefinedCategories;
    }

    public java.util.List<java.lang.String> getCustomIncludedCategories() {
        return this.mCustomIncludedCategories;
    }

    public int getTracingMode() {
        return this.mTracingMode;
    }

    public static class Builder {
        private int mPredefinedCategories = 0;
        private final java.util.List<java.lang.String> mCustomIncludedCategories = new java.util.ArrayList();
        private int mTracingMode = 1;

        public androidx.webkit.TracingConfig build() {
            return new androidx.webkit.TracingConfig(this.mPredefinedCategories, this.mCustomIncludedCategories, this.mTracingMode);
        }

        public androidx.webkit.TracingConfig.Builder addCategories(int... iArr) {
            for (int i : iArr) {
                this.mPredefinedCategories = i | this.mPredefinedCategories;
            }
            return this;
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.lang.String... strArr) {
            this.mCustomIncludedCategories.addAll(java.util.Arrays.asList(strArr));
            return this;
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.util.Collection<java.lang.String> collection) {
            this.mCustomIncludedCategories.addAll(collection);
            return this;
        }

        public androidx.webkit.TracingConfig.Builder setTracingMode(int i) {
            this.mTracingMode = i;
            return this;
        }
    }
}
