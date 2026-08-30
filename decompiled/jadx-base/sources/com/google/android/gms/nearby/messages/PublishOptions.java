package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class PublishOptions {
    public static final com.google.android.gms.nearby.messages.PublishOptions DEFAULT = new com.google.android.gms.nearby.messages.PublishOptions.Builder().build();
    private final com.google.android.gms.nearby.messages.Strategy zza;
    private final com.google.android.gms.nearby.messages.PublishCallback zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.nearby.messages.Strategy zza = com.google.android.gms.nearby.messages.Strategy.DEFAULT;
        private com.google.android.gms.nearby.messages.PublishCallback zzb;

        public com.google.android.gms.nearby.messages.PublishOptions build() {
            return new com.google.android.gms.nearby.messages.PublishOptions(this.zza, this.zzb, null);
        }

        public com.google.android.gms.nearby.messages.PublishOptions.Builder setCallback(com.google.android.gms.nearby.messages.PublishCallback publishCallback) {
            this.zzb = (com.google.android.gms.nearby.messages.PublishCallback) com.google.android.gms.common.internal.Preconditions.checkNotNull(publishCallback);
            return this;
        }

        public com.google.android.gms.nearby.messages.PublishOptions.Builder setStrategy(com.google.android.gms.nearby.messages.Strategy strategy) {
            this.zza = (com.google.android.gms.nearby.messages.Strategy) com.google.android.gms.common.internal.Preconditions.checkNotNull(strategy);
            return this;
        }
    }

    /* synthetic */ PublishOptions(com.google.android.gms.nearby.messages.Strategy strategy, com.google.android.gms.nearby.messages.PublishCallback publishCallback, com.google.android.gms.nearby.messages.zze zzeVar) {
        this.zza = strategy;
        this.zzb = publishCallback;
    }

    public com.google.android.gms.nearby.messages.PublishCallback getCallback() {
        return this.zzb;
    }

    public com.google.android.gms.nearby.messages.Strategy getStrategy() {
        return this.zza;
    }
}
