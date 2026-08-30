package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public interface DecorToolbar {
    void animateToVisibility(int i);

    boolean canShowOverflowMenu();

    void collapseActionView();

    void dismissPopupMenus();

    android.content.Context getContext();

    android.view.View getCustomView();

    int getDisplayOptions();

    int getDropdownItemCount();

    int getDropdownSelectedPosition();

    int getHeight();

    android.view.Menu getMenu();

    int getNavigationMode();

    java.lang.CharSequence getSubtitle();

    java.lang.CharSequence getTitle();

    android.view.ViewGroup getViewGroup();

    int getVisibility();

    boolean hasEmbeddedTabs();

    boolean hasExpandedActionView();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initIndeterminateProgress();

    void initProgress();

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    boolean isTitleTruncated();

    void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray);

    void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray);

    void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

    void setCollapsible(boolean z);

    void setCustomView(android.view.View view);

    void setDefaultNavigationContentDescription(int i);

    void setDefaultNavigationIcon(android.graphics.drawable.Drawable drawable);

    void setDisplayOptions(int i);

    void setDropdownParams(android.widget.SpinnerAdapter spinnerAdapter, android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener);

    void setDropdownSelectedPosition(int i);

    void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView);

    void setHomeButtonEnabled(boolean z);

    void setIcon(int i);

    void setIcon(android.graphics.drawable.Drawable drawable);

    void setLogo(int i);

    void setLogo(android.graphics.drawable.Drawable drawable);

    void setMenu(android.view.Menu menu, androidx.appcompat.view.menu.MenuPresenter.Callback callback);

    void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2);

    void setMenuPrepared();

    void setNavigationContentDescription(int i);

    void setNavigationContentDescription(java.lang.CharSequence charSequence);

    void setNavigationIcon(int i);

    void setNavigationIcon(android.graphics.drawable.Drawable drawable);

    void setNavigationMode(int i);

    void setSubtitle(java.lang.CharSequence charSequence);

    void setTitle(java.lang.CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(android.view.Window.Callback callback);

    void setWindowTitle(java.lang.CharSequence charSequence);

    androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j);

    boolean showOverflowMenu();
}
