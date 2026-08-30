package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AndroidClientInfo extends com.google.android.datatransport.cct.internal.AndroidClientInfo {
    private final java.lang.String applicationBuild;
    private final java.lang.String country;
    private final java.lang.String device;
    private final java.lang.String fingerprint;
    private final java.lang.String hardware;
    private final java.lang.String locale;
    private final java.lang.String manufacturer;
    private final java.lang.String mccMnc;
    private final java.lang.String model;
    private final java.lang.String osBuild;
    private final java.lang.String product;
    private final java.lang.Integer sdkVersion;

    private AutoValue_AndroidClientInfo(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.Integer getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getModel() {
        return this.model;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getHardware() {
        return this.hardware;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getDevice() {
        return this.device;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getProduct() {
        return this.product;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getOsBuild() {
        return this.osBuild;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getFingerprint() {
        return this.fingerprint;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getLocale() {
        return this.locale;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getCountry() {
        return this.country;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getMccMnc() {
        return this.mccMnc;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public java.lang.String getApplicationBuild() {
        return this.applicationBuild;
    }

    public java.lang.String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.sdkVersion + ", model=" + this.model + ", hardware=" + this.hardware + ", device=" + this.device + ", product=" + this.product + ", osBuild=" + this.osBuild + ", manufacturer=" + this.manufacturer + ", fingerprint=" + this.fingerprint + ", locale=" + this.locale + ", country=" + this.country + ", mccMnc=" + this.mccMnc + ", applicationBuild=" + this.applicationBuild + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.AndroidClientInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = (com.google.android.datatransport.cct.internal.AndroidClientInfo) obj;
        java.lang.Integer num = this.sdkVersion;
        if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
            java.lang.String str = this.model;
            if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                java.lang.String str2 = this.hardware;
                if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                    java.lang.String str3 = this.device;
                    if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                        java.lang.String str4 = this.product;
                        if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                            java.lang.String str5 = this.osBuild;
                            if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                java.lang.String str6 = this.manufacturer;
                                if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                    java.lang.String str7 = this.fingerprint;
                                    if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                        java.lang.String str8 = this.locale;
                                        if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                            java.lang.String str9 = this.country;
                                            if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                java.lang.String str10 = this.mccMnc;
                                                if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                    java.lang.String str11 = this.applicationBuild;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.getApplicationBuild())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Integer num = this.sdkVersion;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        java.lang.String str = this.model;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.hardware;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.device;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.product;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        java.lang.String str5 = this.osBuild;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        java.lang.String str6 = this.manufacturer;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        java.lang.String str7 = this.fingerprint;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        java.lang.String str8 = this.locale;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        java.lang.String str9 = this.country;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        java.lang.String str10 = this.mccMnc;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        java.lang.String str11 = this.applicationBuild;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder {
        private java.lang.String applicationBuild;
        private java.lang.String country;
        private java.lang.String device;
        private java.lang.String fingerprint;
        private java.lang.String hardware;
        private java.lang.String locale;
        private java.lang.String manufacturer;
        private java.lang.String mccMnc;
        private java.lang.String model;
        private java.lang.String osBuild;
        private java.lang.String product;
        private java.lang.Integer sdkVersion;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(java.lang.Integer num) {
            this.sdkVersion = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(java.lang.String str) {
            this.model = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(java.lang.String str) {
            this.hardware = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(java.lang.String str) {
            this.device = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(java.lang.String str) {
            this.product = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(java.lang.String str) {
            this.osBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(java.lang.String str) {
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(java.lang.String str) {
            this.fingerprint = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(java.lang.String str) {
            this.locale = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(java.lang.String str) {
            this.country = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(java.lang.String str) {
            this.mccMnc = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(java.lang.String str) {
            this.applicationBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public com.google.android.datatransport.cct.internal.AndroidClientInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo(this.sdkVersion, this.model, this.hardware, this.device, this.product, this.osBuild, this.manufacturer, this.fingerprint, this.locale, this.country, this.mccMnc, this.applicationBuild);
        }
    }
}
