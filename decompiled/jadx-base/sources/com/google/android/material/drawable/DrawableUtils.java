package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class DrawableUtils {
    private DrawableUtils() {
    }

    public static void setTint(android.graphics.drawable.Drawable drawable, int i) {
        if (i != 0) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(drawable, i);
        } else {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, null);
        }
    }

    public static android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static android.util.AttributeSet parseDrawableXml(android.content.Context context, int i, java.lang.CharSequence charSequence) {
        int next;
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            if (!android.text.TextUtils.equals(xml.getName(), charSequence)) {
                throw new org.xmlpull.v1.XmlPullParserException("Must have a <" + ((java.lang.Object) charSequence) + "> start tag");
            }
            return android.util.Xml.asAttributeSet(xml);
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e) {
            android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("Can't load badge resource ID #0x" + java.lang.Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static void setRippleDrawableRadius(android.graphics.drawable.RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int intrinsicHeight;
        int intrinsicWidth;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            intrinsicWidth = intrinsicWidth2;
        } else if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        } else {
            float intrinsicWidth3 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth3 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
            }
        }
        layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static int[] getUncheckedState(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }
}
