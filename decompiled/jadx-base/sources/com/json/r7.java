package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ironsource/r7;", "Lcom/ironsource/e0;", "Lcom/ironsource/y;", com.json.j5.p, "Lcom/ironsource/e0$b;", "loadSelection", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/vv;", "waterfallInstances", "<init>", "(Lcom/ironsource/t1;Lcom/ironsource/vv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class r7 extends com.json.e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(com.json.t1 adUnitData, com.json.vv waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.json.e0
    public void a(com.json.y instance, com.ironsource.e0.b loadSelection) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        if (!instance.getIsBidder()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceName() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.getInstanceName() + ". No other instances will be loaded at the same time.";
            loadSelection.a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.getInstanceName() + " as a non bidder is being loaded";
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - " + str);
    }

    @Override // com.json.e0
    public boolean a(com.ironsource.e0.b loadSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.getIsBidderReached();
    }
}
