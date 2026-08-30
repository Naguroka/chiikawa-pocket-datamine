package com.bytedance.sdk.openadsdk.core.PX.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> bg(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.bytedance.sdk.openadsdk.core.PX.eo eoVarBg;
        if (xmlPullParser == null) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    java.lang.String attributeValue = xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "vendor");
                    java.lang.String strIL = null;
                    java.lang.String strIL2 = null;
                    java.lang.String strIL3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                java.lang.String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, androidx.core.app.NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strIL3 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "apiFramework"))) {
                                            break;
                                        } else {
                                            strIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strIL2 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!android.text.TextUtils.isEmpty(strIL) && (eoVarBg = com.bytedance.sdk.openadsdk.core.PX.eo.bg("omid", strIL, attributeValue, strIL2, strIL3)) != null) {
                            hashSet.add(eoVarBg);
                        }
                    }
                } else {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
