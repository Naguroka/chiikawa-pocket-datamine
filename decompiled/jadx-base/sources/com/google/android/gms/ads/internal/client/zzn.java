package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzn {
    private android.os.Bundle zza = new android.os.Bundle();
    private java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final android.os.Bundle zze = new android.os.Bundle();
    private final android.os.Bundle zzf = new android.os.Bundle();
    private final java.util.List zzg = new java.util.ArrayList();
    private int zzh = -1;
    private java.lang.String zzi = null;
    private final java.util.List zzj = new java.util.ArrayList();
    private int zzk = 60000;
    private final int zzl = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final com.google.android.gms.ads.internal.client.zzm zza() {
        android.os.Bundle bundle = this.zze;
        android.os.Bundle bundle2 = this.zza;
        android.os.Bundle bundle3 = this.zzf;
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle2, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, bundle, bundle3, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null, this.zzl, this.zzm);
    }

    public final com.google.android.gms.ads.internal.client.zzn zzb(android.os.Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzc(int i) {
        this.zzk = i;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zze(java.util.List list) {
        this.zzb = list;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzf(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzg(long j) {
        this.zzm = j;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzh(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzi(int i) {
        this.zzh = i;
        return this;
    }
}
