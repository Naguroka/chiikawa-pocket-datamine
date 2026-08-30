package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class CustomSupport {
    private static final java.lang.String TAG = "CustomSupport";

    private static int clamp(int c) {
        int i = (c & (~(c >> 31))) - 255;
        return (i & (i >> 31)) + 255;
    }

    public static void setInterpolatedValue(androidx.constraintlayout.widget.ConstraintAttribute att, android.view.View view, float[] value) {
        java.lang.Class<?> cls = view.getClass();
        java.lang.String str = "set" + att.getName();
        try {
            boolean z = true;
            switch (androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[att.getType().ordinal()]) {
                case 1:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf((int) value[0]));
                    return;
                case 2:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(value[0]));
                    return;
                case 3:
                    java.lang.reflect.Method method = cls.getMethod(str, android.graphics.drawable.Drawable.class);
                    int iClamp = (clamp((int) (((float) java.lang.Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (value[3] * 255.0f)) << 24) | (clamp((int) (((float) java.lang.Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) java.lang.Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                    colorDrawable.setColor(iClamp);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf((clamp((int) (((float) java.lang.Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (value[3] * 255.0f)) << 24) | (clamp((int) (((float) java.lang.Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) java.lang.Math.pow(value[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new java.lang.RuntimeException("unable to interpolate strings " + att.getName());
                case 6:
                    java.lang.reflect.Method method2 = cls.getMethod(str, java.lang.Boolean.TYPE);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    if (value[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = java.lang.Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(value[0]));
                    return;
                default:
                    return;
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.Debug.getName(view) + "\"");
            e.printStackTrace();
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.Debug.getName(view) + "\"");
            e2.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                iArr[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
