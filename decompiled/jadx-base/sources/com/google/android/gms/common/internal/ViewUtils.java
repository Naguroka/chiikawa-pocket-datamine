package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    public static java.lang.String getXmlAttributeString(java.lang.String str, java.lang.String str2, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, java.lang.String str3) {
        java.lang.String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            java.lang.String strSubstring = attributeValue.substring(8);
            java.lang.String packageName = context.getPackageName();
            android.util.TypedValue typedValue = new android.util.TypedValue();
            try {
                context.getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
            } catch (android.content.res.Resources.NotFoundException unused) {
                android.util.Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
            }
            if (typedValue.string != null) {
                attributeValue = typedValue.string.toString();
            } else {
                android.util.Log.w(str3, "Resource " + str2 + " was not a string: " + typedValue.toString());
            }
        }
        if (z2 && attributeValue == null) {
            android.util.Log.w(str3, "Required XML attribute \"" + str2 + "\" missing");
        }
        return attributeValue;
    }
}
