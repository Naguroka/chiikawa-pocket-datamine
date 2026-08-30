package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    public android.graphics.Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
        return this;
    }

    public android.os.Bundle toBundle() {
        return null;
    }

    public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context context, int i, int i2) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api16Impl.makeCustomAnimation(context, i, i2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api16Impl.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api23Impl.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View view, android.graphics.Bitmap bitmap, int i, int i2) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api16Impl.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, android.view.View view, java.lang.String str) {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(activity, view, str));
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, androidx.core.util.Pair<android.view.View, java.lang.String>... pairArr) {
        android.util.Pair[] pairArr2;
        if (pairArr != null) {
            pairArr2 = new android.util.Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                pairArr2[i] = android.util.Pair.create(pairArr[i].first, pairArr[i].second);
            }
        } else {
            pairArr2 = null;
        }
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(activity, pairArr2));
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api21Impl.makeTaskLaunchBehind());
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
        return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api23Impl.makeBasic());
    }

    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
            androidx.core.app.ActivityOptionsCompat.Api23Impl.requestUsageTimeReport(this.mActivityOptions, pendingIntent);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(androidx.core.app.ActivityOptionsCompat.Api24Impl.setLaunchBounds(this.mActivityOptions, rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
            return androidx.core.app.ActivityOptionsCompat.Api24Impl.getLaunchBounds(this.mActivityOptions);
        }
    }

    protected ActivityOptionsCompat() {
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.app.ActivityOptions makeCustomAnimation(android.content.Context context, int i, int i2) {
            return android.app.ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        static android.app.ActivityOptions makeScaleUpAnimation(android.view.View view, int i, int i2, int i3, int i4) {
            return android.app.ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View view, android.graphics.Bitmap bitmap, int i, int i2) {
            return android.app.ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.app.ActivityOptions makeClipRevealAnimation(android.view.View view, int i, int i2, int i3, int i4) {
            return android.app.ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        static android.app.ActivityOptions makeBasic() {
            return android.app.ActivityOptions.makeBasic();
        }

        static void requestUsageTimeReport(android.app.ActivityOptions activityOptions, android.app.PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity activity, android.view.View view, java.lang.String str) {
            return android.app.ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @java.lang.SafeVarargs
        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity activity, android.util.Pair<android.view.View, java.lang.String>... pairArr) {
            return android.app.ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static android.app.ActivityOptions makeTaskLaunchBehind() {
            return android.app.ActivityOptions.makeTaskLaunchBehind();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.app.ActivityOptions setLaunchBounds(android.app.ActivityOptions activityOptions, android.graphics.Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }

        static android.graphics.Rect getLaunchBounds(android.app.ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }
    }
}
