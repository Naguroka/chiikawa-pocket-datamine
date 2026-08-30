package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0007J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minState", "Landroidx/lifecycle/Lifecycle$State;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "parentJob", "Lkotlinx/coroutines/Job;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "finish", "", "handleDestroy", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleController {
    private final androidx.lifecycle.DispatchQueue dispatchQueue;
    private final androidx.lifecycle.Lifecycle lifecycle;
    private final androidx.lifecycle.Lifecycle.State minState;
    private final androidx.lifecycle.LifecycleEventObserver observer;

    public LifecycleController(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State minState, androidx.lifecycle.DispatchQueue dispatchQueue, final kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minState, "minState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.lifecycle.LifecycleController.observer$lambda$0(this.f$0, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getState() != androidx.lifecycle.Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(parentJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(androidx.lifecycle.LifecycleController this$0, kotlinx.coroutines.Job parentJob, androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getState() != androidx.lifecycle.Lifecycle.State.DESTROYED) {
            if (source.getLifecycle().getState().compareTo(this$0.minState) < 0) {
                this$0.dispatchQueue.pause();
                return;
            } else {
                this$0.dispatchQueue.resume();
                return;
            }
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(parentJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        this$0.finish();
    }

    private final void handleDestroy(kotlinx.coroutines.Job parentJob) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(parentJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        finish();
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
