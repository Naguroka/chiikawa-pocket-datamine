package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/ve;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/services/AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ve {

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ve$a;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/services/AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "isCapped", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat, boolean isCapped);
    }

    boolean a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat);
}
