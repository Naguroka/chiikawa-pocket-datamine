package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public final class UserAgentMetadata {
    public static final int BITNESS_DEFAULT = 0;
    private final java.lang.String mArchitecture;
    private int mBitness;
    private final java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> mBrandVersionList;
    private final java.lang.String mFullVersion;
    private boolean mMobile;
    private final java.lang.String mModel;
    private final java.lang.String mPlatform;
    private final java.lang.String mPlatformVersion;
    private boolean mWow64;

    private UserAgentMetadata(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, boolean z2) {
        this.mBrandVersionList = list;
        this.mFullVersion = str;
        this.mPlatform = str2;
        this.mPlatformVersion = str3;
        this.mArchitecture = str4;
        this.mModel = str5;
        this.mMobile = z;
        this.mBitness = i;
        this.mWow64 = z2;
    }

    public java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> getBrandVersionList() {
        return this.mBrandVersionList;
    }

    public java.lang.String getFullVersion() {
        return this.mFullVersion;
    }

    public java.lang.String getPlatform() {
        return this.mPlatform;
    }

    public java.lang.String getPlatformVersion() {
        return this.mPlatformVersion;
    }

    public java.lang.String getArchitecture() {
        return this.mArchitecture;
    }

    public java.lang.String getModel() {
        return this.mModel;
    }

    public boolean isMobile() {
        return this.mMobile;
    }

    public int getBitness() {
        return this.mBitness;
    }

    public boolean isWow64() {
        return this.mWow64;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.webkit.UserAgentMetadata)) {
            return false;
        }
        androidx.webkit.UserAgentMetadata userAgentMetadata = (androidx.webkit.UserAgentMetadata) obj;
        return this.mMobile == userAgentMetadata.mMobile && this.mBitness == userAgentMetadata.mBitness && this.mWow64 == userAgentMetadata.mWow64 && java.util.Objects.equals(this.mBrandVersionList, userAgentMetadata.mBrandVersionList) && java.util.Objects.equals(this.mFullVersion, userAgentMetadata.mFullVersion) && java.util.Objects.equals(this.mPlatform, userAgentMetadata.mPlatform) && java.util.Objects.equals(this.mPlatformVersion, userAgentMetadata.mPlatformVersion) && java.util.Objects.equals(this.mArchitecture, userAgentMetadata.mArchitecture) && java.util.Objects.equals(this.mModel, userAgentMetadata.mModel);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, java.lang.Boolean.valueOf(this.mMobile), java.lang.Integer.valueOf(this.mBitness), java.lang.Boolean.valueOf(this.mWow64));
    }

    public static final class BrandVersion {
        private final java.lang.String mBrand;
        private final java.lang.String mFullVersion;
        private final java.lang.String mMajorVersion;

        private BrandVersion(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.mBrand = str;
            this.mMajorVersion = str2;
            this.mFullVersion = str3;
        }

        public java.lang.String getBrand() {
            return this.mBrand;
        }

        public java.lang.String getMajorVersion() {
            return this.mMajorVersion;
        }

        public java.lang.String getFullVersion() {
            return this.mFullVersion;
        }

        public java.lang.String toString() {
            return this.mBrand + "," + this.mMajorVersion + "," + this.mFullVersion;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.webkit.UserAgentMetadata.BrandVersion)) {
                return false;
            }
            androidx.webkit.UserAgentMetadata.BrandVersion brandVersion = (androidx.webkit.UserAgentMetadata.BrandVersion) obj;
            return java.util.Objects.equals(this.mBrand, brandVersion.mBrand) && java.util.Objects.equals(this.mMajorVersion, brandVersion.mMajorVersion) && java.util.Objects.equals(this.mFullVersion, brandVersion.mFullVersion);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.mBrand, this.mMajorVersion, this.mFullVersion);
        }

        public static final class Builder {
            private java.lang.String mBrand;
            private java.lang.String mFullVersion;
            private java.lang.String mMajorVersion;

            public Builder() {
            }

            public Builder(androidx.webkit.UserAgentMetadata.BrandVersion brandVersion) {
                this.mBrand = brandVersion.getBrand();
                this.mMajorVersion = brandVersion.getMajorVersion();
                this.mFullVersion = brandVersion.getFullVersion();
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion build() {
                java.lang.String str;
                java.lang.String str2;
                java.lang.String str3 = this.mBrand;
                if (str3 == null || str3.trim().isEmpty() || (str = this.mMajorVersion) == null || str.trim().isEmpty() || (str2 = this.mFullVersion) == null || str2.trim().isEmpty()) {
                    throw new java.lang.IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new androidx.webkit.UserAgentMetadata.BrandVersion(this.mBrand, this.mMajorVersion, this.mFullVersion);
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setBrand(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Brand should not be blank.");
                }
                this.mBrand = str;
                return this;
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setMajorVersion(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.mMajorVersion = str;
                return this;
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setFullVersion(java.lang.String str) {
                if (str.trim().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("FullVersion should not be blank.");
                }
                this.mFullVersion = str;
                return this;
            }
        }
    }

    public static final class Builder {
        private java.lang.String mArchitecture;
        private int mBitness;
        private java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> mBrandVersionList;
        private java.lang.String mFullVersion;
        private boolean mMobile;
        private java.lang.String mModel;
        private java.lang.String mPlatform;
        private java.lang.String mPlatformVersion;
        private boolean mWow64;

        public Builder() {
            this.mBrandVersionList = new java.util.ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
        }

        public Builder(androidx.webkit.UserAgentMetadata userAgentMetadata) {
            this.mBrandVersionList = new java.util.ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
            this.mBrandVersionList = userAgentMetadata.getBrandVersionList();
            this.mFullVersion = userAgentMetadata.getFullVersion();
            this.mPlatform = userAgentMetadata.getPlatform();
            this.mPlatformVersion = userAgentMetadata.getPlatformVersion();
            this.mArchitecture = userAgentMetadata.getArchitecture();
            this.mModel = userAgentMetadata.getModel();
            this.mMobile = userAgentMetadata.isMobile();
            this.mBitness = userAgentMetadata.getBitness();
            this.mWow64 = userAgentMetadata.isWow64();
        }

        public androidx.webkit.UserAgentMetadata build() {
            return new androidx.webkit.UserAgentMetadata(this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, this.mMobile, this.mBitness, this.mWow64);
        }

        public androidx.webkit.UserAgentMetadata.Builder setBrandVersionList(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list) {
            this.mBrandVersionList = list;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setFullVersion(java.lang.String str) {
            if (str == null) {
                this.mFullVersion = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Full version should not be blank.");
            }
            this.mFullVersion = str;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setPlatform(java.lang.String str) {
            if (str == null) {
                this.mPlatform = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Platform should not be blank.");
            }
            this.mPlatform = str;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setPlatformVersion(java.lang.String str) {
            this.mPlatformVersion = str;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setArchitecture(java.lang.String str) {
            this.mArchitecture = str;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setModel(java.lang.String str) {
            this.mModel = str;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setMobile(boolean z) {
            this.mMobile = z;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setBitness(int i) {
            this.mBitness = i;
            return this;
        }

        public androidx.webkit.UserAgentMetadata.Builder setWow64(boolean z) {
            this.mWow64 = z;
            return this;
        }
    }
}
