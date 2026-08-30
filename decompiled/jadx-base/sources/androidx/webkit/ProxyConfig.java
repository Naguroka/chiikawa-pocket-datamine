package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public final class ProxyConfig {
    private static final java.lang.String BYPASS_RULE_REMOVE_IMPLICIT = "<-loopback>";
    private static final java.lang.String BYPASS_RULE_SIMPLE_NAMES = "<local>";
    private static final java.lang.String DIRECT = "direct://";
    public static final java.lang.String MATCH_ALL_SCHEMES = "*";
    public static final java.lang.String MATCH_HTTP = "http";
    public static final java.lang.String MATCH_HTTPS = "https";
    private java.util.List<java.lang.String> mBypassRules;
    private java.util.List<androidx.webkit.ProxyConfig.ProxyRule> mProxyRules;
    private boolean mReverseBypass;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProxyScheme {
    }

    public ProxyConfig(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> list, java.util.List<java.lang.String> list2, boolean z) {
        this.mProxyRules = list;
        this.mBypassRules = list2;
        this.mReverseBypass = z;
    }

    public java.util.List<androidx.webkit.ProxyConfig.ProxyRule> getProxyRules() {
        return java.util.Collections.unmodifiableList(this.mProxyRules);
    }

    public java.util.List<java.lang.String> getBypassRules() {
        return java.util.Collections.unmodifiableList(this.mBypassRules);
    }

    public boolean isReverseBypassEnabled() {
        return this.mReverseBypass;
    }

    public static final class ProxyRule {
        private java.lang.String mSchemeFilter;
        private java.lang.String mUrl;

        public ProxyRule(java.lang.String str, java.lang.String str2) {
            this.mSchemeFilter = str;
            this.mUrl = str2;
        }

        public ProxyRule(java.lang.String str) {
            this(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, str);
        }

        public java.lang.String getSchemeFilter() {
            return this.mSchemeFilter;
        }

        public java.lang.String getUrl() {
            return this.mUrl;
        }
    }

    public static final class Builder {
        private java.util.List<java.lang.String> mBypassRules;
        private java.util.List<androidx.webkit.ProxyConfig.ProxyRule> mProxyRules;
        private boolean mReverseBypass;

        public Builder() {
            this.mReverseBypass = false;
            this.mProxyRules = new java.util.ArrayList();
            this.mBypassRules = new java.util.ArrayList();
        }

        public Builder(androidx.webkit.ProxyConfig proxyConfig) {
            this.mReverseBypass = false;
            this.mProxyRules = proxyConfig.getProxyRules();
            this.mBypassRules = proxyConfig.getBypassRules();
            this.mReverseBypass = proxyConfig.isReverseBypassEnabled();
        }

        public androidx.webkit.ProxyConfig build() {
            return new androidx.webkit.ProxyConfig(proxyRules(), bypassRules(), reverseBypass());
        }

        public androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String str) {
            this.mProxyRules.add(new androidx.webkit.ProxyConfig.ProxyRule(str));
            return this;
        }

        public androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String str, java.lang.String str2) {
            this.mProxyRules.add(new androidx.webkit.ProxyConfig.ProxyRule(str2, str));
            return this;
        }

        public androidx.webkit.ProxyConfig.Builder addBypassRule(java.lang.String str) {
            this.mBypassRules.add(str);
            return this;
        }

        public androidx.webkit.ProxyConfig.Builder addDirect(java.lang.String str) {
            this.mProxyRules.add(new androidx.webkit.ProxyConfig.ProxyRule(str, androidx.webkit.ProxyConfig.DIRECT));
            return this;
        }

        public androidx.webkit.ProxyConfig.Builder addDirect() {
            return addDirect(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
        }

        public androidx.webkit.ProxyConfig.Builder bypassSimpleHostnames() {
            return addBypassRule(androidx.webkit.ProxyConfig.BYPASS_RULE_SIMPLE_NAMES);
        }

        public androidx.webkit.ProxyConfig.Builder removeImplicitRules() {
            return addBypassRule(androidx.webkit.ProxyConfig.BYPASS_RULE_REMOVE_IMPLICIT);
        }

        public androidx.webkit.ProxyConfig.Builder setReverseBypassEnabled(boolean z) {
            this.mReverseBypass = z;
            return this;
        }

        private java.util.List<androidx.webkit.ProxyConfig.ProxyRule> proxyRules() {
            return this.mProxyRules;
        }

        private java.util.List<java.lang.String> bypassRules() {
            return this.mBypassRules;
        }

        private boolean reverseBypass() {
            return this.mReverseBypass;
        }
    }
}
