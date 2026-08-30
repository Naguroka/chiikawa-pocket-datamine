package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/pv;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/View;", "view", "b", "", "c", "Lcom/ironsource/no;", "Lcom/ironsource/no;", "onVisibilityChangeListener", "Landroid/view/View;", "Z", "wasVisible", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "d", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "e", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "onWindowFocusChangeListener", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "rect", "<init>", "(Lcom/ironsource/no;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.no onVisibilityChangeListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private android.view.View view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean wasVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final android.view.ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final android.graphics.Rect rect;

    public pv(com.json.no onVisibilityChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.onVisibilityChangeListener = onVisibilityChangeListener;
        this.onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.pv$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.json.pv.a(this.f$0);
            }
        };
        this.onWindowFocusChangeListener = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.pv$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                com.json.pv.a(this.f$0, z);
            }
        };
        this.rect = new android.graphics.Rect();
    }

    private final void a() {
        boolean zC = c();
        if (this.wasVisible != zC) {
            this.wasVisible = zC;
            this.onVisibilityChangeListener.a(zC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.pv this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.pv this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
    }

    public final void b() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        android.view.View view = this.view;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        android.view.View view2 = this.view;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        this.view = null;
    }

    public final boolean c() {
        android.view.View view = this.view;
        if (!(view != null && view.isShown())) {
            return false;
        }
        android.view.View view2 = this.view;
        if (!(view2 != null && view2.hasWindowFocus())) {
            return false;
        }
        android.view.View view3 = this.view;
        return view3 != null && view3.getGlobalVisibleRect(this.rect);
    }
}
