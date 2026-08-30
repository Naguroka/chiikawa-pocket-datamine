package androidx.privacysandbox.ads.adservices.java.customaudience;

/* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {org.objectweb.asm.Opcodes.I2B}, m = "invokeSuspend", n = {}, s = {})
final class CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest $request;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = joinCustomAudienceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager customAudienceManager = this.this$0.mCustomAudienceManager;
            kotlin.jvm.internal.Intrinsics.checkNotNull(customAudienceManager);
            this.label = 1;
            if (customAudienceManager.joinCustomAudience(this.$request, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
