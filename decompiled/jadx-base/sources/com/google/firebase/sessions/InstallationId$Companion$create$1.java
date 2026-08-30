package com.google.firebase.sessions;

/* JADX INFO: compiled from: InstallationId.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", i = {0, 1}, l = {32, 40}, m = "create", n = {"firebaseInstallations", "authToken"}, s = {"L$0", "L$0"})
final class InstallationId$Companion$create$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.InstallationId.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallationId$Companion$create$1(com.google.firebase.sessions.InstallationId.Companion companion, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId$Companion$create$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
