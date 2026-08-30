package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/t4;", "Lcom/ironsource/u4;", "", "", "auctionUrls", "methodName", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "Lcom/ironsource/qi;", "Lcom/ironsource/qi;", "instanceInfo", "Lcom/ironsource/mediationsdk/d;", "Lcom/ironsource/mediationsdk/d;", "auctionDataUtils", "Lcom/ironsource/z4;", "Lcom/ironsource/z4;", "auctionReportUrls", "<init>", "(Lcom/ironsource/qi;Lcom/ironsource/mediationsdk/d;Lcom/ironsource/z4;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t4 implements com.json.u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.qi instanceInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.d auctionDataUtils;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.z4 auctionReportUrls;

    public t4(com.json.qi instanceInfo, com.json.mediationsdk.d auctionDataUtils, com.json.z4 z4Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.instanceInfo = instanceInfo;
        this.auctionDataUtils = auctionDataUtils;
        this.auctionReportUrls = z4Var;
    }

    private final void a(java.util.List<java.lang.String> auctionUrls, java.lang.String methodName) {
        java.util.Iterator<java.lang.String> it = auctionUrls.iterator();
        while (it.hasNext()) {
            this.auctionDataUtils.a(methodName, this.instanceInfo.e(), com.json.mediationsdk.d.b().a(it.next(), this.instanceInfo.e(), this.instanceInfo.f(), this.instanceInfo.d(), "", "", "", ""));
        }
    }

    @Override // com.json.u4
    public void a(java.lang.String methodName) {
        java.util.List<java.lang.String> listEmptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.json.z4 z4Var = this.auctionReportUrls;
        if (z4Var == null || (listEmptyList = z4Var.b()) == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.json.u4
    public void b(java.lang.String methodName) {
        java.util.List<java.lang.String> listEmptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.json.z4 z4Var = this.auctionReportUrls;
        if (z4Var == null || (listEmptyList = z4Var.c()) == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.json.u4
    public void c(java.lang.String methodName) {
        java.util.List<java.lang.String> listEmptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        com.json.z4 z4Var = this.auctionReportUrls;
        if (z4Var == null || (listEmptyList = z4Var.a()) == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }
}
