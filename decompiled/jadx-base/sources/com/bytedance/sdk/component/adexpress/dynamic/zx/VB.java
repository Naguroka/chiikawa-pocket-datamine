package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class VB {
    private static java.lang.String IL;
    private static final java.util.Set<java.lang.String> bg = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX WARN: Code duplicated, block: B:218:0x0484  */
    /* JADX WARN: Code duplicated, block: B:221:0x0492 A[Catch: Exception -> 0x04a3, JSONException -> 0x04a7, TryCatch #1 {JSONException -> 0x04a7, blocks: (B:177:0x03a4, B:179:0x0404, B:181:0x0409, B:183:0x0411, B:191:0x0426, B:193:0x042d, B:195:0x0439, B:197:0x0441, B:200:0x0448, B:204:0x0452, B:210:0x0466, B:212:0x046e, B:214:0x0474, B:216:0x047c, B:228:0x04a3, B:219:0x0488, B:221:0x0492, B:226:0x049c, B:206:0x045b), top: B:272:0x03a4 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x049b  */
    public static com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, double d, int i2, double d2, java.lang.String str4, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        int i3;
        int i4;
        float f;
        float f2;
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg;
        int i5;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx;
        java.lang.String strOptString = str;
        int i6 = i;
        java.lang.String strEqN = ta.eqN();
        int iIR = ta.iR();
        if (com.bytedance.sdk.component.adexpress.eqN.IL() && i2 != 4 && (android.text.TextUtils.equals(str2, "text_star") || android.text.TextUtils.equals(str2, "score-count") || android.text.TextUtils.equals(str2, "score-count-type-1") || android.text.TextUtils.equals(str2, "score-count-type-2"))) {
            return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        if (strOptString.startsWith("<svg") || bg.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.eqN.IL() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new org.json.JSONObject(str3).optDouble(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE);
                    bXVar.bg = fOptDouble;
                    bXVar.IL = fOptDouble;
                    return bXVar;
                }
            } catch (java.lang.Exception unused) {
            }
            bXVar.bg = 10.0f;
            bXVar.IL = 10.0f;
            return bXVar;
        }
        if ("logo".equals(str2)) {
            if (!com.bytedance.sdk.component.adexpress.eqN.IL() && ((!android.text.TextUtils.isEmpty(str) && strOptString.contains("adx:")) || IL())) {
                if (IL()) {
                    return bg(bXVar, strOptString, str3, IL);
                }
                return bg(bXVar, strOptString, str3, "");
            }
            bXVar.bg = "union".equals(strOptString) ? 10.0f : 20.0f;
            bXVar.IL = 10.0f;
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                java.lang.String str5 = str2 + strOptString;
                float fIL = (float) IL(str3);
                if (str5.contains("logoad")) {
                    return bg(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_logo_en"), str3);
                }
                bXVar.IL = fIL;
            }
            return bXVar;
        }
        if ("development-name".equals(str2)) {
            strOptString = com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_text_privacy_development") + strOptString;
        }
        if ("app-version".equals(str2)) {
            strOptString = com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_text_privacy_app_version") + strOptString;
        }
        if ("score-count".equals(str2)) {
            try {
                i3 = java.lang.Integer.parseInt(strOptString);
            } catch (java.lang.NumberFormatException unused2) {
                i3 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.eqN.IL() && i3 < 0) {
                return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
            }
            return bg("(" + java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_comment_num"), java.lang.Integer.valueOf(i3)) + ")", str3);
        }
        if ("score-count-type-2".equals(str2)) {
            try {
                i4 = java.lang.Integer.parseInt(strOptString);
            } catch (java.lang.NumberFormatException unused3) {
                i4 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.eqN.IL() && i4 < 0) {
                return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
            }
            return bg("(" + java.lang.String.format(new java.text.DecimalFormat("###,###,###").format(i4), java.lang.Integer.valueOf(i4)) + ")", str3);
        }
        if ("feedback-dislike".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar2 = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
                float fIL2 = (float) IL(str3);
                bXVar2.bg = fIL2;
                bXVar2.IL = fIL2;
                return bXVar2;
            }
            return bg(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_feedback"), str3);
        }
        if ("skip-with-time-countdown".equals(str2) || android.text.TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
            if (ta.bg() && com.bytedance.sdk.component.adexpress.eqN.iR.IL(strEqN)) {
                if (((int) (d + 0.5d)) - iIR < 10) {
                    return com.bytedance.sdk.component.adexpress.eqN.IL() ? bg("0s", str3) : bg(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.eqN.IL() ? bg("00s", str3) : bg(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip"), "00"), str3);
            }
            if (d < 10.0d) {
                return bg("0S", str3);
            }
            return bg("00S", str3);
        }
        if (android.text.TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
            return bg("| " + com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_screen_skip_tx"), str3);
        }
        if (android.text.TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
            return bg("| ".concat(java.lang.String.valueOf(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip_count_down"), "00"))), str3);
        }
        if ("skip-with-time-skip-btn".equals(str2)) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg2 = bg("| " + com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_screen_skip_tx"), str3);
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                try {
                    bXVarBg2.IL = (float) ((((double) bXVarBg2.IL) * new org.json.JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                } catch (java.lang.Throwable unused4) {
                }
                bXVarBg2.bg = bXVarBg2.IL;
            }
            return bXVarBg2;
        }
        if ("skip".equals(str2)) {
            return bg(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_screen_skip_tx"), str3);
        }
        if ("timedown".equals(str2)) {
            return bg(com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME, str3);
        }
        if ("text_star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.eqN.IL() && (d2 < 0.0d || d2 > 5.0d)) {
                return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
            }
            return bg(com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME, str3);
        }
        if (android.text.TextUtils.equals("privacy-detail", str2)) {
            return bg("Permission list | Privacy policy", str3);
        }
        if ("arrowButton".equals(str2)) {
            return bg("Download", str3);
        }
        if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.eqN.IL() && android.text.TextUtils.isEmpty(strOptString) && (ldrVarZx = kg.eo().zx()) != null) {
            strOptString = ldrVarZx.RiO() != null ? kg.eo().zx().RiO().optString(com.bytedance.sdk.component.adexpress.eqN.Kg.bX(com.bytedance.sdk.component.adexpress.eqN.bg())) : "";
        }
        if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && (!com.bytedance.sdk.component.adexpress.eqN.IL() || !"open_ad".equals(strEqN))) || android.text.TextUtils.equals("app-version", str2) || android.text.TextUtils.equals("development-name", str2))) {
            return bg(strOptString, str3);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
            int length = strOptString.length();
            float fOptDouble2 = (float) jSONObject.optDouble(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE);
            float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
            float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
            float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
            float f3 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
            com.bytedance.sdk.component.utils.PX.bg("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + fOptDouble3 + ",lineHeight==" + fOptDouble4 + ",maxWidth ==" + fOptDouble5 + ",totalStrLength" + f3);
            if ("muted".equals(str2)) {
                bXVar.bg = fOptDouble2;
                bXVar.IL = fOptDouble2;
                return bXVar;
            }
            if ("star".equals(str2)) {
                if (com.bytedance.sdk.component.adexpress.eqN.IL() && (d2 < 0.0d || d2 > 5.0d || i2 != 4)) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
                }
                com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg3 = bg("str", str3);
                bXVarBg3.bg = fOptDouble2 * 5.0f;
                return bXVarBg3;
            }
            if (com.ironsource.y8.h.H0.equals(str2)) {
                bXVar.bg = fOptDouble2;
                bXVar.IL = fOptDouble2;
                return bXVar;
            }
            if (!z) {
                f = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                if (f3 <= fOptDouble5) {
                    f2 = f3;
                }
                if (!com.ironsource.y8.h.D0.equals(str2) || (com.bytedance.sdk.component.adexpress.eqN.IL() && "open_ad".equals(strEqN) && "source".equals(str2))) {
                    try {
                        bXVarBg = bg(strOptString.replace('\n', ' '), str3, false);
                        if (z) {
                            i5 = ((int) (f3 / fOptDouble5)) + 1;
                            if (z2 || i5 < i6) {
                                i6 = i5;
                            }
                            bXVarBg.IL *= i6;
                        }
                        return bXVarBg;
                    } catch (java.lang.Exception unused5) {
                    }
                }
                bXVar.bg = f2;
                bXVar.IL = f;
                return bXVar;
            }
            int i7 = ((int) (f3 / fOptDouble5)) + 1;
            if (z2 && i7 >= i6) {
                i7 = i6;
            }
            f = (float) (((double) (fOptDouble4 * fOptDouble2 * i7)) * 1.2d);
            f2 = fOptDouble5;
            if (!com.ironsource.y8.h.D0.equals(str2)) {
                bXVarBg = bg(strOptString.replace('\n', ' '), str3, false);
                if (z) {
                    i5 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                    bXVarBg.IL *= i6;
                }
                return bXVarBg;
            }
            bXVarBg = bg(strOptString.replace('\n', ' '), str3, false);
            if (z) {
                i5 = ((int) (f3 / fOptDouble5)) + 1;
                if (z2) {
                    i6 = i5;
                } else {
                    i6 = i5;
                }
                bXVarBg.IL *= i6;
            }
            return bXVarBg;
            return bXVar;
        } catch (org.json.JSONException unused6) {
        }
    }

    public static java.lang.String bg(java.lang.String str) {
        java.lang.String[] strArrSplit;
        return (android.text.TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str.contains("union")) {
            bXVar.bg = 0.0f;
            bXVar.IL = 0.0f;
        } else {
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = bg(str);
            }
            if (android.text.TextUtils.isEmpty(str3)) {
                bXVar.bg = 0.0f;
                bXVar.IL = 0.0f;
            } else {
                return bg(str3, str2);
            }
        }
        return bXVar;
    }

    public static com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(java.lang.String str, java.lang.String str2) {
        return bg(str, str2, false);
    }

    public static com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(java.lang.String str, java.lang.String str2, boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            int[] iArrBg = bg(str, (float) IL(str2), z);
            bXVar.bg = iArrBg[0];
            bXVar.IL = iArrBg[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                bXVar.IL = 0.0f;
            }
        } catch (java.lang.Exception unused) {
        }
        return bXVar;
    }

    public static double IL(java.lang.String str) {
        try {
            return java.lang.Double.parseDouble(new org.json.JSONObject(str).optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (java.lang.Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] bg(java.lang.String str, float f, boolean z) {
        int[] iArrIL = IL(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), iArrIL[0]), com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), iArrIL[1])};
    }

    public static int[] IL(java.lang.String str, float f, boolean z) {
        try {
            android.widget.TextView textView = new android.widget.TextView(com.bytedance.sdk.component.adexpress.eqN.bg());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (java.lang.Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static java.lang.String bg() {
        return IL;
    }

    public static boolean IL() {
        return !android.text.TextUtils.isEmpty(IL);
    }
}
