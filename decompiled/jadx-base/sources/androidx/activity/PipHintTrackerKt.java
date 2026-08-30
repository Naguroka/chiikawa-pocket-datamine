package androidx.activity;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PipHintTrackerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect trackPipAnimationHintView$positionInWindow(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static final java.lang.Object trackPipAnimationHintView(final android.app.Activity activity, android.view.View view, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objCollect = kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((android.graphics.Rect) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(android.graphics.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                androidx.activity.Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
    }
}
