package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/ironsource/bn;", "Lcom/ironsource/m1;", "Lcom/ironsource/b0;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/cn;", "adUnitData", "Lcom/ironsource/dn;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/cn;Lcom/ironsource/dn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bn extends com.json.m1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.json.l1 adTools, com.json.cn adUnitData, com.json.dn listener) {
        java.lang.String str;
        int iB;
        super(adTools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.json.mediationsdk.model.Placement placementH = h();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + placementH);
        if (placementH == null || android.text.TextUtils.isEmpty(placementH.getCom.ironsource.op.d java.lang.String())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = placementH == null ? "placement is null" : "placement name is empty";
            str = java.lang.String.format("can't load native ad - %s", java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = com.json.x1.b(adUnitData.getAdProperties().getAdFormat());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            com.json.mediationsdk.logger.IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.json.y a(com.json.bn this$0, com.json.z adInstanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        return new com.json.tm(new com.json.t2(this$0.getAdUnitTools(), com.ironsource.b2.b.PROVIDER), adInstanceData, new com.ironsource.m1.a());
    }

    @Override // com.json.m1
    protected com.json.b0 a() {
        return new com.json.b0() { // from class: com.ironsource.bn$$ExternalSyntheticLambda0
            @Override // com.json.b0
            public final com.json.y a(com.json.z zVar) {
                return com.json.bn.a(this.f$0, zVar);
            }
        };
    }
}
