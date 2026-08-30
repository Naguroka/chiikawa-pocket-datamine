package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ironsource/h5;", "Lcom/ironsource/i5;", "Lkotlin/Result;", "Lcom/ironsource/f5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "", "Ljava/lang/String;", "encryptedAuctionResponse", "Lcom/ironsource/up;", "b", "Lcom/ironsource/up;", "providerName", "<init>", "(Ljava/lang/String;Lcom/ironsource/up;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class h5 implements com.json.i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String encryptedAuctionResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.up providerName;

    public h5(java.lang.String encryptedAuctionResponse, com.json.up providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.encryptedAuctionResponse = encryptedAuctionResponse;
        this.providerName = providerName;
    }

    @Override // com.json.i5
    public java.lang.Object a() {
        java.lang.Object objM1301constructorimpl;
        java.lang.String strC = com.json.jb.b().c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strC, "getInstance().mediationKey");
        com.json.pk pkVar = new com.json.pk(new com.json.da(this.encryptedAuctionResponse, strC));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(pkVar.a());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
        if (thM1304exceptionOrNullimpl == null) {
            return com.json.f5.INSTANCE.a((org.json.JSONObject) objM1301constructorimpl, this.providerName.value());
        }
        com.json.l9.d().a(thM1304exceptionOrNullimpl);
        if (thM1304exceptionOrNullimpl instanceof java.lang.IllegalArgumentException) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new com.json.lg(com.json.tb.f3430a.d())));
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new com.json.lg(com.json.tb.f3430a.h())));
    }
}
