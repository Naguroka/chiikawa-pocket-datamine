package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewMediaIntegrityApiStatusConfig {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    private int mDefaultStatus;
    private java.util.Map<java.lang.String, java.lang.Integer> mOverrideRules;

    public WebViewMediaIntegrityApiStatusConfig(androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder builder) {
        this.mDefaultStatus = builder.mDefaultStatus;
        this.mOverrideRules = builder.mOverrideRules;
    }

    public static final class Builder {
        private int mDefaultStatus;
        private java.util.Map<java.lang.String, java.lang.Integer> mOverrideRules = new java.util.HashMap();

        public Builder(int i) {
            this.mDefaultStatus = i;
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder addOverrideRule(java.lang.String str, int i) {
            this.mOverrideRules.put(str, java.lang.Integer.valueOf(i));
            return this;
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder setOverrideRules(java.util.Map<java.lang.String, java.lang.Integer> map) {
            this.mOverrideRules = map;
            return this;
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig build() {
            return new androidx.webkit.WebViewMediaIntegrityApiStatusConfig(this);
        }
    }

    public int getDefaultStatus() {
        return this.mDefaultStatus;
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getOverrideRules() {
        return this.mOverrideRules;
    }
}
