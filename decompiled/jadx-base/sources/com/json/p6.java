package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ironsource/p6;", "Lcom/ironsource/o1;", "Lcom/ironsource/mediationsdk/i;", "auctionRequestParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/ISBannerSize;", "b", "Lcom/ironsource/mediationsdk/ISBannerSize;", com.json.h6.u, "Lcom/ironsource/c1;", "adProperties", "<init>", "(Lcom/ironsource/c1;Lcom/ironsource/mediationsdk/ISBannerSize;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p6 extends com.json.o1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.ISBannerSize bannerSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(com.json.c1 adProperties, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.bannerSize = iSBannerSize;
    }

    @Override // com.json.o1, com.json.d5
    public void a(com.json.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.bannerSize);
    }
}
