package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1527a {
    public static final android.app.AlertDialog.Builder a(android.app.AlertDialog.Builder builder, android.widget.EditText... editTexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editTexts, "editTexts");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(builder.getContext());
        linearLayout.setOrientation(1);
        for (android.widget.EditText editText : editTexts) {
            linearLayout.addView(editText);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) ((16.0f / 2) * android.content.res.Resources.getSystem().getDisplayMetrics().density);
        int i = (int) 48.0f;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        linearLayout.setLayoutParams(layoutParams);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(builder.getContext());
        frameLayout.addView(linearLayout);
        builder.setView(frameLayout);
        return builder;
    }
}
