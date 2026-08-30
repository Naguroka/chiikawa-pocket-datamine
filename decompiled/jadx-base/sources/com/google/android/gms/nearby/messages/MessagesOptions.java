package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class MessagesOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public final int zzc;
    public final java.lang.String zza = null;
    public final boolean zzb = false;
    public final java.lang.String zzd = null;
    public final java.lang.String zze = null;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Builder {
        private int zza = -1;

        public com.google.android.gms.nearby.messages.MessagesOptions build() {
            return new com.google.android.gms.nearby.messages.MessagesOptions(this, null);
        }

        public com.google.android.gms.nearby.messages.MessagesOptions.Builder setPermissions(int i) {
            this.zza = i;
            return this;
        }
    }

    /* synthetic */ MessagesOptions(com.google.android.gms.nearby.messages.MessagesOptions.Builder builder, com.google.android.gms.nearby.messages.zzd zzdVar) {
        this.zzc = builder.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.MessagesOptions)) {
            return false;
        }
        com.google.android.gms.nearby.messages.MessagesOptions messagesOptions = (com.google.android.gms.nearby.messages.MessagesOptions) obj;
        java.lang.String str = messagesOptions.zza;
        if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
            boolean z = messagesOptions.zzb;
            java.lang.String str2 = messagesOptions.zzd;
            if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                java.lang.String str3 = messagesOptions.zze;
                if (com.google.android.gms.common.internal.Objects.equal(null, null) && this.zzc == messagesOptions.zzc) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(null, false, null, null, java.lang.Integer.valueOf(this.zzc));
    }
}
