package com.bytedance.sdk.openadsdk.core.PX.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    public static void bg(org.xmlpull.v1.XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.PX.bg bgVar, int i, double d) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && android.text.TextUtils.isEmpty(bgVar.iR())) {
                        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                    }
                    java.lang.String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VideoClicks":
                            bg(xmlPullParser, bgVar);
                            break;
                        case "Duration":
                            bgVar.bg(IL(xmlPullParser));
                            break;
                        case "MediaFiles":
                            bg(xmlPullParser, i, d, bgVar);
                            z = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.PX.IL ilBg = bg(xmlPullParser);
                            if (ilBg != null && bgVar.IL() == null) {
                                bgVar.bg(ilBg);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            bg(xmlPullParser, bgVar.bg());
                            break;
                        default:
                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static java.lang.String bg(org.xmlpull.v1.XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.PX.bg bgVar) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        double d2 = Double.NEGATIVE_INFINITY;
        java.lang.String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "type");
                int iIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "width"));
                int iIL2 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "height"));
                int iIL3 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "bitrate"));
                java.lang.String strIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "MediaFile");
                if (iIL > 0 && iIL2 > 0 && com.bytedance.sdk.openadsdk.core.PX.bX.eqN.bg.contains(attributeValue) && !android.text.TextUtils.isEmpty(strIL)) {
                    double dBg = com.bytedance.sdk.openadsdk.core.PX.bX.eqN.bg(i, d, iIL, iIL2, iIL3, attributeValue);
                    if (dBg > d2) {
                        str = strIL;
                        i2 = iIL;
                        d2 = dBg;
                        i3 = iIL2;
                    }
                }
            }
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            bgVar.eqN(str);
            bgVar.bg(i2);
            bgVar.IL(i3);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.PX.IL bg(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.bytedance.sdk.openadsdk.core.PX.IL il;
        int i;
        java.util.ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg;
        byte b;
        com.bytedance.sdk.openadsdk.core.PX.IL il2 = null;
        while (true) {
            int i5 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return il2;
            }
            xmlPullParser.next();
            int i6 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                int iIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "width"));
                int iIL2 = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "height"));
                if (iIL <= 0 || iIL > 300 || iIL2 <= 0 || iIL2 > 300) {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                    il2 = il2;
                } else {
                    int iBg = com.bytedance.sdk.openadsdk.core.PX.IL.bg.bg(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET));
                    int iBg2 = com.bytedance.sdk.openadsdk.core.PX.IL.bg.bg(xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "duration"));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg bgVar = null;
                    java.lang.String strIL = null;
                    while (true) {
                        if (xmlPullParser.next() != i5 || !xmlPullParser.getName().equals("Icon")) {
                            java.util.ArrayList arrayList4 = arrayList3;
                            arrayList2 = arrayList2;
                            if (xmlPullParser.getEventType() == i6) {
                                java.lang.String name = xmlPullParser.getName();
                                name.hashCode();
                                il = il2;
                                byte b2 = -1;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            b = 0;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b = 1;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b = 4;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        i2 = 3;
                                        i = 2;
                                        arrayList = arrayList4;
                                        arrayList.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "IconViewTracking")).bg());
                                        break;
                                    case 1:
                                        i3 = 3;
                                        i4 = 2;
                                        if (bgVar == null) {
                                            bgVar = new com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "IFrameResource"), com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.IFRAME_RESOURCE);
                                        } else {
                                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                                        }
                                        i5 = i3;
                                        i6 = i4;
                                        il2 = il;
                                        arrayList3 = arrayList4;
                                        break;
                                    case 2:
                                        i3 = 3;
                                        i4 = 2;
                                        com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg2 = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE;
                                        java.lang.String lowerCase = xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, "creativeType").toLowerCase();
                                        java.lang.String strIL2 = (com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.contains(lowerCase)) ? com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "StaticResource") : null;
                                        if (com.bytedance.sdk.openadsdk.core.PX.bX.bg.bg.contains(lowerCase)) {
                                            enumC0137bg = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.IMAGE;
                                        } else {
                                            enumC0137bg = com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.JAVASCRIPT;
                                        }
                                        bgVar = new com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(strIL2, enumC0137bg, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE);
                                        i5 = i3;
                                        i6 = i4;
                                        il2 = il;
                                        arrayList3 = arrayList4;
                                        break;
                                    case 3:
                                        while (true) {
                                            i3 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i4 = 2;
                                                i5 = i3;
                                                i6 = i4;
                                                il2 = il;
                                                arrayList3 = arrayList4;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strIL = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList2.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "IconClickTracking")).bg());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (bgVar == null || bgVar.bX == com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.IFRAME_RESOURCE) {
                                            bgVar = new com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "HTMLResource"), com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE);
                                            il2 = il;
                                            arrayList3 = arrayList4;
                                            i5 = 3;
                                            i6 = 2;
                                        } else {
                                            i3 = 3;
                                            i4 = 2;
                                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                                            i5 = i3;
                                            i6 = i4;
                                            il2 = il;
                                            arrayList3 = arrayList4;
                                        }
                                        break;
                                    default:
                                        i3 = 3;
                                        i4 = 2;
                                        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                                        i5 = i3;
                                        i6 = i4;
                                        il2 = il;
                                        arrayList3 = arrayList4;
                                        break;
                                }
                            } else {
                                il = il2;
                                i = i6;
                                arrayList = arrayList4;
                                i2 = 3;
                            }
                            i5 = i2;
                            i6 = i;
                            arrayList3 = arrayList;
                            il2 = il;
                        } else if (bgVar != null && (il2 == null || android.text.TextUtils.isEmpty(il2.ldr()))) {
                            il2 = new com.bytedance.sdk.openadsdk.core.PX.IL(iIL, iIL2, iBg, iBg2, bgVar.IL, bgVar.bX, bgVar.bg, arrayList2, arrayList3, strIL);
                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "Icons", 3);
                        }
                    }
                }
            } else {
                il2 = il2;
            }
        }
    }

    public static double IL(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String[] strArrSplit = com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Duration").split(":");
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (java.lang.Integer.parseInt(strArrSplit[0].trim()) * 60 * 60) + (java.lang.Integer.parseInt(strArrSplit[1].trim()) * 60) + java.lang.Float.parseFloat(strArrSplit[2].trim());
        } catch (java.lang.Exception unused) {
            return 0.0d;
        }
    }

    public static void bg(org.xmlpull.v1.XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.PX.eqN eqn) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    java.lang.String attributeValue = xmlPullParser.getAttributeValue(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.iR, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    if (android.text.TextUtils.isEmpty(attributeValue)) {
                        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "midpoint":
                                eqn.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                eqn.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                eqn.bX(bX(xmlPullParser));
                                break;
                            case "unmute":
                                eqn.PX(bX(xmlPullParser));
                                break;
                            case "complete":
                                eqn.eqN(bX(xmlPullParser));
                                break;
                            case "mute":
                                eqn.VB(bX(xmlPullParser));
                                break;
                            case "skip":
                                eqn.ldr(bX(xmlPullParser));
                                break;
                            case "close":
                                eqn.zx(bX(xmlPullParser));
                                break;
                            case "pause":
                                eqn.IL(bX(xmlPullParser));
                                break;
                            case "start":
                            case "creativeView":
                                eqn.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                eqn.bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                }
            }
        }
    }

    private static void bg(org.xmlpull.v1.XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.PX.bg bgVar) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                java.lang.String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ClickThrough")) {
                    bgVar.bX(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.IL(xmlPullParser, "ClickThrough"));
                } else if (name.equals("ClickTracking")) {
                    bgVar.bg().iR(com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "ClickTracking"));
                } else {
                    com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser);
                }
            }
        }
    }

    private static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bX(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx.bg(xmlPullParser, "Tracking");
    }
}
