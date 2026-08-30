package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes5.dex */
public class TabItem extends android.view.View {
    public final int customLayout;
    public final android.graphics.drawable.Drawable icon;
    public final java.lang.CharSequence text;

    public TabItem(android.content.Context context) {
        this(context, null);
    }

    public TabItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.TabItem);
        this.text = tintTypedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.TabItem_android_text);
        this.icon = tintTypedArrayObtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.TabItem_android_icon);
        this.customLayout = tintTypedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.TabItem_android_layout, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
