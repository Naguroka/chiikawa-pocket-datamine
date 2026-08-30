package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/ironsource/cc;", "Lcom/ironsource/a2;", "Lcom/ironsource/c1;", "adProperties", "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class cc implements com.json.a2 {
    public final java.util.Map<java.lang.String, java.lang.Object> a(com.json.c1 adProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        java.lang.String string = adProperties.getAdFormat().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "adProperties.adFormat.toString()");
        map.put(com.json.bl.EVENTS_LEVEL_PLAY_AD_FORMAT_NAME, string);
        map.put("adf", java.lang.Integer.valueOf(com.json.rt.b(adProperties.getAdFormat())));
        map.put(com.json.bl.EVENTS_LEVEL_PLAY_AD_ID, adProperties.getLevelPlayAdId().getId());
        map.put("mediationAdUnitId", adProperties.getAdUnitId());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
