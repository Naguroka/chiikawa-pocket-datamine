package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class ExecutionOptions {
    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
    private final java.lang.String zzan;
    private final boolean zzao;
    private final int zzap;

    public ExecutionOptions(java.lang.String str, boolean z, int i) {
        this.zzan = str;
        this.zzao = z;
        this.zzap = i;
    }

    public static boolean zza(int i) {
        return i == 1;
    }

    public static class Builder {
        protected java.lang.String zzaq;
        protected boolean zzar;
        protected int zzas = 0;

        public com.google.android.gms.drive.ExecutionOptions.Builder setTrackingTag(java.lang.String str) {
            if (!(!android.text.TextUtils.isEmpty(str) && str.length() <= 65536)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", 65536));
            }
            this.zzaq = str;
            return this;
        }

        public com.google.android.gms.drive.ExecutionOptions.Builder setNotifyOnCompletion(boolean z) {
            this.zzar = z;
            return this;
        }

        public com.google.android.gms.drive.ExecutionOptions.Builder setConflictStrategy(int i) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            if (!z) {
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(53).append("Unrecognized value for conflict strategy: ").append(i).toString());
            }
            this.zzas = i;
            return this;
        }

        protected final void zzo() {
            if (this.zzas == 1 && !this.zzar) {
                throw new java.lang.IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            }
        }

        public com.google.android.gms.drive.ExecutionOptions build() {
            zzo();
            return new com.google.android.gms.drive.ExecutionOptions(this.zzaq, this.zzar, this.zzas);
        }
    }

    public final java.lang.String zzl() {
        return this.zzan;
    }

    public final boolean zzm() {
        return this.zzao;
    }

    public final int zzn() {
        return this.zzap;
    }

    @java.lang.Deprecated
    public final void zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        zza((com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY));
    }

    public final void zza(com.google.android.gms.internal.drive.zzaw zzawVar) {
        if (this.zzao && !zzawVar.zzah()) {
            throw new java.lang.IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.drive.ExecutionOptions executionOptions = (com.google.android.gms.drive.ExecutionOptions) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzan, executionOptions.zzan) && this.zzap == executionOptions.zzap && this.zzao == executionOptions.zzao) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzan, java.lang.Integer.valueOf(this.zzap), java.lang.Boolean.valueOf(this.zzao));
    }
}
