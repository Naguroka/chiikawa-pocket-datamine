package com.google.android.gms.ads.rewarded;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ServerSideVerificationOptions {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private java.lang.String zza = "";
        private java.lang.String zzb = "";

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions build() {
            return new com.google.android.gms.ads.rewarded.ServerSideVerificationOptions(this, null);
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setCustomData(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setUserId(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder builder, com.google.android.gms.ads.rewarded.zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    public java.lang.String getCustomData() {
        return this.zzb;
    }

    public java.lang.String getUserId() {
        return this.zza;
    }
}
