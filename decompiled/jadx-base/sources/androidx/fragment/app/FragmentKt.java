package androidx.fragment.app;

/* JADX INFO: compiled from: Fragment.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aJ\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\u000f"}, d2 = {"clearFragmentResult", "", "Landroidx/fragment/app/Fragment;", "requestKey", "", "clearFragmentResultListener", "setFragmentResult", "result", "Landroid/os/Bundle;", "setFragmentResultListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "bundle", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentKt {
    public static final void setFragmentResult(androidx.fragment.app.Fragment setFragmentResult, java.lang.String requestKey, android.os.Bundle result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setFragmentResult, "$this$setFragmentResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        setFragmentResult.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void clearFragmentResult(androidx.fragment.app.Fragment clearFragmentResult, java.lang.String requestKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearFragmentResult, "$this$clearFragmentResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        clearFragmentResult.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void setFragmentResultListener(androidx.fragment.app.Fragment setFragmentResultListener, java.lang.String requestKey, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.os.Bundle, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setFragmentResultListener, "$this$setFragmentResultListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        setFragmentResultListener.getParentFragmentManager().setFragmentResultListener(requestKey, setFragmentResultListener, new androidx.fragment.app.FragmentResultListener() { // from class: androidx.fragment.app.FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0
            @Override // androidx.fragment.app.FragmentResultListener
            public final /* synthetic */ void onFragmentResult(java.lang.String p0, android.os.Bundle p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listener.invoke(p0, p1), "invoke(...)");
            }
        });
    }

    public static final void clearFragmentResultListener(androidx.fragment.app.Fragment clearFragmentResultListener, java.lang.String requestKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearFragmentResultListener, "$this$clearFragmentResultListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        clearFragmentResultListener.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }
}
