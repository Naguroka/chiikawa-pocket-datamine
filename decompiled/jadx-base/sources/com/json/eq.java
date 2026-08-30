package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0010J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/eq;", "", "Lcom/ironsource/zf$a;", "rewardService", "", "identifier", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, "", "b", "(Lcom/ironsource/zf$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "name", "amount", "Lkotlin/Result;", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Object;", "Lcom/ironsource/rl;", "Lcom/ironsource/rl;", "tools", "", "Lcom/ironsource/s$d;", "Ljava/util/Map;", com.json.v2.c, "c", com.json.op.c, "<init>", "(Lcom/ironsource/rl;Ljava/util/Map;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.rl tools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.ironsource.s.d> adUnits;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.ironsource.s.d> placements;

    public eq(com.json.rl tools, java.util.Map<java.lang.String, com.ironsource.s.d> map, java.util.Map<java.lang.String, com.ironsource.s.d> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        this.tools = tools;
        this.adUnits = map;
        this.placements = map2;
    }

    private final java.lang.Object a(java.lang.String name, java.lang.Integer amount) {
        java.lang.Object objCreateFailure;
        if (name == null || amount == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objCreateFailure = kotlin.ResultKt.createFailure(new java.lang.Exception("name - " + name + " or amount - " + amount + " is not provided or invalid"));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objCreateFailure = kotlin.Unit.INSTANCE;
        }
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }

    private final void a(com.ironsource.zf.a rewardService, java.lang.String identifier, java.lang.String rewardName, java.lang.Integer rewardAmount) throws org.json.JSONException {
        java.lang.Object objA = a(rewardName, rewardAmount);
        if (kotlin.Result.m1308isSuccessimpl(objA)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rewardName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(rewardAmount);
            rewardService.b(identifier, rewardName, rewardAmount.intValue());
        }
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objA);
        if (thM1304exceptionOrNullimpl != null) {
            this.tools.b(identifier, 3004, thM1304exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(com.ironsource.zf.a rewardService, java.lang.String identifier, java.lang.String rewardName, java.lang.Integer rewardAmount) throws org.json.JSONException {
        java.lang.Object objA = a(rewardName, rewardAmount);
        if (kotlin.Result.m1308isSuccessimpl(objA)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rewardName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(rewardAmount);
            rewardService.a(identifier, rewardName, rewardAmount.intValue());
        }
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objA);
        if (thM1304exceptionOrNullimpl != null) {
            this.tools.b(identifier, 3004, thM1304exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(com.ironsource.zf.a rewardService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        java.util.Map<java.lang.String, com.ironsource.s.d> map = this.placements;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (java.util.Map.Entry<java.lang.String, com.ironsource.s.d> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                com.json.cq placementReward = entry.getValue().getPlacementReward();
                if (placementReward != null) {
                    b(rewardService, key, placementReward.getName(), placementReward.getAmount());
                }
            }
        }
        java.util.Map<java.lang.String, com.ironsource.s.d> map2 = this.adUnits;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.ironsource.s.d> entry2 : map2.entrySet()) {
            java.lang.String key2 = entry2.getKey();
            com.json.cq adUnitReward = entry2.getValue().getAdUnitReward();
            if (adUnitReward != null) {
                a(rewardService, key2, adUnitReward.getName(), adUnitReward.getAmount());
            }
        }
    }
}
