package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final android.graphics.Rect INSETS_NONE = new android.graphics.Rect();

    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable drawable) {
        return true;
    }

    private DrawableUtils() {
    }

    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets opticalInsets = androidx.appcompat.widget.DrawableUtils.Api29Impl.getOpticalInsets(drawable);
            return new android.graphics.Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        return androidx.appcompat.widget.DrawableUtils.Api18Impl.getOpticalInsets(androidx.core.graphics.drawable.DrawableCompat.unwrap(drawable));
    }

    static void fixDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        if (android.os.Build.VERSION.SDK_INT < 29 || android.os.Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        forceDrawableStateChange(drawable);
    }

    private static void forceDrawableStateChange(android.graphics.drawable.Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static class Api18Impl {
        private static final java.lang.reflect.Field sBottom;
        private static final java.lang.reflect.Method sGetOpticalInsets;
        private static final java.lang.reflect.Field sLeft;
        private static final boolean sReflectionSuccessful;
        private static final java.lang.reflect.Field sRight;
        private static final java.lang.reflect.Field sTop;

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0058  */
        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Field field;
            java.lang.reflect.Field field2;
            java.lang.reflect.Field field3;
            java.lang.reflect.Field field4;
            boolean z;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.graphics.Insets");
                method = android.graphics.drawable.Drawable.class.getMethod("getOpticalInsets", new java.lang.Class[0]);
                try {
                    field = cls.getField(androidx.media3.extractor.text.ttml.TtmlNode.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (java.lang.ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            sGetOpticalInsets = method;
                            sLeft = field;
                            sTop = field2;
                            sRight = field3;
                            sBottom = field4;
                            sReflectionSuccessful = true;
                            return;
                        }
                        sGetOpticalInsets = null;
                        sLeft = null;
                        sTop = null;
                        sRight = null;
                        sBottom = null;
                        sReflectionSuccessful = false;
                    } catch (java.lang.NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            sGetOpticalInsets = method;
                            sLeft = field;
                            sTop = field2;
                            sRight = field3;
                            sBottom = field4;
                            sReflectionSuccessful = true;
                            return;
                        }
                        sGetOpticalInsets = null;
                        sLeft = null;
                        sTop = null;
                        sRight = null;
                        sBottom = null;
                        sReflectionSuccessful = false;
                    } catch (java.lang.NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            sGetOpticalInsets = method;
                            sLeft = field;
                            sTop = field2;
                            sRight = field3;
                            sBottom = field4;
                            sReflectionSuccessful = true;
                            return;
                        }
                        sGetOpticalInsets = null;
                        sLeft = null;
                        sTop = null;
                        sRight = null;
                        sBottom = null;
                        sReflectionSuccessful = false;
                    }
                } catch (java.lang.ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        sGetOpticalInsets = method;
                        sLeft = field;
                        sTop = field2;
                        sRight = field3;
                        sBottom = field4;
                        sReflectionSuccessful = true;
                        return;
                    }
                    sGetOpticalInsets = null;
                    sLeft = null;
                    sTop = null;
                    sRight = null;
                    sBottom = null;
                    sReflectionSuccessful = false;
                } catch (java.lang.NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        sGetOpticalInsets = method;
                        sLeft = field;
                        sTop = field2;
                        sRight = field3;
                        sBottom = field4;
                        sReflectionSuccessful = true;
                        return;
                    }
                    sGetOpticalInsets = null;
                    sLeft = null;
                    sTop = null;
                    sRight = null;
                    sBottom = null;
                    sReflectionSuccessful = false;
                } catch (java.lang.NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        sGetOpticalInsets = method;
                        sLeft = field;
                        sTop = field2;
                        sRight = field3;
                        sBottom = field4;
                        sReflectionSuccessful = true;
                        return;
                    }
                    sGetOpticalInsets = null;
                    sLeft = null;
                    sTop = null;
                    sRight = null;
                    sBottom = null;
                    sReflectionSuccessful = false;
                }
            } catch (java.lang.ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (java.lang.NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (java.lang.NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z) {
                sGetOpticalInsets = method;
                sLeft = field;
                sTop = field2;
                sRight = field3;
                sBottom = field4;
                sReflectionSuccessful = true;
                return;
            }
            sGetOpticalInsets = null;
            sLeft = null;
            sTop = null;
            sRight = null;
            sBottom = null;
            sReflectionSuccessful = false;
        }

        private Api18Impl() {
        }

        static android.graphics.Rect getOpticalInsets(android.graphics.drawable.Drawable drawable) {
            if (android.os.Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    java.lang.Object objInvoke = sGetOpticalInsets.invoke(drawable, new java.lang.Object[0]);
                    if (objInvoke != null) {
                        return new android.graphics.Rect(sLeft.getInt(objInvoke), sTop.getInt(objInvoke), sRight.getInt(objInvoke), sBottom.getInt(objInvoke));
                    }
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                }
            }
            return androidx.appcompat.widget.DrawableUtils.INSETS_NONE;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.Insets getOpticalInsets(android.graphics.drawable.Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
