package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceScreen extends androidx.preference.PreferenceGroup {
    private boolean mShouldUseGeneratedIds;

    @Override // androidx.preference.PreferenceGroup
    protected boolean isOnSameScreenAsChildren() {
        return false;
    }

    public PreferenceScreen(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.mShouldUseGeneratedIds = true;
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        androidx.preference.PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener;
        if (getIntent() != null || getFragment() != null || getPreferenceCount() == 0 || (onNavigateToScreenListener = getPreferenceManager().getOnNavigateToScreenListener()) == null) {
            return;
        }
        onNavigateToScreenListener.onNavigateToScreen(this);
    }

    public boolean shouldUseGeneratedIds() {
        return this.mShouldUseGeneratedIds;
    }

    public void setShouldUseGeneratedIds(boolean z) {
        if (isAttached()) {
            throw new java.lang.IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.mShouldUseGeneratedIds = z;
    }
}
