package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\t\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/r;", "Lcom/ironsource/ve;", "Lcom/ironsource/ve$a;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/services/AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "isCapped", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/Map;", "adFormatCappedMap", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class r implements com.json.ve, com.ironsource.ve.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<com.ironsource.mediationsdk.IronSource.AD_UNIT, java.util.concurrent.atomic.AtomicBoolean> adFormatCappedMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, new java.util.concurrent.atomic.AtomicBoolean(false)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, new java.util.concurrent.atomic.AtomicBoolean(false)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new java.util.concurrent.atomic.AtomicBoolean(false)));

    @Override // com.ironsource.ve.a
    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat, boolean isCapped) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.adFormatCappedMap.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(isCapped);
        }
    }

    @Override // com.json.ve
    public boolean a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.adFormatCappedMap.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
