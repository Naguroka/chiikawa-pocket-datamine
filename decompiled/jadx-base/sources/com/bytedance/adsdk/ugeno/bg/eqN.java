package com.bytedance.adsdk.ugeno.bg;

/* JADX INFO: loaded from: classes3.dex */
public enum eqN {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    TRANSLATE_Y("translateY", "translationY", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    ROTATE_X("rotateX", "rotationX", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    ROTATE_Y("rotateY", "rotationY", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    ROTATE_Z("rotateZ", androidx.constraintlayout.motion.widget.Key.ROTATION, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    SCALE_Y("scaleY", "scaleY", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    ALPHA("opacity", "alpha", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    BACKGROUND_COLOR(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    RIPPLE("ripple", "ripple", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT),
    SHINE("shine", "shine", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT);

    private final java.lang.String Lq;
    private final java.lang.String vb;
    private final java.lang.String xxp;

    eqN(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.Lq = str;
        this.vb = str2;
        this.xxp = str3;
    }

    public java.lang.String bg() {
        return this.Lq;
    }

    public java.lang.String IL() {
        return this.vb;
    }

    public java.lang.String bX() {
        return this.xxp;
    }

    public static com.bytedance.adsdk.ugeno.bg.eqN bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "translateX":
                return TRANSLATE_X;
            case "translateY":
                return TRANSLATE_Y;
            case "opacity":
                return ALPHA;
            case "ripple":
                return RIPPLE;
            case "scaleX":
                return SCALE_X;
            case "scaleY":
                return SCALE_Y;
            case "scale":
                return SCALE;
            case "translate":
                return TRANSLATE;
            case "backgroundColor":
                return BACKGROUND_COLOR;
            case "borderRadius":
                return BORDER_RADIUS;
            case "rotateX":
                return ROTATE_X;
            case "rotateY":
                return ROTATE_Y;
            case "rotateZ":
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
