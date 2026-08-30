package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate sDelegate;

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(android.app.Activity activity, int i, int i2, android.content.Intent intent);

        boolean requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    protected ActivityCompat() {
    }

    public static void setPermissionCompatDelegate(androidx.core.app.ActivityCompat.PermissionCompatDelegate permissionCompatDelegate) {
        sDelegate = permissionCompatDelegate;
    }

    public static androidx.core.app.ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    @java.lang.Deprecated
    public static boolean invalidateOptionsMenu(android.app.Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void startActivityForResult(android.app.Activity activity, android.content.Intent intent, int i, android.os.Bundle bundle) {
        androidx.core.app.ActivityCompat.Api16Impl.startActivityForResult(activity, intent, i, bundle);
    }

    public static void startIntentSenderForResult(android.app.Activity activity, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        androidx.core.app.ActivityCompat.Api16Impl.startIntentSenderForResult(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void finishAffinity(android.app.Activity activity) {
        androidx.core.app.ActivityCompat.Api16Impl.finishAffinity(activity);
    }

    public static void finishAfterTransition(android.app.Activity activity) {
        androidx.core.app.ActivityCompat.Api21Impl.finishAfterTransition(activity);
    }

    public static android.net.Uri getReferrer(android.app.Activity activity) {
        return androidx.core.app.ActivityCompat.Api22Impl.getReferrer(activity);
    }

    public static <T extends android.view.View> T requireViewById(android.app.Activity activity, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) androidx.core.app.ActivityCompat.Api28Impl.requireViewById(activity, i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(android.app.Activity activity, androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.Api21Impl.setEnterSharedElementCallback(activity, sharedElementCallback != null ? new androidx.core.app.ActivityCompat.SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void setExitSharedElementCallback(android.app.Activity activity, androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.Api21Impl.setExitSharedElementCallback(activity, sharedElementCallback != null ? new androidx.core.app.ActivityCompat.SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void postponeEnterTransition(android.app.Activity activity) {
        androidx.core.app.ActivityCompat.Api21Impl.postponeEnterTransition(activity);
    }

    public static void startPostponedEnterTransition(android.app.Activity activity) {
        androidx.core.app.ActivityCompat.Api21Impl.startPostponedEnterTransition(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i) {
        androidx.core.app.ActivityCompat.PermissionCompatDelegate permissionCompatDelegate = sDelegate;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (android.text.TextUtils.isEmpty(strArr[i2])) {
                    throw new java.lang.IllegalArgumentException("Permission request for permissions " + java.util.Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.BuildCompat.isAtLeastT() && android.text.TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(java.lang.Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            java.lang.String[] strArr2 = size > 0 ? new java.lang.String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(java.lang.Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (activity instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) {
                ((androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            androidx.core.app.ActivityCompat.Api23Impl.requestPermissions(activity, strArr, i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ android.app.Activity val$activity;
        final /* synthetic */ java.lang.String[] val$permissionsArray;
        final /* synthetic */ int val$requestCode;

        AnonymousClass1(java.lang.String[] strArr, android.app.Activity activity, int i) {
            this.val$permissionsArray = strArr;
            this.val$activity = activity;
            this.val$requestCode = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.val$permissionsArray.length];
            android.content.pm.PackageManager packageManager = this.val$activity.getPackageManager();
            java.lang.String packageName = this.val$activity.getPackageName();
            int length = this.val$permissionsArray.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.val$permissionsArray[i], packageName);
            }
            ((androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback) this.val$activity).onRequestPermissionsResult(this.val$requestCode, this.val$permissionsArray, iArr);
        }
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity activity, java.lang.String str) {
        if (androidx.core.os.BuildCompat.isAtLeastT() || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return androidx.core.app.ActivityCompat.Api23Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        return false;
    }

    public static boolean isLaunchedFromBubble(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.app.ActivityCompat.Api31Impl.isLaunchedFromBubble(activity);
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            return (androidx.core.app.ActivityCompat.Api30Impl.getDisplay(activity) == null || androidx.core.app.ActivityCompat.Api30Impl.getDisplay(activity).getDisplayId() == 0) ? false : true;
        }
        if (android.os.Build.VERSION.SDK_INT == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    public static androidx.core.view.DragAndDropPermissionsCompat requestDragAndDropPermissions(android.app.Activity activity, android.view.DragEvent dragEvent) {
        return androidx.core.view.DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    public static void recreate(final android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new android.os.Handler(activity.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.app.ActivityCompat.lambda$recreate$0(activity);
                }
            });
        }
    }

    static /* synthetic */ void lambda$recreate$0(android.app.Activity activity) {
        if (activity.isFinishing() || androidx.core.app.ActivityRecreator.recreate(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void setLocusContext(android.app.Activity activity, androidx.core.content.LocusIdCompat locusIdCompat, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.app.ActivityCompat.Api30Impl.setLocusContext(activity, locusIdCompat, bundle);
        }
    }

    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
            this.mCallback.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
            this.mCallback.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> list) {
            this.mCallback.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
            this.mCallback.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, final android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.mCallback.onSharedElementsArrived(list, list2, new androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener() { // from class: androidx.core.app.ActivityCompat$SharedElementCallback21Impl$$ExternalSyntheticLambda0
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void onSharedElementsReady() {
                    androidx.core.app.ActivityCompat.Api23Impl.onSharedElementsReady(onSharedElementsReadyListener);
                }
            });
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void setLocusContext(android.app.Activity activity, androidx.core.content.LocusIdCompat locusIdCompat, android.os.Bundle bundle) {
            activity.setLocusContext(locusIdCompat == null ? null : locusIdCompat.toLocusId(), bundle);
        }

        static android.view.Display getDisplay(android.content.ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean isLaunchedFromBubble(android.app.Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void startActivityForResult(android.app.Activity activity, android.content.Intent intent, int i, android.os.Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        static void startIntentSenderForResult(android.app.Activity activity, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }

        static void finishAffinity(android.app.Activity activity) {
            activity.finishAffinity();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void finishAfterTransition(android.app.Activity activity) {
            activity.finishAfterTransition();
        }

        static void setEnterSharedElementCallback(android.app.Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void setExitSharedElementCallback(android.app.Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void postponeEnterTransition(android.app.Activity activity) {
            activity.postponeEnterTransition();
        }

        static void startPostponedEnterTransition(android.app.Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class Api22Impl {
        private Api22Impl() {
        }

        static android.net.Uri getReferrer(android.app.Activity activity) {
            return activity.getReferrer();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(android.app.Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        static boolean shouldShowRequestPermissionRationale(android.app.Activity activity, java.lang.String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void onSharedElementsReady(java.lang.Object obj) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }
    }
}
