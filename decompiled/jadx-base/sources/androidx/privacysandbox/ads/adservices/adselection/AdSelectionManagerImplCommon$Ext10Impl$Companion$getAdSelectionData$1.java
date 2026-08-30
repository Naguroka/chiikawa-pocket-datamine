package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", i = {0, 0}, l = {231}, m = "getAdSelectionData", n = {"adSelectionManager", "getAdSelectionDataRequest"}, s = {"L$0", "L$1"})
final class AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion companion, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdSelectionData(null, null, this);
    }
}
