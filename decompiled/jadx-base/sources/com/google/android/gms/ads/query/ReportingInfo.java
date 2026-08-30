package com.google.android.gms.ads.query;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class ReportingInfo {
    private final com.google.android.gms.internal.ads.zzbub zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private final com.google.android.gms.internal.ads.zzbua zza;

        @java.lang.Deprecated
        public Builder(android.view.View view) {
            com.google.android.gms.internal.ads.zzbua zzbuaVar = new com.google.android.gms.internal.ads.zzbua();
            this.zza = zzbuaVar;
            zzbuaVar.zzb(view);
        }

        @java.lang.Deprecated
        public com.google.android.gms.ads.query.ReportingInfo build() {
            return new com.google.android.gms.ads.query.ReportingInfo(this, null);
        }

        @java.lang.Deprecated
        public com.google.android.gms.ads.query.ReportingInfo.Builder setAssetViews(java.util.Map<java.lang.String, android.view.View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(com.google.android.gms.ads.query.ReportingInfo.Builder builder, com.google.android.gms.ads.query.zzb zzbVar) {
        this.zza = new com.google.android.gms.internal.ads.zzbub(builder.zza);
    }

    @java.lang.Deprecated
    public void recordClick(java.util.List<android.net.Uri> list) {
        this.zza.zza(list);
    }

    @java.lang.Deprecated
    public void recordImpression(java.util.List<android.net.Uri> list) {
        this.zza.zzb(list);
    }

    @java.lang.Deprecated
    public void reportTouchEvent(android.view.MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @java.lang.Deprecated
    public void updateClickUrl(android.net.Uri uri, com.google.android.gms.ads.query.UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @java.lang.Deprecated
    public void updateImpressionUrls(java.util.List<android.net.Uri> list, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
