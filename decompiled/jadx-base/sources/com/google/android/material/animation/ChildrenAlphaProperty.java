package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class ChildrenAlphaProperty extends android.util.Property<android.view.ViewGroup, java.lang.Float> {
    public static final android.util.Property<android.view.ViewGroup, java.lang.Float> CHILDREN_ALPHA = new com.google.android.material.animation.ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(java.lang.String str) {
        super(java.lang.Float.class, str);
    }

    @Override // android.util.Property
    public java.lang.Float get(android.view.ViewGroup viewGroup) {
        java.lang.Float f = (java.lang.Float) viewGroup.getTag(com.google.android.material.R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : java.lang.Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(android.view.ViewGroup viewGroup, java.lang.Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(com.google.android.material.R.id.mtrl_internal_children_alpha_tag, java.lang.Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
