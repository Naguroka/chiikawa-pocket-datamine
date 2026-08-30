package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000b\u001aY\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"registerForActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "I", "O", "Landroidx/activity/result/ActivityResultCaller;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "callback", "Lkotlin/Function1;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultCallerKt {
    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.activity.result.ActivityResultCaller activityResultCaller, androidx.activity.result.contract.ActivityResultContract<I, O> contract, I i, androidx.activity.result.ActivityResultRegistry registry, final kotlin.jvm.functions.Function1<? super O, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "contract");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        androidx.activity.result.ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(contract, registry, new androidx.activity.result.ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                androidx.activity.result.ActivityResultCallerKt.registerForActivityResult$lambda$0(callback, obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new androidx.activity.result.ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, contract, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(kotlin.jvm.functions.Function1 callback, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }

    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.activity.result.ActivityResultCaller activityResultCaller, androidx.activity.result.contract.ActivityResultContract<I, O> contract, I i, final kotlin.jvm.functions.Function1<? super O, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "contract");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        androidx.activity.result.ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(contract, new androidx.activity.result.ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                androidx.activity.result.ActivityResultCallerKt.registerForActivityResult$lambda$1(callback, obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new androidx.activity.result.ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, contract, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(kotlin.jvm.functions.Function1 callback, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }
}
