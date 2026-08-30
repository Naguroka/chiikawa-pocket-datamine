package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public interface ActivityResultCaller {
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultCallback<O> activityResultCallback);

    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultRegistry activityResultRegistry, androidx.activity.result.ActivityResultCallback<O> activityResultCallback);
}
