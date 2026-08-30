package androidx.core.internal.view;

/* JADX INFO: loaded from: classes.dex */
public interface SupportMenuItem extends android.view.MenuItem {
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    android.view.View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    androidx.core.view.ActionProvider getSupportActionProvider();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    boolean requiresActionButton();

    boolean requiresOverflow();

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(android.view.View view);

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence charSequence);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    android.view.MenuItem setShowAsActionFlags(int i);

    androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider);

    @Override // android.view.MenuItem
    androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence charSequence);
}
