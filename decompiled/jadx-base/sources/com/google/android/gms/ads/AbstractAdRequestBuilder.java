package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractAdRequestBuilder<T extends com.google.android.gms.ads.AbstractAdRequestBuilder<T>> {
    protected final com.google.android.gms.ads.internal.client.zzeh zza;

    protected AbstractAdRequestBuilder() {
        com.google.android.gms.ads.internal.client.zzeh zzehVar = new com.google.android.gms.ads.internal.client.zzeh();
        this.zza = zzehVar;
        zzehVar.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @java.lang.Deprecated
    public T addCustomEventExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.customevent.CustomEvent> cls, android.os.Bundle bundle) {
        this.zza.zzo(cls, bundle);
        return (T) self();
    }

    public T addCustomTargeting(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2) && str2.contains(",")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        this.zza.zzp(str, str2);
        return (T) self();
    }

    public T addKeyword(java.lang.String str) {
        this.zza.zzq(str);
        return (T) self();
    }

    public T addNetworkExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> cls, android.os.Bundle bundle) {
        this.zza.zzr(cls, bundle);
        if (cls.equals(com.google.ads.mediation.admob.AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.zza.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) self();
    }

    protected abstract T self();

    public T setAdString(java.lang.String str) {
        this.zza.zzv(str);
        return (T) self();
    }

    public T setContentUrl(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Content URL must be non-null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        com.google.android.gms.common.internal.Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, java.lang.Integer.valueOf(str.length()));
        this.zza.zzw(str);
        return (T) self();
    }

    public T setHttpTimeoutMillis(int i) {
        this.zza.zzx(i);
        return (T) self();
    }

    public T setNeighboringContentUrls(java.util.List<java.lang.String> list) {
        if (list == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.zza.zzz(list);
        return (T) self();
    }

    public T setRequestAgent(java.lang.String str) {
        this.zza.zzC(str);
        return (T) self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zza(java.lang.String str) {
        this.zza.zzt(str);
        return self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzb(boolean z) {
        this.zza.zzy(z);
        return self();
    }

    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzc(android.os.Bundle bundle) {
        this.zza.zzA(bundle);
        return self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzd(boolean z) {
        this.zza.zzD(z);
        return self();
    }

    public T addCustomTargeting(java.lang.String str, java.util.List<java.lang.String> list) {
        if (list != null) {
            for (java.lang.String str2 : list) {
                if (!android.text.TextUtils.isEmpty(str2) && str2.contains(",")) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
            }
            this.zza.zzp(str, android.text.TextUtils.join(",", list));
        }
        return (T) self();
    }
}
