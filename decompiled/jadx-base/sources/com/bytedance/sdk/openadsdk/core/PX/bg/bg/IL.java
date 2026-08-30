package com.bytedance.sdk.openadsdk.core.PX.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static com.bytedance.sdk.openadsdk.core.PX.bg bg(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, int i, double d) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "InLine");
        com.bytedance.sdk.openadsdk.core.PX.bg bgVar = new com.bytedance.sdk.openadsdk.core.PX.bg();
        while (true) {
            if (xmlPullParser.next() != 3 || !"InLine".equals(xmlPullParser.getName())) {
                if (xmlPullParser.getEventType() == 2) {
                    java.lang.String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "AdVerifications":
                            bgVar.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.eqN.bg(xmlPullParser));
                            continue;
                            break;
                        case "Creatives":
                            if (!android.text.TextUtils.isEmpty(bgVar.iR()) && bgVar.bX() != null) {
                                break;
                            } else {
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        if ("Creative".equals(xmlPullParser.getName())) {
                                            bg(context, xmlPullParser, bgVar, i, d);
                                        } else {
                                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        case "Description":
                            bgVar.IL(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, name));
                            continue;
                            break;
                        case "Error":
                            list.addAll(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, name));
                            continue;
                            break;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                    continue;
                                    break;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        bgVar.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.eqN.bg(xmlPullParser));
                                    }
                                }
                            }
                            break;
                        case "AdTitle":
                            bgVar.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, name));
                            continue;
                            break;
                        case "Impression":
                            bgVar.bg().bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, name));
                            continue;
                            break;
                    }
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                }
            } else {
                bgVar.bg().eo(list);
                return bgVar;
            }
        }
    }

    public static void bg(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.PX.bg bgVar, int i, double d) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && android.text.TextUtils.isEmpty(bgVar.iR())) {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.bX.bg(xmlPullParser, bgVar, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && bgVar.bX() == null) {
                    bgVar.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.bg.bg(context, xmlPullParser));
                } else {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                }
            }
        }
    }
}
