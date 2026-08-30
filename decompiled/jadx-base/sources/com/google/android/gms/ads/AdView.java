package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdView extends com.google.android.gms.ads.BaseAdView {
    public AdView(android.content.Context context) {
        super(context, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final com.google.android.gms.ads.VideoController zza() {
        return this.zza.zzf();
    }

    public AdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
