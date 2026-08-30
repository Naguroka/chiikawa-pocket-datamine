package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseOptions {
    private static final java.lang.String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final java.lang.String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final java.lang.String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final java.lang.String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final java.lang.String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final java.lang.String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final java.lang.String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final java.lang.String apiKey;
    private final java.lang.String applicationId;
    private final java.lang.String databaseUrl;
    private final java.lang.String gaTrackingId;
    private final java.lang.String gcmSenderId;
    private final java.lang.String projectId;
    private final java.lang.String storageBucket;

    public static final class Builder {
        private java.lang.String apiKey;
        private java.lang.String applicationId;
        private java.lang.String databaseUrl;
        private java.lang.String gaTrackingId;
        private java.lang.String gcmSenderId;
        private java.lang.String projectId;
        private java.lang.String storageBucket;

        public Builder() {
        }

        public Builder(com.google.firebase.FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }

        public com.google.firebase.FirebaseOptions.Builder setApiKey(java.lang.String str) {
            this.apiKey = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setApplicationId(java.lang.String str) {
            this.applicationId = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setDatabaseUrl(java.lang.String str) {
            this.databaseUrl = str;
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setGaTrackingId(java.lang.String str) {
            this.gaTrackingId = str;
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setGcmSenderId(java.lang.String str) {
            this.gcmSenderId = str;
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setStorageBucket(java.lang.String str) {
            this.storageBucket = str;
            return this;
        }

        public com.google.firebase.FirebaseOptions.Builder setProjectId(java.lang.String str) {
            this.projectId = str;
            return this;
        }

        public com.google.firebase.FirebaseOptions build() {
            return new com.google.firebase.FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }
    }

    private FirebaseOptions(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.google.android.gms.common.internal.Preconditions.checkState(!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }

    public static com.google.firebase.FirebaseOptions fromResource(android.content.Context context) {
        com.google.android.gms.common.internal.StringResourceValueReader stringResourceValueReader = new com.google.android.gms.common.internal.StringResourceValueReader(context);
        java.lang.String string = stringResourceValueReader.getString(APP_ID_RESOURCE_NAME);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        return new com.google.firebase.FirebaseOptions(string, stringResourceValueReader.getString(API_KEY_RESOURCE_NAME), stringResourceValueReader.getString(DATABASE_URL_RESOURCE_NAME), stringResourceValueReader.getString(GA_TRACKING_ID_RESOURCE_NAME), stringResourceValueReader.getString(GCM_SENDER_ID_RESOURCE_NAME), stringResourceValueReader.getString(STORAGE_BUCKET_RESOURCE_NAME), stringResourceValueReader.getString(PROJECT_ID_RESOURCE_NAME));
    }

    public java.lang.String getApiKey() {
        return this.apiKey;
    }

    public java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public java.lang.String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public java.lang.String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public java.lang.String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public java.lang.String getStorageBucket() {
        return this.storageBucket;
    }

    public java.lang.String getProjectId() {
        return this.projectId;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.firebase.FirebaseOptions)) {
            return false;
        }
        com.google.firebase.FirebaseOptions firebaseOptions = (com.google.firebase.FirebaseOptions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.applicationId, firebaseOptions.applicationId) && com.google.android.gms.common.internal.Objects.equal(this.apiKey, firebaseOptions.apiKey) && com.google.android.gms.common.internal.Objects.equal(this.databaseUrl, firebaseOptions.databaseUrl) && com.google.android.gms.common.internal.Objects.equal(this.gaTrackingId, firebaseOptions.gaTrackingId) && com.google.android.gms.common.internal.Objects.equal(this.gcmSenderId, firebaseOptions.gcmSenderId) && com.google.android.gms.common.internal.Objects.equal(this.storageBucket, firebaseOptions.storageBucket) && com.google.android.gms.common.internal.Objects.equal(this.projectId, firebaseOptions.projectId);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("applicationId", this.applicationId).add("apiKey", this.apiKey).add("databaseUrl", this.databaseUrl).add("gcmSenderId", this.gcmSenderId).add("storageBucket", this.storageBucket).add("projectId", this.projectId).toString();
    }
}
