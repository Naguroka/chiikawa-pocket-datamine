package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemCompat {

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final java.lang.String TAG = "MenuItemCompat";

    @java.lang.Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(android.view.MenuItem menuItem);

        boolean onMenuItemActionExpand(android.view.MenuItem menuItem);
    }

    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem menuItem, android.view.View view) {
        return menuItem.setActionView(view);
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @java.lang.Deprecated
    public static android.view.View getActionView(android.view.MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static android.view.MenuItem setActionProvider(android.view.MenuItem menuItem, androidx.core.view.ActionProvider actionProvider) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        android.util.Log.w(TAG, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static androidx.core.view.ActionProvider getActionProvider(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getSupportActionProvider();
        }
        android.util.Log.w(TAG, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @java.lang.Deprecated
    public static boolean expandActionView(android.view.MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @java.lang.Deprecated
    public static boolean collapseActionView(android.view.MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @java.lang.Deprecated
    public static boolean isActionViewExpanded(android.view.MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setOnActionExpandListener(android.view.MenuItem menuItem, final androidx.core.view.MenuItemCompat.OnActionExpandListener onActionExpandListener) {
        return menuItem.setOnActionExpandListener(new android.view.MenuItem.OnActionExpandListener() { // from class: androidx.core.view.MenuItemCompat.1
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(android.view.MenuItem menuItem2) {
                return onActionExpandListener.onMenuItemActionExpand(menuItem2);
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem2) {
                return onActionExpandListener.onMenuItemActionCollapse(menuItem2);
            }
        });
    }

    public static void setContentDescription(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setContentDescription(menuItem, charSequence);
        }
    }

    public static java.lang.CharSequence getContentDescription(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getContentDescription();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getContentDescription(menuItem);
        }
        return null;
    }

    public static void setTooltipText(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setTooltipText(menuItem, charSequence);
        }
    }

    public static java.lang.CharSequence getTooltipText(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getTooltipText();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getTooltipText(menuItem);
        }
        return null;
    }

    public static void setShortcut(android.view.MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setShortcut(c, c2, i, i2);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setShortcut(menuItem, c, c2, i, i2);
        }
    }

    public static void setNumericShortcut(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setNumericShortcut(menuItem, c, i);
        }
    }

    public static int getNumericModifiers(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getNumericModifiers();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getNumericModifiers(menuItem);
        }
        return 0;
    }

    public static void setAlphabeticShortcut(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setAlphabeticShortcut(menuItem, c, i);
        }
    }

    public static int getAlphabeticModifiers(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getAlphabeticModifiers();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getAlphabeticModifiers(menuItem);
        }
        return 0;
    }

    public static void setIconTintList(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintList(menuItem, colorStateList);
        }
    }

    public static android.content.res.ColorStateList getIconTintList(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getIconTintList();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getIconTintList(menuItem);
        }
        return null;
    }

    public static void setIconTintMode(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            ((androidx.core.internal.view.SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintMode(menuItem, mode);
        }
    }

    public static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem menuItem) {
        if (menuItem instanceof androidx.core.internal.view.SupportMenuItem) {
            return ((androidx.core.internal.view.SupportMenuItem) menuItem).getIconTintMode();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.MenuItemCompat.Api26Impl.getIconTintMode(menuItem);
        }
        return null;
    }

    private MenuItemCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.view.MenuItem setContentDescription(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static java.lang.CharSequence getContentDescription(android.view.MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static android.view.MenuItem setTooltipText(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        static java.lang.CharSequence getTooltipText(android.view.MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static android.view.MenuItem setShortcut(android.view.MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        static android.view.MenuItem setNumericShortcut(android.view.MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        static int getNumericModifiers(android.view.MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static android.view.MenuItem setAlphabeticShortcut(android.view.MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        static int getAlphabeticModifiers(android.view.MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static android.view.MenuItem setIconTintList(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static android.content.res.ColorStateList getIconTintList(android.view.MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static android.view.MenuItem setIconTintMode(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
    }
}
