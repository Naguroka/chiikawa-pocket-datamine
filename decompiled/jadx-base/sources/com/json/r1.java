package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ironsource/r1;", "Lcom/ironsource/h8;", "Lcom/ironsource/bf$a;", "cappingService", "", "adUnitId", "Lcom/ironsource/s$d;", "features", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lkotlin/Result;", "result", "Lcom/ironsource/k8;", "cappingType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/ironsource/k8;)V", "Lcom/ironsource/rl;", "Lcom/ironsource/rl;", "tools", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/s;", "Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lcom/ironsource/rl;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class r1 implements com.json.h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rl tools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> adFormatsConfigurations;

    public r1(com.json.rl tools, java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> adFormatsConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.tools = tools;
        this.adFormatsConfigurations = adFormatsConfigurations;
    }

    private final void a(com.ironsource.bf.a cappingService, java.lang.String adUnitId, com.ironsource.s.d features) throws org.json.JSONException {
        com.json.e8 capping = features.getCapping();
        if (capping != null) {
            com.json.k8 k8Var = com.json.k8.ShowCount;
            a(cappingService.a(adUnitId, k8Var, new com.json.b8(capping.getEnabled(), capping.getMaxImpressions(), capping.getUnit())), adUnitId, k8Var);
        }
    }

    private final void a(java.lang.Object result, java.lang.String adUnitId, com.json.k8 cappingType) throws org.json.JSONException {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(result);
        if (thM1304exceptionOrNullimpl != null) {
            this.tools.a(adUnitId, new com.json.f8().a(cappingType), thM1304exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(com.ironsource.bf.a cappingService, java.lang.String adUnitId, com.ironsource.s.d features) throws org.json.JSONException {
        com.json.yo yoVar = features.getCom.ironsource.s.f java.lang.String();
        if (yoVar != null) {
            com.json.k8 k8Var = com.json.k8.Pacing;
            a(cappingService.a(adUnitId, k8Var, new com.json.b8(yoVar.getEnabled(), yoVar.getNumOfSeconds(), yoVar.getUnit())), adUnitId, k8Var);
        }
    }

    @Override // com.json.h8
    public void a(com.ironsource.bf.a cappingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        java.util.Iterator<java.util.Map.Entry<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s>> it = this.adFormatsConfigurations.entrySet().iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry<java.lang.String, com.ironsource.s.d> entry : it.next().getValue().a().entrySet()) {
                java.lang.String key = entry.getKey();
                com.ironsource.s.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }
}
