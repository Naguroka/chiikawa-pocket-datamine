package androidx.activity;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0017J\u0012\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0015J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020 H\u0015J\b\u0010,\u001a\u00020 H\u0015J\u0010\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\bH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u0014¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycleRegistry", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "addContentView", "", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "initViewTreeOwners", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "onStart", "onStop", "setContentView", "layoutResID", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentDialog extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.savedstate.SavedStateRegistryOwner {
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;
    private final androidx.savedstate.SavedStateRegistryController savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(android.content.Context context) {
        this(context, 0, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public /* synthetic */ ComponentDialog(android.content.Context context, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(android.content.Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = androidx.savedstate.SavedStateRegistryController.INSTANCE.create(this);
        this.onBackPressedDispatcher = new androidx.activity.OnBackPressedDispatcher(new java.lang.Runnable() { // from class: androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.activity.ComponentDialog.onBackPressedDispatcher$lambda$1(this.f$0);
            }
        });
    }

    private final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
        androidx.lifecycle.LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        androidx.lifecycle.LifecycleRegistry lifecycleRegistry2 = new androidx.lifecycle.LifecycleRegistry(this);
        this._lifecycleRegistry = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // android.app.Dialog
    public android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.performSave(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.performRestore(savedInstanceState);
        getLifecycleRegistry().handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(androidx.activity.ComponentDialog this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.onBackPressed();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initViewTreeOwners();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.setContentView(view, params);
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        initViewTreeOwners();
        super.addContentView(view, params);
    }

    private final void initViewTreeOwners() {
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNull(window);
        android.view.View decorView = window.getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        androidx.lifecycle.ViewTreeLifecycleOwner.set(decorView, this);
        android.view.Window window2 = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNull(window2);
        android.view.View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(decorView2, this);
        android.view.Window window3 = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNull(window3);
        android.view.View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(decorView3, this);
    }
}
