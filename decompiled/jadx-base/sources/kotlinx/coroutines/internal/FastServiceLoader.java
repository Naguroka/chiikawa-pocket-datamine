package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "name", "loader", "Ljava/lang/ClassLoader;", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = new kotlinx.coroutines.internal.FastServiceLoader();
    private static final java.lang.String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory;
        if (!kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(java.lang.Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            } catch (java.lang.ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(java.lang.Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            } catch (java.lang.ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (java.lang.Throwable unused3) {
            return load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
    }

    private final kotlinx.coroutines.internal.MainDispatcherFactory createInstanceOf(java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> baseClass, java.lang.String serviceClass) {
        try {
            return baseClass.cast(java.lang.Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> service, java.lang.ClassLoader loader) {
        try {
            return loadProviders$kotlinx_coroutines_core(service, loader);
        } catch (java.lang.Throwable unused) {
            return kotlin.collections.CollectionsKt.toList(java.util.ServiceLoader.load(service, loader));
        }
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> service, java.lang.ClassLoader loader) {
        java.util.ArrayList list = java.util.Collections.list(loader.getResources(PREFIX + service.getName()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, INSTANCE.parse((java.net.URL) it.next()));
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        if (!(!set.isEmpty())) {
            throw new java.lang.IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        java.util.Set set2 = set;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((java.lang.String) it2.next(), loader, service));
        }
        return arrayList2;
    }

    private final <S> S getProviderInstance(java.lang.String name, java.lang.ClassLoader loader, java.lang.Class<S> service) throws java.lang.ClassNotFoundException {
        java.lang.Class<?> cls = java.lang.Class.forName(name, false, loader);
        if (!service.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException(("Expected service of class " + service + ", but found " + cls).toString());
        }
        return service.cast(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
    }

    private final java.util.List<java.lang.String> parse(java.net.URL url) {
        java.lang.String string = url.toString();
        if (kotlin.text.StringsKt.startsWith$default(string, "jar", false, 2, (java.lang.Object) null)) {
            java.lang.String strSubstringBefore$default = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter$default(string, "jar:file:", (java.lang.String) null, 2, (java.lang.Object) null), '!', (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String strSubstringAfter$default = kotlin.text.StringsKt.substringAfter$default(string, "!/", (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.jar.JarFile jarFile = new java.util.jar.JarFile(strSubstringBefore$default, false);
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(jarFile.getInputStream(new java.util.zip.ZipEntry(strSubstringAfter$default)), com.adjust.sdk.Constants.ENCODING));
                try {
                    java.util.List<java.lang.String> file = INSTANCE.parseFile(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    jarFile.close();
                    return file;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    try {
                        jarFile.close();
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        kotlin.ExceptionsKt.addSuppressed(th3, th5);
                        throw th3;
                    }
                }
            }
        }
        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
        try {
            java.util.List<java.lang.String> file2 = INSTANCE.parseFile(bufferedReader2);
            kotlin.io.CloseableKt.closeFinally(bufferedReader2, null);
            return file2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader2, th6);
                throw th7;
            }
        }
    }

    private final <R> R use(java.util.jar.JarFile jarFile, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> function1) {
        try {
            R rInvoke = function1.invoke(jarFile);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            jarFile.close();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r) throws java.io.IOException {
        boolean z;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        while (true) {
            java.lang.String line = r.readLine();
            if (line != null) {
                java.lang.String string = kotlin.text.StringsKt.trim((java.lang.CharSequence) kotlin.text.StringsKt.substringBefore$default(line, "#", (java.lang.String) null, 2, (java.lang.Object) null)).toString();
                java.lang.String str = string;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char cCharAt = str.charAt(i);
                    if (!(cCharAt == '.' || java.lang.Character.isJavaIdentifierPart(cCharAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new java.lang.IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
                if (str.length() > 0) {
                    linkedHashSet.add(string);
                }
            } else {
                return kotlin.collections.CollectionsKt.toList(linkedHashSet);
            }
        }
    }
}
