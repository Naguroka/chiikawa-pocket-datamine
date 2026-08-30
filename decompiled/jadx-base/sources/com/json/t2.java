package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020\u0000\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011J\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b\u000e\u0010#¨\u0006-"}, d2 = {"Lcom/ironsource/t2;", "Lcom/ironsource/l1;", "Lcom/ironsource/dr;", "task", "", "c", "Lcom/ironsource/mediationsdk/IronSourceSegment;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "", com.json.j5.s, "e", "Lcom/ironsource/z;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vh$a;", "m", "", "k", "", "timeStamp", "instanceName", "j", "g", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/p2;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/p2;", "()Lcom/ironsource/p2;", "auctionHistory", "Lcom/ironsource/d5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/d5;", "()Lcom/ironsource/d5;", "(Lcom/ironsource/d5;)V", "auctionRequestEnricher", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/b2$b;", "level", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/t1;Lcom/ironsource/b2$b;)V", "adUnitTools", "(Lcom/ironsource/t2;Lcom/ironsource/b2$b;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class t2 extends com.json.l1 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final com.json.p2 auctionHistory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.d5 auctionRequestEnricher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.json.l1 adTools, com.json.t1 adUnitData, com.ironsource.b2.b level) {
        super(adTools, level);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.adTools = adTools;
        com.json.p2 p2VarA = com.json.rt.a(adUnitData, adUnitData.getAuctionSettings().c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p2VarA, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.auctionHistory = p2VarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.json.t2 adUnitTools, com.ironsource.b2.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.adTools = adUnitTools.adTools;
        this.auctionHistory = adUnitTools.auctionHistory;
        this.auctionRequestEnricher = adUnitTools.auctionRequestEnricher;
    }

    public final com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.json.z instanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.json.mediationsdk.c.b().a(instanceData.u(), instanceData.getAdFormat(), instanceData.i().getAdProperties().getLevelPlayAdId().getId());
    }

    public final java.lang.String a(long timeStamp, java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.lang.String transId = com.json.mediationsdk.utils.IronSourceUtils.getTransId(timeStamp, instanceName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }

    public final void a(com.json.d5 d5Var) {
        this.auctionRequestEnricher = d5Var;
    }

    public final void c(com.json.dr task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        com.json.st.a(com.json.st.f3417a, task, 0L, 2, null);
    }

    public final java.lang.String e(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        java.lang.String strC = com.json.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.json.p2 getAuctionHistory() {
        return this.auctionHistory;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.json.d5 getAuctionRequestEnricher() {
        return this.auctionRequestEnricher;
    }

    public final java.lang.String j() {
        return com.json.mediationsdk.p.m().l();
    }

    public final java.util.Map<java.lang.String, java.lang.String> k() {
        return com.json.mediationsdk.p.m().s();
    }

    public final com.json.mediationsdk.IronSourceSegment l() {
        return com.json.rt.a();
    }

    public final com.ironsource.vh.a m() {
        return com.json.im.INSTANCE.a().e();
    }
}
