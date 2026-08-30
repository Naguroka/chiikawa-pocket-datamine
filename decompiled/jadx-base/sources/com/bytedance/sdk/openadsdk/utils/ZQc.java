package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class ZQc {
    private static int IL = -1;
    private static java.lang.Boolean Kg = null;
    private static final java.lang.Object WR = new java.lang.Object();
    private static float bX = -1.0f;
    private static float bg = -1.0f;
    private static int eqN = -1;
    private static float iR = -1.0f;
    private static android.view.WindowManager ldr = null;
    private static int zx = -1;

    private static boolean bg(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private static boolean IL() {
        return bg < 0.0f || IL < 0 || bX < 0.0f || eqN < 0 || zx < 0;
    }

    public static void bg(android.content.Context context) {
        bg(context, false);
    }

    public static void bg(android.content.Context context, boolean z) {
        android.content.Context contextBg = context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context;
        if (contextBg == null) {
            return;
        }
        ldr = (android.view.WindowManager) contextBg.getSystemService("window");
        if (IL() || z) {
            android.util.DisplayMetrics displayMetrics = contextBg.getResources().getDisplayMetrics();
            bg = displayMetrics.density;
            IL = displayMetrics.densityDpi;
            bX = displayMetrics.scaledDensity;
            eqN = displayMetrics.widthPixels;
            zx = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i = eqN;
            int i2 = zx;
            if (i > i2) {
                eqN = i2;
                zx = i;
                return;
            }
            return;
        }
        int i3 = eqN;
        int i4 = zx;
        if (i3 < i4) {
            eqN = i4;
            zx = i3;
        }
    }

    public static float bg(android.content.Context context, float f) {
        bg(context);
        return f * ldr(context);
    }

    public static int IL(android.content.Context context, float f) {
        bg(context);
        float fLdr = ldr(context);
        if (fLdr <= 0.0f) {
            fLdr = 1.0f;
        }
        return (int) ((f / fLdr) + 0.5f);
    }

    public static int bX(android.content.Context context, float f) {
        return java.lang.Float.valueOf(bg(context, f, true)).intValue();
    }

    public static float bg(android.content.Context context, float f, boolean z) {
        bg(context);
        return (f * zx(context)) + (z ? 0.5f : 0.0f);
    }

    public static int eqN(android.content.Context context, float f) {
        bg(context, true);
        float fZx = zx(context);
        if (fZx <= 0.0f) {
            fZx = 1.0f;
        }
        return (int) ((f / fZx) + 0.5f);
    }

    public static int[] IL(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (ldr == null) {
            ldr = (android.view.WindowManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("window");
        }
        int[] iArr = new int[2];
        android.view.WindowManager windowManager = ldr;
        if (windowManager != null) {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                android.graphics.Point point = new android.graphics.Point();
                android.view.Display.class.getMethod("getRealSize", android.graphics.Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (java.lang.Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int bX(android.content.Context context) {
        bg(context);
        return eqN;
    }

    public static int eqN(android.content.Context context) {
        bg(context);
        return zx;
    }

    public static float zx(android.content.Context context) {
        bg(context, true);
        return bg;
    }

    public static float ldr(android.content.Context context) {
        bg(context);
        return bX;
    }

    public static int iR(android.content.Context context) {
        bg(context);
        return IL;
    }

    public static int[] bg(android.view.View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] IL(android.view.View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] bX(android.view.View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void bg(android.view.View view, int i) {
        if (view == null || view.getVisibility() == i || !bg(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean eqN(android.view.View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void bg(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (textView == null || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void bg(android.view.View view, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        bg(view, (android.view.ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void bg(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static android.graphics.Bitmap bg(android.webkit.WebView webView) {
        android.graphics.Bitmap bitmapCreateBitmap = null;
        try {
            android.graphics.Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static void zx(android.view.View view) {
        if (view == null) {
            return;
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 != null) {
                    com.bytedance.sdk.openadsdk.utils.ZQc.bg(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void ldr(android.view.View view) {
        if (view == null) {
            return;
        }
        bg(view, 0);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> Kg(android.content.Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        return new android.util.Pair<>(java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
    }

    public static int WR(android.content.Context context) {
        return ((java.lang.Integer) Kg(context).second).intValue();
    }

    public static int eo(android.content.Context context) {
        return ((java.lang.Integer) Kg(context).first).intValue();
    }

    public static float bg() {
        float f = iR;
        if (f > 0.0f) {
            return f;
        }
        android.content.res.Resources resources = com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        iR = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void bg(android.app.Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e.getMessage());
        }
    }

    public static void IL(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean bX(android.app.Activity activity) {
        if (Kg == null) {
            synchronized (WR) {
                if (Kg == null) {
                    boolean z = true;
                    if (!eqN(activity) && bg("ro.miui.notch", activity) != 1 && !VB(activity) && !Lq(activity) && !PX(activity) && !Ta(activity) && !yDt(activity)) {
                        z = false;
                    }
                    Kg = java.lang.Boolean.valueOf(z);
                }
            }
        }
        return Kg.booleanValue();
    }

    public static boolean eqN(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            android.view.WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e.getMessage());
            return false;
        }
    }

    public static int bg(java.lang.String str, android.app.Activity activity) {
        if (!com.bytedance.sdk.openadsdk.utils.JAA.zx()) {
            return 0;
        }
        try {
            java.lang.Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((java.lang.Integer) clsLoadClass.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE).invoke(clsLoadClass, new java.lang.String(str), 0)).intValue();
        } catch (java.lang.ClassNotFoundException e) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e.getMessage());
            return 0;
        } catch (java.lang.IllegalAccessException e2) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e2.getMessage());
            return 0;
        } catch (java.lang.IllegalArgumentException e3) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e3.getMessage());
            return 0;
        } catch (java.lang.NoSuchMethodException e4) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e4.getMessage());
            return 0;
        } catch (java.lang.reflect.InvocationTargetException e5) {
            com.bytedance.sdk.component.utils.PX.bg("UIUtils", e5.getMessage());
            return 0;
        }
    }

    public static boolean VB(android.content.Context context) {
        try {
            java.lang.Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((java.lang.Boolean) clsLoadClass.getMethod("hasNotchInScreen", new java.lang.Class[0]).invoke(clsLoadClass, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean PX(android.content.Context context) {
        try {
            java.lang.Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((java.lang.Boolean) clsLoadClass.getMethod("isFeatureSupport", java.lang.Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean Ta(android.content.Context context) {
        return android.os.Build.MODEL.equals("IN2010") || android.os.Build.MODEL.equals("IN2020") || android.os.Build.MODEL.equals("KB2000") || android.os.Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean yDt(android.content.Context context) {
        try {
            android.content.res.Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "android");
            java.lang.String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || android.text.TextUtils.isEmpty(string)) ? false : true;
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean Lq(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void bg(android.view.View view, android.view.View.OnClickListener onClickListener, java.lang.String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.PX.bg("OnclickListener ", str + " is null , can not set OnClickListener !!!");
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void bg(android.view.View view, android.view.View.OnTouchListener onTouchListener, java.lang.String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.PX.bg("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
        } else {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public static void bg(android.view.View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void bg(android.widget.TextView textView, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        bg(textView, xxpVar, tuv, 14);
    }

    public static void bg(android.widget.TextView textView, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        bg(textView, xxpVar, (tuv == null || tuv.RiO() == null) ? -1.0d : tuv.RiO().eqN(), i);
    }

    public static void bg(android.widget.TextView textView, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            xxpVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(java.lang.String.format(java.util.Locale.getDefault(), "%.1f", java.lang.Double.valueOf(d)));
            }
            bg(xxpVar, d, i);
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, double d, int i) {
        if (d < 0.0d) {
            xxpVar.setVisibility(8);
        } else {
            xxpVar.setVisibility(0);
            xxpVar.bg(d, i);
        }
    }

    public static android.graphics.Bitmap bg(com.bytedance.sdk.component.WR.eqN eqn) {
        android.webkit.WebView webView = eqn.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        android.graphics.Bitmap bitmapIL = IL(eqn);
        if (bitmapIL == null) {
            bitmapIL = bg(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapIL == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.eqN.bg(bitmapIL, bitmapIL.getWidth() / 6, bitmapIL.getHeight() / 6);
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final java.lang.String str2, final android.graphics.Bitmap bitmap, final java.lang.String str3, final long j) {
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.ZQc.bX(tuv, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final android.graphics.Bitmap bitmap, final java.lang.String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.4
                        @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                        public org.json.JSONObject bg() {
                            try {
                                int iBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(bitmap);
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iBg == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(tuv) ? 1 : 0);
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (org.json.JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (org.json.JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(java.lang.String.valueOf(th)));
            }
        }
    }

    private static android.graphics.Bitmap IL(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return null;
        }
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(eqn.getWidth(), eqn.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            eqn.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static int bg(android.graphics.Bitmap bitmap) {
        try {
            java.util.ArrayList<java.lang.Integer> arrayListIL = IL(bitmap);
            if (arrayListIL == null) {
                return -1;
            }
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.Integer num : arrayListIL) {
                if (map.containsKey(num)) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(((java.lang.Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (i < iIntValue2) {
                    iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
                    i = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    private static java.util.ArrayList<java.lang.Integer> IL(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(java.lang.Integer.valueOf(android.graphics.Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void IL(android.view.View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(android.view.View view2, android.graphics.Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static void iR(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(view);
        }
    }
}
