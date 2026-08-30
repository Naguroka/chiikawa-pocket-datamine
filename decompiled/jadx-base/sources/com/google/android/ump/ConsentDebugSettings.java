package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ConsentDebugSettings {
    private final boolean zza;
    private final int zzb;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public static class Builder {
        private final android.content.Context zzb;
        private boolean zzd;
        private final java.util.List zza = new java.util.ArrayList();
        private int zzc = 0;

        public Builder(android.content.Context context) {
            this.zzb = context.getApplicationContext();
        }

        public com.google.android.ump.ConsentDebugSettings.Builder addTestDeviceHashedId(java.lang.String str) {
            this.zza.add(str);
            return this;
        }

        public com.google.android.ump.ConsentDebugSettings build() {
            boolean z = true;
            if (!com.google.android.gms.internal.consent_sdk.zzcq.zza(true) && !this.zza.contains(com.google.android.gms.internal.consent_sdk.zzci.zza(this.zzb)) && !this.zzd) {
                z = false;
            }
            return new com.google.android.ump.ConsentDebugSettings(z, this, null);
        }

        public com.google.android.ump.ConsentDebugSettings.Builder setDebugGeography(int i) {
            this.zzc = i;
            return this;
        }

        public com.google.android.ump.ConsentDebugSettings.Builder setForceTesting(boolean z) {
            this.zzd = z;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @java.lang.Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    /* synthetic */ ConsentDebugSettings(boolean z, com.google.android.ump.ConsentDebugSettings.Builder builder, com.google.android.ump.zza zzaVar) {
        this.zza = z;
        this.zzb = builder.zzc;
    }

    public int getDebugGeography() {
        return this.zzb;
    }

    public boolean isTestDevice() {
        return this.zza;
    }
}
