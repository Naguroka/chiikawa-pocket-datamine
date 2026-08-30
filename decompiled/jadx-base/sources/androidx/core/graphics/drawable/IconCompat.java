package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final java.lang.String EXTRA_INT1 = "int1";
    static final java.lang.String EXTRA_INT2 = "int2";
    static final java.lang.String EXTRA_OBJ = "obj";
    static final java.lang.String EXTRA_STRING1 = "string1";
    static final java.lang.String EXTRA_TINT_LIST = "tint_list";
    static final java.lang.String EXTRA_TINT_MODE = "tint_mode";
    static final java.lang.String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final java.lang.String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    java.lang.Object mObj1;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;
    public java.lang.String mTintModeStr;
    public int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    private static java.lang.String typeToString(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.Context context, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i);
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources resources, java.lang.String str, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.mInt1 = i;
        if (resources != null) {
            try {
                iconCompat.mObj1 = resources.getResourceName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.mObj1 = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap bitmap) {
        androidx.core.util.ObjectsCompat.requireNonNull(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(android.graphics.Bitmap bitmap) {
        androidx.core.util.ObjectsCompat.requireNonNull(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(5);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithData(byte[] bArr, int i, int i2) {
        androidx.core.util.ObjectsCompat.requireNonNull(bArr);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(3);
        iconCompat.mObj1 = bArr;
        iconCompat.mInt1 = i;
        iconCompat.mInt2 = i2;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri uri) {
        androidx.core.util.ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(6);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri uri) {
        androidx.core.util.ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    IconCompat(int i) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = i;
    }

    public int getType() {
        int i = this.mType;
        return i == -1 ? androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(this.mObj1) : i;
    }

    public java.lang.String getResPackage() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.getResPackage(this.mObj1);
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException("called getResPackage() on " + this);
        }
        java.lang.String str = this.mString1;
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.String) this.mObj1).split(":", -1)[0];
        }
        return this.mString1;
    }

    public int getResId() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(this.mObj1);
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException("called getResId() on " + this);
        }
        return this.mInt1;
    }

    public android.graphics.Bitmap getBitmap() {
        int i = this.mType;
        if (i == -1) {
            java.lang.Object obj = this.mObj1;
            if (obj instanceof android.graphics.Bitmap) {
                return (android.graphics.Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (android.graphics.Bitmap) this.mObj1;
        }
        if (i == 5) {
            return createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, true);
        }
        throw new java.lang.IllegalStateException("called getBitmap() on " + this);
    }

    public android.net.Uri getUri() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.getUri(this.mObj1);
        }
        if (i != 4 && i != 6) {
            throw new java.lang.IllegalStateException("called getUri() on " + this);
        }
        return android.net.Uri.parse((java.lang.String) this.mObj1);
    }

    public androidx.core.graphics.drawable.IconCompat setTint(int i) {
        return setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public androidx.core.graphics.drawable.IconCompat setTintList(android.content.res.ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public androidx.core.graphics.drawable.IconCompat setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
        return toIcon(null);
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context context) {
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.toIcon(this, context);
    }

    public void checkResource(android.content.Context context) {
        java.lang.Object obj;
        if (this.mType != 2 || (obj = this.mObj1) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str.contains(":")) {
            java.lang.String str2 = str.split(":", -1)[1];
            java.lang.String str3 = str2.split("/", -1)[0];
            java.lang.String str4 = str2.split("/", -1)[1];
            java.lang.String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                android.util.Log.i(TAG, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            java.lang.String resPackage = getResPackage();
            int identifier = getResources(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                android.util.Log.i(TAG, "Id has changed for " + resPackage + " " + str);
                this.mInt1 = identifier;
            }
        }
    }

    public android.graphics.drawable.Drawable loadDrawable(android.content.Context context) {
        checkResource(context);
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.loadDrawable(toIcon(context), context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context context) {
        switch (this.mType) {
            case 1:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), (android.graphics.Bitmap) this.mObj1);
            case 2:
                java.lang.String resPackage = getResPackage();
                if (android.text.TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.ResourcesCompat.getDrawable(getResources(context, resPackage), this.mInt1, context.getTheme());
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.e(TAG, java.lang.String.format("Unable to load resource 0x%08x from pkg=%s", java.lang.Integer.valueOf(this.mInt1), this.mObj1), e);
                }
                break;
            case 3:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
            case 4:
                java.io.InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeStream(uriInputStream));
                }
                return null;
            case 5:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, false));
            case 6:
                java.io.InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        return androidx.core.graphics.drawable.IconCompat.Api26Impl.createAdaptiveIconDrawable(null, new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeStream(uriInputStream2)));
                    }
                    return new android.graphics.drawable.BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon(android.graphics.BitmapFactory.decodeStream(uriInputStream2), false));
                }
                return null;
            default:
                return null;
        }
    }

    public java.io.InputStream getUriInputStream(android.content.Context context) {
        android.net.Uri uri = getUri();
        java.lang.String scheme = uri.getScheme();
        if ("content".equals(scheme) || com.ironsource.y8.h.b.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Unable to load image from URI: " + uri, e);
                return null;
            }
        }
        try {
            return new java.io.FileInputStream(new java.io.File((java.lang.String) this.mObj1));
        } catch (java.io.FileNotFoundException e2) {
            android.util.Log.w(TAG, "Unable to load image from path: " + uri, e2);
            return null;
        }
    }

    static android.content.res.Resources getResources(android.content.Context context, java.lang.String str) {
        if ("android".equals(str)) {
            return android.content.res.Resources.getSystem();
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(TAG, java.lang.String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public void addToShortcutIntent(android.content.Intent intent, android.graphics.drawable.Drawable drawable, android.content.Context context) {
        android.graphics.Bitmap bitmapCopy;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmapCopy = (android.graphics.Bitmap) this.mObj1;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                android.content.Context contextCreatePackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.mInt1));
                    return;
                }
                android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(contextCreatePackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((android.app.ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = android.graphics.Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, android.graphics.Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = android.graphics.Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new android.graphics.Canvas(bitmapCopy));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new java.lang.IllegalArgumentException("Can't find package " + this.mObj1, e);
            }
        } else if (i == 5) {
            bitmapCopy = createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, true);
        } else {
            throw new java.lang.IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new android.graphics.Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable(EXTRA_OBJ, (android.os.Parcelable) this.mObj1);
                break;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(EXTRA_OBJ, (android.graphics.Bitmap) this.mObj1);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(EXTRA_OBJ, (java.lang.String) this.mObj1);
                break;
            case 3:
                bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        bundle.putString(EXTRA_STRING1, this.mString1);
        android.content.res.ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString(EXTRA_TINT_MODE, mode.name());
        }
        return bundle;
    }

    public java.lang.String toString() {
        if (this.mType == -1) {
            return java.lang.String.valueOf(this.mObj1);
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Icon(typ=").append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sbAppend.append(" size=").append(((android.graphics.Bitmap) this.mObj1).getWidth()).append("x").append(((android.graphics.Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sbAppend.append(" pkg=").append(this.mString1).append(" id=").append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(getResId())));
                break;
            case 3:
                sbAppend.append(" len=").append(this.mInt1);
                if (this.mInt2 != 0) {
                    sbAppend.append(" off=").append(this.mInt2);
                }
                break;
            case 4:
            case 6:
                sbAppend.append(" uri=").append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sbAppend.append(" tint=");
            sbAppend.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sbAppend.append(" mode=").append(this.mTintMode);
        }
        sbAppend.append(")");
        return sbAppend.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (z) {
                    throw new java.lang.IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (android.os.Parcelable) this.mObj1;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.mObj1;
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.mParcelable = (android.os.Parcelable) this.mObj1;
                return;
            case 2:
                this.mData = ((java.lang.String) this.mObj1).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = android.graphics.PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                android.os.Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.mObj1 = parcelable;
                    return;
                }
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.mObj1 = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(this.mData, java.nio.charset.Charset.forName("UTF-16"));
                this.mObj1 = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createFromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt("type");
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        iconCompat.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (android.content.res.ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = android.graphics.PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.mObj1 = bundle.getParcelable(EXTRA_OBJ);
                return iconCompat;
            case 0:
            default:
                android.util.Log.w(TAG, "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.mObj1 = bundle.getString(EXTRA_OBJ);
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return iconCompat;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context context, android.graphics.drawable.Icon icon) {
        androidx.core.util.Preconditions.checkNotNull(icon);
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIcon(context, icon);
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon icon) {
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(icon);
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(android.graphics.drawable.Icon icon) {
        if (androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(icon) == 2 && androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(icon) == 0) {
            return null;
        }
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(icon);
    }

    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap bitmap, boolean z) {
        int iMin = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = ICON_DIAMETER_FACTOR * f2;
        if (z) {
            float f4 = BLUR_FACTOR * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.lang.String getResPackage(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResPackage();
        }

        static int getType(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getType();
        }

        static int getResId(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResId();
        }

        static android.net.Uri getUri(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getUri();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.graphics.drawable.Drawable createAdaptiveIconDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
            return new android.graphics.drawable.AdaptiveIconDrawable(drawable, drawable2);
        }

        static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap bitmap) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri uri) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context context, android.graphics.drawable.Icon icon) {
            int type = getType(icon);
            if (type == 2) {
                java.lang.String resPackage = getResPackage(icon);
                try {
                    return androidx.core.graphics.drawable.IconCompat.createWithResource(androidx.core.graphics.drawable.IconCompat.getResources(context, resPackage), resPackage, getResId(icon));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (type == 4) {
                return androidx.core.graphics.drawable.IconCompat.createWithContentUri(getUri(icon));
            }
            if (type == 6) {
                return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(getUri(icon));
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        }

        static int getType(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getType(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getType", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon type " + obj, e);
                return -1;
            } catch (java.lang.NoSuchMethodException e2) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon type " + obj, e2);
                return -1;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        static java.lang.String getResPackage(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getResPackage(obj);
            }
            try {
                return (java.lang.String) obj.getClass().getMethod("getResPackage", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon package", e);
                return null;
            } catch (java.lang.NoSuchMethodException e2) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon package", e2);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon package", e3);
                return null;
            }
        }

        static androidx.core.graphics.drawable.IconCompat createFromIconInner(java.lang.Object obj) {
            androidx.core.util.Preconditions.checkNotNull(obj);
            int type = getType(obj);
            if (type == 2) {
                return androidx.core.graphics.drawable.IconCompat.createWithResource(null, getResPackage(obj), getResId(obj));
            }
            if (type == 4) {
                return androidx.core.graphics.drawable.IconCompat.createWithContentUri(getUri(obj));
            }
            if (type == 6) {
                return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(getUri(obj));
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
            iconCompat.mObj1 = obj;
            return iconCompat;
        }

        static int getResId(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getResId(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getResId", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon resource", e);
                return 0;
            } catch (java.lang.NoSuchMethodException e2) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon resource", e2);
                return 0;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon resource", e3);
                return 0;
            }
        }

        static android.net.Uri getUri(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getUri(obj);
            }
            try {
                return (android.net.Uri) obj.getClass().getMethod("getUri", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon uri", e);
                return null;
            } catch (java.lang.NoSuchMethodException e2) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon uri", e2);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.e(androidx.core.graphics.drawable.IconCompat.TAG, "Unable to get icon uri", e3);
                return null;
            }
        }

        static android.graphics.drawable.Icon toIcon(androidx.core.graphics.drawable.IconCompat iconCompat, android.content.Context context) {
            android.graphics.drawable.Icon iconCreateWithBitmap;
            switch (iconCompat.mType) {
                case -1:
                    return (android.graphics.drawable.Icon) iconCompat.mObj1;
                case 0:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) iconCompat.mObj1);
                    break;
                case 2:
                    iconCreateWithBitmap = android.graphics.drawable.Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
                    break;
                case 3:
                    iconCreateWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.mObj1, iconCompat.mInt1, iconCompat.mInt2);
                    break;
                case 4:
                    iconCreateWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.mObj1);
                    break;
                case 5:
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        iconCreateWithBitmap = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap((android.graphics.Bitmap) iconCompat.mObj1);
                    } else {
                        iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap(androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) iconCompat.mObj1, false));
                    }
                    break;
                case 6:
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = androidx.core.graphics.drawable.IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(iconCompat.getUri());
                    } else {
                        if (context == null) {
                            throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.getUri());
                        }
                        java.io.InputStream uriInputStream = iconCompat.getUriInputStream(context);
                        if (uriInputStream == null) {
                            throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.getUri());
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            iconCreateWithBitmap = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(android.graphics.BitmapFactory.decodeStream(uriInputStream));
                        } else {
                            iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap(androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(android.graphics.BitmapFactory.decodeStream(uriInputStream), false));
                        }
                    }
                    break;
            }
            if (iconCompat.mTintList != null) {
                iconCreateWithBitmap.setTintList(iconCompat.mTintList);
            }
            if (iconCompat.mTintMode != androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE) {
                iconCreateWithBitmap.setTintMode(iconCompat.mTintMode);
            }
            return iconCreateWithBitmap;
        }

        static android.graphics.drawable.Drawable loadDrawable(android.graphics.drawable.Icon icon, android.content.Context context) {
            return icon.loadDrawable(context);
        }
    }
}
