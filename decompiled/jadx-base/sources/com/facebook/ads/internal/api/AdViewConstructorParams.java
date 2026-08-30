package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public class AdViewConstructorParams {
    public static final int CONTEXT = 0;
    public static final int CONTEXT_ATTRS = 1;
    public static final int CONTEXT_ATTRS_STYLE_ATTR = 2;
    public static final int CONTEXT_ATTRS_STYLE_ATTR_STYLE_RES = 3;
    private final android.util.AttributeSet mAttributeSet;
    private final android.content.Context mContext;
    private final int mDefStyleAttr;
    private final int mDefStyleRes;
    private final int mInitializationType;

    public AdViewConstructorParams(android.content.Context context) {
        this.mInitializationType = 0;
        this.mContext = context;
        this.mAttributeSet = null;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.mInitializationType = 1;
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this.mInitializationType = 2;
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = i;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.mInitializationType = 3;
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = i;
        this.mDefStyleRes = i2;
    }

    public int getInitializationType() {
        return this.mInitializationType;
    }

    public android.util.AttributeSet getAttributeSet() {
        return this.mAttributeSet;
    }

    public int getDefStyleAttr() {
        return this.mDefStyleAttr;
    }

    public int getDefStyleRes() {
        return this.mDefStyleRes;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }
}
