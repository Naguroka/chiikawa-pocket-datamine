package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class SubscribeOptions {
    public static final com.google.android.gms.nearby.messages.SubscribeOptions DEFAULT = new com.google.android.gms.nearby.messages.SubscribeOptions.Builder().build();
    public final boolean zza = false;
    public final int zzb = 0;
    private final com.google.android.gms.nearby.messages.Strategy zzc;
    private final com.google.android.gms.nearby.messages.MessageFilter zzd;
    private final com.google.android.gms.nearby.messages.SubscribeCallback zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.nearby.messages.Strategy zza = com.google.android.gms.nearby.messages.Strategy.DEFAULT;
        private com.google.android.gms.nearby.messages.MessageFilter zzb = com.google.android.gms.nearby.messages.MessageFilter.INCLUDE_ALL_MY_TYPES;
        private com.google.android.gms.nearby.messages.SubscribeCallback zzc;

        public com.google.android.gms.nearby.messages.SubscribeOptions build() {
            return new com.google.android.gms.nearby.messages.SubscribeOptions(this.zza, this.zzb, this.zzc, false, 0, null);
        }

        public com.google.android.gms.nearby.messages.SubscribeOptions.Builder setCallback(com.google.android.gms.nearby.messages.SubscribeCallback subscribeCallback) {
            this.zzc = (com.google.android.gms.nearby.messages.SubscribeCallback) com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeCallback);
            return this;
        }

        public com.google.android.gms.nearby.messages.SubscribeOptions.Builder setFilter(com.google.android.gms.nearby.messages.MessageFilter messageFilter) {
            this.zzb = messageFilter;
            return this;
        }

        public com.google.android.gms.nearby.messages.SubscribeOptions.Builder setStrategy(com.google.android.gms.nearby.messages.Strategy strategy) {
            this.zza = strategy;
            return this;
        }
    }

    /* synthetic */ SubscribeOptions(com.google.android.gms.nearby.messages.Strategy strategy, com.google.android.gms.nearby.messages.MessageFilter messageFilter, com.google.android.gms.nearby.messages.SubscribeCallback subscribeCallback, boolean z, int i, com.google.android.gms.nearby.messages.zzg zzgVar) {
        this.zzc = strategy;
        this.zzd = messageFilter;
        this.zze = subscribeCallback;
    }

    public com.google.android.gms.nearby.messages.SubscribeCallback getCallback() {
        return this.zze;
    }

    public com.google.android.gms.nearby.messages.MessageFilter getFilter() {
        return this.zzd;
    }

    public com.google.android.gms.nearby.messages.Strategy getStrategy() {
        return this.zzc;
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzd);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 36 + java.lang.String.valueOf(strValueOf2).length());
        sb.append("SubscribeOptions{strategy=");
        sb.append(strValueOf);
        sb.append(", filter=");
        sb.append(strValueOf2);
        sb.append('}');
        return sb.toString();
    }
}
