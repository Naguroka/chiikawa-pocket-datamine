package com.bytedance.sdk.openadsdk.core.PX.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0120. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.PX.bX bg(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg bgVar;
        com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg;
        int i;
        byte b;
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
            return null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = (int) (i2 / displayMetrics.density);
        int i5 = (int) (i3 / displayMetrics.density);
        float f = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.PX.bX bXVar = null;
        while (true) {
            int i6 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return bXVar;
            }
            xmlPullParser.next();
            int i7 = 2;
            if (xmlPullParser.getEventType() == 2) {
                java.lang.String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    int iIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "width"));
                    int iIL2 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "height"));
                    if (iIL < 300 || iIL2 < 250) {
                        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                        bXVar = bXVar;
                    } else {
                        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg bgVar2 = new com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg();
                        while (true) {
                            if (xmlPullParser.getEventType() != i6 || !xmlPullParser.getName().equals(str)) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i7) {
                                    java.lang.String name = xmlPullParser.getName();
                                    name.hashCode();
                                    bXVar = bXVar;
                                    str = str;
                                    byte b2 = -1;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                b = 0;
                                                b2 = b;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                b = 1;
                                                b2 = b;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                b2 = 2;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                b2 = 3;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals("CompanionClickTracking")) {
                                                b = 4;
                                                b2 = b;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals("HTMLResource")) {
                                                b = 5;
                                                b2 = b;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (b2) {
                                        case 0:
                                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg bgVar3 = bgVar2;
                                            int i8 = iIL2;
                                            int i9 = iIL;
                                            android.graphics.Point pointBg = com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg(context, i9, i8, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE);
                                            float fBg = com.bytedance.sdk.openadsdk.core.PX.bX.bg(i4, i5, pointBg.x, pointBg.y, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.IFRAME_RESOURCE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE);
                                            java.lang.String strIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "IFrameResource");
                                            if (android.text.TextUtils.isEmpty(strIL) || fBg <= bgVar3.iR || fBg <= f) {
                                                i = 3;
                                                com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "IFrameResource", 3);
                                                bgVar2 = bgVar3;
                                                iIL2 = i8;
                                                iIL = i9;
                                                i7 = 2;
                                                i6 = i;
                                            } else {
                                                bgVar3.iR = fBg;
                                                bgVar3.bg(strIL, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.IFRAME_RESOURCE);
                                                bgVar2 = bgVar3;
                                                iIL2 = i8;
                                                iIL = i9;
                                                i7 = 2;
                                                bXVar = bXVar;
                                                str = str;
                                                i6 = 3;
                                            }
                                            break;
                                        case 1:
                                            bgVar2.eqN = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "CompanionClickThrough");
                                            i7 = 2;
                                            iIL = iIL;
                                            bXVar = bXVar;
                                            str = str;
                                            i6 = 3;
                                            break;
                                        case 2:
                                            bgVar = bgVar2;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    iIL2 = iIL2;
                                                    iIL = iIL;
                                                    bgVar2 = bgVar;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    bgVar.IL(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            bgVar = bgVar2;
                                            int i10 = iIL2;
                                            iIL = iIL;
                                            com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg2 = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE;
                                            java.lang.String lowerCase = xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "creativeType").toLowerCase();
                                            if (com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg.contains(lowerCase)) {
                                                enumC0137bg = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.IMAGE;
                                            } else {
                                                enumC0137bg = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.JAVASCRIPT;
                                            }
                                            com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg3 = enumC0137bg;
                                            android.graphics.Point pointBg2 = com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg(context, iIL, i10, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE);
                                            float fBg2 = com.bytedance.sdk.openadsdk.core.PX.bX.bg(i4, i5, pointBg2.x, pointBg2.y, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE, enumC0137bg3);
                                            java.lang.String strIL2 = (com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.contains(lowerCase)) ? com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "StaticResource") : null;
                                            if (fBg2 < bgVar.iR || fBg2 <= f || android.text.TextUtils.isEmpty(strIL2)) {
                                                i = 3;
                                                com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "StaticResource", 3);
                                                iIL2 = i10;
                                                iIL = iIL;
                                                bgVar2 = bgVar;
                                                i7 = 2;
                                                i6 = i;
                                            } else {
                                                bgVar.iR = fBg2;
                                                bgVar.bg(strIL2, enumC0137bg3, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE);
                                                iIL2 = i10;
                                                iIL = iIL;
                                                bgVar2 = bgVar;
                                                i6 = 3;
                                                i7 = 2;
                                            }
                                            break;
                                        case 4:
                                            bgVar2.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "CompanionClickTracking"));
                                            i6 = 3;
                                            i7 = 2;
                                            break;
                                        case 5:
                                            android.graphics.Point pointBg3 = com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg(context, iIL, iIL2, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE);
                                            bgVar = bgVar2;
                                            int i11 = iIL2;
                                            int i12 = iIL;
                                            float fBg3 = com.bytedance.sdk.openadsdk.core.PX.bX.bg(i4, i5, pointBg3.x, pointBg3.y, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE);
                                            java.lang.String strIL3 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "HTMLResource");
                                            if (android.text.TextUtils.isEmpty(strIL3) || fBg3 <= bgVar.iR || fBg3 <= f) {
                                                com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "HTMLResource", 3);
                                                iIL2 = i11;
                                                i6 = 3;
                                                iIL = i12;
                                                bgVar2 = bgVar;
                                            } else {
                                                bgVar.iR = fBg3;
                                                bgVar.bg(strIL3, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE);
                                                iIL2 = i11;
                                                iIL = i12;
                                                bgVar2 = bgVar;
                                                i6 = 3;
                                            }
                                            i7 = 2;
                                            break;
                                        default:
                                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                                            bgVar = bgVar2;
                                            iIL2 = iIL2;
                                            iIL = iIL;
                                            bgVar2 = bgVar;
                                            i6 = 3;
                                            i7 = 2;
                                            break;
                                    }
                                }
                            } else if (!android.text.TextUtils.isEmpty(bgVar2.bg) && bgVar2.iR >= f) {
                                bXVar = new com.bytedance.sdk.openadsdk.core.PX.bX(iIL, iIL2, bgVar2.IL, bgVar2.bX, bgVar2.bg, bgVar2.zx, bgVar2.ldr, bgVar2.eqN);
                                f = bgVar2.iR;
                            }
                        }
                    }
                }
            }
            bXVar = bXVar;
        }
    }
}
