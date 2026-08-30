package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionFragment extends android.app.Fragment {
    public static final java.lang.String PERMISSION_NAMES = "PermissionNames";
    public static final int UNITY_PERMISSION_REQUEST_CODE = 96489;
    private final android.app.Activity m_Activity;
    private final android.os.Looper m_Looper;
    private final com.unity3d.player.IPermissionRequestCallbacks m_ResultCallbacks;

    public PermissionFragment() {
        this.m_ResultCallbacks = null;
        this.m_Activity = null;
        this.m_Looper = null;
    }

    public PermissionFragment(android.app.Activity activity, com.unity3d.player.IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.m_ResultCallbacks = iPermissionRequestCallbacks;
        this.m_Activity = activity;
        this.m_Looper = android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAllDenied(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            this.m_ResultCallbacks.onPermissionDenied(str);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray(PERMISSION_NAMES), UNITY_PERMISSION_REQUEST_CODE);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (i != 96489) {
            return;
        }
        if (strArr.length != 0) {
            for (int i2 = 0; i2 < strArr.length && i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                com.unity3d.player.IPermissionRequestCallbacks iPermissionRequestCallbacks = this.m_ResultCallbacks;
                if (iPermissionRequestCallbacks != null && this.m_Activity != null && this.m_Looper != null) {
                    if (iPermissionRequestCallbacks instanceof com.unity3d.player.UnityPermissions.ModalWaitForPermissionResponse) {
                        iPermissionRequestCallbacks.onPermissionGranted(strArr[i2]);
                    } else {
                        java.lang.String str = strArr[i2];
                        if (str == null) {
                            str = "<null>";
                        }
                        new android.os.Handler(this.m_Looper).post(new com.unity3d.player.I(this.m_ResultCallbacks, str, iArr[i2], this.m_Activity.shouldShowRequestPermissionRationale(str)));
                    }
                }
            }
        } else if (this.m_ResultCallbacks != null && this.m_Activity != null && this.m_Looper != null) {
            java.lang.String[] stringArray = getArguments().getStringArray(PERMISSION_NAMES);
            if (this.m_ResultCallbacks instanceof com.unity3d.player.UnityPermissions.ModalWaitForPermissionResponse) {
                reportAllDenied(stringArray);
            } else {
                new android.os.Handler(this.m_Looper).post(new com.unity3d.player.H(this, stringArray));
            }
        }
        android.app.FragmentTransaction fragmentTransactionBeginTransaction = getActivity().getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commit();
    }
}
