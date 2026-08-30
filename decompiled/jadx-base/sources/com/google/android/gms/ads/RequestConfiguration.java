package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class RequestConfiguration {
    public static final java.lang.String MAX_AD_CONTENT_RATING_T = "T";
    public static final java.lang.String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;

    @javax.annotation.Nullable
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState zzf;
    public static final java.lang.String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final java.lang.String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final java.lang.String MAX_AD_CONTENT_RATING_G = "G";
    public static final java.util.List zza = java.util.Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @javax.annotation.Nullable
        private java.lang.String zzc = null;
        private final java.util.List zzd = new java.util.ArrayList();
        private com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState zze = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT;

        public com.google.android.gms.ads.RequestConfiguration build() {
            return new com.google.android.gms.ads.RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setMaxAdContentRating(@javax.annotation.Nullable java.lang.String str) {
            if (str == null || "".equals(str)) {
                this.zzc = null;
            } else if (com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || "T".equals(str) || com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.zzc = str;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            }
            return this;
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setPublisherPrivacyPersonalizationState(com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zze = publisherPrivacyPersonalizationState;
            return this;
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zza = i;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            }
            return this;
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzb = i;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            }
            return this;
        }

        public com.google.android.gms.ads.RequestConfiguration.Builder setTestDeviceIds(@javax.annotation.Nullable java.util.List<java.lang.String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zzb;

        PublisherPrivacyPersonalizationState(int i) {
            this.zzb = i;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i, int i2, java.lang.String str, java.util.List list, com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, com.google.android.gms.ads.zzi zziVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = list;
        this.zzf = publisherPrivacyPersonalizationState;
    }

    public java.lang.String getMaxAdContentRating() {
        java.lang.String str = this.zzd;
        return str == null ? "" : str;
    }

    public com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzf;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    public java.util.List<java.lang.String> getTestDeviceIds() {
        return new java.util.ArrayList(this.zze);
    }

    public com.google.android.gms.ads.RequestConfiguration.Builder toBuilder() {
        com.google.android.gms.ads.RequestConfiguration.Builder builder = new com.google.android.gms.ads.RequestConfiguration.Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}
