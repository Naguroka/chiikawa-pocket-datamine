package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    private final java.lang.String zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public static final class Builder {
        private boolean zza;
        private java.lang.String zzb;
        private com.google.android.ump.ConsentDebugSettings zzc;

        public com.google.android.ump.ConsentRequestParameters build() {
            return new com.google.android.ump.ConsentRequestParameters(this, null);
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setAdMobAppId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setConsentDebugSettings(com.google.android.ump.ConsentDebugSettings consentDebugSettings) {
            this.zzc = consentDebugSettings;
            return this;
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setTagForUnderAgeOfConsent(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(com.google.android.ump.ConsentRequestParameters.Builder builder, com.google.android.ump.zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public com.google.android.ump.ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }
}
