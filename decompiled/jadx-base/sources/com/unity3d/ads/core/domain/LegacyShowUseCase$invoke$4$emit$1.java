package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: LegacyShowUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", i = {3, 3}, l = {154, 155, 156, 158, org.objectweb.asm.Opcodes.IF_ICMPGT}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
final class LegacyShowUseCase$invoke$4$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4$emit$1(com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4<? super T> anonymousClass4, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((com.unity3d.ads.core.data.model.ShowEvent) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
