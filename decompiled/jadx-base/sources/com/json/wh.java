package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/wh;", "", "Lcom/ironsource/at;", com.ironsource.y8.a.t, "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "", "", "Lcom/ironsource/os;", "configuration", "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface wh {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/wh$a;", "", "Lcom/ironsource/rs;", "historyRecord", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(com.json.rs historyRecord);
    }

    int a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat);

    java.util.List<java.lang.String> a();

    java.util.Map<java.lang.String, org.json.JSONObject> a(com.json.os configuration);

    org.json.JSONObject a(com.json.at mode);
}
