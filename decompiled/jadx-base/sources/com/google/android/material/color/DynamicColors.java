package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public class DynamicColors {
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {com.google.android.material.R.attr.dynamicColorThemeOverlay};
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    public interface OnAppliedCallback {
        void onApplied(android.app.Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(android.app.Activity activity, int i);
    }

    static {
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition = new com.google.android.material.color.DynamicColors.DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                return true;
            }
        };
        DEFAULT_DEVICE_SUPPORT_CONDITION = deviceSupportCondition;
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition2 = new com.google.android.material.color.DynamicColors.DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2
            private java.lang.Long version;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                if (this.version == null) {
                    try {
                        java.lang.reflect.Method declaredMethod = android.os.Build.class.getDeclaredMethod("getLong", java.lang.String.class);
                        declaredMethod.setAccessible(true);
                        this.version = java.lang.Long.valueOf(((java.lang.Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                    } catch (java.lang.Exception unused) {
                        this.version = -1L;
                    }
                }
                return this.version.longValue() >= 40100;
            }
        };
        SAMSUNG_DEVICE_SUPPORT_CONDITION = deviceSupportCondition2;
        java.util.HashMap map = new java.util.HashMap();
        map.put("fcnt", deviceSupportCondition);
        map.put("google", deviceSupportCondition);
        map.put("hmd global", deviceSupportCondition);
        map.put("infinix", deviceSupportCondition);
        map.put("infinix mobility limited", deviceSupportCondition);
        map.put("itel", deviceSupportCondition);
        map.put("kyocera", deviceSupportCondition);
        map.put("lenovo", deviceSupportCondition);
        map.put("lge", deviceSupportCondition);
        map.put("motorola", deviceSupportCondition);
        map.put("nothing", deviceSupportCondition);
        map.put("oneplus", deviceSupportCondition);
        map.put("oppo", deviceSupportCondition);
        map.put("realme", deviceSupportCondition);
        map.put("robolectric", deviceSupportCondition);
        map.put(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, deviceSupportCondition2);
        map.put("sharp", deviceSupportCondition);
        map.put("sony", deviceSupportCondition);
        map.put("tcl", deviceSupportCondition);
        map.put("tecno", deviceSupportCondition);
        map.put("tecno mobile limited", deviceSupportCondition);
        map.put(com.adjust.sdk.Constants.REFERRER_API_VIVO, deviceSupportCondition);
        map.put(com.adjust.sdk.Constants.REFERRER_API_XIAOMI, deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("asus", deviceSupportCondition);
        map2.put("jio", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = java.util.Collections.unmodifiableMap(map2);
    }

    private DynamicColors() {
    }

    public static void applyToActivitiesIfAvailable(android.app.Application application) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, int i) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application application, int i, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivitiesIfAvailable(application, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(android.app.Application application, com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new com.google.android.material.color.DynamicColors.DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity, int i) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity activity, com.google.android.material.color.DynamicColors.Precondition precondition) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    public static void applyToActivityIfAvailable(android.app.Activity activity) {
        applyToActivityIfAvailable(activity, new com.google.android.material.color.DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(android.app.Activity activity, com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
        applyToActivityIfAvailable(activity, dynamicColorsOptions.getThemeOverlay(), dynamicColorsOptions.getPrecondition(), dynamicColorsOptions.getOnAppliedCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyToActivityIfAvailable(android.app.Activity activity, int i, com.google.android.material.color.DynamicColors.Precondition precondition, com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback) {
        if (isDynamicColorAvailable()) {
            if (i == 0) {
                i = getDefaultThemeOverlay(activity);
            }
            if (i == 0 || !precondition.shouldApplyDynamicColors(activity, i)) {
                return;
            }
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(activity, i);
            onAppliedCallback.onApplied(activity);
        }
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context, int i) {
        if (!isDynamicColorAvailable()) {
            return context;
        }
        if (i == 0) {
            i = getDefaultThemeOverlay(context);
        }
        return i == 0 ? context : new android.view.ContextThemeWrapper(context, i);
    }

    public static boolean isDynamicColorAvailable() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return true;
        }
        com.google.android.material.color.DynamicColors.DeviceSupportCondition deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS.get(android.os.Build.MANUFACTURER.toLowerCase());
        if (deviceSupportCondition == null) {
            deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_BRANDS.get(android.os.Build.BRAND.toLowerCase());
        }
        return deviceSupportCondition != null && deviceSupportCondition.isSupported();
    }

    private static int getDefaultThemeOverlay(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static class DynamicColorsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }

        DynamicColorsActivityLifecycleCallbacks(com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions) {
            this.dynamicColorsOptions = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.material.color.DynamicColors.applyToActivityIfAvailable(activity, this.dynamicColorsOptions.getThemeOverlay(), this.dynamicColorsOptions.getPrecondition(), this.dynamicColorsOptions.getOnAppliedCallback());
        }
    }
}
