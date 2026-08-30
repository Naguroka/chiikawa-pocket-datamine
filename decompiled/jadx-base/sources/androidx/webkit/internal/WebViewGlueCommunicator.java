package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewGlueCommunicator {
    private static final java.lang.String GLUE_FACTORY_PROVIDER_FETCHER_CLASS = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    private static final java.lang.String GLUE_FACTORY_PROVIDER_FETCHER_METHOD = "createWebViewProviderFactory";

    public static androidx.webkit.internal.WebViewProviderFactory getFactory() {
        return androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE;
    }

    public static androidx.webkit.internal.WebkitToCompatConverter getCompatConverter() {
        return androidx.webkit.internal.WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
    }

    private static class LAZY_FACTORY_HOLDER {
        static final androidx.webkit.internal.WebViewProviderFactory INSTANCE = androidx.webkit.internal.WebViewGlueCommunicator.createGlueProviderFactory();

        private LAZY_FACTORY_HOLDER() {
        }
    }

    private static class LAZY_COMPAT_CONVERTER_HOLDER {
        static final androidx.webkit.internal.WebkitToCompatConverter INSTANCE = new androidx.webkit.internal.WebkitToCompatConverter(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getWebkitToCompatConverter());

        private LAZY_COMPAT_CONVERTER_HOLDER() {
        }
    }

    private static java.lang.reflect.InvocationHandler fetchGlueProviderFactoryImpl() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return (java.lang.reflect.InvocationHandler) java.lang.Class.forName(GLUE_FACTORY_PROVIDER_FETCHER_CLASS, false, getWebViewClassLoader()).getDeclaredMethod(GLUE_FACTORY_PROVIDER_FETCHER_METHOD, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }

    static androidx.webkit.internal.WebViewProviderFactory createGlueProviderFactory() {
        try {
            return new androidx.webkit.internal.WebViewProviderFactoryAdapter((org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class, fetchGlueProviderFactoryImpl()));
        } catch (java.lang.ClassNotFoundException unused) {
            return new androidx.webkit.internal.IncompatibleApkWebViewProviderFactory();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.NoSuchMethodException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.webkit.internal.ApiHelperForP.getWebViewClassLoader();
        }
        return getWebViewProviderFactory().getClass().getClassLoader();
    }

    private static java.lang.Object getWebViewProviderFactory() {
        try {
            java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("getFactory", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.NoSuchMethodException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private WebViewGlueCommunicator() {
    }
}
