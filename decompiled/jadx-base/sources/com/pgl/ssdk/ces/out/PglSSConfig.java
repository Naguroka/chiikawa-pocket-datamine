package com.pgl.ssdk.ces.out;

/* JADX INFO: loaded from: classes3.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final java.lang.String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3786a;
    private final int b;
    private final int c;
    private java.lang.String d;
    private java.util.Map<java.lang.String, java.lang.Object> e;
    private java.lang.String f;
    private java.lang.String g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f3787a;
        private int b = -1;
        private int c = 0;
        private java.lang.String d;

        public com.pgl.ssdk.ces.out.PglSSConfig build() {
            if (android.text.TextUtils.isEmpty(this.f3787a)) {
                return null;
            }
            int i = this.b;
            if (i != 2 && i != 1 && i != 0) {
                return null;
            }
            int i2 = this.c;
            if (i2 == 0 || i2 == 1) {
                return new com.pgl.ssdk.ces.out.PglSSConfig(this.f3787a, i, i2, this.d);
            }
            return null;
        }

        public com.pgl.ssdk.ces.out.PglSSConfig.Builder setAdsdkVersion(java.lang.String str) {
            this.d = str;
            return this;
        }

        public com.pgl.ssdk.ces.out.PglSSConfig.Builder setAppId(java.lang.String str) {
            this.f3787a = str;
            return this;
        }

        public com.pgl.ssdk.ces.out.PglSSConfig.Builder setCollectMode(int i) {
            this.c = i;
            return this;
        }

        public com.pgl.ssdk.ces.out.PglSSConfig.Builder setOVRegionType(int i) {
            this.b = i;
            return this;
        }
    }

    public static com.pgl.ssdk.ces.out.PglSSConfig.Builder builder() {
        return new com.pgl.ssdk.ces.out.PglSSConfig.Builder();
    }

    public java.lang.String getAdSdkVersion() {
        return this.d;
    }

    public java.lang.String getAppId() {
        return this.f3786a;
    }

    public java.lang.String getCnReportUrl() {
        return this.f;
    }

    public java.lang.String getCnTokenUrl() {
        return this.g;
    }

    public int getCollectMode() {
        return this.c;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getCustomInfo() {
        return this.e;
    }

    public int getOVRegionType() {
        return this.b;
    }

    public void setCnReportUrl(java.lang.String str) {
        this.f = str;
    }

    public void setCnTokenUrl(java.lang.String str) {
        this.g = str;
    }

    public void setCustomInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.e = map;
    }

    private PglSSConfig(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.f3786a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }
}
