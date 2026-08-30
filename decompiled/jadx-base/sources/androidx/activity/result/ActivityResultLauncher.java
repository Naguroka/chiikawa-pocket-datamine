package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract androidx.activity.result.contract.ActivityResultContract<I, ?> getContract();

    public abstract void launch(I i, androidx.core.app.ActivityOptionsCompat activityOptionsCompat);

    public abstract void unregister();

    public void launch(I i) {
        launch(i, null);
    }
}
