package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private final java.lang.Object[] mConstructorArgs = new java.lang.Object[2];
    private static final java.lang.Class<?>[] sConstructorSignature = {android.content.Context.class, android.util.AttributeSet.class};
    private static final int[] sOnClickAttrs = {android.R.attr.onClick};
    private static final int[] sAccessibilityHeading = {android.R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {android.R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {android.R.attr.screenReaderFocusable};
    private static final java.lang.String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = new androidx.collection.SimpleArrayMap<>();

    protected android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        return null;
    }

    public final android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        android.view.View viewCreateRatingBar;
        android.content.Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = androidx.appcompat.widget.TintContextWrapper.wrap(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (viewCreateRatingBar != null) {
            checkOnClickListener(viewCreateRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, viewCreateRatingBar, attributeSet);
        }
        return viewCreateRatingBar;
    }

    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatImageView createImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatEditText createEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatEditText(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatSpinner createSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatSpinner(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatImageButton createImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatImageButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatCheckBox(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatRadioButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatCheckedTextView createCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatCheckedTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatRatingBar createRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatRatingBar(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatSeekBar createSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatSeekBar(context, attributeSet);
    }

    protected androidx.appcompat.widget.AppCompatToggleButton createToggleButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.AppCompatToggleButton(context, attributeSet);
    }

    private void verifyNotNull(android.view.View view, java.lang.String str) {
        if (view == null) {
            throw new java.lang.IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    private android.view.View createViewFromTag(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            java.lang.Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                java.lang.String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                android.view.View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (viewCreateViewByPrefix != null) {
                    return viewCreateViewByPrefix;
                }
                i++;
            }
        } catch (java.lang.Exception unused) {
            return null;
        } finally {
            java.lang.Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void checkOnClickListener(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        if ((context instanceof android.content.ContextWrapper) && androidx.core.view.ViewCompat.hasOnClickListeners(view)) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new androidx.appcompat.app.AppCompatViewInflater.DeclaredOnClickListener(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private android.view.View createViewByPrefix(android.content.Context context, java.lang.String str, java.lang.String str2) throws android.view.InflateException, java.lang.ClassNotFoundException {
        java.lang.String str3;
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> simpleArrayMap = sConstructorMap;
        java.lang.reflect.Constructor<? extends android.view.View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = java.lang.Class.forName(str3, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(sConstructorSignature);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private static android.content.Context themifyContext(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_theme, 0)) != 0) {
            android.util.Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof androidx.appcompat.view.ContextThemeWrapper) && ((androidx.appcompat.view.ContextThemeWrapper) context).getThemeResId() == resourceId) ? context : new androidx.appcompat.view.ContextThemeWrapper(context, resourceId);
        }
        return context;
    }

    private void backportAccessibilityAttributes(android.content.Context context, android.view.View view, android.util.AttributeSet attributeSet) {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            androidx.core.view.ViewCompat.setAccessibilityHeading(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            androidx.core.view.ViewCompat.setScreenReaderFocusable(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView;
        private final java.lang.String mMethodName;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;

        public DeclaredOnClickListener(android.view.View view, java.lang.String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (this.mResolvedMethod == null) {
                resolveMethod(this.mHostView.getContext());
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void resolveMethod(android.content.Context context) {
            java.lang.reflect.Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.mMethodName, android.view.View.class)) != null) {
                        this.mResolvedMethod = method;
                        this.mResolvedContext = context;
                        return;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.mHostView.getId();
            throw new java.lang.IllegalStateException("Could not find method " + this.mMethodName + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.mHostView.getClass() + (id == -1 ? "" : " with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'"));
        }
    }
}
