package com.unity3d.services.core.extensions;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"toUnityMessage", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final java.lang.String toUnityMessage(java.lang.String str) {
        java.lang.String str2 = str;
        return str2 == null || str2.length() == 0 ? "[Unity Ads] Internal error" : com.unity3d.services.UnityAdsConstants.Messages.MSG_UNITY_BASE + str;
    }
}
