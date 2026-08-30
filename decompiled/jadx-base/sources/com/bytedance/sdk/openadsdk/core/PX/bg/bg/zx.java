package com.bytedance.sdk.openadsdk.core.PX.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.core.PX.bg.IL {
    public static final java.lang.String iR = null;

    public zx(android.content.Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.PX.bg.IL
    public com.bytedance.sdk.openadsdk.core.PX.bg bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) throws java.lang.Throwable {
        java.io.ByteArrayInputStream byteArrayInputStream;
        this.zx = 0;
        java.io.ByteArrayInputStream byteArrayInputStream2 = null;
        if (this.IL == null) {
            this.zx = -1;
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            this.zx = -2;
            return null;
        }
        try {
            byteArrayInputStream = new java.io.ByteArrayInputStream(str.getBytes(com.adjust.sdk.Constants.ENCODING));
            try {
                try {
                    org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = android.util.Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, com.adjust.sdk.Constants.ENCODING);
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.PX.bg bgVarBg = bg(xmlPullParserNewPullParser, list);
                    bg(bgVarBg);
                    try {
                        byteArrayInputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                    return bgVarBg;
                } catch (java.lang.Exception unused2) {
                    this.zx = -3;
                    bg((com.bytedance.sdk.openadsdk.core.PX.bg) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused5) {
            byteArrayInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (byteArrayInputStream2 != null) {
                byteArrayInputStream2.close();
            }
            throw th;
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.PX.bg bgVar) {
        if (this.ldr == null) {
            this.ldr = new com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg();
        }
        this.ldr.bg = this.zx;
        this.ldr.IL = this.bg;
        if (bgVar != null) {
            this.ldr.bX = bgVar.bg().IL.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.PX.bg bg(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) throws java.lang.Throwable {
        xmlPullParser.require(2, iR, "VAST");
        boolean z = false;
        java.lang.String strIL = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strIL = IL(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (bg(xmlPullParser.getAttributeValue(iR, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                java.lang.String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.PX.bg bgVarBg = com.bytedance.sdk.openadsdk.core.PX.bg.bg.IL.bg(this.IL, xmlPullParser, list, this.bX, this.eqN);
                                    if (bgVarBg != null) {
                                        if (!android.text.TextUtils.isEmpty(bgVarBg.iR())) {
                                            return bgVarBg;
                                        }
                                        this.zx = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.PX.bg bgVarIL = IL(xmlPullParser, list);
                                    if (bgVarIL != null) {
                                        return bgVarIL;
                                    }
                                } else {
                                    bg(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        bg(xmlPullParser);
                    }
                    z = true;
                } else {
                    bg(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.zx = -4;
            bX(strIL);
        }
        if (this.zx == 0) {
            this.zx = -5;
        }
        return null;
    }

    private void bX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(java.util.Collections.singletonList(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(str).bg()), this.bg > 0 ? com.bytedance.sdk.openadsdk.core.PX.bg.bg.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.PX.bg.bg.UNDEFINED_ERROR, -1L, null), (com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL) null);
    }

    static class bg {
        com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg IL;
        com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL bX;
        java.lang.String bg;
        java.lang.String eqN;
        final java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> zx = new java.util.ArrayList();
        final java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> ldr = new java.util.ArrayList();
        float iR = Float.MIN_VALUE;

        public bg() {
        }

        public bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il) {
            bg(str, enumC0137bg, il);
        }

        public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il) {
            this.bg = str;
            this.IL = enumC0137bg;
            this.bX = il;
        }

        public void bg(java.lang.String str) {
            this.zx.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(str).bg());
        }

        public void IL(java.lang.String str) {
            this.ldr.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(str).bg());
        }
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return eqN(IL(xmlPullParser, str));
    }

    public static int IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static java.lang.String IL(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String strTrim;
        java.lang.String str2 = iR;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    public static void bg(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new java.lang.IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void bg(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private com.bytedance.sdk.openadsdk.core.PX.bg IL(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) throws java.lang.Throwable {
        if (this.bg >= 5) {
            bg(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.PX.eqN eqn = new com.bytedance.sdk.openadsdk.core.PX.eqN(null);
        java.lang.String strIL = null;
        com.bytedance.sdk.openadsdk.core.PX.bX bXVarBg = null;
        while (true) {
            if (xmlPullParser.getEventType() != 3 || !"Wrapper".equals(xmlPullParser.getName())) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    java.lang.String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VASTAdTagURI":
                            strIL = IL(IL(xmlPullParser, "VASTAdTagURI"), list);
                            if (!android.text.TextUtils.isEmpty(strIL)) {
                                break;
                            } else {
                                bg(xmlPullParser, "Wrapper", 3);
                                this.zx = -2;
                                return null;
                            }
                            break;
                        case "Error":
                            list.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(IL(xmlPullParser, "Error")).bg());
                            break;
                        case "TrackingEvents":
                            com.bytedance.sdk.openadsdk.core.PX.bg.bg.bX.bg(xmlPullParser, eqn);
                            break;
                        case "CompanionAds":
                            bXVarBg = com.bytedance.sdk.openadsdk.core.PX.bg.bg.bg.bg(this.IL, xmlPullParser);
                            break;
                        case "ClickTracking":
                            eqn.iR(bg(xmlPullParser, "ClickTracking"));
                            break;
                        case "Impression":
                            eqn.bg(bg(xmlPullParser, name));
                            break;
                    }
                }
            } else {
                com.bytedance.sdk.openadsdk.core.PX.bg bgVarBg = bg(strIL, list);
                if (bgVarBg != null) {
                    if (bgVarBg.bX() == null) {
                        bgVarBg.bg(bXVarBg);
                    }
                    bgVarBg.bg().bg(eqn);
                }
                return bgVarBg;
            }
        }
    }

    private static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new java.util.ArrayList();
        }
        return java.util.Collections.singletonList(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(str).bg(z).bg());
    }

    private static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> eqN(java.lang.String str) {
        return bg(str, false);
    }
}
