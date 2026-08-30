package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class BlendModeUtils {
    private BlendModeUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static java.lang.Object obtainBlendModeFromCompat(androidx.core.graphics.BlendModeCompat blendModeCompat) {
            switch (androidx.core.graphics.BlendModeUtils.AnonymousClass1.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
                case 1:
                    return android.graphics.BlendMode.CLEAR;
                case 2:
                    return android.graphics.BlendMode.SRC;
                case 3:
                    return android.graphics.BlendMode.DST;
                case 4:
                    return android.graphics.BlendMode.SRC_OVER;
                case 5:
                    return android.graphics.BlendMode.DST_OVER;
                case 6:
                    return android.graphics.BlendMode.SRC_IN;
                case 7:
                    return android.graphics.BlendMode.DST_IN;
                case 8:
                    return android.graphics.BlendMode.SRC_OUT;
                case 9:
                    return android.graphics.BlendMode.DST_OUT;
                case 10:
                    return android.graphics.BlendMode.SRC_ATOP;
                case 11:
                    return android.graphics.BlendMode.DST_ATOP;
                case 12:
                    return android.graphics.BlendMode.XOR;
                case 13:
                    return android.graphics.BlendMode.PLUS;
                case 14:
                    return android.graphics.BlendMode.MODULATE;
                case 15:
                    return android.graphics.BlendMode.SCREEN;
                case 16:
                    return android.graphics.BlendMode.OVERLAY;
                case 17:
                    return android.graphics.BlendMode.DARKEN;
                case 18:
                    return android.graphics.BlendMode.LIGHTEN;
                case 19:
                    return android.graphics.BlendMode.COLOR_DODGE;
                case 20:
                    return android.graphics.BlendMode.COLOR_BURN;
                case 21:
                    return android.graphics.BlendMode.HARD_LIGHT;
                case 22:
                    return android.graphics.BlendMode.SOFT_LIGHT;
                case 23:
                    return android.graphics.BlendMode.DIFFERENCE;
                case 24:
                    return android.graphics.BlendMode.EXCLUSION;
                case 25:
                    return android.graphics.BlendMode.MULTIPLY;
                case 26:
                    return android.graphics.BlendMode.HUE;
                case 27:
                    return android.graphics.BlendMode.SATURATION;
                case 28:
                    return android.graphics.BlendMode.COLOR;
                case 29:
                    return android.graphics.BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.BlendModeUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$core$graphics$BlendModeCompat;

        static {
            int[] iArr = new int[androidx.core.graphics.BlendModeCompat.values().length];
            $SwitchMap$androidx$core$graphics$BlendModeCompat = iArr;
            try {
                iArr[androidx.core.graphics.BlendModeCompat.CLEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SRC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SRC_OVER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DST_OVER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SRC_IN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DST_IN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SRC_OUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DST_OUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SRC_ATOP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DST_ATOP.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.XOR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.PLUS.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.MODULATE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SCREEN.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.OVERLAY.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DARKEN.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.LIGHTEN.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.COLOR_DODGE.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.COLOR_BURN.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.HARD_LIGHT.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SOFT_LIGHT.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.DIFFERENCE.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.EXCLUSION.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.MULTIPLY.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.HUE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.SATURATION.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.COLOR.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[androidx.core.graphics.BlendModeCompat.LUMINOSITY.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
        }
    }

    static android.graphics.PorterDuff.Mode obtainPorterDuffFromCompat(androidx.core.graphics.BlendModeCompat blendModeCompat) {
        if (blendModeCompat == null) {
            return null;
        }
        switch (androidx.core.graphics.BlendModeUtils.AnonymousClass1.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
            case 1:
                return android.graphics.PorterDuff.Mode.CLEAR;
            case 2:
                return android.graphics.PorterDuff.Mode.SRC;
            case 3:
                return android.graphics.PorterDuff.Mode.DST;
            case 4:
                return android.graphics.PorterDuff.Mode.SRC_OVER;
            case 5:
                return android.graphics.PorterDuff.Mode.DST_OVER;
            case 6:
                return android.graphics.PorterDuff.Mode.SRC_IN;
            case 7:
                return android.graphics.PorterDuff.Mode.DST_IN;
            case 8:
                return android.graphics.PorterDuff.Mode.SRC_OUT;
            case 9:
                return android.graphics.PorterDuff.Mode.DST_OUT;
            case 10:
                return android.graphics.PorterDuff.Mode.SRC_ATOP;
            case 11:
                return android.graphics.PorterDuff.Mode.DST_ATOP;
            case 12:
                return android.graphics.PorterDuff.Mode.XOR;
            case 13:
                return android.graphics.PorterDuff.Mode.ADD;
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.OVERLAY;
            case 17:
                return android.graphics.PorterDuff.Mode.DARKEN;
            case 18:
                return android.graphics.PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }
}
