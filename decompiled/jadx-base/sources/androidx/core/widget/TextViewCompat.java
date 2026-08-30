package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    private static final int LINES = 1;
    private static final java.lang.String LOG_TAG = "TextViewCompat";
    private static java.lang.reflect.Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static java.lang.reflect.Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static java.lang.reflect.Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static java.lang.reflect.Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private TextViewCompat() {
    }

    private static java.lang.reflect.Field retrieveField(java.lang.String str) {
        java.lang.reflect.Field declaredField = null;
        try {
            declaredField = android.widget.TextView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.NoSuchFieldException unused) {
            android.util.Log.e(LOG_TAG, "Could not retrieve " + str + " field.");
            return declaredField;
        }
    }

    private static int retrieveIntFromField(java.lang.reflect.Field field, android.widget.TextView textView) {
        try {
            return field.getInt(textView);
        } catch (java.lang.IllegalAccessException unused) {
            android.util.Log.d(LOG_TAG, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    public static void setCompoundDrawablesRelative(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        androidx.core.widget.TextViewCompat.Api17Impl.setCompoundDrawablesRelative(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        androidx.core.widget.TextViewCompat.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, int i, int i2, int i3, int i4) {
        androidx.core.widget.TextViewCompat.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, i, i2, i3, i4);
    }

    public static int getMaxLines(android.widget.TextView textView) {
        return androidx.core.widget.TextViewCompat.Api16Impl.getMaxLines(textView);
    }

    public static int getMinLines(android.widget.TextView textView) {
        return androidx.core.widget.TextViewCompat.Api16Impl.getMinLines(textView);
    }

    public static void setTextAppearance(android.widget.TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView textView) {
        return androidx.core.widget.TextViewCompat.Api17Impl.getCompoundDrawablesRelative(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(android.widget.TextView textView, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeWithDefaults(textView, i);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView textView, int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, i3, i4);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView textView, int[] iArr, int i) throws java.lang.IllegalArgumentException {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(textView, iArr, i);
        } else if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            ((androidx.core.widget.AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextType(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeStepGranularity(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMinTextSize(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMaxTextSize(textView);
        }
        if (textView instanceof androidx.core.widget.AutoSizeableTextView) {
            return ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] getAutoSizeTextAvailableSizes(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextAvailableSizes(textView);
        }
        return textView instanceof androidx.core.widget.AutoSizeableTextView ? ((androidx.core.widget.AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static void setCustomSelectionActionModeCallback(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        return (android.os.Build.VERSION.SDK_INT < 26 || android.os.Build.VERSION.SDK_INT > 27 || (callback instanceof androidx.core.widget.TextViewCompat.OreoCallback) || callback == null) ? callback : new androidx.core.widget.TextViewCompat.OreoCallback(callback, textView);
    }

    public static android.view.ActionMode.Callback unwrapCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        return (!(callback instanceof androidx.core.widget.TextViewCompat.OreoCallback) || android.os.Build.VERSION.SDK_INT < 26) ? callback : ((androidx.core.widget.TextViewCompat.OreoCallback) callback).getWrappedCallback();
    }

    private static class OreoCallback implements android.view.ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final android.view.ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences = false;
        private java.lang.Class<?> mMenuBuilderClass;
        private java.lang.reflect.Method mMenuBuilderRemoveItemAtMethod;
        private final android.widget.TextView mTextView;

        OreoCallback(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
            this.mCallback = callback;
            this.mTextView = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            return this.mCallback.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            recomputeProcessTextMenuItems(menu);
            return this.mCallback.onPrepareActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.mCallback.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode actionMode) {
            this.mCallback.onDestroyActionMode(actionMode);
        }

        android.view.ActionMode.Callback getWrappedCallback() {
            return this.mCallback;
        }

        private void recomputeProcessTextMenuItems(android.view.Menu menu) {
            java.lang.reflect.Method declaredMethod;
            android.content.Context context = this.mTextView.getContext();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (!this.mInitializedMenuBuilderReferences) {
                this.mInitializedMenuBuilderReferences = true;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.mMenuBuilderClass = cls;
                    this.mMenuBuilderRemoveItemAtMethod = cls.getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                    this.mCanUseMenuBuilderReferences = true;
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                    this.mMenuBuilderClass = null;
                    this.mMenuBuilderRemoveItemAtMethod = null;
                    this.mCanUseMenuBuilderReferences = false;
                }
            }
            try {
                if (this.mCanUseMenuBuilderReferences && this.mMenuBuilderClass.isInstance(menu)) {
                    declaredMethod = this.mMenuBuilderRemoveItemAtMethod;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    android.view.MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                    }
                }
                java.util.List<android.content.pm.ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
                for (int i = 0; i < supportedActivities.size(); i++) {
                    android.content.pm.ResolveInfo resolveInfo = supportedActivities.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(resolveInfo, this.mTextView)).setShowAsAction(1);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        private java.util.List<android.content.pm.ResolveInfo> getSupportedActivities(android.content.Context context, android.content.pm.PackageManager packageManager) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!(context instanceof android.app.Activity)) {
                return arrayList;
            }
            for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(createProcessTextIntent(), 0)) {
                if (isSupportedActivity(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean isSupportedActivity(android.content.pm.ResolveInfo resolveInfo, android.content.Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (resolveInfo.activityInfo.exported) {
                return resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0;
            }
            return false;
        }

        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo resolveInfo, android.widget.TextView textView) {
            return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        private boolean isEditable(android.widget.TextView textView) {
            return (textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private android.content.Intent createProcessTextIntent() {
            return new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        }
    }

    public static void setFirstBaselineToTopHeight(android.widget.TextView textView, int i) {
        int i2;
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.widget.TextViewCompat.Api28Impl.setFirstBaselineToTopHeight(textView, i);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (androidx.core.widget.TextViewCompat.Api16Impl.getIncludeFontPadding(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > java.lang.Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(android.widget.TextView textView, int i) {
        int i2;
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (androidx.core.widget.TextViewCompat.Api16Impl.getIncludeFontPadding(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > java.lang.Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static int getFirstBaselineToTopHeight(android.widget.TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(android.widget.TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void setLineHeight(android.widget.TextView textView, int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParams(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.core.text.PrecomputedTextCompat.Params(androidx.core.widget.TextViewCompat.Api28Impl.getTextMetricsParams(textView));
        }
        androidx.core.text.PrecomputedTextCompat.Params.Builder builder = new androidx.core.text.PrecomputedTextCompat.Params.Builder(new android.text.TextPaint(textView.getPaint()));
        builder.setBreakStrategy(androidx.core.widget.TextViewCompat.Api23Impl.getBreakStrategy(textView));
        builder.setHyphenationFrequency(androidx.core.widget.TextViewCompat.Api23Impl.getHyphenationFrequency(textView));
        builder.setTextDirection(getTextDirectionHeuristic(textView));
        return builder.build();
    }

    public static void setTextMetricsParams(android.widget.TextView textView, androidx.core.text.PrecomputedTextCompat.Params params) {
        androidx.core.widget.TextViewCompat.Api17Impl.setTextDirection(textView, getTextDirection(params.getTextDirection()));
        textView.getPaint().set(params.getTextPaint());
        androidx.core.widget.TextViewCompat.Api23Impl.setBreakStrategy(textView, params.getBreakStrategy());
        androidx.core.widget.TextViewCompat.Api23Impl.setHyphenationFrequency(textView, params.getHyphenationFrequency());
    }

    public static void setPrecomputedText(android.widget.TextView textView, androidx.core.text.PrecomputedTextCompat precomputedTextCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textView.setText(precomputedTextCompat.getPrecomputedText());
        } else {
            if (!getTextMetricsParams(textView).equalsWithoutTextDirection(precomputedTextCompat.getParams())) {
                throw new java.lang.IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    private static android.text.TextDirectionHeuristic getTextDirectionHeuristic(android.widget.TextView textView) {
        if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = java.lang.Character.getDirectionality(androidx.core.widget.TextViewCompat.Api28Impl.getDigitStrings(androidx.core.widget.TextViewCompat.Api24Impl.getInstance(androidx.core.widget.TextViewCompat.Api17Impl.getTextLocale(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return android.text.TextDirectionHeuristics.RTL;
            }
            return android.text.TextDirectionHeuristics.LTR;
        }
        boolean z = androidx.core.widget.TextViewCompat.Api17Impl.getLayoutDirection(textView) == 1;
        switch (androidx.core.widget.TextViewCompat.Api17Impl.getTextDirection(textView)) {
            case 2:
                return android.text.TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return android.text.TextDirectionHeuristics.LTR;
            case 4:
                return android.text.TextDirectionHeuristics.RTL;
            case 5:
                return android.text.TextDirectionHeuristics.LOCALE;
            case 6:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    private static int getTextDirection(android.text.TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static void setCompoundDrawableTintList(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintList(textView, colorStateList);
    }

    public static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView textView) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        return androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintList(textView);
    }

    public static void setCompoundDrawableTintMode(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintMode(textView, mode);
    }

    public static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView textView) {
        androidx.core.util.Preconditions.checkNotNull(textView);
        return androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintMode(textView);
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static void setCompoundDrawablesRelative(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        static int getLayoutDirection(android.view.View view) {
            return view.getLayoutDirection();
        }

        static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void setTextDirection(android.view.View view, int i) {
            view.setTextDirection(i);
        }

        static java.util.Locale getTextLocale(android.widget.TextView textView) {
            return textView.getTextLocale();
        }

        static int getTextDirection(android.view.View view) {
            return view.getTextDirection();
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static int getMaxLines(android.widget.TextView textView) {
            return textView.getMaxLines();
        }

        static int getMinLines(android.widget.TextView textView) {
            return textView.getMinLines();
        }

        static boolean getIncludeFontPadding(android.widget.TextView textView) {
            return textView.getIncludeFontPadding();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setAutoSizeTextTypeWithDefaults(android.widget.TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static int getAutoSizeTextType(android.widget.TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static int getAutoSizeStepGranularity(android.widget.TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int getAutoSizeMinTextSize(android.widget.TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int getAutoSizeMaxTextSize(android.widget.TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int[] getAutoSizeTextAvailableSizes(android.widget.TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setFirstBaselineToTopHeight(android.widget.TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        static android.text.PrecomputedText.Params getTextMetricsParams(android.widget.TextView textView) {
            return textView.getTextMetricsParams();
        }

        static java.lang.String[] getDigitStrings(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getBreakStrategy(android.widget.TextView textView) {
            return textView.getBreakStrategy();
        }

        static void setBreakStrategy(android.widget.TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        static int getHyphenationFrequency(android.widget.TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void setHyphenationFrequency(android.widget.TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static void setCompoundDrawableTintList(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void setCompoundDrawableTintMode(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.icu.text.DecimalFormatSymbols getInstance(java.util.Locale locale) {
            return android.icu.text.DecimalFormatSymbols.getInstance(locale);
        }
    }
}
