package androidx.activity;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {188}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.activity.FullyDrawnReporterKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.activity.FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.activity.FullyDrawnReporterKt.AnonymousClass1 anonymousClass1;
        androidx.activity.FullyDrawnReporter fullyDrawnReporter2;
        if (continuation instanceof androidx.activity.FullyDrawnReporterKt.AnonymousClass1) {
            anonymousClass1 = (androidx.activity.FullyDrawnReporterKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.activity.FullyDrawnReporterKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new androidx.activity.FullyDrawnReporterKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return kotlin.Unit.INSTANCE;
                }
                anonymousClass1.L$0 = fullyDrawnReporter;
                anonymousClass1.label = 1;
                if (function1.invoke(anonymousClass1) == coroutine_suspended) {
                    fullyDrawnReporter2 = fullyDrawnReporter;
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.activity.FullyDrawnReporter fullyDrawnReporter3 = (androidx.activity.FullyDrawnReporter) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                fullyDrawnReporter2 = fullyDrawnReporter3;
            }
            fullyDrawnReporter2 = fullyDrawnReporter;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter2.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            fullyDrawnReporter = kotlin.Unit.INSTANCE;
            return fullyDrawnReporter;
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private static final java.lang.Object reportWhenComplete$$forInline(androidx.activity.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return kotlin.Unit.INSTANCE;
        }
        try {
            function1.invoke(continuation);
            return kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
