package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class VectorEnabledTintResources extends androidx.appcompat.widget.ResourcesWrapper {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled = false;
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getAnimation(int i) throws android.content.res.Resources.NotFoundException {
        return super.getAnimation(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) throws android.content.res.Resources.NotFoundException {
        return super.getBoolean(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) throws android.content.res.Resources.NotFoundException {
        return super.getColor(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getColorStateList(int i) throws android.content.res.Resources.NotFoundException {
        return super.getColorStateList(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) throws android.content.res.Resources.NotFoundException {
        return super.getDimension(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) throws android.content.res.Resources.NotFoundException {
        return super.getDimensionPixelOffset(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) throws android.content.res.Resources.NotFoundException {
        return super.getDimensionPixelSize(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.util.DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return super.getDrawable(i, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2, android.content.res.Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) throws android.content.res.Resources.NotFoundException {
        return super.getIntArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) throws android.content.res.Resources.NotFoundException {
        return super.getInteger(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getLayout(int i) throws android.content.res.Resources.NotFoundException {
        return super.getLayout(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.Movie getMovie(int i) throws android.content.res.Resources.NotFoundException {
        return super.getMovie(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return super.getQuantityString(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int i, int i2, java.lang.Object[] objArr) throws android.content.res.Resources.NotFoundException {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getQuantityText(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return super.getQuantityText(i, i2);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceEntryName(int i) throws android.content.res.Resources.NotFoundException {
        return super.getResourceEntryName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceName(int i) throws android.content.res.Resources.NotFoundException {
        return super.getResourceName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourcePackageName(int i) throws android.content.res.Resources.NotFoundException {
        return super.getResourcePackageName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceTypeName(int i) throws android.content.res.Resources.NotFoundException {
        return super.getResourceTypeName(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int i) throws android.content.res.Resources.NotFoundException {
        return super.getString(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int i, java.lang.Object[] objArr) throws android.content.res.Resources.NotFoundException {
        return super.getString(i, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String[] getStringArray(int i) throws android.content.res.Resources.NotFoundException {
        return super.getStringArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int i) throws android.content.res.Resources.NotFoundException {
        return super.getText(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int i, java.lang.CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence[] getTextArray(int i) throws android.content.res.Resources.NotFoundException {
        return super.getTextArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        super.getValue(str, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getXml(int i) throws android.content.res.Resources.NotFoundException {
        return super.getXml(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainTypedArray(int i) throws android.content.res.Resources.NotFoundException {
        return super.obtainTypedArray(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int i) throws android.content.res.Resources.NotFoundException {
        return super.openRawResource(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int i, android.util.TypedValue typedValue) throws android.content.res.Resources.NotFoundException {
        return super.openRawResource(i, typedValue);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor openRawResourceFd(int i) throws android.content.res.Resources.NotFoundException {
        return super.openRawResourceFd(i);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    public static boolean shouldBeUsed() {
        isCompatVectorFromResourcesEnabled();
        return false;
    }

    public VectorEnabledTintResources(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.mContextRef = new java.lang.ref.WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        android.content.Context context = this.mContextRef.get();
        if (context != null) {
            return androidx.appcompat.widget.ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i);
        }
        return getDrawableCanonical(i);
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        sCompatVectorFromResourcesEnabled = z;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return sCompatVectorFromResourcesEnabled;
    }
}
