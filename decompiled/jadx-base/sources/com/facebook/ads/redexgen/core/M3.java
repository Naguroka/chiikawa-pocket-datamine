package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class M3 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> A04;
    public static final java.util.concurrent.atomic.AtomicInteger A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.graphics.drawable.Drawable A09(int i, int i2, int i3, int i4) {
        return android.os.Build.VERSION.SDK_INT >= 21 ? new android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4)) : A0A(i, i2, i4);
    }

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{120, 118, -127, -127, 122, -121, 105, -114, -123, 122, -35, -26, -29, -35, -27, -39, -19, -23, -17, -20, -35, -33, -124, -121, -118, -110, -125, -112, -125, -126, 125, -127, -118, -121, -127, -119, 125, -126, -125, -118, 127, -105, 125, -117, -111, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -39, -29, -49, -45, -47, -45, -49, -42, -39, -36, -28, -43, -30, -49, -45, -36, -39, -45, -37, -29, -49, -33, -34, -49, -45, -28, -47, -125, -115, 121, 125, -116, 127, 123, -114, -125, -112, 127, 121, 123, -115, 121, 125, -114, 123, 121, -112, 76, -90, -103, -85, -107, -90, -104, -103, -104, -109, -86, -99, -104, -103, -93, -50, -53, -66, -53, -48, -53, -119, -55, -63, -64, -59, -47, -55, -11, -29, -16, -11, -81, -11, -25, -12, -21, -24, -81, -17, -25, -26, -21, -9, -17, -36, -43, -48, -40, -36, -52, -80, -53, -66, -68, -82, -69, -84, -75, -78, -84, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0g(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.EnumC03240g enumC03240g, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get(A0D(84, 21, 11));
        boolean z = str != null && str.equals(java.lang.Boolean.TRUE.toString());
        if (z && (A0f(c1199Zs, enumC03240g) || A0d(enumC03240g, map))) {
            return true;
        }
        java.lang.String str2 = map.get(A0D(57, 27, 97));
        return z && (str2 != null && str2.equals(java.lang.Boolean.TRUE.toString())) && A0e(enumC03240g, map);
    }

    static {
        A0E();
        A03 = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 0);
        A02 = com.facebook.ads.redexgen.core.AbstractC03842p.A01(androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 115);
        A05 = new java.util.concurrent.atomic.AtomicInteger(1);
        A04 = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public static int A00() {
        int i;
        int newValue;
        do {
            i = A05.get();
            newValue = i + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i, newValue));
        return i;
    }

    public static int A01(int i) {
        return (int) android.util.TypedValue.applyDimension(2, i, com.facebook.ads.redexgen.core.LP.A03);
    }

    public static int A02(int i) {
        if (A0c(i)) {
            return com.facebook.ads.redexgen.core.AbstractC03842p.A02(i, -1, 0.4f);
        }
        return com.facebook.ads.redexgen.core.AbstractC03842p.A02(i, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 0.2f);
    }

    public static int A03(android.widget.TextView textView) {
        android.text.Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (((double) textView.getText().length()) - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) java.lang.Math.ceil(ellipsisCount2);
    }

    public static int A04(android.widget.TextView textView, int i) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i -= extraLinesRequired;
        }
        return lines;
    }

    public static android.graphics.drawable.Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static android.graphics.drawable.Drawable A06(int i, int i2) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static android.graphics.drawable.Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        java.util.Arrays.fill(fArr, i2);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static android.graphics.drawable.Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static android.graphics.drawable.StateListDrawable A0A(int i, int i2, int i3) {
        return A0B(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i2, i}, i3);
    }

    public static android.graphics.drawable.StateListDrawable A0B(int[][] iArr, int[] iArr2, int i) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[7];
            java.lang.String str2 = strArr[6];
            int i3 = str.length();
            if (i3 != str2.length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "YKf7NEmPl3xejVzEDC";
            strArr2[1] = "WRDdubv1OiIiL9yW5q";
            if (i2 < length) {
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(iArr2[i2]);
                gradientDrawable.setCornerRadius(i);
                stateListDrawable.addState(iArr[i2], gradientDrawable);
                i2++;
            } else {
                return stateListDrawable;
            }
        }
    }

    public static android.widget.TextView A0C(android.view.ViewGroup viewGroup) {
        for (int i = 0; i < i; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (A01[3].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[0] = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE";
                strArr[2] = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g";
                return textView;
            }
            if (childAt instanceof android.view.ViewGroup) {
                A0C((android.view.ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0F(int i, android.view.View view) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new android.view.animation.BounceInterpolator());
        scaleAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.C1088Vh(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i, android.view.View view) {
        java.lang.Integer viewId = A04.get(java.lang.Integer.valueOf(i));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(android.view.View view) {
        A0N(view, 8);
    }

    public static void A0I(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof android.view.ViewGroup)) {
            A0T((android.view.ViewGroup) parent);
        }
    }

    public static void A0J(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(android.view.View view) {
        if (view == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            view.setId(android.view.View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(android.view.View view) {
        A0N(view, 0);
    }

    public static void A0M(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new android.graphics.drawable.ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(i));
        }
    }

    public static void A0N(android.view.View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0O(android.view.View view, int i, int i2) {
        A0S(view, A08(i, A02(i), i2));
    }

    public static void A0P(android.view.View view, int i, int i2, int i3) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(android.view.View view, int i, int i2, int i3) {
        A0S(view, A09(i, A02(i), i2, i3));
    }

    public static void A0R(android.view.View view, android.content.Context context) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(android.view.View view, android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(android.view.ViewGroup viewGroup, int i) {
        if (android.os.Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new android.transition.AutoTransition(), i);
        }
    }

    public static void A0V(android.view.ViewGroup viewGroup, android.transition.Transition transition) {
        if (android.os.Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    public static void A0W(android.view.ViewGroup viewGroup, android.transition.Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(android.widget.Button button) {
        android.graphics.Typeface typeface;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            java.lang.String[] strArr = A01;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[7] = "0eysB36Fl0fjQH1dJXMQGfNSZ7";
            strArr2[6] = "2uEiWgVZ3g024XFvQ4YapgJ5oH";
            typeface = android.graphics.Typeface.create(A0D(119, 13, 77), 0);
        } else {
            typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 1);
        }
        button.setTypeface(typeface);
    }

    public static void A0Y(android.widget.TextView textView, boolean z, int i) {
        android.graphics.Typeface typeface;
        if (!z) {
            typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0);
        } else if (android.os.Build.VERSION.SDK_INT < 21) {
            typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 1);
        } else {
            if (A01[5].length() != 25) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "EYVeEO4Fu";
            typeface = android.graphics.Typeface.create(A0D(org.objectweb.asm.Opcodes.IINC, 17, 115), 0);
        }
        textView.setTypeface(typeface);
        textView.setTextSize(2, i);
    }

    public static void A0Z(android.widget.Toast toast, java.lang.String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        android.widget.TextView textViewA0C = A0C((android.view.ViewGroup) toast.getView());
        if (textViewA0C != null) {
            textViewA0C.setText(str);
            textViewA0C.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static void A0a(java.util.Map<java.lang.String, java.lang.String> map, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        byte b;
        java.lang.String strA0D;
        if (abstractC1341cD == null) {
            return;
        }
        java.lang.String strA0c = abstractC1341cD.A0c();
        switch (strA0c.hashCode()) {
            case -1364000502:
                if (strA0c.equals(A0D(105, 14, 37))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strA0D = A0D(0, 10, 6);
                switch (b) {
                    case 0:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0D(org.objectweb.asm.Opcodes.FCMPL, 8, 88), abstractC1341cD.A0X());
                map.put(A0D(84, 21, 11), java.lang.String.valueOf(abstractC1341cD.A17()));
                map.put(A0D(57, 27, 97), java.lang.String.valueOf(abstractC1341cD.A13()));
                map.put(A0D(22, 23, 15), java.lang.String.valueOf(abstractC1341cD.A0U()));
                return;
            case 604727084:
                java.lang.String strA0D2 = A0D(45, 12, 96);
                if (A01[3].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "p9FB";
                if (strA0c.equals(strA0D2)) {
                    b = 0;
                } else {
                    b = -1;
                }
                strA0D = A0D(0, 10, 6);
                switch (b) {
                    case 0:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0D(org.objectweb.asm.Opcodes.FCMPL, 8, 88), abstractC1341cD.A0X());
                map.put(A0D(84, 21, 11), java.lang.String.valueOf(abstractC1341cD.A17()));
                map.put(A0D(57, 27, 97), java.lang.String.valueOf(abstractC1341cD.A13()));
                map.put(A0D(22, 23, 15), java.lang.String.valueOf(abstractC1341cD.A0U()));
                return;
            default:
                b = -1;
                strA0D = A0D(0, 10, 6);
                switch (b) {
                    case 0:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0D, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0D(org.objectweb.asm.Opcodes.FCMPL, 8, 88), abstractC1341cD.A0X());
                map.put(A0D(84, 21, 11), java.lang.String.valueOf(abstractC1341cD.A17()));
                map.put(A0D(57, 27, 97), java.lang.String.valueOf(abstractC1341cD.A13()));
                map.put(A0D(22, 23, 15), java.lang.String.valueOf(abstractC1341cD.A0U()));
                return;
        }
    }

    public static void A0b(android.view.View... viewArr) {
        for (android.view.View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0c(int i) {
        return com.facebook.ads.redexgen.core.AbstractC03842p.A00(i) < 0.5d;
    }

    public static boolean A0d(com.facebook.ads.redexgen.core.EnumC03240g enumC03240g, java.util.Map<java.lang.String, java.lang.String> extraData) {
        boolean nonIabDestination = !A0D(157, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean nonCtaClick = enumC03240g != com.facebook.ads.redexgen.core.EnumC03240g.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0e(com.facebook.ads.redexgen.core.EnumC03240g enumC03240g, java.util.Map<java.lang.String, java.lang.String> extraData) {
        boolean zEquals = A0D(157, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean ctaClick = enumC03240g != com.facebook.ads.redexgen.core.EnumC03240g.A08;
        return zEquals && ctaClick;
    }

    public static boolean A0f(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.EnumC03240g enumC03240g) {
        return enumC03240g == com.facebook.ads.redexgen.core.EnumC03240g.A08 && com.facebook.ads.redexgen.core.C0762Im.A2j(c1199Zs);
    }
}
