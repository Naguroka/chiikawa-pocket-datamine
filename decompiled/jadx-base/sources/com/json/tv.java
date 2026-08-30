package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J$\u0010\t\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ironsource/tv;", "", "Lcom/ironsource/j5;", "item", "Lcom/ironsource/g5;", "auctionData", "Lcom/ironsource/b0;", "adInstanceFactory", "Lcom/ironsource/y;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/uv;", "waterfallFetcherListener", "", "", "waterfallItems", "Lcom/ironsource/vv;", "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/t1;", "b", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/to;", "c", "Lcom/ironsource/to;", "()Lcom/ironsource/to;", "outcomeReporter", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/t1;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class tv {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final com.json.tv.Companion INSTANCE = new com.json.tv.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.to outcomeReporter;

    /* JADX INFO: renamed from: com.ironsource.tv$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/tv$a;", "", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/tv;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.tv a(com.json.t2 adTools, com.json.t1 adUnitData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new com.json.m5(adTools, adUnitData) : new com.json.bo(adTools, adUnitData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ironsource/tv$b", "Lcom/ironsource/to;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.to {
        b() {
        }
    }

    public tv(com.json.t2 adTools, com.json.t1 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        this.outcomeReporter = new com.ironsource.tv.b();
    }

    private final com.json.y a(com.json.j5 item, com.json.g5 auctionData, com.json.b0 adInstanceFactory) {
        com.json.t1 t1Var = this.adUnitData;
        java.lang.String strC = item.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strC, "item.instanceName");
        com.json.mediationsdk.model.NetworkSettings networkSettingsA = t1Var.a(strC);
        if (networkSettingsA != null) {
            com.json.mediationsdk.c.b().b(networkSettingsA, this.adUnitData.getAdProperties().getAdFormat(), this.adUnitData.getAdProperties().getLevelPlayAdId().getId());
            int iF = this.adTools.f();
            com.json.t1 t1Var2 = this.adUnitData;
            return adInstanceFactory.a(new com.json.z(t1Var2, networkSettingsA, auctionData, new com.json.z2(networkSettingsA, t1Var2.b(networkSettingsA), this.adUnitData.getAdProperties().getAdFormat()), item, iF));
        }
        java.lang.String str = "could not find matching provider settings for auction response item - item = " + item.c();
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(com.json.l1.a(this.adTools, str, (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.getEventSender().getTroubleshoot().h(str);
        return null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public com.json.to getOutcomeReporter() {
        return this.outcomeReporter;
    }

    public final com.json.vv a(java.util.List<? extends com.json.j5> waterfallItems, com.json.g5 auctionData, com.json.b0 adInstanceFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adTools, "waterfall.size() = " + waterfallItems.size(), (java.lang.String) null, 2, (java.lang.Object) null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = waterfallItems.size();
        for (int i = 0; i < size; i++) {
            com.json.y yVarA = a(waterfallItems.get(i), auctionData, adInstanceFactory);
            if (yVarA != null && yVarA.g() != null) {
                arrayList.add(yVarA);
            }
        }
        com.json.vv vvVar = new com.json.vv(arrayList);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adTools, "updateWaterfall() - next waterfall is " + vvVar + ".toWaterfallString()", (java.lang.String) null, 2, (java.lang.Object) null));
        return vvVar;
    }

    public abstract void a(com.json.b0 adInstanceFactory, com.json.uv waterfallFetcherListener);
}
