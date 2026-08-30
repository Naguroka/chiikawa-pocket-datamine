package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements java.lang.Iterable<android.content.Intent> {
    private static final java.lang.String TAG = "TaskStackBuilder";
    private final java.util.ArrayList<android.content.Intent> mIntents = new java.util.ArrayList<>();
    private final android.content.Context mSourceContext;

    public interface SupportParentable {
        android.content.Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(android.content.Context context) {
        this.mSourceContext = context;
    }

    public static androidx.core.app.TaskStackBuilder create(android.content.Context context) {
        return new androidx.core.app.TaskStackBuilder(context);
    }

    @java.lang.Deprecated
    public static androidx.core.app.TaskStackBuilder from(android.content.Context context) {
        return create(context);
    }

    public androidx.core.app.TaskStackBuilder addNextIntent(android.content.Intent intent) {
        this.mIntents.add(intent);
        return this;
    }

    public androidx.core.app.TaskStackBuilder addNextIntentWithParentStack(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.mSourceContext.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.core.app.TaskStackBuilder addParentStack(android.app.Activity activity) {
        android.content.Intent supportParentActivityIntent = activity instanceof androidx.core.app.TaskStackBuilder.SupportParentable ? ((androidx.core.app.TaskStackBuilder.SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            android.content.ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public androidx.core.app.TaskStackBuilder addParentStack(java.lang.Class<?> cls) {
        return addParentStack(new android.content.ComponentName(this.mSourceContext, cls));
    }

    public androidx.core.app.TaskStackBuilder addParentStack(android.content.ComponentName componentName) {
        int size = this.mIntents.size();
        try {
            android.content.Intent parentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (parentActivityIntent != null) {
                this.mIntents.add(size, parentActivityIntent);
                parentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(this.mSourceContext, parentActivityIntent.getComponent());
            }
            return this;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(TAG, "Bad ComponentName while traversing activity parent metadata");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public int getIntentCount() {
        return this.mIntents.size();
    }

    @java.lang.Deprecated
    public android.content.Intent getIntent(int i) {
        return editIntentAt(i);
    }

    public android.content.Intent editIntentAt(int i) {
        return this.mIntents.get(i);
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public java.util.Iterator<android.content.Intent> iterator() {
        return this.mIntents.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public void startActivities(android.os.Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) this.mIntents.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.ContextCompat.startActivities(this.mSourceContext, intentArr, bundle)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.mSourceContext.startActivity(intent);
    }

    public android.app.PendingIntent getPendingIntent(int i, int i2) {
        return getPendingIntent(i, i2, null);
    }

    public android.app.PendingIntent getPendingIntent(int i, int i2, android.os.Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) this.mIntents.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        return androidx.core.app.TaskStackBuilder.Api16Impl.getActivities(this.mSourceContext, i, intentArr, i2, bundle);
    }

    public android.content.Intent[] getIntents() {
        int size = this.mIntents.size();
        android.content.Intent[] intentArr = new android.content.Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new android.content.Intent(this.mIntents.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new android.content.Intent(this.mIntents.get(i));
        }
        return intentArr;
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.app.PendingIntent getActivities(android.content.Context context, int i, android.content.Intent[] intentArr, int i2, android.os.Bundle bundle) {
            return android.app.PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }
}
