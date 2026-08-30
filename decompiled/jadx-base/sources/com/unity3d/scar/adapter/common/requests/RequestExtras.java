package com.unity3d.scar.adapter.common.requests;

/* JADX INFO: loaded from: classes6.dex */
public class RequestExtras {
    public static java.lang.String QUERY_INFO_TYPE = "query_info_type";
    public static java.lang.String REQUESTER_TYPE = "requester_type_5";
    public static java.lang.String VERSION_PREFIX = "UnityScar";
    private java.lang.String _versionName;

    public RequestExtras(java.lang.String str) {
        this._versionName = VERSION_PREFIX + str;
    }

    public android.os.Bundle getExtras() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(QUERY_INFO_TYPE, REQUESTER_TYPE);
        return bundle;
    }

    public java.lang.String getVersionName() {
        return this._versionName;
    }
}
