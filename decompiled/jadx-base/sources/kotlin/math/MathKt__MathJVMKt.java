package kotlin.math;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0007\u001a\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007\u001a\u0011\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u0010:\u001a\u00020\u0001*\u00020\u00012\u0006\u0010;\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0006*\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0087\b\u001a\r\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010<\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0087\b\u001a\r\u0010?\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010?\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010A\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006D"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", com.json.zb.q, "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "cbrt", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "log10", "log2", com.applovin.sdk.AppLovinMediationProvider.MAX, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
public class MathKt__MathJVMKt extends kotlin.math.MathKt__MathHKt {
    public static /* synthetic */ void getAbsoluteValue$annotations(double d) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j) {
    }

    public static final int getSign(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static final int getSign(long j) {
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(double d) {
    }

    public static /* synthetic */ void getSign$annotations(float f) {
    }

    public static /* synthetic */ void getSign$annotations(int i) {
    }

    public static /* synthetic */ void getSign$annotations(long j) {
    }

    public static /* synthetic */ void getUlp$annotations(double d) {
    }

    public static /* synthetic */ void getUlp$annotations(float f) {
    }

    private static final double sin(double d) {
        return java.lang.Math.sin(d);
    }

    private static final double cos(double d) {
        return java.lang.Math.cos(d);
    }

    private static final double tan(double d) {
        return java.lang.Math.tan(d);
    }

    private static final double asin(double d) {
        return java.lang.Math.asin(d);
    }

    private static final double acos(double d) {
        return java.lang.Math.acos(d);
    }

    private static final double atan(double d) {
        return java.lang.Math.atan(d);
    }

    private static final double atan2(double d, double d2) {
        return java.lang.Math.atan2(d, d2);
    }

    private static final double sinh(double d) {
        return java.lang.Math.sinh(d);
    }

    private static final double cosh(double d) {
        return java.lang.Math.cosh(d);
    }

    private static final double tanh(double d) {
        return java.lang.Math.tanh(d);
    }

    public static final double asinh(double d) {
        if (d < kotlin.math.Constants.taylor_n_bound) {
            if (d <= (-kotlin.math.Constants.taylor_n_bound)) {
                return -kotlin.math.MathKt.asinh(-d);
            }
            return java.lang.Math.abs(d) >= kotlin.math.Constants.taylor_2_bound ? d - (((d * d) * d) / ((double) 6)) : d;
        }
        if (d <= kotlin.math.Constants.upper_taylor_n_bound) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) + ((double) 1)));
        }
        if (d > kotlin.math.Constants.upper_taylor_2_bound) {
            return java.lang.Math.log(d) + kotlin.math.Constants.LN2;
        }
        double d2 = d * ((double) 2);
        return java.lang.Math.log(d2 + (((double) 1) / d2));
    }

    public static final double acosh(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > kotlin.math.Constants.upper_taylor_2_bound) {
            return java.lang.Math.log(d) + kotlin.math.Constants.LN2;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= kotlin.math.Constants.taylor_n_bound) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) - d2));
        }
        double dSqrt = java.lang.Math.sqrt(d3);
        if (dSqrt >= kotlin.math.Constants.taylor_2_bound) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * java.lang.Math.sqrt(2.0d);
    }

    public static final double atanh(double d) {
        if (java.lang.Math.abs(d) < kotlin.math.Constants.taylor_n_bound) {
            return java.lang.Math.abs(d) > kotlin.math.Constants.taylor_2_bound ? d + (((d * d) * d) / ((double) 3)) : d;
        }
        double d2 = 1;
        return java.lang.Math.log((d2 + d) / (d2 - d)) / ((double) 2);
    }

    private static final double hypot(double d, double d2) {
        return java.lang.Math.hypot(d, d2);
    }

    private static final double sqrt(double d) {
        return java.lang.Math.sqrt(d);
    }

    private static final double exp(double d) {
        return java.lang.Math.exp(d);
    }

    private static final double expm1(double d) {
        return java.lang.Math.expm1(d);
    }

    public static final double log(double d, double d2) {
        if (d2 <= 0.0d) {
            return Double.NaN;
        }
        if (d2 == 1.0d) {
            return Double.NaN;
        }
        return java.lang.Math.log(d) / java.lang.Math.log(d2);
    }

    private static final double ln(double d) {
        return java.lang.Math.log(d);
    }

    private static final double log10(double d) {
        return java.lang.Math.log10(d);
    }

    public static final double log2(double d) {
        return java.lang.Math.log(d) / kotlin.math.Constants.LN2;
    }

    private static final double ln1p(double d) {
        return java.lang.Math.log1p(d);
    }

    private static final double ceil(double d) {
        return java.lang.Math.ceil(d);
    }

    private static final double floor(double d) {
        return java.lang.Math.floor(d);
    }

    public static final double truncate(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            return d;
        }
        if (d > 0.0d) {
            return java.lang.Math.floor(d);
        }
        return java.lang.Math.ceil(d);
    }

    private static final double round(double d) {
        return java.lang.Math.rint(d);
    }

    private static final double abs(double d) {
        return java.lang.Math.abs(d);
    }

    private static final double sign(double d) {
        return java.lang.Math.signum(d);
    }

    private static final double min(double d, double d2) {
        return java.lang.Math.min(d, d2);
    }

    private static final double max(double d, double d2) {
        return java.lang.Math.max(d, d2);
    }

    private static final double cbrt(double d) {
        return java.lang.Math.cbrt(d);
    }

    private static final double pow(double d, double d2) {
        return java.lang.Math.pow(d, d2);
    }

    private static final double pow(double d, int i) {
        return java.lang.Math.pow(d, i);
    }

    private static final double IEEErem(double d, double d2) {
        return java.lang.Math.IEEEremainder(d, d2);
    }

    private static final double getAbsoluteValue(double d) {
        return java.lang.Math.abs(d);
    }

    private static final double getSign(double d) {
        return java.lang.Math.signum(d);
    }

    private static final double withSign(double d, double d2) {
        return java.lang.Math.copySign(d, d2);
    }

    private static final double withSign(double d, int i) {
        return java.lang.Math.copySign(d, i);
    }

    private static final double getUlp(double d) {
        return java.lang.Math.ulp(d);
    }

    private static final double nextUp(double d) {
        return java.lang.Math.nextUp(d);
    }

    private static final double nextDown(double d) {
        return java.lang.Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    private static final double nextTowards(double d, double d2) {
        return java.lang.Math.nextAfter(d, d2);
    }

    public static final int roundToInt(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static final long roundToLong(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    private static final float sin(float f) {
        return (float) java.lang.Math.sin(f);
    }

    private static final float cos(float f) {
        return (float) java.lang.Math.cos(f);
    }

    private static final float tan(float f) {
        return (float) java.lang.Math.tan(f);
    }

    private static final float asin(float f) {
        return (float) java.lang.Math.asin(f);
    }

    private static final float acos(float f) {
        return (float) java.lang.Math.acos(f);
    }

    private static final float atan(float f) {
        return (float) java.lang.Math.atan(f);
    }

    private static final float atan2(float f, float f2) {
        return (float) java.lang.Math.atan2(f, f2);
    }

    private static final float sinh(float f) {
        return (float) java.lang.Math.sinh(f);
    }

    private static final float cosh(float f) {
        return (float) java.lang.Math.cosh(f);
    }

    private static final float tanh(float f) {
        return (float) java.lang.Math.tanh(f);
    }

    private static final float asinh(float f) {
        return (float) kotlin.math.MathKt.asinh(f);
    }

    private static final float acosh(float f) {
        return (float) kotlin.math.MathKt.acosh(f);
    }

    private static final float atanh(float f) {
        return (float) kotlin.math.MathKt.atanh(f);
    }

    private static final float hypot(float f, float f2) {
        return (float) java.lang.Math.hypot(f, f2);
    }

    private static final float sqrt(float f) {
        return (float) java.lang.Math.sqrt(f);
    }

    private static final float exp(float f) {
        return (float) java.lang.Math.exp(f);
    }

    private static final float expm1(float f) {
        return (float) java.lang.Math.expm1(f);
    }

    public static final float log(float f, float f2) {
        if (f2 <= 0.0f) {
            return Float.NaN;
        }
        if (f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (java.lang.Math.log(f) / java.lang.Math.log(f2));
    }

    private static final float ln(float f) {
        return (float) java.lang.Math.log(f);
    }

    private static final float log10(float f) {
        return (float) java.lang.Math.log10(f);
    }

    public static final float log2(float f) {
        return (float) (java.lang.Math.log(f) / kotlin.math.Constants.LN2);
    }

    private static final float ln1p(float f) {
        return (float) java.lang.Math.log1p(f);
    }

    private static final float ceil(float f) {
        return (float) java.lang.Math.ceil(f);
    }

    private static final float floor(float f) {
        return (float) java.lang.Math.floor(f);
    }

    public static final float truncate(float f) {
        double dCeil;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            dCeil = java.lang.Math.floor(f);
        } else {
            dCeil = java.lang.Math.ceil(f);
        }
        return (float) dCeil;
    }

    private static final float round(float f) {
        return (float) java.lang.Math.rint(f);
    }

    private static final float abs(float f) {
        return java.lang.Math.abs(f);
    }

    private static final float sign(float f) {
        return java.lang.Math.signum(f);
    }

    private static final float min(float f, float f2) {
        return java.lang.Math.min(f, f2);
    }

    private static final float max(float f, float f2) {
        return java.lang.Math.max(f, f2);
    }

    private static final float cbrt(float f) {
        return (float) java.lang.Math.cbrt(f);
    }

    private static final float pow(float f, float f2) {
        return (float) java.lang.Math.pow(f, f2);
    }

    private static final float pow(float f, int i) {
        return (float) java.lang.Math.pow(f, i);
    }

    private static final float IEEErem(float f, float f2) {
        return (float) java.lang.Math.IEEEremainder(f, f2);
    }

    private static final float getAbsoluteValue(float f) {
        return java.lang.Math.abs(f);
    }

    private static final float getSign(float f) {
        return java.lang.Math.signum(f);
    }

    private static final float withSign(float f, float f2) {
        return java.lang.Math.copySign(f, f2);
    }

    private static final float withSign(float f, int i) {
        return java.lang.Math.copySign(f, i);
    }

    private static final float getUlp(float f) {
        return java.lang.Math.ulp(f);
    }

    private static final float nextUp(float f) {
        return java.lang.Math.nextUp(f);
    }

    private static final float nextDown(float f) {
        return java.lang.Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    private static final float nextTowards(float f, float f2) {
        return java.lang.Math.nextAfter(f, f2);
    }

    public static final int roundToInt(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static final long roundToLong(float f) {
        return kotlin.math.MathKt.roundToLong(f);
    }

    private static final int abs(int i) {
        return java.lang.Math.abs(i);
    }

    private static final int min(int i, int i2) {
        return java.lang.Math.min(i, i2);
    }

    private static final int max(int i, int i2) {
        return java.lang.Math.max(i, i2);
    }

    private static final int getAbsoluteValue(int i) {
        return java.lang.Math.abs(i);
    }

    private static final long abs(long j) {
        return java.lang.Math.abs(j);
    }

    private static final long min(long j, long j2) {
        return java.lang.Math.min(j, j2);
    }

    private static final long max(long j, long j2) {
        return java.lang.Math.max(j, j2);
    }

    private static final long getAbsoluteValue(long j) {
        return java.lang.Math.abs(j);
    }
}
