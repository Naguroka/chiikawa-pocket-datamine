package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ResourcesWrapper extends android.content.res.Resources {
    private final android.content.res.Resources mResources;

    public ResourcesWrapper(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getText(i);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getString(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i, java.lang.Object... objArr) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i, int i2, java.lang.Object... objArr) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i, java.lang.CharSequence charSequence) {
        return this.mResources.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.mResources.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getDrawable(i);
    }

    final android.graphics.drawable.Drawable getDrawableCanonical(int i) throws android.content.res.Resources.NotFoundException {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.getDrawable(this.mResources, i, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, null);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getColor(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getInteger(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getLayout(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getXml(i);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i, android.util.TypedValue typedValue) throws android.content.res.Resources.NotFoundException {
        return this.mResources.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        this.mResources.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        androidx.appcompat.resources.Compatibility.Api15Impl.getValueForDensity(this.mResources, i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i) throws android.content.res.Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }
}
