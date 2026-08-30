package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J8\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0012J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/jp;", "", "Lcom/ironsource/uf$a;", "cappingService", "", com.json.op.d, "Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/ironsource/s$d;", "features", "", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "c", "Lkotlin/Result;", "result", "Lcom/ironsource/k8;", "cappingType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/k8;)V", "Lcom/ironsource/rl;", "Lcom/ironsource/rl;", "tools", "", "Lcom/ironsource/s;", "Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lcom/ironsource/rl;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rl tools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> adFormatsConfigurations;

    public jp(com.json.rl tools, java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> adFormatsConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.tools = tools;
        this.adFormatsConfigurations = adFormatsConfigurations;
    }

    private final void a(com.ironsource.uf.a cappingService, java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.s.d features) throws org.json.JSONException {
        com.json.e8 capping = features.getCapping();
        if (capping != null) {
            com.json.k8 k8Var = com.json.k8.ShowCount;
            a(cappingService.a(placementName, adFormat, k8Var, new com.json.b8(capping.getEnabled(), capping.getMaxImpressions(), capping.getUnit())), placementName, adFormat, k8Var);
        }
    }

    private final void a(java.lang.Object result, java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.json.k8 cappingType) throws org.json.JSONException {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(result);
        if (thM1304exceptionOrNullimpl != null) {
            this.tools.a(placementName, adFormat, new com.json.f8().a(cappingType), thM1304exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(com.ironsource.uf.a cappingService, java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.s.d features) throws org.json.JSONException {
        com.json.k8 k8Var = com.json.k8.Delivery;
        com.json.la laVar = features.getCom.ironsource.s.g java.lang.String();
        a(cappingService.a(placementName, adFormat, k8Var, new com.json.b8(laVar != null ? java.lang.Boolean.valueOf(laVar.getEnabled()) : null, null, null, 6, null)), placementName, adFormat, k8Var);
    }

    private final void c(com.ironsource.uf.a cappingService, java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.s.d features) throws org.json.JSONException {
        com.json.yo yoVar = features.getCom.ironsource.s.f java.lang.String();
        if (yoVar != null) {
            com.json.k8 k8Var = com.json.k8.Pacing;
            a(cappingService.a(placementName, adFormat, k8Var, new com.json.b8(yoVar.getEnabled(), yoVar.getNumOfSeconds(), com.json.j8.Second)), placementName, adFormat, k8Var);
        }
    }

    public final void a(com.ironsource.uf.a cappingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (java.util.Map.Entry<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> entry : this.adFormatsConfigurations.entrySet()) {
            com.unity3d.mediation.LevelPlay.AdFormat key = entry.getKey();
            for (java.util.Map.Entry<java.lang.String, com.ironsource.s.d> entry2 : entry.getValue().c().entrySet()) {
                java.lang.String key2 = entry2.getKey();
                com.ironsource.s.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }
}
