package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute {
    private final java.lang.String key;
    private final java.lang.String value;

    private AutoValue_CrashlyticsReport_CustomAttribute(java.lang.String str, java.lang.String str2) {
        this.key = str;
        this.value = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public java.lang.String getKey() {
        return this.key;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.String toString() {
        return "CustomAttribute{key=" + this.key + ", value=" + this.value + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute customAttribute = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute) obj;
        return this.key.equals(customAttribute.getKey()) && this.value.equals(customAttribute.getValue());
    }

    public int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder {
        private java.lang.String key;
        private java.lang.String value;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null key");
            }
            this.key = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setValue(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null value");
            }
            this.value = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute build() {
            if (this.key == null || this.value == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.key == null) {
                    sb.append(" key");
                }
                if (this.value == null) {
                    sb.append(" value");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute(this.key, this.value);
        }
    }
}
