package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.view.accessibility.AccessibilityManager f3805a;

    private static android.view.accessibility.AccessibilityManager a(android.content.Context context) {
        if (f3805a == null) {
            f3805a = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        }
        return f3805a;
    }

    public static java.lang.String b(android.content.Context context) {
        android.view.accessibility.AccessibilityManager accessibilityManagerA;
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerA = a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerA.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                sb.append(java.lang.String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name));
                if (i != enabledAccessibilityServiceList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }
}
