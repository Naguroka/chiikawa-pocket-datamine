package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {
    public static boolean b(android.util.AttributeSet attributeSet) {
        return attributeSet != null && attributeSet.getAttributeBooleanValue(com.applovin.adview.AppLovinAdView.NAMESPACE, "loadAdOnCreate", false);
    }

    public static java.lang.String a(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, java.lang.String str2) {
        if (context == null || attributeSet == null || str == null || str2 == null) {
            return null;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeValue(str, str2);
        }
        return context.getResources().getString(attributeResourceValue);
    }

    public static com.applovin.mediation.MaxAdFormat a(android.content.Context context) {
        return (com.applovin.sdk.AppLovinSdkUtils.isTablet(context) || com.applovin.sdk.AppLovinSdkUtils.isTv(context)) ? com.applovin.mediation.MaxAdFormat.LEADER : com.applovin.mediation.MaxAdFormat.BANNER;
    }

    public static boolean a(android.view.View view) {
        if (view == null || view.getRootView() == null || !(view.getRootView().getLayoutParams() instanceof android.view.WindowManager.LayoutParams)) {
            return false;
        }
        int i = ((android.view.WindowManager.LayoutParams) view.getRootView().getLayoutParams()).type;
        return i == 2002 || i == 2007 || i == 2003 || i == 2010 || i == 2006 || (android.os.Build.VERSION.SDK_INT >= 26 && i == 2038);
    }

    public static void a(android.view.ViewGroup viewGroup, android.view.View view) {
        if (viewGroup == null) {
            return;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        if (iIndexOfChild == -1) {
            viewGroup.removeAllViews();
        } else {
            viewGroup.removeViews(0, iIndexOfChild);
            viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        }
    }

    public static com.applovin.sdk.AppLovinAdSize a(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(com.applovin.adview.AppLovinAdView.NAMESPACE, "size");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(attributeValue)) {
            return com.applovin.sdk.AppLovinAdSize.fromString(attributeValue);
        }
        return null;
    }
}
