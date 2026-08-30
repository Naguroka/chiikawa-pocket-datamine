package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class WR {
    public static int bg(int i) {
        return ((i & 3) == 3 || (i & 5) == 5) ? i | 8388608 : i;
    }

    private static void bg(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
            marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
        }
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = bg(layoutParams2.gravity);
        }
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = bg(layoutParams3.gravity);
        }
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            int[] rules = layoutParams4.getRules();
            if (rules[9] != 0) {
                layoutParams4.addRule(20);
            }
            if (rules[11] != 0) {
                layoutParams4.addRule(21);
            }
            int i = rules[0];
            if (i != 0) {
                layoutParams4.addRule(16, i);
            }
            int i2 = rules[1];
            if (i2 != 0) {
                layoutParams4.addRule(17, i2);
            }
            int i3 = rules[5];
            if (i3 != 0) {
                layoutParams4.addRule(18, i3);
            }
            int i4 = rules[7];
            if (i4 != 0) {
                layoutParams4.addRule(19, i4);
            }
        }
    }

    public static android.view.ViewGroup.LayoutParams bg(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams layoutParamsIL = IL(view, layoutParams);
        if (layoutParamsIL != null) {
            layoutParams = layoutParamsIL;
        }
        bg(layoutParams);
        return layoutParams;
    }

    private static android.view.ViewGroup.LayoutParams IL(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewParent parent;
        android.view.ViewGroup.LayoutParams layoutParams2;
        if (view == null || layoutParams == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (!(parent instanceof android.widget.LinearLayout)) {
            layoutParams2 = null;
        } else {
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new android.widget.LinearLayout.LayoutParams(layoutParams);
        }
        if (parent instanceof android.widget.RelativeLayout) {
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new android.widget.RelativeLayout.LayoutParams(layoutParams);
        }
        if (!(parent instanceof android.widget.FrameLayout)) {
            return layoutParams2;
        }
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            return null;
        }
        return new android.widget.FrameLayout.LayoutParams(layoutParams);
    }
}
