package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class UnityPermissions {
    private static final java.lang.String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";

    public static class ModalWaitForPermissionResponse implements com.unity3d.player.IPermissionRequestCallbacks {
        private boolean haveResponse = false;

        @Override // com.unity3d.player.IPermissionRequestCallbacks
        public synchronized void onPermissionDenied(java.lang.String str) {
            this.haveResponse = true;
            notify();
        }

        @Override // com.unity3d.player.IPermissionRequestCallbacks
        public synchronized void onPermissionDeniedAndDontAskAgain(java.lang.String str) {
            this.haveResponse = true;
            notify();
        }

        @Override // com.unity3d.player.IPermissionRequestCallbacks
        public synchronized void onPermissionGranted(java.lang.String str) {
            this.haveResponse = true;
            notify();
        }

        public synchronized void waitForResponse() {
            try {
                if (this.haveResponse) {
                } else {
                    wait();
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    private static boolean checkInfoForMetadata(android.content.pm.PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean(SKIP_DIALOG_METADATA_NAME);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean hasUserAuthorizedPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void requestUserPermissions(android.app.Activity activity, java.lang.String[] strArr, com.unity3d.player.IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        if (!com.unity3d.player.PlatformSupport.MARSHMALLOW_SUPPORT || activity == null || strArr == null) {
            return;
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        java.lang.String strValueOf = java.lang.String.valueOf(com.unity3d.player.PermissionFragment.UNITY_PERMISSION_REQUEST_CODE);
        if (fragmentManager.findFragmentByTag(strValueOf) == null) {
            com.unity3d.player.PermissionFragment permissionFragment = new com.unity3d.player.PermissionFragment(activity, iPermissionRequestCallbacks);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArray(com.unity3d.player.PermissionFragment.PERMISSION_NAMES, strArr);
            permissionFragment.setArguments(bundle);
            android.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(0, permissionFragment, strValueOf);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static boolean skipPermissionsDialog(android.app.Activity activity) {
        if (!com.unity3d.player.PlatformSupport.MARSHMALLOW_SUPPORT) {
            return false;
        }
        try {
            android.content.pm.PackageManager packageManager = activity.getPackageManager();
            return checkInfoForMetadata(packageManager.getActivityInfo(activity.getComponentName(), 128)) || checkInfoForMetadata(packageManager.getApplicationInfo(activity.getPackageName(), 128));
        } catch (java.lang.Exception unused) {
        }
    }
}
